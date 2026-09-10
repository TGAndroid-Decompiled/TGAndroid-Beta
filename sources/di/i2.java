package di;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
public final class i2 implements s4, GenericProvider, org.telegram.ui.ActionBar.c2 {
    public final n3 f6676a;

    public i2(n3 n3Var) {
        this.f6676a = n3Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        this.f6676a.k(false);
    }

    @Override
    public void j(boolean z10) {
        n3 n3Var = this.f6676a;
        if (n3Var.f6788d0 && z10) {
            return;
        }
        n3Var.k(true);
    }

    @Override
    public Object provide(Object obj) {
        boolean z10;
        Void r22 = (Void) obj;
        if (this.f6676a.e.getKeyboardHeight() >= AndroidUtilities.dp(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
