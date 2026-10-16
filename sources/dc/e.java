package dc;
public final class e extends h {
    public static final e f6476c;

    static {
        ?? exc = new Exception();
        f6476c = exc;
        exc.setStackTrace(h.f6481b);
    }

    public static e a() {
        if (h.f6480a) {
            return new Exception();
        }
        return f6476c;
    }
}
