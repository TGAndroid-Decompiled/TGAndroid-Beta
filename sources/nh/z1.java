package nh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;

public final class z1 implements c4, GenericProvider, org.telegram.ui.ActionBar.a2 {

    public final b3 f19069a;

    public z1(b3 b3Var) {
        this.f19069a = b3Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f19069a.k(false);
    }

    @Override
    public void i(boolean z10) {
        b3 b3Var = this.f19069a;
        if (b3Var.Z && z10) {
            return;
        }
        b3Var.k(true);
    }

    @Override
    public Object provide(Object obj) {
        return Boolean.valueOf(this.f19069a.f18575e.getKeyboardHeight() >= AndroidUtilities.dp(20.0f));
    }
}
