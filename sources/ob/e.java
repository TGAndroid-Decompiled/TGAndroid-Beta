package ob;
public final class e extends h {
    public static final e f16525c;

    static {
        ?? exc = new Exception();
        f16525c = exc;
        exc.setStackTrace(h.f16530b);
    }

    public static e a() {
        if (h.f16529a) {
            return new Exception();
        }
        return f16525c;
    }
}
