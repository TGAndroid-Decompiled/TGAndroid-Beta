package c8;
public abstract class ob {
    public static void a(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException(str);
    }
}
