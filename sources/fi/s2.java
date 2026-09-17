package fi;

import org.telegram.messenger.R;
public final class s2 extends org.telegram.ui.ActionBar.j {
    public final k3 f9981a;

    public s2(k3 k3Var) {
        this.f9981a = k3Var;
    }

    @Override
    public final void b(int i10) {
        k3 k3Var = this.f9981a;
        if (i10 == -1) {
            if (!k3Var.f9817x.D()) {
                k3Var.q();
            }
        } else if (i10 == R.id.menu_collapse_bot) {
            k3Var.f9818x0 = true;
            k3Var.k(true);
        }
    }
}
