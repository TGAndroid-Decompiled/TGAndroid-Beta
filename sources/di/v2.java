package di;

import org.telegram.messenger.R;
public final class v2 extends org.telegram.ui.ActionBar.k {
    public final n3 f6960a;

    public v2(n3 n3Var) {
        this.f6960a = n3Var;
    }

    @Override
    public final void b(int i10) {
        n3 n3Var = this.f6960a;
        if (i10 == -1) {
            if (!n3Var.f6812x.D()) {
                n3Var.q();
            }
        } else if (i10 == R.id.menu_collapse_bot) {
            n3Var.f6813x0 = true;
            n3Var.k(true);
        }
    }
}
