package cc;
public final class e extends h {
    public static final e f4202c;

    static {
        ?? exc = new Exception();
        f4202c = exc;
        exc.setStackTrace(h.f4207b);
    }

    public static e a() {
        if (h.f4206a) {
            return new Exception();
        }
        return f4202c;
    }
}
