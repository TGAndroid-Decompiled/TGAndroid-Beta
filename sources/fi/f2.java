package fi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
public final class f2 implements p4, GenericProvider, org.telegram.ui.ActionBar.a2 {
    public final k3 f9654a;

    public f2(k3 k3Var) {
        this.f9654a = k3Var;
    }

    @Override
    public void f(boolean z10) {
        k3 k3Var = this.f9654a;
        if (k3Var.f9764d0 && z10) {
            return;
        }
        k3Var.k(true);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f9654a.k(false);
    }

    @Override
    public Object provide(Object obj) {
        boolean z10;
        Void r22 = (Void) obj;
        if (this.f9654a.f9765e.getKeyboardHeight() >= AndroidUtilities.dp(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
