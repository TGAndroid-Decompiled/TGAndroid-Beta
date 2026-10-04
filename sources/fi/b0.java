package fi;

import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.yn;
public final class b0 implements s0 {
    public final n2 f9873a;
    public final k0 f9874b;

    public b0(k0 k0Var, n2 n2Var) {
        this.f9874b = k0Var;
        this.f9873a = n2Var;
    }

    @Override
    public final void close() {
        this.f9874b.d.E(0);
    }

    @Override
    public final void k(long j3) {
        this.f9873a.presentFragment(yn.Q9(j3));
        this.f9874b.dismiss();
    }

    @Override
    public final void l() {
        k0 k0Var = this.f9874b;
        k0Var.f9921w.d.f25244f3.N(true);
        k0Var.v.d.f25244f3.N(true);
    }
}
