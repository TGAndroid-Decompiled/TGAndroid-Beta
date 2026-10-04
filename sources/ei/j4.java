package ei;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
public final class j4 implements org.telegram.ui.ActionBar.a2, p4, GenericProvider {
    public final r4 f9121a;

    public j4(r4 r4Var) {
        this.f9121a = r4Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f9121a.f29643b.dismiss();
    }

    @Override
    public void o(boolean z10) {
        r4 r4Var = this.f9121a;
        if (!r4Var.I()) {
            r4Var.J.e(0.0f);
        }
    }

    @Override
    public Object provide(Object obj) {
        boolean z10;
        Void r22 = (Void) obj;
        if (this.f9121a.f29643b.f32850r1.getKeyboardHeight() >= AndroidUtilities.dp(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
