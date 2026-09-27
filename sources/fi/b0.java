package fi;

import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.xn;
public final class b0 implements s0 {
    public final o2 f9075a;
    public final k0 f9076b;

    public b0(k0 k0Var, o2 o2Var) {
        this.f9076b = k0Var;
        this.f9075a = o2Var;
    }

    @Override
    public final void close() {
        this.f9076b.d.E(0);
    }

    @Override
    public final void e(long j3) {
        this.f9075a.presentFragment(xn.R9(j3));
        this.f9076b.dismiss();
    }

    @Override
    public final void f() {
        k0 k0Var = this.f9076b;
        k0Var.f9118w.d.Y2.N(true);
        k0Var.v.d.Y2.N(true);
    }
}
