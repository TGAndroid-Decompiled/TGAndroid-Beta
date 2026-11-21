package ki;

import org.telegram.messenger.i9;
public final class l3 implements org.telegram.ui.ActionBar.q1, q3, i9 {
    public final s3 f18798a;

    public l3(s3 s3Var) {
        this.f18798a = s3Var;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        this.f18798a.f37521b.dismiss();
    }

    @Override
    public Object m(Object obj) {
        boolean z10;
        Void r22 = (Void) obj;
        if (this.f18798a.f37521b.f40421p3.getKeyboardHeight() >= org.telegram.messenger.g0.L(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    @Override
    public void s(boolean z10) {
        s3 s3Var = this.f18798a;
        if (!s3Var.P()) {
            s3Var.K.e(0.0f);
        }
    }
}
