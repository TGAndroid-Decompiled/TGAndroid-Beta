package defpackage;
public final class nt5 extends iv5 {
    public static final long f = fx.a.objectFieldOffset(nt5.class.getDeclaredField("_invoked$volatile"));
    private volatile int _invoked$volatile = 0;
    public final ur4 e;

    public nt5(ur4 ur4Var) {
        this.e = ur4Var;
    }

    @Override
    public final boolean k() {
        return true;
    }

    @Override
    public final void l(Throwable th) {
        if (fx.a.compareAndSwapInt(this, f, 0, 1)) {
            this.e.invoke(th);
        }
    }
}
