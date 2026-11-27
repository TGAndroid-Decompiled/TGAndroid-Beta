package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class e44 extends AnimatorListenerAdapter {
    public final byte a;
    public final h44 b;

    public e44(h44 h44Var, byte b) {
        this.a = b;
        this.b = h44Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        h44 h44Var = this.b;
        switch (b) {
            case 0:
                if (animator == h44Var.c0) {
                    h44Var.c0 = null;
                    return;
                }
                return;
            case 1:
                if (animator == h44Var.d0) {
                    h44Var.d0 = null;
                    return;
                }
                return;
            case 2:
                if (animator == h44Var.R) {
                    h44Var.R = null;
                    h44Var.Q = 0.0f;
                    return;
                }
                return;
            case 3:
                if (animator == h44Var.S) {
                    h44Var.S = null;
                    return;
                }
                return;
            default:
                if (!h44Var.n0) {
                    hl.B2(h44Var.J);
                    h44Var.J = null;
                    return;
                }
                return;
        }
    }
}
