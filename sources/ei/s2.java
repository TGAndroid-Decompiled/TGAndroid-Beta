package ei;

import org.telegram.messenger.R;
public final class s2 extends org.telegram.ui.ActionBar.j {
    public final k3 f9347a;

    public s2(k3 k3Var) {
        this.f9347a = k3Var;
    }

    @Override
    public final void b(int i10) {
        k3 k3Var = this.f9347a;
        if (i10 == -1) {
            if (!k3Var.f9182x.C()) {
                k3Var.r();
            }
        } else if (i10 == R.id.menu_collapse_bot) {
            k3Var.f9183x0 = true;
            k3Var.k(true);
        }
    }
}
