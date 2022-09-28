public class BuilderPuckingDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal nonVeganMeal = mealBuilder.prepareNonVegMeal();
        Meal veganMeal = mealBuilder.prepareVegMeal();

        veganMeal.showItems();
        System.out.println("Price of your oder: " + veganMeal.getCost() + "\n");
        nonVeganMeal.showItems();
        System.out.println("Price of your oder: " + nonVeganMeal.getCost());
    }
}
