package ei;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
public final class g2 implements p4, GenericProvider, org.telegram.ui.ActionBar.a2 {
    public final l3 f9063a;

    public g2(l3 l3Var) {
        this.f9063a = l3Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f9063a.k(false);
    }

    @Override
    public void o(boolean z10) {
        l3 l3Var = this.f9063a;
        if (l3Var.f9156d0 && z10) {
            return;
        }
        l3Var.k(true);
    }

    @Override
    public Object provide(Object obj) {
        boolean z10;
        Void r22 = (Void) obj;
        if (this.f9063a.f9157e.getKeyboardHeight() >= AndroidUtilities.dp(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
