package fi;

import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.wn;
public final class b0 implements s0 {
    public final m2 f9082a;
    public final k0 f9083b;

    public b0(k0 k0Var, m2 m2Var) {
        this.f9083b = k0Var;
        this.f9082a = m2Var;
    }

    @Override
    public final void close() {
        this.f9083b.d.D(0);
    }

    @Override
    public final void e(long j3) {
        this.f9082a.presentFragment(wn.R9(j3));
        this.f9083b.dismiss();
    }

    @Override
    public final void f() {
        k0 k0Var = this.f9083b;
        k0Var.f9125w.d.f28778f3.N(true);
        k0Var.v.d.f28778f3.N(true);
    }
}
