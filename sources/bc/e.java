package bc;
public final class e extends h {
    public static final e f3122c;

    static {
        ?? exc = new Exception();
        f3122c = exc;
        exc.setStackTrace(h.f3129b);
    }

    public static e a() {
        if (h.f3128a) {
            return new Exception();
        }
        return f3122c;
    }
}
