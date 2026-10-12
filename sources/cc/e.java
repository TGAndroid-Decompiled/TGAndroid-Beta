package cc;
public final class e extends h {
    public static final e f4589c;

    static {
        ?? exc = new Exception();
        f4589c = exc;
        exc.setStackTrace(h.f4596b);
    }

    public static e a() {
        if (h.f4595a) {
            return new Exception();
        }
        return f4589c;
    }
}
