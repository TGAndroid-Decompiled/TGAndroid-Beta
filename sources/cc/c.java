package cc;
public final class c extends h {
    public static final c f4203c;

    static {
        ?? exc = new Exception();
        f4203c = exc;
        exc.setStackTrace(h.f4211b);
    }

    public static c a() {
        if (h.f4210a) {
            return new Exception();
        }
        return f4203c;
    }
}
