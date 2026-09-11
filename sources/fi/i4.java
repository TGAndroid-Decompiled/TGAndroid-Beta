package fi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
public final class i4 implements org.telegram.ui.ActionBar.a2, p4, GenericProvider {
    public final r4 f9725a;

    public i4(r4 r4Var) {
        this.f9725a = r4Var;
    }

    @Override
    public void f(boolean z10) {
        r4 r4Var = this.f9725a;
        if (!r4Var.K()) {
            r4Var.J.e(0.0f);
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f9725a.f28753b.dismiss();
    }

    @Override
    public Object provide(Object obj) {
        boolean z10;
        Void r22 = (Void) obj;
        if (this.f9725a.f28753b.f31316r1.getKeyboardHeight() >= AndroidUtilities.dp(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
