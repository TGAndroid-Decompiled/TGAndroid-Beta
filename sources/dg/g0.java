package dg;
public final class g0 implements Runnable {
    public final int f4541a;
    public final m0 f4542b;

    public g0(m0 m0Var, int i10) {
        this.f4541a = i10;
        this.f4542b = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f4541a) {
            case 0:
                m0 m0Var = this.f4542b;
                m mVar = m0Var.A;
                if (mVar != null) {
                    m0Var.f4582a.g(mVar);
                    m0Var.A = null;
                    return;
                }
                return;
            default:
                this.f4542b.a(null, true, null);
                return;
        }
    }
}
