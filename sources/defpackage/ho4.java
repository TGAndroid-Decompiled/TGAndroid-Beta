package defpackage;
public final class ho4 extends p39 {
    public static final ho4 c;

    static {
        ?? exc = new Exception();
        c = exc;
        exc.setStackTrace(p39.b);
    }

    public static ho4 a() {
        if (p39.a) {
            return new Exception();
        }
        return c;
    }
}
