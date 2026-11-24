package defpackage;
public enum s21 {
    SAVED_TO_DOWNLOADS(2131624053, 2, "Box", "Arrow"),
    SAVED_TO_GALLERY(2131624056, 0, "Box", "Arrow", "Mask", "Arrow 2", "Splash"),
    SAVED_TO_MUSIC(2131624058, 2, "Box", "Arrow"),
    SAVED_TO_GIFS(2131624057, 0, "gif");
    
    public final int a;
    public final String[] b;
    public final byte c;

    s21(int i, int i2, String... strArr) {
        this.a = i;
        this.c = i2;
        this.b = strArr;
    }
}
