package ei;

import org.telegram.messenger.R;
public final class s2 extends org.telegram.ui.ActionBar.j {
    public final k3 f8602a;

    public s2(k3 k3Var) {
        this.f8602a = k3Var;
    }

    @Override
    public final void b(int i10) {
        k3 k3Var = this.f8602a;
        if (i10 == -1) {
            if (!k3Var.f8451x.D()) {
                k3Var.q();
            }
        } else if (i10 == R.id.menu_collapse_bot) {
            k3Var.f8452x0 = true;
            k3Var.k(true);
        }
    }
}
