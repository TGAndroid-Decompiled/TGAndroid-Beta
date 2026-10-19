package gi;

import org.telegram.messenger.R;
public final class m2 extends org.telegram.ui.ActionBar.j {
    public final d3 f11336a;

    public m2(d3 d3Var) {
        this.f11336a = d3Var;
    }

    @Override
    public final void b(int i10) {
        d3 d3Var = this.f11336a;
        if (i10 == -1) {
            if (!d3Var.f11164x.C()) {
                d3Var.r();
            }
        } else if (i10 == R.id.menu_collapse_bot) {
            d3Var.f11165x0 = true;
            d3Var.k(true);
        }
    }
}
