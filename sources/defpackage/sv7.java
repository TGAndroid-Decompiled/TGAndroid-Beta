package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class sv7 extends AnimatorListenerAdapter {
    public final byte a;
    public final tv7 b;

    public sv7(tv7 tv7Var, byte b) {
        this.a = b;
        this.b = tv7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        tv7 tv7Var = this.b;
        switch (b) {
            case 0:
                AnimatorSet animatorSet = (AnimatorSet) tv7Var.e;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    tv7Var.e = null;
                    return;
                }
                return;
            case 1:
                AnimatorSet animatorSet2 = (AnimatorSet) tv7Var.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    tv7Var.e = null;
                    return;
                }
                return;
            default:
                AnimatorSet animatorSet3 = (AnimatorSet) tv7Var.e;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    tv7Var.e = null;
                    return;
                }
                return;
        }
    }
}
