package ei;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
public final class f2 implements n4, GenericProvider, org.telegram.ui.ActionBar.a2 {
    public final k3 f9062a;

    public f2(k3 k3Var) {
        this.f9062a = k3Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f9062a.k(false);
    }

    @Override
    public void j(boolean z10) {
        k3 k3Var = this.f9062a;
        if (k3Var.f9158d0 && z10) {
            return;
        }
        k3Var.k(true);
    }

    @Override
    public Object provide(Object obj) {
        boolean z10;
        Void r22 = (Void) obj;
        if (this.f9062a.f9159e.getKeyboardHeight() >= AndroidUtilities.dp(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
