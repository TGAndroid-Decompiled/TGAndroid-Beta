package bc;
public final class c extends h {
    public static final c f3087c;

    static {
        ?? exc = new Exception();
        f3087c = exc;
        exc.setStackTrace(h.f3097b);
    }

    public static c a() {
        if (h.f3096a) {
            return new Exception();
        }
        return f3087c;
    }
}
