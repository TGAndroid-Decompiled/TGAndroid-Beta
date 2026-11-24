package defpackage;
public final class gm4 extends m19 {
    public static final gm4 c;

    static {
        ?? exc = new Exception();
        c = exc;
        exc.setStackTrace(m19.b);
    }

    public static gm4 a() {
        if (m19.a) {
            return new Exception();
        }
        return c;
    }
}
