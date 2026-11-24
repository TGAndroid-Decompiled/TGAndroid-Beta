package defpackage;

import android.view.KeyEvent;
public final class y46 implements ee, k8 {
    public final byte a;
    public final f56 b;

    public y46(f56 f56Var, byte b) {
        this.a = b;
        this.b = f56Var;
    }

    @Override
    public final void q(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0) {
            f56 f56Var = this.b;
            if (f56Var.s.isShowing()) {
                f56Var.s.d(true);
            }
        }
    }

    @Override
    public final void r(he heVar, int i) {
        byte b = this.a;
        f56 f56Var = this.b;
        switch (b) {
            case 0:
                e56 e56Var = f56Var.r;
                if (e56Var != null) {
                    e56Var.m();
                    return;
                }
                return;
            default:
                e56 e56Var2 = f56Var.r;
                if (e56Var2 != null) {
                    e56Var2.c();
                    return;
                }
                return;
        }
    }
}
