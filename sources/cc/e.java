package cc;
public final class e extends h {
    public static final e f4199c;

    static {
        ?? exc = new Exception();
        f4199c = exc;
        exc.setStackTrace(h.f4204b);
    }

    public static e a() {
        if (h.f4203a) {
            return new Exception();
        }
        return f4199c;
    }
}
