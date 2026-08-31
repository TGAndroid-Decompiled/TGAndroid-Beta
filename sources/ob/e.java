package ob;
public final class e extends h {
    public static final e f16690c;

    static {
        ?? exc = new Exception();
        f16690c = exc;
        exc.setStackTrace(h.f16697b);
    }

    public static e a() {
        if (h.f16696a) {
            return new Exception();
        }
        return f16690c;
    }
}
