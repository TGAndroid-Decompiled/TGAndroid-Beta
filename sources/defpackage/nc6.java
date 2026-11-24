package defpackage;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class nc6 implements Runnable {
    public final byte a;
    public final ae6 b;

    public nc6(ae6 ae6Var, byte b) {
        this.a = b;
        this.b = ae6Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ae6 ae6Var = this.b;
        switch (b) {
            case 0:
                ae6Var.N.m();
                return;
            case 1:
                ae6Var.O = null;
                ae6Var.P = null;
                ae6Var.o(true);
                ae6Var.e.m(null, null, ae6Var.f, null);
                vh1 vh1Var = ae6Var.n;
                oy8 oy8Var = ae6Var.K;
                vh1Var.setAnimation(oy8Var);
                oy8Var.H(0);
                ae6Var.M = true;
                return;
            case 2:
                ae6Var.M = true;
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = ae6Var.c;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    gl.E3(editTextBoldCursor);
                    return;
                }
                return;
        }
    }
}
