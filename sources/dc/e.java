package dc;
public final class e extends h {
    public static final e f7932c;

    static {
        ?? exc = new Exception();
        f7932c = exc;
        exc.setStackTrace(h.f7937b);
    }

    public static e a() {
        if (h.f7936a) {
            return new Exception();
        }
        return f7932c;
    }
}
