package defpackage;

import android.view.KeyEvent;
public final class y26 implements ed, k8 {
    public final byte a;
    public final f36 b;

    public y26(f36 f36Var, byte b) {
        this.a = b;
        this.b = f36Var;
    }

    @Override
    public final void r(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0) {
            f36 f36Var = this.b;
            if (f36Var.s.isShowing()) {
                f36Var.s.d(true);
            }
        }
    }

    @Override
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        f36 f36Var = this.b;
        switch (b) {
            case 0:
                e36 e36Var = f36Var.r;
                if (e36Var != null) {
                    e36Var.k();
                    return;
                }
                return;
            default:
                e36 e36Var2 = f36Var.r;
                if (e36Var2 != null) {
                    e36Var2.c();
                    return;
                }
                return;
        }
    }
}
