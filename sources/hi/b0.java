package hi;

import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.sn;
public final class b0 implements r0 {
    public final n2 f12132a;
    public final k0 f12133b;

    public b0(k0 k0Var, n2 n2Var) {
        this.f12133b = k0Var;
        this.f12132a = n2Var;
    }

    @Override
    public final void close() {
        this.f12133b.d.D(0);
    }

    @Override
    public final void j(long j10) {
        this.f12132a.presentFragment(sn.W9(j10));
        this.f12133b.dismiss();
    }

    @Override
    public final void p() {
        k0 k0Var = this.f12133b;
        k0Var.f12175w.d.W2.N(true);
        k0Var.v.d.W2.N(true);
    }
}
