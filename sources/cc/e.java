package cc;
public final class e extends h {
    public static final e f4590c;

    static {
        ?? exc = new Exception();
        f4590c = exc;
        exc.setStackTrace(h.f4597b);
    }

    public static e a() {
        if (h.f4596a) {
            return new Exception();
        }
        return f4590c;
    }
}
