package ob;
public final class e extends h {
    public static final e f16507c;

    static {
        ?? exc = new Exception();
        f16507c = exc;
        exc.setStackTrace(h.f16512b);
    }

    public static e a() {
        if (h.f16511a) {
            return new Exception();
        }
        return f16507c;
    }
}
