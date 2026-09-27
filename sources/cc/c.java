package cc;
public final class c extends h {
    public static final c f4196c;

    static {
        ?? exc = new Exception();
        f4196c = exc;
        exc.setStackTrace(h.f4204b);
    }

    public static c a() {
        if (h.f4203a) {
            return new Exception();
        }
        return f4196c;
    }
}
