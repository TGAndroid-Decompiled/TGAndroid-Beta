package hi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
public final class h4 implements org.telegram.ui.ActionBar.b2, m4, GenericProvider {
    public final o4 f13013a;

    public h4(o4 o4Var) {
        this.f13013a = o4Var;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        this.f13013a.f30254b.dismiss();
    }

    @Override
    public void o(boolean z10) {
        o4 o4Var = this.f13013a;
        if (!o4Var.N()) {
            o4Var.J.e(0.0f);
        }
    }

    @Override
    public Object provide(Object obj) {
        boolean z10;
        Void r22 = (Void) obj;
        if (this.f13013a.f30254b.f33037u1.getKeyboardHeight() >= AndroidUtilities.dp(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
