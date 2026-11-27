package defpackage;

import android.view.KeyEvent;
public final class s78 implements hj, l8 {
    public final byte a;
    public final w78 b;

    public s78(w78 w78Var, byte b) {
        this.a = b;
        this.b = w78Var;
    }

    @Override
    public final void o(KeyEvent keyEvent) {
        w78 w78Var;
        n8 n8Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n8Var = (w78Var = this.b).J) != null && n8Var.isShowing()) {
            w78Var.J.d(true);
        }
    }

    @Override
    public final void y(int i, int i2, boolean z) {
        byte b = this.a;
        w78 w78Var = this.b;
        switch (b) {
            case 0:
                w78Var.Z(w78Var.b, w78Var.c, z, i);
                w78Var.finishFragment();
                return;
            default:
                w78Var.Z(w78Var.b, w78Var.c, z, i);
                w78Var.finishFragment();
                return;
        }
    }
}
