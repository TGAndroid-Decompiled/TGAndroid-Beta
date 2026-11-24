package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class fz7 extends AnimatorListenerAdapter {
    public final byte a;
    public final boolean b;
    public final xz7 c;

    public fz7(xz7 xz7Var, boolean z, byte b) {
        this.a = b;
        this.c = xz7Var;
        this.b = z;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        byte b = this.a;
        xz7 xz7Var = this.c;
        switch (b) {
            case 0:
                AnimatorSet animatorSet = xz7Var.N;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    xz7Var.N = null;
                    return;
                }
                return;
            default:
                AnimatorSet animatorSet2 = xz7Var.N;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    xz7Var.N = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        boolean z = this.b;
        xz7 xz7Var = this.c;
        switch (b) {
            case 0:
                AnimatorSet animatorSet = xz7Var.N;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!z) {
                        xz7Var.O.setVisibility(4);
                        return;
                    } else {
                        xz7Var.M.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                AnimatorSet animatorSet2 = xz7Var.N;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!z) {
                        xz7Var.Q.setVisibility(4);
                        return;
                    } else {
                        xz7Var.P.setVisibility(4);
                        return;
                    }
                }
                return;
        }
    }
}
