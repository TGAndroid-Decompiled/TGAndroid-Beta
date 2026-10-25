package ec;
public final class c extends h {
    public static final c f9879c;

    static {
        ?? exc = new Exception();
        f9879c = exc;
        exc.setStackTrace(h.f9887b);
    }

    public static c a() {
        if (h.f9886a) {
            return new Exception();
        }
        return f9879c;
    }
}
