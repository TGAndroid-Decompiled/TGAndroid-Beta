package defpackage;

import android.view.KeyEvent;
public final class tr5 implements k8 {
    public final byte a;
    public final cs5 b;

    public tr5(cs5 cs5Var, byte b) {
        this.a = b;
        this.b = cs5Var;
    }

    @Override
    public final void r(KeyEvent keyEvent) {
        xr5 xr5Var;
        xr5 xr5Var2;
        byte b = this.a;
        cs5 cs5Var = this.b;
        switch (b) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (xr5Var = cs5Var.m) != null && xr5Var.isShowing()) {
                    cs5Var.u();
                    return;
                }
                return;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (xr5Var2 = cs5Var.m) != null && xr5Var2.isShowing()) {
                    cs5Var.u();
                    return;
                }
                return;
        }
    }
}
