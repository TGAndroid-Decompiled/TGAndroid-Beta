package fi;

import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.zn;
public final class b0 implements s0 {
    public final m2 f9948a;
    public final k0 f9949b;

    public b0(k0 k0Var, m2 m2Var) {
        this.f9949b = k0Var;
        this.f9948a = m2Var;
    }

    @Override
    public final void a(long j3) {
        this.f9948a.presentFragment(zn.W9(j3));
        this.f9949b.dismiss();
    }

    @Override
    public final void close() {
        this.f9949b.d.D(0);
    }

    @Override
    public final void i() {
        k0 k0Var = this.f9949b;
        k0Var.f9996w.d.W2.N(true);
        k0Var.v.d.W2.N(true);
    }
}
