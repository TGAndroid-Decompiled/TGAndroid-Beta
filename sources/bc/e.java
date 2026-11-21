package bc;
public final class e extends h {
    public static final e f3132c;

    static {
        ?? exc = new Exception();
        f3132c = exc;
        exc.setStackTrace(h.f3139b);
    }

    public static e a() {
        if (h.f3138a) {
            return new Exception();
        }
        return f3132c;
    }
}
