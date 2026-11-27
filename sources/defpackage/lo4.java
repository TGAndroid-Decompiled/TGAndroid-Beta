package defpackage;
public final class lo4 extends b59 {
    public static final lo4 c;

    static {
        ?? exc = new Exception();
        c = exc;
        exc.setStackTrace(b59.b);
    }

    public static lo4 a() {
        if (b59.a) {
            return new Exception();
        }
        return c;
    }
}
