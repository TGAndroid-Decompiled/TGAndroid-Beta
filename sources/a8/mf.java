package a8;
public abstract class mf {
    public static void a(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException(str);
    }
}
