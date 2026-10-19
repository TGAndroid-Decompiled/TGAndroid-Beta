package dc;
public final class e extends h {
    public static final e f7929c;

    static {
        ?? exc = new Exception();
        f7929c = exc;
        exc.setStackTrace(h.f7934b);
    }

    public static e a() {
        if (h.f7933a) {
            return new Exception();
        }
        return f7929c;
    }
}
