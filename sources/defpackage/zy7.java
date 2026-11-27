package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class zy7 extends AnimatorListenerAdapter {
    public final byte a;
    public final az7 b;

    public zy7(az7 az7Var, byte b) {
        this.a = b;
        this.b = az7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        az7 az7Var = this.b;
        switch (b) {
            case 0:
                AnimatorSet animatorSet = (AnimatorSet) az7Var.e;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    az7Var.e = null;
                    return;
                }
                return;
            case 1:
                AnimatorSet animatorSet2 = (AnimatorSet) az7Var.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    az7Var.e = null;
                    return;
                }
                return;
            default:
                AnimatorSet animatorSet3 = (AnimatorSet) az7Var.e;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    az7Var.e = null;
                    return;
                }
                return;
        }
    }
}
