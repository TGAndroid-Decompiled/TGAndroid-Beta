package defpackage;
public final class lr5 extends ft5 {
    public static final long f = ex.a.objectFieldOffset(lr5.class.getDeclaredField("_invoked$volatile"));
    private volatile int _invoked$volatile = 0;
    public final qp4 e;

    public lr5(qp4 qp4Var) {
        this.e = qp4Var;
    }

    @Override
    public final boolean k() {
        return true;
    }

    @Override
    public final void l(Throwable th) {
        if (ex.a.compareAndSwapInt(this, f, 0, 1)) {
            this.e.invoke(th);
        }
    }
}
