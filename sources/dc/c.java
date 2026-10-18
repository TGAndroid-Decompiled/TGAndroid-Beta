package dc;
public final class c extends h {
    public static final c f7929c;

    static {
        ?? exc = new Exception();
        f7929c = exc;
        exc.setStackTrace(h.f7937b);
    }

    public static c a() {
        if (h.f7936a) {
            return new Exception();
        }
        return f7929c;
    }
}
