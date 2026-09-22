package ei;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
public final class f2 implements o4, GenericProvider, org.telegram.ui.ActionBar.a2 {
    public final k3 f8331a;

    public f2(k3 k3Var) {
        this.f8331a = k3Var;
    }

    @Override
    public void f(boolean z10) {
        k3 k3Var = this.f8331a;
        if (k3Var.f8431d0 && z10) {
            return;
        }
        k3Var.k(true);
    }

    @Override
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f8331a.k(false);
    }

    @Override
    public Object provide(Object obj) {
        boolean z10;
        Void r22 = (Void) obj;
        if (this.f8331a.e.getKeyboardHeight() >= AndroidUtilities.dp(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
