package cc;
public final class c extends h {
    public static final c f4758c;

    static {
        ?? exc = new Exception();
        f4758c = exc;
        exc.setStackTrace(h.f4768b);
    }

    public static c a() {
        if (h.f4767a) {
            return new Exception();
        }
        return f4758c;
    }
}
