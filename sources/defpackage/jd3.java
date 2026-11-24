package defpackage;
public final class jd3 extends d64 {
    public static final jd3 d;
    public jy2 c;

    static {
        int i = eib.c;
        int i2 = eib.d;
        long j = eib.e;
        String str = eib.a;
        ?? fy2Var = new fy2();
        fy2Var.c = new jy2(i, j, str, i2);
        d = fy2Var;
    }

    @Override
    public final void c(cy2 cy2Var, Runnable runnable) {
        this.c.b(runnable, false);
    }

    @Override
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override
    public final String toString() {
        return "Dispatchers.Default";
    }
}
