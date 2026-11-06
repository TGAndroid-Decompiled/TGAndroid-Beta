package bc;
public final class c extends h {
    public static final c f3164c;

    static {
        ?? exc = new Exception();
        f3164c = exc;
        exc.setStackTrace(h.f3174b);
    }

    public static c a() {
        if (h.f3173a) {
            return new Exception();
        }
        return f3164c;
    }
}
