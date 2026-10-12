package dc;
public final class e extends h {
    public static final e f6473c;

    static {
        ?? exc = new Exception();
        f6473c = exc;
        exc.setStackTrace(h.f6478b);
    }

    public static e a() {
        if (h.f6477a) {
            return new Exception();
        }
        return f6473c;
    }
}
