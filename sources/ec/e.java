package ec;
public final class e extends h {
    public static final e f9881c;

    static {
        ?? exc = new Exception();
        f9881c = exc;
        exc.setStackTrace(h.f9886b);
    }

    public static e a() {
        if (h.f9885a) {
            return new Exception();
        }
        return f9881c;
    }
}
