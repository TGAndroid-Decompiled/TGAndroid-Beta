package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class xy7 extends AnimatorListenerAdapter {
    public final byte a;
    public final yy7 b;

    public xy7(yy7 yy7Var, byte b) {
        this.a = b;
        this.b = yy7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        EditTextBoldCursor editTextBoldCursor;
        byte b = this.a;
        yy7 yy7Var = this.b;
        switch (b) {
            case 0:
                fz7 fz7Var = yy7Var.d;
                if (!fz7Var.Q) {
                    fz7Var.b0 = 1.0f;
                    fz7Var.h(1.0f);
                    return;
                }
                return;
            default:
                fz7 fz7Var2 = yy7Var.d;
                if (!fz7Var2.Q) {
                    tg5 tg5Var = yy7Var.c;
                    if (tg5Var != null) {
                        tg5Var.run();
                    }
                    if (xea.q == 1 && fz7Var2.y.getVisibility() != 0 && (editTextBoldCursor = fz7Var2.r) != null) {
                        editTextBoldCursor.requestFocus();
                        hl.E3(fz7Var2.r);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
