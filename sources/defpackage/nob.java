package defpackage;
public final class nob extends rq9 implements Runnable {
    public final long f;

    public nob(long j, fw2 fw2Var) {
        super(fw2Var, fw2Var.getContext());
        this.f = j;
    }

    @Override
    public final String D() {
        return super.D() + "(timeMillis=" + this.f + ')';
    }

    @Override
    public final void run() {
        jde.b(this.d);
        i(new mob("Timed out waiting for " + this.f + " ms", this));
    }
}
