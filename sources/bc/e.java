package bc;
public final class e extends h {
    public static final e f3139c;

    static {
        ?? exc = new Exception();
        f3139c = exc;
        exc.setStackTrace(h.f3146b);
    }

    public static e a() {
        if (h.f3145a) {
            return new Exception();
        }
        return f3139c;
    }
}
