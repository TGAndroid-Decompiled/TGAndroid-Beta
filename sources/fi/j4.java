package fi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
public final class j4 implements org.telegram.ui.ActionBar.z1, o4, GenericProvider {
    public final q4 f9341a;

    public j4(q4 q4Var) {
        this.f9341a = q4Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        this.f9341a.f27671b.dismiss();
    }

    @Override
    public void j(boolean z10) {
        q4 q4Var = this.f9341a;
        if (!q4Var.N()) {
            q4Var.J.e(0.0f);
        }
    }

    @Override
    public Object provide(Object obj) {
        boolean z10;
        Void r22 = (Void) obj;
        if (this.f9341a.f27671b.f30048u1.getKeyboardHeight() >= AndroidUtilities.dp(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
