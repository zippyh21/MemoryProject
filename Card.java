public class Card {
    private int type;
    public Card(int type){
        this.type = type;
    }

    public int getType(){
        return type;
    }

    public boolean equals(Card c){
        if (type == c.getType()){
            return true;
        }
        return false;
    }
}
