package bc;
public final class c extends h {
    public static final c f3122c;

    static {
        ?? exc = new Exception();
        f3122c = exc;
        exc.setStackTrace(h.f3132b);
    }

    public static c a() {
        if (h.f3131a) {
            return new Exception();
        }
        return f3122c;
    }
}
