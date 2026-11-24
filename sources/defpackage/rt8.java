package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class rt8 extends AnimatorListenerAdapter {
    public final byte a;
    public final st8 b;

    public rt8(st8 st8Var, byte b) {
        this.a = b;
        this.b = st8Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        byte b = this.a;
        st8 st8Var = this.b;
        switch (b) {
            case 1:
                AnimatorSet animatorSet = st8Var.s;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    st8Var.s = null;
                    st8Var.getClass();
                    return;
                }
                return;
            case 2:
                AnimatorSet animatorSet2 = st8Var.s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    st8Var.s = null;
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
        st8 st8Var = this.b;
        switch (b) {
            case 0:
                AnimatorSet animatorSet = st8Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    st8Var.h = null;
                }
                kk7.e().k(99, 512);
                return;
            case 1:
                AnimatorSet animatorSet2 = st8Var.s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    st8Var.s = null;
                    if (st8Var.x) {
                        st8Var.setLayerType(0, null);
                    }
                }
                kk7.e().k(99, 512);
                return;
            default:
                AnimatorSet animatorSet3 = st8Var.s;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    st8Var.s = null;
                    gl.d3(new sr8(this, (byte) 2));
                }
                kk7.e().k(99, 512);
                return;
        }
    }
}
