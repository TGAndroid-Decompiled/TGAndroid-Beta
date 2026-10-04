package ei;

import org.telegram.messenger.R;
public final class t2 extends org.telegram.ui.ActionBar.j {
    public final l3 f9346a;

    public t2(l3 l3Var) {
        this.f9346a = l3Var;
    }

    @Override
    public final void b(int i10) {
        l3 l3Var = this.f9346a;
        if (i10 == -1) {
            if (!l3Var.f9180x.D()) {
                l3Var.q();
            }
        } else if (i10 == R.id.menu_collapse_bot) {
            l3Var.f9181x0 = true;
            l3Var.k(true);
        }
    }
}
