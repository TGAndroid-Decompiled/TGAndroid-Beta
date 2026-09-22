package cc;
public final class c extends h {
    public static final c f4199c;

    static {
        ?? exc = new Exception();
        f4199c = exc;
        exc.setStackTrace(h.f4207b);
    }

    public static c a() {
        if (h.f4206a) {
            return new Exception();
        }
        return f4199c;
    }
}
