package mb;
public final class e extends h {
    public static final e f16956c;

    static {
        ?? exc = new Exception();
        f16956c = exc;
        exc.setStackTrace(h.f16963b);
    }

    public static e a() {
        if (h.f16962a) {
            return new Exception();
        }
        return f16956c;
    }
}
