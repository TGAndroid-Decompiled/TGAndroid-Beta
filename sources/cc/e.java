package cc;
public final class e extends h {
    public static final e f4200c;

    static {
        ?? exc = new Exception();
        f4200c = exc;
        exc.setStackTrace(h.f4205b);
    }

    public static e a() {
        if (h.f4204a) {
            return new Exception();
        }
        return f4200c;
    }
}
