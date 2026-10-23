package dc;
public final class c extends h {
    public static final c f7938c;

    static {
        ?? exc = new Exception();
        f7938c = exc;
        exc.setStackTrace(h.f7946b);
    }

    public static c a() {
        if (h.f7945a) {
            return new Exception();
        }
        return f7938c;
    }
}
