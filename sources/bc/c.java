package bc;
public final class c extends h {
    public static final c f3136c;

    static {
        ?? exc = new Exception();
        f3136c = exc;
        exc.setStackTrace(h.f3146b);
    }

    public static c a() {
        if (h.f3145a) {
            return new Exception();
        }
        return f3136c;
    }
}
