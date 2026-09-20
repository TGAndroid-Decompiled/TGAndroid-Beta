package ei;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
public final class f2 implements o4, GenericProvider, org.telegram.ui.ActionBar.a2 {
    public final k3 f8332a;

    public f2(k3 k3Var) {
        this.f8332a = k3Var;
    }

    @Override
    public void i(boolean z10) {
        k3 k3Var = this.f8332a;
        if (k3Var.f8432d0 && z10) {
            return;
        }
        k3Var.k(true);
    }

    @Override
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f8332a.k(false);
    }

    @Override
    public Object provide(Object obj) {
        boolean z10;
        Void r22 = (Void) obj;
        if (this.f8332a.e.getKeyboardHeight() >= AndroidUtilities.dp(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
