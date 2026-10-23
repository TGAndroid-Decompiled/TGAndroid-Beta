package hi;

import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.sn;
public final class b0 implements r0 {
    public final o2 f12161a;
    public final k0 f12162b;

    public b0(k0 k0Var, o2 o2Var) {
        this.f12162b = k0Var;
        this.f12161a = o2Var;
    }

    @Override
    public final void close() {
        this.f12162b.d.D(0);
    }

    @Override
    public final void j(long j10) {
        this.f12161a.presentFragment(sn.W9(j10));
        this.f12162b.dismiss();
    }

    @Override
    public final void q() {
        k0 k0Var = this.f12162b;
        k0Var.f12205w.d.Z2.N(true);
        k0Var.v.d.Z2.N(true);
    }
}
