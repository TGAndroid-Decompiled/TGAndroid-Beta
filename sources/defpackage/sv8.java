package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class sv8 extends AnimatorListenerAdapter {
    public final byte a;
    public final tv8 b;

    public sv8(tv8 tv8Var, byte b) {
        this.a = b;
        this.b = tv8Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        byte b = this.a;
        tv8 tv8Var = this.b;
        switch (b) {
            case 1:
                AnimatorSet animatorSet = tv8Var.s;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    tv8Var.s = null;
                    tv8Var.getClass();
                    return;
                }
                return;
            case 2:
                AnimatorSet animatorSet2 = tv8Var.s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    tv8Var.s = null;
                    return;
                }
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        tv8 tv8Var = this.b;
        switch (b) {
            case 0:
                AnimatorSet animatorSet = tv8Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    tv8Var.h = null;
                }
                nm7.e().k(100, 512);
                return;
            case 1:
                AnimatorSet animatorSet2 = tv8Var.s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    tv8Var.s = null;
                    if (tv8Var.x) {
                        tv8Var.setLayerType(0, null);
                    }
                }
                nm7.e().k(100, 512);
                return;
            default:
                AnimatorSet animatorSet3 = tv8Var.s;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    tv8Var.s = null;
                    gm.c3(new pp8(this, (byte) 10));
                }
                nm7.e().k(100, 512);
                return;
        }
    }
}
