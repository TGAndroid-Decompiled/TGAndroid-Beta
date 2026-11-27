package defpackage;
public final class tm7 extends b59 {
    public static final tm7 c;

    static {
        ?? exc = new Exception();
        c = exc;
        exc.setStackTrace(b59.b);
    }

    public static tm7 a() {
        if (b59.a) {
            return new Exception();
        }
        return c;
    }
}
