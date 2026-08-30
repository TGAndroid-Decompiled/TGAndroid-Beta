package cg;
public final class g0 implements Runnable {
    public final int f2404a;
    public final m0 f2405b;

    public g0(m0 m0Var, int i10) {
        this.f2404a = i10;
        this.f2405b = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f2404a) {
            case 0:
                m0 m0Var = this.f2405b;
                m mVar = m0Var.A;
                if (mVar != null) {
                    m0Var.f2448a.g(mVar);
                    m0Var.A = null;
                    return;
                }
                return;
            default:
                this.f2405b.a(null, true, null);
                return;
        }
    }
}
