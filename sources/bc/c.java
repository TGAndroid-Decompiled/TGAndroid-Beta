package bc;
public final class c extends h {
    public static final c f3117c;

    static {
        ?? exc = new Exception();
        f3117c = exc;
        exc.setStackTrace(h.f3127b);
    }

    public static c a() {
        if (h.f3126a) {
            return new Exception();
        }
        return f3117c;
    }
}
