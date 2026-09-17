package cc;
public final class e extends h {
    public static final e f4761c;

    static {
        ?? exc = new Exception();
        f4761c = exc;
        exc.setStackTrace(h.f4768b);
    }

    public static e a() {
        if (h.f4767a) {
            return new Exception();
        }
        return f4761c;
    }
}
