package ii;

import org.telegram.messenger.e9;
public final class u3 implements org.telegram.ui.ActionBar.p1, b4, e9 {
    public final d4 f15257a;

    public u3(d4 d4Var) {
        this.f15257a = d4Var;
    }

    @Override
    public void a(boolean z10) {
        d4 d4Var = this.f15257a;
        if (!d4Var.O()) {
            d4Var.K.e(0.0f);
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        this.f15257a.f38416b.dismiss();
    }

    @Override
    public Object k(Object obj) {
        boolean z10;
        Void r22 = (Void) obj;
        if (this.f15257a.f38416b.f32249m3.getKeyboardHeight() >= org.telegram.messenger.g0.L(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
