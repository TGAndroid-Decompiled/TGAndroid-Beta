package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class t44 extends AnimatorListenerAdapter {
    public final byte a;
    public final w44 b;

    public t44(w44 w44Var, byte b) {
        this.a = b;
        this.b = w44Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        w44 w44Var = this.b;
        switch (b) {
            case 0:
                if (animator == w44Var.c0) {
                    w44Var.c0 = null;
                    return;
                }
                return;
            case 1:
                if (animator == w44Var.d0) {
                    w44Var.d0 = null;
                    return;
                }
                return;
            case 2:
                if (animator == w44Var.R) {
                    w44Var.R = null;
                    w44Var.Q = 0.0f;
                    return;
                }
                return;
            case 3:
                if (animator == w44Var.S) {
                    w44Var.S = null;
                    return;
                }
                return;
            default:
                if (!w44Var.n0) {
                    gm.B2(w44Var.J);
                    w44Var.J = null;
                    return;
                }
                return;
        }
    }
}
