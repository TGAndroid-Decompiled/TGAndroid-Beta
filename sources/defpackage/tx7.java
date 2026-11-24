package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class tx7 extends AnimatorListenerAdapter {
    public final byte a;
    public final ux7 b;

    public tx7(ux7 ux7Var, byte b) {
        this.a = b;
        this.b = ux7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        EditTextBoldCursor editTextBoldCursor;
        byte b = this.a;
        ux7 ux7Var = this.b;
        switch (b) {
            case 0:
                by7 by7Var = ux7Var.d;
                if (!by7Var.Q) {
                    by7Var.b0 = 1.0f;
                    by7Var.h(1.0f);
                    return;
                }
                return;
            default:
                by7 by7Var2 = ux7Var.d;
                if (!by7Var2.Q) {
                    fd5 fd5Var = ux7Var.c;
                    if (fd5Var != null) {
                        fd5Var.run();
                    }
                    if (gda.q == 1 && by7Var2.y.getVisibility() != 0 && (editTextBoldCursor = by7Var2.r) != null) {
                        editTextBoldCursor.requestFocus();
                        gm.E3(by7Var2.r);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
