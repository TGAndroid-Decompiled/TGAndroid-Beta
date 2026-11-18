package bc;
public final class e extends h {
    public static final e f3120c;

    static {
        ?? exc = new Exception();
        f3120c = exc;
        exc.setStackTrace(h.f3127b);
    }

    public static e a() {
        if (h.f3126a) {
            return new Exception();
        }
        return f3120c;
    }
}
