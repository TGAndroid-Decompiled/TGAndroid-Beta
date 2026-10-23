package dc;
public final class e extends h {
    public static final e f7941c;

    static {
        ?? exc = new Exception();
        f7941c = exc;
        exc.setStackTrace(h.f7946b);
    }

    public static e a() {
        if (h.f7945a) {
            return new Exception();
        }
        return f7941c;
    }
}
