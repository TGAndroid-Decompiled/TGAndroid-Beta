package cc;
public final class c extends h {
    public static final c f4201c;

    static {
        ?? exc = new Exception();
        f4201c = exc;
        exc.setStackTrace(h.f4209b);
    }

    public static c a() {
        if (h.f4208a) {
            return new Exception();
        }
        return f4201c;
    }
}
