package cc;
public final class e extends h {
    public static final e f4205c;

    static {
        ?? exc = new Exception();
        f4205c = exc;
        exc.setStackTrace(h.f4210b);
    }

    public static e a() {
        if (h.f4209a) {
            return new Exception();
        }
        return f4205c;
    }
}
