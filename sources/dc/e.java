package dc;
public final class e extends h {
    public static final e f7931c;

    static {
        ?? exc = new Exception();
        f7931c = exc;
        exc.setStackTrace(h.f7936b);
    }

    public static e a() {
        if (h.f7935a) {
            return new Exception();
        }
        return f7931c;
    }
}
