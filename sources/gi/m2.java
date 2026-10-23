package gi;

import org.telegram.messenger.R;
public final class m2 extends org.telegram.ui.ActionBar.j {
    public final d3 f11361a;

    public m2(d3 d3Var) {
        this.f11361a = d3Var;
    }

    @Override
    public final void b(int i10) {
        d3 d3Var = this.f11361a;
        if (i10 == -1) {
            if (!d3Var.f11188y.C()) {
                d3Var.r();
            }
        } else if (i10 == R.id.menu_collapse_bot) {
            d3Var.f11189y0 = true;
            d3Var.k(true);
        }
    }
}
