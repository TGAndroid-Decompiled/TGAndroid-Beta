package cc;
public final class e extends h {
    public static final e f4619c;

    static {
        ?? exc = new Exception();
        f4619c = exc;
        exc.setStackTrace(h.f4624b);
    }

    public static e a() {
        if (h.f4623a) {
            return new Exception();
        }
        return f4619c;
    }
}
