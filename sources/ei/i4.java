package ei;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
public final class i4 implements org.telegram.ui.ActionBar.b2, o4, GenericProvider {
    public final q4 f8384a;

    public i4(q4 q4Var) {
        this.f8384a = q4Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        this.f8384a.f27104b.dismiss();
    }

    @Override
    public void k(boolean z10) {
        q4 q4Var = this.f8384a;
        if (!q4Var.K()) {
            q4Var.J.e(0.0f);
        }
    }

    @Override
    public Object provide(Object obj) {
        boolean z10;
        Void r22 = (Void) obj;
        if (this.f8384a.f27104b.f29999r1.getKeyboardHeight() >= AndroidUtilities.dp(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
