package ei;

import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.eo;
public final class b0 implements s0 {
    public final p2 f7532a;
    public final k0 f7533b;

    public b0(k0 k0Var, p2 p2Var) {
        this.f7533b = k0Var;
        this.f7532a = p2Var;
    }

    @Override
    public final void F() {
        k0 k0Var = this.f7533b;
        k0Var.f7575w.d.Y2.N(true);
        k0Var.v.d.Y2.N(true);
    }

    @Override
    public final void close() {
        this.f7533b.d.D(0);
    }

    @Override
    public final void v(long j3) {
        this.f7532a.presentFragment(eo.R9(j3));
        this.f7533b.dismiss();
    }
}
