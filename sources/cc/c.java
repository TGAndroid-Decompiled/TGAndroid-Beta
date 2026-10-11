package cc;
public final class c extends h {
    public static final c f4587c;

    static {
        ?? exc = new Exception();
        f4587c = exc;
        exc.setStackTrace(h.f4597b);
    }

    public static c a() {
        if (h.f4596a) {
            return new Exception();
        }
        return f4587c;
    }
}
