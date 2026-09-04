package cc;
public final class e extends h {
    public static final e f4734c;

    static {
        ?? exc = new Exception();
        f4734c = exc;
        exc.setStackTrace(h.f4741b);
    }

    public static e a() {
        if (h.f4740a) {
            return new Exception();
        }
        return f4734c;
    }
}
