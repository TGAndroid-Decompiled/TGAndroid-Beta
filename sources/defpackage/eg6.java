package defpackage;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class eg6 implements Runnable {
    public final byte a;
    public final fg6 b;

    public eg6(fg6 fg6Var, byte b) {
        this.a = b;
        this.b = fg6Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        fg6 fg6Var = this.b;
        switch (b) {
            case 0:
                e29 e29Var = fg6Var.h;
                e29Var.getAnimatedDrawable().I(0, false, false);
                e29Var.d();
                EditTextBoldCursor editTextBoldCursor = fg6Var.b;
                editTextBoldCursor.requestFocus();
                hl.E3(editTextBoldCursor);
                return;
            default:
                fg6Var.b.requestFocus();
                return;
        }
    }
}
