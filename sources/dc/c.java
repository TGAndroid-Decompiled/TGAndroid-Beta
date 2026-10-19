package dc;
public final class c extends h {
    public static final c f7926c;

    static {
        ?? exc = new Exception();
        f7926c = exc;
        exc.setStackTrace(h.f7934b);
    }

    public static c a() {
        if (h.f7933a) {
            return new Exception();
        }
        return f7926c;
    }
}
