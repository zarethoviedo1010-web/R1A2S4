import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int menu,vidas=10,evento,puntos=0;
            do {
                System.out.println("Hola Bienvenido al juego");
                System.out.println("1.Dseas Jugar el dia de hoy");
                System.out.println("2.Deseas salir del juego");
                menu=teclado.nextInt();
                switch(menu) {
                    case 1:
                    evento=(int)(Math.random()* 6)+1;
                    switch (evento) {
                        case 1:
                            System.out.println("El jugador pierde tres vidas");
                            vidas=vidas-3;
                            System.out.println(vidas);
                            break;
                        case 2:
                            System.out.println("El jugador pierde dos vidas");
                            vidas=vidas-2;
                            System.out.println(vidas);
                            break;
                        case 3:
                            System.out.println("El jugador pierde una vida");
                            vidas--;
                            System.out.println(vidas);
                            break;
                        case 4:
                            System.out.println("No ocurre nada");
                            System.out.println(vidas);
                            break;
                        case 5:
                            System.out.println("El jugador a ganado dos vidas");
                            vidas=vidas+2;
                            System.out.println(vidas);
                            break;
                        case 6:
                            System.out.println("El jugadpor a ganado tres vidas y diez puntos");
                            vidas=vidas+3;
                            puntos=puntos+10;
                            System.out.println(vidas);
                            break;
                    }
                    break;
                    case 2:
                        System.out.println("Saliste del juego");
                }
            } while(vidas!=0||puntos==100);
        }
    }