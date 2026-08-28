package kb;
public final class e extends h {
    public static final e f14735c;

    static {
        ?? exc = new Exception();
        f14735c = exc;
        exc.setStackTrace(h.f14742b);
    }

    public static e a() {
        if (h.f14741a) {
            return new Exception();
        }
        return f14735c;
    }
}
