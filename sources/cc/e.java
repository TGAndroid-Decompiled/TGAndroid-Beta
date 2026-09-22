package cc;
public final class e extends h {
    public static final e f4204c;

    static {
        ?? exc = new Exception();
        f4204c = exc;
        exc.setStackTrace(h.f4209b);
    }

    public static e a() {
        if (h.f4208a) {
            return new Exception();
        }
        return f4204c;
    }
}
