package cc;
public final class c extends h {
    public static final c f4616c;

    static {
        ?? exc = new Exception();
        f4616c = exc;
        exc.setStackTrace(h.f4624b);
    }

    public static c a() {
        if (h.f4623a) {
            return new Exception();
        }
        return f4616c;
    }
}
