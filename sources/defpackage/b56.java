package defpackage;

import android.view.KeyEvent;
public final class b56 implements fd, l8 {
    public final byte a;
    public final i56 b;

    public b56(i56 i56Var, byte b) {
        this.a = b;
        this.b = i56Var;
    }

    @Override
    public final void o(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0) {
            i56 i56Var = this.b;
            if (i56Var.s.isShowing()) {
                i56Var.s.d(true);
            }
        }
    }

    @Override
    public final void w(id idVar, int i) {
        byte b = this.a;
        i56 i56Var = this.b;
        switch (b) {
            case 0:
                h56 h56Var = i56Var.r;
                if (h56Var != null) {
                    h56Var.h();
                    return;
                }
                return;
            default:
                h56 h56Var2 = i56Var.r;
                if (h56Var2 != null) {
                    h56Var2.d();
                    return;
                }
                return;
        }
    }
}
