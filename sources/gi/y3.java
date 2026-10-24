package gi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
public final class y3 implements org.telegram.ui.ActionBar.z1, d4, GenericProvider {
    public final f4 f11597a;

    public y3(f4 f4Var) {
        this.f11597a = f4Var;
    }

    @Override
    public void f(boolean z10) {
        f4 f4Var = this.f11597a;
        if (!f4Var.N()) {
            f4Var.J.e(0.0f);
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        this.f11597a.f27704b.dismiss();
    }

    @Override
    public Object provide(Object obj) {
        boolean z10;
        Void r22 = (Void) obj;
        if (this.f11597a.f27704b.f30193u1.getKeyboardHeight() >= AndroidUtilities.dp(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
