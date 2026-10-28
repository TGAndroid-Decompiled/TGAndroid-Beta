package ec;
public final class c extends h {
    public static final c f9878c;

    static {
        ?? exc = new Exception();
        f9878c = exc;
        exc.setStackTrace(h.f9886b);
    }

    public static c a() {
        if (h.f9885a) {
            return new Exception();
        }
        return f9878c;
    }
}
