package cg;
public final class g0 implements Runnable {
    public final int f2387a;
    public final m0 f2388b;

    public g0(m0 m0Var, int i10) {
        this.f2387a = i10;
        this.f2388b = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f2387a) {
            case 0:
                m0 m0Var = this.f2388b;
                m mVar = m0Var.A;
                if (mVar != null) {
                    m0Var.f2431a.g(mVar);
                    m0Var.A = null;
                    return;
                }
                return;
            default:
                this.f2388b.a(null, true, null);
                return;
        }
    }
}
