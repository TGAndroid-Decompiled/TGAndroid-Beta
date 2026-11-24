package defpackage;
public final class uj7 extends m19 {
    public static final uj7 c;

    static {
        ?? exc = new Exception();
        c = exc;
        exc.setStackTrace(m19.b);
    }

    public static uj7 a() {
        if (m19.a) {
            return new Exception();
        }
        return c;
    }
}
