package fi;

import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.eo;
public final class b0 implements s0 {
    public final m2 f9947a;
    public final k0 f9948b;

    public b0(k0 k0Var, m2 m2Var) {
        this.f9948b = k0Var;
        this.f9947a = m2Var;
    }

    @Override
    public final void a(long j3) {
        this.f9947a.presentFragment(eo.W9(j3));
        this.f9948b.dismiss();
    }

    @Override
    public final void close() {
        this.f9948b.d.D(0);
    }

    @Override
    public final void i() {
        k0 k0Var = this.f9948b;
        k0Var.f9995w.d.W2.N(true);
        k0Var.v.d.W2.N(true);
    }
}
