package gi;

import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.fo;
public final class b0 implements s0 {
    public final m2 f10163a;
    public final k0 f10164b;

    public b0(k0 k0Var, m2 m2Var) {
        this.f10164b = k0Var;
        this.f10163a = m2Var;
    }

    @Override
    public final void a(long j10) {
        this.f10163a.presentFragment(fo.W9(j10));
        this.f10164b.dismiss();
    }

    @Override
    public final void b() {
        k0 k0Var = this.f10164b;
        k0Var.f10206w.d.W2.N(true);
        k0Var.v.d.W2.N(true);
    }

    @Override
    public final void close() {
        this.f10164b.d.D(0);
    }
}
