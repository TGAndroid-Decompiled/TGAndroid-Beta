package di;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
public final class m4 implements org.telegram.ui.ActionBar.c2, s4, GenericProvider {
    public final u4 f6766a;

    public m4(u4 u4Var) {
        this.f6766a = u4Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        this.f6766a.f26422b.dismiss();
    }

    @Override
    public void j(boolean z10) {
        u4 u4Var = this.f6766a;
        if (!u4Var.K()) {
            u4Var.J.e(0.0f);
        }
    }

    @Override
    public Object provide(Object obj) {
        boolean z10;
        Void r22 = (Void) obj;
        if (this.f6766a.f26422b.f29403r1.getKeyboardHeight() >= AndroidUtilities.dp(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
