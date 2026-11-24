package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i34 extends AnimatorListenerAdapter {
    public final byte a;
    public final l34 b;

    public i34(l34 l34Var, byte b) {
        this.a = b;
        this.b = l34Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        l34 l34Var = this.b;
        switch (b) {
            case 0:
                if (animator == l34Var.c0) {
                    l34Var.c0 = null;
                    return;
                }
                return;
            case 1:
                if (animator == l34Var.d0) {
                    l34Var.d0 = null;
                    return;
                }
                return;
            case 2:
                if (animator == l34Var.R) {
                    l34Var.R = null;
                    l34Var.Q = 0.0f;
                    return;
                }
                return;
            case 3:
                if (animator == l34Var.S) {
                    l34Var.S = null;
                    return;
                }
                return;
            default:
                if (!l34Var.n0) {
                    gl.B2(l34Var.J);
                    l34Var.J = null;
                    return;
                }
                return;
        }
    }
}
