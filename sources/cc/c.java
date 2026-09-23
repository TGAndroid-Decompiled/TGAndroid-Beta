package cc;
public final class c extends h {
    public static final c f4194c;

    static {
        ?? exc = new Exception();
        f4194c = exc;
        exc.setStackTrace(h.f4202b);
    }

    public static c a() {
        if (h.f4201a) {
            return new Exception();
        }
        return f4194c;
    }
}
