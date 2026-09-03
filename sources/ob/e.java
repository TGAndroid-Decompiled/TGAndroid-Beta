package ob;
public final class e extends h {
    public static final e f16692c;

    static {
        ?? exc = new Exception();
        f16692c = exc;
        exc.setStackTrace(h.f16699b);
    }

    public static e a() {
        if (h.f16698a) {
            return new Exception();
        }
        return f16692c;
    }
}
