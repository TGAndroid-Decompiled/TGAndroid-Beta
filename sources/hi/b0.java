package hi;

import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.qn;
public final class b0 implements r0 {
    public final n2 f12133a;
    public final k0 f12134b;

    public b0(k0 k0Var, n2 n2Var) {
        this.f12134b = k0Var;
        this.f12133a = n2Var;
    }

    @Override
    public final void close() {
        this.f12134b.d.D(0);
    }

    @Override
    public final void j(long j10) {
        this.f12133a.presentFragment(qn.W9(j10));
        this.f12134b.dismiss();
    }

    @Override
    public final void l() {
        k0 k0Var = this.f12134b;
        k0Var.f12176w.d.W2.N(true);
        k0Var.v.d.W2.N(true);
    }
}
