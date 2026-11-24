package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class fa5 extends AnimatorListenerAdapter {
    public final byte a;
    public final ha5 b;

    public fa5(ha5 ha5Var, byte b) {
        this.a = b;
        this.b = ha5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        float f = 0.0f;
        int i = 0;
        ha5 ha5Var = this.b;
        switch (b) {
            case 0:
                ha5Var.F = false;
                ha5Var.invalidate();
                return;
            case 1:
                ga5 ga5Var = ha5Var.b0;
                if (!ha5Var.W) {
                    f = 1.0f;
                }
                ha5Var.a0 = f;
                ga5Var.setAlpha(f);
                if (ha5Var.W) {
                    i = 8;
                }
                ga5Var.setVisibility(i);
                ha5Var.a.invalidate();
                return;
            case 2:
                super.onAnimationEnd(animator);
                ha5Var.H0 = null;
                da5 da5Var = ha5Var.a;
                da5Var.setRotationY(0.0f);
                if (!ha5Var.I0) {
                    da5Var.d.clearImage();
                    return;
                }
                return;
            case 3:
                ha5Var.F = false;
                return;
            default:
                ha5Var.F = false;
                return;
        }
    }
}
