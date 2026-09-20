package cc;
public final class e extends h {
    public static final e f4206c;

    static {
        ?? exc = new Exception();
        f4206c = exc;
        exc.setStackTrace(h.f4211b);
    }

    public static e a() {
        if (h.f4210a) {
            return new Exception();
        }
        return f4206c;
    }
}
