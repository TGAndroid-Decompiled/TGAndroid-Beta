package nh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;

public final class w3 implements org.telegram.ui.ActionBar.a2, c4, GenericProvider {

    public final e4 f19024a;

    public w3(e4 e4Var) {
        this.f19024a = e4Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f19024a.f34900b.dismiss();
    }

    @Override
    public void i(boolean z10) {
        e4 e4Var = this.f19024a;
        if (e4Var.K()) {
            return;
        }
        e4Var.F.e(0.0f);
    }

    @Override
    public Object provide(Object obj) {
        return Boolean.valueOf(this.f19024a.f34900b.f28674n1.getKeyboardHeight() >= AndroidUtilities.dp(20.0f));
    }
}
