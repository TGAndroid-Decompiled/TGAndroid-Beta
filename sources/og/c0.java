package og;
public final class c0 implements Runnable {
    public final int f14336a;
    public final g0 f14337b;

    public c0(g0 g0Var, int i10) {
        this.f14336a = i10;
        this.f14337b = g0Var;
    }

    @Override
    public final void run() {
        switch (this.f14336a) {
            case 0:
                g0 g0Var = this.f14337b;
                m mVar = g0Var.A;
                if (mVar != null) {
                    g0Var.f14364a.g(mVar);
                    g0Var.A = null;
                    return;
                }
                return;
            default:
                this.f14337b.a(null, true, null);
                return;
        }
    }
}
