package oh;

import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.rn;

public final class a0 implements p0 {

    public final n2 f19462a;

    public final j0 f19463b;

    public a0(j0 j0Var, n2 n2Var) {
        this.f19463b = j0Var;
        this.f19462a = n2Var;
    }

    @Override
    public final void b(long j10) {
        this.f19462a.presentFragment(rn.R9(j10));
        this.f19463b.dismiss();
    }

    @Override
    public final void close() {
        this.f19463b.d.D(0);
    }

    @Override
    public final void i() {
        j0 j0Var = this.f19463b;
        j0Var.f19505w.d.U2.N(true);
        j0Var.v.d.U2.N(true);
    }
}
