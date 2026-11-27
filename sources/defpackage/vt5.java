package defpackage;

import android.view.KeyEvent;
public final class vt5 implements l8 {
    public final byte a;
    public final fu5 b;

    public vt5(fu5 fu5Var, byte b) {
        this.a = b;
        this.b = fu5Var;
    }

    @Override
    public final void o(KeyEvent keyEvent) {
        zt5 zt5Var;
        zt5 zt5Var2;
        byte b = this.a;
        fu5 fu5Var = this.b;
        switch (b) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (zt5Var = fu5Var.m) != null && zt5Var.isShowing()) {
                    fu5Var.u();
                    return;
                }
                return;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (zt5Var2 = fu5Var.m) != null && zt5Var2.isShowing()) {
                    fu5Var.u();
                    return;
                }
                return;
        }
    }
}
