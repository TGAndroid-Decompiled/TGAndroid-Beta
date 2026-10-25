package ec;
public final class e extends h {
    public static final e f9882c;

    static {
        ?? exc = new Exception();
        f9882c = exc;
        exc.setStackTrace(h.f9887b);
    }

    public static e a() {
        if (h.f9886a) {
            return new Exception();
        }
        return f9882c;
    }
}
