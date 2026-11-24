package defpackage;

import android.view.KeyEvent;
public final class e68 implements gk, k8 {
    public final byte a;
    public final j68 b;

    public e68(j68 j68Var, byte b) {
        this.a = b;
        this.b = j68Var;
    }

    @Override
    public final void q(KeyEvent keyEvent) {
        j68 j68Var;
        m8 m8Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m8Var = (j68Var = this.b).J) != null && m8Var.isShowing()) {
            j68Var.J.d(true);
        }
    }

    @Override
    public final void y(int i, int i2, boolean z) {
        byte b = this.a;
        j68 j68Var = this.b;
        switch (b) {
            case 0:
                j68Var.a0(j68Var.b, j68Var.c, z, i);
                j68Var.finishFragment();
                return;
            default:
                j68Var.a0(j68Var.b, j68Var.c, z, i);
                j68Var.finishFragment();
                return;
        }
    }
}
