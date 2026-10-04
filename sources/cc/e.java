package cc;
public final class e extends h {
    public static final e f4541c;

    static {
        ?? exc = new Exception();
        f4541c = exc;
        exc.setStackTrace(h.f4548b);
    }

    public static e a() {
        if (h.f4547a) {
            return new Exception();
        }
        return f4541c;
    }
}
