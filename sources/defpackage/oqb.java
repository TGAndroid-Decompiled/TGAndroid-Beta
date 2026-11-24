package defpackage;
public final class oqb extends ss9 implements Runnable {
    public final long f;

    public oqb(long j, px2 px2Var) {
        super(px2Var, px2Var.getContext());
        this.f = j;
    }

    @Override
    public final String D() {
        return super.D() + "(timeMillis=" + this.f + ')';
    }

    @Override
    public final void run() {
        kfe.b(this.d);
        i(new nqb("Timed out waiting for " + this.f + " ms", this));
    }
}
