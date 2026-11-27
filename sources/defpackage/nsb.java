package defpackage;
public final class nsb extends ju9 implements Runnable {
    public final long f;

    public nsb(long j, zw2 zw2Var) {
        super(zw2Var, zw2Var.getContext());
        this.f = j;
    }

    @Override
    public final String D() {
        return super.D() + "(timeMillis=" + this.f + ')';
    }

    @Override
    public final void run() {
        aie.b(this.d);
        i(new msb("Timed out waiting for " + this.f + " ms", this));
    }
}
