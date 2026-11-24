package defpackage;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class ce6 implements Runnable {
    public final byte a;
    public final de6 b;

    public ce6(de6 de6Var, byte b) {
        this.a = b;
        this.b = de6Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        de6 de6Var = this.b;
        switch (b) {
            case 0:
                ry8 ry8Var = de6Var.h;
                ry8Var.getAnimatedDrawable().I(0, false, false);
                ry8Var.d();
                EditTextBoldCursor editTextBoldCursor = de6Var.b;
                editTextBoldCursor.requestFocus();
                gl.E3(editTextBoldCursor);
                return;
            default:
                de6Var.b.requestFocus();
                return;
        }
    }
}
