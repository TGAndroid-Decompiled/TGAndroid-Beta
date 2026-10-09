package cc;
public final class c extends h {
    public static final c f4588c;

    static {
        ?? exc = new Exception();
        f4588c = exc;
        exc.setStackTrace(h.f4598b);
    }

    public static c a() {
        if (h.f4597a) {
            return new Exception();
        }
        return f4588c;
    }
}
