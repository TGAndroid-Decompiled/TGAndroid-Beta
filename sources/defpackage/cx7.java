package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class cx7 extends AnimatorListenerAdapter {
    public final byte a;
    public final boolean b;
    public final vx7 c;

    public cx7(vx7 vx7Var, boolean z, byte b) {
        this.a = b;
        this.c = vx7Var;
        this.b = z;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        byte b = this.a;
        vx7 vx7Var = this.c;
        switch (b) {
            case 0:
                AnimatorSet animatorSet = vx7Var.N;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    vx7Var.N = null;
                    return;
                }
                return;
            default:
                AnimatorSet animatorSet2 = vx7Var.N;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    vx7Var.N = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        boolean z = this.b;
        vx7 vx7Var = this.c;
        switch (b) {
            case 0:
                AnimatorSet animatorSet = vx7Var.N;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!z) {
                        vx7Var.O.setVisibility(4);
                        return;
                    } else {
                        vx7Var.M.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                AnimatorSet animatorSet2 = vx7Var.N;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!z) {
                        vx7Var.Q.setVisibility(4);
                        return;
                    } else {
                        vx7Var.P.setVisibility(4);
                        return;
                    }
                }
                return;
        }
    }
}
