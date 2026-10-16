package gi;

import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.fo;
public final class b0 implements s0 {
    public final m2 f10167a;
    public final k0 f10168b;

    public b0(k0 k0Var, m2 m2Var) {
        this.f10168b = k0Var;
        this.f10167a = m2Var;
    }

    @Override
    public final void close() {
        this.f10168b.d.D(0);
    }

    @Override
    public final void n(long j10) {
        this.f10167a.presentFragment(fo.W9(j10));
        this.f10168b.dismiss();
    }

    @Override
    public final void p() {
        k0 k0Var = this.f10168b;
        k0Var.f10210w.d.W2.N(true);
        k0Var.v.d.W2.N(true);
    }
}
