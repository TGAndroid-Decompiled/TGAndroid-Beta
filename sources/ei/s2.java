package ei;

import org.telegram.messenger.R;
public final class s2 extends org.telegram.ui.ActionBar.j {
    public final k3 f8606a;

    public s2(k3 k3Var) {
        this.f8606a = k3Var;
    }

    @Override
    public final void b(int i10) {
        k3 k3Var = this.f8606a;
        if (i10 == -1) {
            if (!k3Var.f8455x.D()) {
                k3Var.q();
            }
        } else if (i10 == R.id.menu_collapse_bot) {
            k3Var.f8456x0 = true;
            k3Var.k(true);
        }
    }
}
