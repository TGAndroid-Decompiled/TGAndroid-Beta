package mh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
public final class z1 implements e4, GenericProvider, org.telegram.ui.ActionBar.b2 {
    public final c3 f18240a;

    public z1(c3 c3Var) {
        this.f18240a = c3Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        this.f18240a.k(false);
    }

    @Override
    public void j(boolean z10) {
        c3 c3Var = this.f18240a;
        if (c3Var.Z && z10) {
            return;
        }
        c3Var.k(true);
    }

    @Override
    public Object provide(Object obj) {
        boolean z10;
        Void r22 = (Void) obj;
        if (this.f18240a.f17754e.getKeyboardHeight() >= AndroidUtilities.dp(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
