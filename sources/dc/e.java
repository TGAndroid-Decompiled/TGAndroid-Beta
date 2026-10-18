package dc;
public final class e extends h {
    public static final e f7930c;

    static {
        ?? exc = new Exception();
        f7930c = exc;
        exc.setStackTrace(h.f7935b);
    }

    public static e a() {
        if (h.f7934a) {
            return new Exception();
        }
        return f7930c;
    }
}
