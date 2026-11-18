package bc;
public final class c extends h {
    public static final c f3116c;

    static {
        ?? exc = new Exception();
        f3116c = exc;
        exc.setStackTrace(h.f3126b);
    }

    public static c a() {
        if (h.f3125a) {
            return new Exception();
        }
        return f3116c;
    }
}
