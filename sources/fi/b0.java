package fi;

import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.zn;
public final class b0 implements s0 {
    public final n2 f9087a;
    public final k0 f9088b;

    public b0(k0 k0Var, n2 n2Var) {
        this.f9088b = k0Var;
        this.f9087a = n2Var;
    }

    @Override
    public final void close() {
        this.f9088b.d.E(0);
    }

    @Override
    public final void e(long j3) {
        this.f9087a.presentFragment(zn.R9(j3));
        this.f9088b.dismiss();
    }

    @Override
    public final void f() {
        k0 k0Var = this.f9088b;
        k0Var.f9130w.d.Y2.N(true);
        k0Var.v.d.Y2.N(true);
    }
}
