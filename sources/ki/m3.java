package ki;

import org.telegram.messenger.i9;
public final class m3 implements org.telegram.ui.ActionBar.r1, r3, i9 {
    public final t3 f18791a;

    public m3(t3 t3Var) {
        this.f18791a = t3Var;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        this.f18791a.f36766b.dismiss();
    }

    @Override
    public Object m(Object obj) {
        boolean z10;
        Void r22 = (Void) obj;
        if (this.f18791a.f36766b.f39705p3.getKeyboardHeight() >= org.telegram.messenger.g0.L(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    @Override
    public void s(boolean z10) {
        t3 t3Var = this.f18791a;
        if (!t3Var.P()) {
            t3Var.K.e(0.0f);
        }
    }
}
