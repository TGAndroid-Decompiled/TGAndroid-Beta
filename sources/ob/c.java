package ob;
public final class c extends h {
    public static final c f16504c;

    static {
        ?? exc = new Exception();
        f16504c = exc;
        exc.setStackTrace(h.f16512b);
    }

    public static c a() {
        if (h.f16511a) {
            return new Exception();
        }
        return f16504c;
    }
}
