package hi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
public final class h2 implements m4, GenericProvider, org.telegram.ui.ActionBar.b2 {
    public final m3 f13009a;

    public h2(m3 m3Var) {
        this.f13009a = m3Var;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        this.f13009a.k(false);
    }

    @Override
    public void o(boolean z10) {
        m3 m3Var = this.f13009a;
        if (m3Var.f13107e0 && z10) {
            return;
        }
        m3Var.k(true);
    }

    @Override
    public Object provide(Object obj) {
        boolean z10;
        Void r22 = (Void) obj;
        if (this.f13009a.f13108f.getKeyboardHeight() >= AndroidUtilities.dp(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
