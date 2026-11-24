package defpackage;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class bg6 implements Runnable {
    public final byte a;
    public final cg6 b;

    public bg6(cg6 cg6Var, byte b) {
        this.a = b;
        this.b = cg6Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        cg6 cg6Var = this.b;
        switch (b) {
            case 0:
                s09 s09Var = cg6Var.h;
                s09Var.getAnimatedDrawable().I(0, false, false);
                s09Var.d();
                EditTextBoldCursor editTextBoldCursor = cg6Var.b;
                editTextBoldCursor.requestFocus();
                gm.E3(editTextBoldCursor);
                return;
            default:
                cg6Var.b.requestFocus();
                return;
        }
    }
}
