package nh;

import org.telegram.messenger.R;

public final class l2 extends org.telegram.ui.ActionBar.j {

    public final b3 f18801a;

    public l2(b3 b3Var) {
        this.f18801a = b3Var;
    }

    @Override
    public final void b(int i10) {
        b3 b3Var = this.f18801a;
        if (i10 == -1) {
            if (b3Var.f18599x.z()) {
                return;
            }
            b3Var.q();
        } else if (i10 == R.id.menu_collapse_bot) {
            b3Var.f18594t0 = true;
            b3Var.k(true);
        }
    }
}
