package cc;
public final class c extends h {
    public static final c f4202c;

    static {
        ?? exc = new Exception();
        f4202c = exc;
        exc.setStackTrace(h.f4210b);
    }

    public static c a() {
        if (h.f4209a) {
            return new Exception();
        }
        return f4202c;
    }
}
