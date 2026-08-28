package nh;

import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.qn;
public final class a0 implements p0 {
    public final o2 f18613a;
    public final j0 f18614b;

    public a0(j0 j0Var, o2 o2Var) {
        this.f18614b = j0Var;
        this.f18613a = o2Var;
    }

    @Override
    public final void a(long j10) {
        this.f18613a.presentFragment(qn.R9(j10));
        this.f18614b.dismiss();
    }

    @Override
    public final void c() {
        j0 j0Var = this.f18614b;
        j0Var.f18656w.d.U2.N(true);
        j0Var.v.d.U2.N(true);
    }

    @Override
    public final void close() {
        this.f18614b.d.D(0);
    }
}
