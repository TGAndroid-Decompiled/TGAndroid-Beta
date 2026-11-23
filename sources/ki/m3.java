package ki;

import org.telegram.messenger.i9;
public final class m3 implements org.telegram.ui.ActionBar.q1, r3, i9 {
    public final t3 f18887a;

    public m3(t3 t3Var) {
        this.f18887a = t3Var;
    }

    @Override
    public void b(boolean z10) {
        t3 t3Var = this.f18887a;
        if (!t3Var.P()) {
            t3Var.K.e(0.0f);
        }
    }

    @Override
    public Object h(Object obj) {
        boolean z10;
        Void r22 = (Void) obj;
        if (this.f18887a.f37135b.f40002p3.getKeyboardHeight() >= org.telegram.messenger.g0.L(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        this.f18887a.f37135b.dismiss();
    }
}
