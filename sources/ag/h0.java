package ag;
public final class h0 implements Runnable {
    public final int f507a;
    public final n0 f508b;

    public h0(n0 n0Var, int i10) {
        this.f507a = i10;
        this.f508b = n0Var;
    }

    @Override
    public final void run() {
        switch (this.f507a) {
            case 0:
                n0 n0Var = this.f508b;
                m mVar = n0Var.A;
                if (mVar != null) {
                    n0Var.f592a.g(mVar);
                    n0Var.A = null;
                    return;
                }
                return;
            default:
                this.f508b.a(null, true, null);
                return;
        }
    }
}
