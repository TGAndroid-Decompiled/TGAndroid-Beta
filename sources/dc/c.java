package dc;
public final class c extends h {
    public static final c f7927c;

    static {
        ?? exc = new Exception();
        f7927c = exc;
        exc.setStackTrace(h.f7935b);
    }

    public static c a() {
        if (h.f7934a) {
            return new Exception();
        }
        return f7927c;
    }
}
