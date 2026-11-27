package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class ax8 extends AnimatorListenerAdapter {
    public final byte a;
    public final bx8 b;

    public ax8(bx8 bx8Var, byte b) {
        this.a = b;
        this.b = bx8Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        byte b = this.a;
        bx8 bx8Var = this.b;
        switch (b) {
            case 1:
                AnimatorSet animatorSet = bx8Var.s;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    bx8Var.s = null;
                    bx8Var.getClass();
                    return;
                }
                return;
            case 2:
                AnimatorSet animatorSet2 = bx8Var.s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    bx8Var.s = null;
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
        bx8 bx8Var = this.b;
        switch (b) {
            case 0:
                AnimatorSet animatorSet = bx8Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    bx8Var.h = null;
                }
                jn7.e().k(100, 512);
                return;
            case 1:
                AnimatorSet animatorSet2 = bx8Var.s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    bx8Var.s = null;
                    if (bx8Var.x) {
                        bx8Var.setLayerType(0, null);
                    }
                }
                jn7.e().k(100, 512);
                return;
            default:
                AnimatorSet animatorSet3 = bx8Var.s;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    bx8Var.s = null;
                    hl.c3(new uk8(this, (byte) 18));
                }
                jn7.e().k(100, 512);
                return;
        }
    }
}
