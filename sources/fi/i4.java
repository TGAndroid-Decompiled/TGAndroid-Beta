package fi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
public final class i4 implements org.telegram.ui.ActionBar.a2, p4, GenericProvider {
    public final r4 f9753a;

    public i4(r4 r4Var) {
        this.f9753a = r4Var;
    }

    @Override
    public void f(boolean z10) {
        r4 r4Var = this.f9753a;
        if (!r4Var.K()) {
            r4Var.J.e(0.0f);
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f9753a.f28780b.dismiss();
    }

    @Override
    public Object provide(Object obj) {
        boolean z10;
        Void r22 = (Void) obj;
        if (this.f9753a.f28780b.f31343r1.getKeyboardHeight() >= AndroidUtilities.dp(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
