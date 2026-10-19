package dc;
public final class c extends h {
    public static final c f7928c;

    static {
        ?? exc = new Exception();
        f7928c = exc;
        exc.setStackTrace(h.f7936b);
    }

    public static c a() {
        if (h.f7935a) {
            return new Exception();
        }
        return f7928c;
    }
}
