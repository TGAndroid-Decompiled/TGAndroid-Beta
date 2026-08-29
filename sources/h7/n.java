package h7;
public abstract class n {
    public static void a(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException(str);
    }
}
