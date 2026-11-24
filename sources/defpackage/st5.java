package defpackage;

import android.view.KeyEvent;
public final class st5 implements k8 {
    public final byte a;
    public final bu5 b;

    public st5(bu5 bu5Var, byte b) {
        this.a = b;
        this.b = bu5Var;
    }

    @Override
    public final void q(KeyEvent keyEvent) {
        wt5 wt5Var;
        wt5 wt5Var2;
        byte b = this.a;
        bu5 bu5Var = this.b;
        switch (b) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (wt5Var = bu5Var.m) != null && wt5Var.isShowing()) {
                    bu5Var.u();
                    return;
                }
                return;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (wt5Var2 = bu5Var.m) != null && wt5Var2.isShowing()) {
                    bu5Var.u();
                    return;
                }
                return;
        }
    }
}
