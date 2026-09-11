package gi;

import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.co;
public final class b0 implements s0 {
    public final n2 f10668a;
    public final k0 f10669b;

    public b0(k0 k0Var, n2 n2Var) {
        this.f10669b = k0Var;
        this.f10668a = n2Var;
    }

    @Override
    public final void close() {
        this.f10669b.d.D(0);
    }

    @Override
    public final void g(long j3) {
        this.f10668a.presentFragment(co.R9(j3));
        this.f10669b.dismiss();
    }

    @Override
    public final void l() {
        k0 k0Var = this.f10669b;
        k0Var.f10716w.d.Y2.N(true);
        k0Var.v.d.Y2.N(true);
    }
}
