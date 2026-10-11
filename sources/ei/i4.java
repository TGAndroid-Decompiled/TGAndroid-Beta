package ei;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
public final class i4 implements org.telegram.ui.ActionBar.z1, n4, GenericProvider {
    public final p4 f9120a;

    public i4(p4 p4Var) {
        this.f9120a = p4Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        this.f9120a.f30245b.dismiss();
    }

    @Override
    public void j(boolean z10) {
        p4 p4Var = this.f9120a;
        if (!p4Var.N()) {
            p4Var.J.e(0.0f);
        }
    }

    @Override
    public Object provide(Object obj) {
        boolean z10;
        Void r22 = (Void) obj;
        if (this.f9120a.f30245b.f33336u1.getKeyboardHeight() >= AndroidUtilities.dp(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
