package bc;
public final class e extends h {
    public static final e f3167c;

    static {
        ?? exc = new Exception();
        f3167c = exc;
        exc.setStackTrace(h.f3174b);
    }

    public static e a() {
        if (h.f3173a) {
            return new Exception();
        }
        return f3167c;
    }
}
