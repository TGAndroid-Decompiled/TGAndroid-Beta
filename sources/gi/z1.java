package gi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
public final class z1 implements d4, GenericProvider, org.telegram.ui.ActionBar.a2 {
    public final d3 f11581a;

    public z1(d3 d3Var) {
        this.f11581a = d3Var;
    }

    @Override
    public void f(boolean z10) {
        d3 d3Var = this.f11581a;
        if (d3Var.f11142d0 && z10) {
            return;
        }
        d3Var.k(true);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f11581a.k(false);
    }

    @Override
    public Object provide(Object obj) {
        boolean z10;
        Void r22 = (Void) obj;
        if (this.f11581a.e.getKeyboardHeight() >= AndroidUtilities.dp(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
