package kb;
public final class c extends h {
    public static final c f14732c;

    static {
        ?? exc = new Exception();
        f14732c = exc;
        exc.setStackTrace(h.f14742b);
    }

    public static c a() {
        if (h.f14741a) {
            return new Exception();
        }
        return f14732c;
    }
}
