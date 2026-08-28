package mh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
public final class y3 implements org.telegram.ui.ActionBar.b2, e4, GenericProvider {
    public final g4 f18232a;

    public y3(g4 g4Var) {
        this.f18232a = g4Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        this.f18232a.f27493b.dismiss();
    }

    @Override
    public void j(boolean z10) {
        g4 g4Var = this.f18232a;
        if (!g4Var.J()) {
            g4Var.F.e(0.0f);
        }
    }

    @Override
    public Object provide(Object obj) {
        boolean z10;
        Void r22 = (Void) obj;
        if (this.f18232a.f27493b.f30138n1.getKeyboardHeight() >= AndroidUtilities.dp(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
