package defpackage;

import android.view.KeyEvent;
public final class c48 implements gj, k8 {
    public final byte a;
    public final g48 b;

    public c48(g48 g48Var, byte b) {
        this.a = b;
        this.b = g48Var;
    }

    @Override
    public final void r(KeyEvent keyEvent) {
        g48 g48Var;
        m8 m8Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m8Var = (g48Var = this.b).J) != null && m8Var.isShowing()) {
            g48Var.J.d(true);
        }
    }

    @Override
    public final void s(int i, int i2, boolean z) {
        byte b = this.a;
        g48 g48Var = this.b;
        switch (b) {
            case 0:
                g48Var.Z(g48Var.b, g48Var.c, z, i);
                g48Var.finishFragment();
                return;
            default:
                g48Var.Z(g48Var.b, g48Var.c, z, i);
                g48Var.finishFragment();
                return;
        }
    }
}
