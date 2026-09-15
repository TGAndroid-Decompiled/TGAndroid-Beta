package cc;
public final class c extends h {
    public static final c f4197c;

    static {
        ?? exc = new Exception();
        f4197c = exc;
        exc.setStackTrace(h.f4205b);
    }

    public static c a() {
        if (h.f4204a) {
            return new Exception();
        }
        return f4197c;
    }
}
