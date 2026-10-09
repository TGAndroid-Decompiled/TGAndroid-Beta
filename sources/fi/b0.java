package fi;

import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.zn;
public final class b0 implements s0 {
    public final n2 f9949a;
    public final k0 f9950b;

    public b0(k0 k0Var, n2 n2Var) {
        this.f9950b = k0Var;
        this.f9949a = n2Var;
    }

    @Override
    public final void a(long j3) {
        this.f9949a.presentFragment(zn.W9(j3));
        this.f9950b.dismiss();
    }

    @Override
    public final void close() {
        this.f9950b.d.D(0);
    }

    @Override
    public final void n() {
        k0 k0Var = this.f9950b;
        k0Var.f9997w.d.W2.N(true);
        k0Var.v.d.W2.N(true);
    }
}
