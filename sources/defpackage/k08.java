package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class k08 extends AnimatorListenerAdapter {
    public final byte a;
    public final boolean b;
    public final b18 c;

    public k08(b18 b18Var, boolean z, byte b) {
        this.a = b;
        this.c = b18Var;
        this.b = z;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        byte b = this.a;
        b18 b18Var = this.c;
        switch (b) {
            case 0:
                AnimatorSet animatorSet = b18Var.N;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    b18Var.N = null;
                    return;
                }
                return;
            default:
                AnimatorSet animatorSet2 = b18Var.N;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    b18Var.N = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        boolean z = this.b;
        b18 b18Var = this.c;
        switch (b) {
            case 0:
                AnimatorSet animatorSet = b18Var.N;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!z) {
                        b18Var.O.setVisibility(4);
                        return;
                    } else {
                        b18Var.M.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                AnimatorSet animatorSet2 = b18Var.N;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!z) {
                        b18Var.Q.setVisibility(4);
                        return;
                    } else {
                        b18Var.P.setVisibility(4);
                        return;
                    }
                }
                return;
        }
    }
}
