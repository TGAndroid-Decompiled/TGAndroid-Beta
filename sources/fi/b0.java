package fi;

import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.bo;
public final class b0 implements s0 {
    public final n2 f9083a;
    public final k0 f9084b;

    public b0(k0 k0Var, n2 n2Var) {
        this.f9084b = k0Var;
        this.f9083a = n2Var;
    }

    @Override
    public final void a(long j3) {
        this.f9083a.presentFragment(bo.R9(j3));
        this.f9084b.dismiss();
    }

    @Override
    public final void close() {
        this.f9084b.d.D(0);
    }

    @Override
    public final void e() {
        k0 k0Var = this.f9084b;
        k0Var.f9126w.d.Y2.N(true);
        k0Var.v.d.Y2.N(true);
    }
}
