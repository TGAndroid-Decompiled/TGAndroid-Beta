package fi;

import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.xn;
public final class b0 implements s0 {
    public final n2 f9071a;
    public final k0 f9072b;

    public b0(k0 k0Var, n2 n2Var) {
        this.f9072b = k0Var;
        this.f9071a = n2Var;
    }

    @Override
    public final void a(long j3) {
        this.f9071a.presentFragment(xn.R9(j3));
        this.f9072b.dismiss();
    }

    @Override
    public final void close() {
        this.f9072b.d.D(0);
    }

    @Override
    public final void e() {
        k0 k0Var = this.f9072b;
        k0Var.f9114w.d.Y2.N(true);
        k0Var.v.d.Y2.N(true);
    }
}
