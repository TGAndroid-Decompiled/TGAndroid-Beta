package defpackage;
public final class qc3 extends o54 {
    public static final qc3 d;
    public tx2 c;

    static {
        int i = zjb.c;
        int i2 = zjb.d;
        long j = zjb.e;
        String str = zjb.a;
        ?? px2Var = new px2();
        px2Var.c = new tx2(i, j, str, i2);
        d = px2Var;
    }

    @Override
    public final void c(mx2 mx2Var, Runnable runnable) {
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
