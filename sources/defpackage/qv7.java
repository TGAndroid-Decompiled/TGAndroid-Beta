package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class qv7 extends AnimatorListenerAdapter {
    public final byte a;
    public final rv7 b;

    public qv7(rv7 rv7Var, byte b) {
        this.a = b;
        this.b = rv7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        EditTextBoldCursor editTextBoldCursor;
        byte b = this.a;
        rv7 rv7Var = this.b;
        switch (b) {
            case 0:
                yv7 yv7Var = rv7Var.d;
                if (!yv7Var.Q) {
                    yv7Var.b0 = 1.0f;
                    yv7Var.h(1.0f);
                    return;
                }
                return;
            default:
                yv7 yv7Var2 = rv7Var.d;
                if (!yv7Var2.Q) {
                    hb5 hb5Var = rv7Var.c;
                    if (hb5Var != null) {
                        hb5Var.run();
                    }
                    if (gba.q == 1 && yv7Var2.y.getVisibility() != 0 && (editTextBoldCursor = yv7Var2.r) != null) {
                        editTextBoldCursor.requestFocus();
                        gl.E3(yv7Var2.r);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
