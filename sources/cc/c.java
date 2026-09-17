package cc;
public final class c extends h {
    public static final c f4731c;

    static {
        ?? exc = new Exception();
        f4731c = exc;
        exc.setStackTrace(h.f4741b);
    }

    public static c a() {
        if (h.f4740a) {
            return new Exception();
        }
        return f4731c;
    }
}
