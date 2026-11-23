package bc;
public final class e extends h {
    public static final e f3090c;

    static {
        ?? exc = new Exception();
        f3090c = exc;
        exc.setStackTrace(h.f3097b);
    }

    public static e a() {
        if (h.f3096a) {
            return new Exception();
        }
        return f3090c;
    }
}
