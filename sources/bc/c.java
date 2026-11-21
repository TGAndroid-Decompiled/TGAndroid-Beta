package bc;
public final class c extends h {
    public static final c f3129c;

    static {
        ?? exc = new Exception();
        f3129c = exc;
        exc.setStackTrace(h.f3139b);
    }

    public static c a() {
        if (h.f3138a) {
            return new Exception();
        }
        return f3129c;
    }
}
