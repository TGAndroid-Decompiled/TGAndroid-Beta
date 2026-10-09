package cc;
public final class e extends h {
    public static final e f4591c;

    static {
        ?? exc = new Exception();
        f4591c = exc;
        exc.setStackTrace(h.f4598b);
    }

    public static e a() {
        if (h.f4597a) {
            return new Exception();
        }
        return f4591c;
    }
}
