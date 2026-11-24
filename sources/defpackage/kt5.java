package defpackage;
public final class kt5 extends ev5 {
    public static final long f = fy.a.objectFieldOffset(kt5.class.getDeclaredField("_invoked$volatile"));
    private volatile int _invoked$volatile = 0;
    public final rr4 e;

    public kt5(rr4 rr4Var) {
        this.e = rr4Var;
    }

    @Override
    public final boolean k() {
        return true;
    }

    @Override
    public final void l(Throwable th) {
        if (fy.a.compareAndSwapInt(this, f, 0, 1)) {
            this.e.invoke(th);
        }
    }
}
