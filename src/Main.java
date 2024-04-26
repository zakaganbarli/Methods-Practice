import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        System.out.println(randomNumber);


        choiceOne(randomNumber);


    }

    public static int choiceOne(int randomNumber) {

        System.out.println("Bir rəqəm təxmin edin (1-100 arası):");


        while (true) {
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();


            if (randomNumber == number) {
                System.out.println("Təbriklər! Doğru təxmin etdiniz.");
                break;
            } else if (randomNumber > number) {
                System.out.println("Biraz daha böyük bir rəqəm daxil edin.");
            } else if (randomNumber < number) {
                System.out.println("Biraz daha kicik bir rəqəm daxil edin.");
            }
        }
        return randomNumber;
    }
}







