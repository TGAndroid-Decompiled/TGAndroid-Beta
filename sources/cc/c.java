package cc;
public final class c extends h {
    public static final c f4586c;

    static {
        ?? exc = new Exception();
        f4586c = exc;
        exc.setStackTrace(h.f4596b);
    }

    public static c a() {
        if (h.f4595a) {
            return new Exception();
        }
        return f4586c;
    }
}
