package defpackage;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class re6 implements Runnable {
    public final byte a;
    public final cg6 b;

    public re6(cg6 cg6Var, byte b) {
        this.a = b;
        this.b = cg6Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        cg6 cg6Var = this.b;
        switch (b) {
            case 0:
                cg6Var.N.m();
                return;
            case 1:
                cg6Var.O = null;
                cg6Var.P = null;
                cg6Var.o(true);
                cg6Var.e.m(null, null, cg6Var.f, null);
                di1 di1Var = cg6Var.n;
                b29 b29Var = cg6Var.K;
                di1Var.setAnimation(b29Var);
                b29Var.H(0);
                cg6Var.M = true;
                return;
            case 2:
                cg6Var.M = true;
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = cg6Var.c;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    hl.E3(editTextBoldCursor);
                    return;
                }
                return;
        }
    }
}
