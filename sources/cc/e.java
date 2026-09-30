package cc;
public final class e extends h {
    public static final e f4197c;

    static {
        ?? exc = new Exception();
        f4197c = exc;
        exc.setStackTrace(h.f4202b);
    }

    public static e a() {
        if (h.f4201a) {
            return new Exception();
        }
        return f4197c;
    }
}
