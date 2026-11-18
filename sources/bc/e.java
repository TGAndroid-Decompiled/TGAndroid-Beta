package bc;
public final class e extends h {
    public static final e f3119c;

    static {
        ?? exc = new Exception();
        f3119c = exc;
        exc.setStackTrace(h.f3126b);
    }

    public static e a() {
        if (h.f3125a) {
            return new Exception();
        }
        return f3119c;
    }
}
