package bc;
public final class c extends h {
    public static final c f3119c;

    static {
        ?? exc = new Exception();
        f3119c = exc;
        exc.setStackTrace(h.f3129b);
    }

    public static c a() {
        if (h.f3128a) {
            return new Exception();
        }
        return f3119c;
    }
}
