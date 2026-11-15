package bc;
public final class e extends h {
    public static final e f3125c;

    static {
        ?? exc = new Exception();
        f3125c = exc;
        exc.setStackTrace(h.f3132b);
    }

    public static e a() {
        if (h.f3131a) {
            return new Exception();
        }
        return f3125c;
    }
}
