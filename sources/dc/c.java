package dc;
public final class c extends h {
    public static final c f6470c;

    static {
        ?? exc = new Exception();
        f6470c = exc;
        exc.setStackTrace(h.f6478b);
    }

    public static c a() {
        if (h.f6477a) {
            return new Exception();
        }
        return f6470c;
    }
}
