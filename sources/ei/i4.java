package ei;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
public final class i4 implements org.telegram.ui.ActionBar.a2, o4, GenericProvider {
    public final q4 f8400a;

    public i4(q4 q4Var) {
        this.f8400a = q4Var;
    }

    @Override
    public void i(boolean z10) {
        q4 q4Var = this.f8400a;
        if (!q4Var.K()) {
            q4Var.J.e(0.0f);
        }
    }

    @Override
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f8400a.f26655b.dismiss();
    }

    @Override
    public Object provide(Object obj) {
        boolean z10;
        Void r22 = (Void) obj;
        if (this.f8400a.f26655b.f29135r1.getKeyboardHeight() >= AndroidUtilities.dp(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
