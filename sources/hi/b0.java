package hi;

import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.sn;
public final class b0 implements r0 {
    public final n2 f12134a;
    public final k0 f12135b;

    public b0(k0 k0Var, n2 n2Var) {
        this.f12135b = k0Var;
        this.f12134a = n2Var;
    }

    @Override
    public final void close() {
        this.f12135b.d.D(0);
    }

    @Override
    public final void j(long j10) {
        this.f12134a.presentFragment(sn.W9(j10));
        this.f12135b.dismiss();
    }

    @Override
    public final void p() {
        k0 k0Var = this.f12135b;
        k0Var.f12177w.d.W2.N(true);
        k0Var.v.d.W2.N(true);
    }
}
