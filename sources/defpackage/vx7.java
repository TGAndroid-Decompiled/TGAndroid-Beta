package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class vx7 extends AnimatorListenerAdapter {
    public final byte a;
    public final wx7 b;

    public vx7(wx7 wx7Var, byte b) {
        this.a = b;
        this.b = wx7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        wx7 wx7Var = this.b;
        switch (b) {
            case 0:
                AnimatorSet animatorSet = (AnimatorSet) wx7Var.e;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    wx7Var.e = null;
                    return;
                }
                return;
            case 1:
                AnimatorSet animatorSet2 = (AnimatorSet) wx7Var.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    wx7Var.e = null;
                    return;
                }
                return;
            default:
                AnimatorSet animatorSet3 = (AnimatorSet) wx7Var.e;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    wx7Var.e = null;
                    return;
                }
                return;
        }
    }
}
