package defpackage;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class me6 implements Runnable {
    public final byte a;
    public final zf6 b;

    public me6(zf6 zf6Var, byte b) {
        this.a = b;
        this.b = zf6Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        zf6 zf6Var = this.b;
        switch (b) {
            case 0:
                zf6Var.N.m();
                return;
            case 1:
                zf6Var.O = null;
                zf6Var.P = null;
                zf6Var.o(true);
                zf6Var.e.m(null, null, zf6Var.f, null);
                cj1 cj1Var = zf6Var.n;
                p09 p09Var = zf6Var.K;
                cj1Var.setAnimation(p09Var);
                p09Var.H(0);
                zf6Var.M = true;
                return;
            case 2:
                zf6Var.M = true;
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = zf6Var.c;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    gm.E3(editTextBoldCursor);
                    return;
                }
                return;
        }
    }
}
