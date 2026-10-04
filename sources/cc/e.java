package cc;
public final class e extends h {
    public static final e f4540c;

    static {
        ?? exc = new Exception();
        f4540c = exc;
        exc.setStackTrace(h.f4547b);
    }

    public static e a() {
        if (h.f4546a) {
            return new Exception();
        }
        return f4540c;
    }
}
