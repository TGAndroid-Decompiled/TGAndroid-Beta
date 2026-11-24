package defpackage;
public final class xb3 extends s44 {
    public static final xb3 d;
    public zw2 c;

    static {
        int i = dgb.c;
        int i2 = dgb.d;
        long j = dgb.e;
        String str = dgb.a;
        ?? vw2Var = new vw2();
        vw2Var.c = new zw2(i, j, str, i2);
        d = vw2Var;
    }

    @Override
    public final void c(sw2 sw2Var, Runnable runnable) {
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
