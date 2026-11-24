package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.WindowManager;
public final class yw0 extends AnimatorListenerAdapter {
    public final byte a;
    public final fx0 b;

    public yw0(fx0 fx0Var, byte b) {
        this.a = b;
        this.b = fx0Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        byte b = this.a;
        fx0 fx0Var = this.b;
        switch (b) {
            case 0:
                AnimatorSet animatorSet = fx0Var.A0;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    fx0Var.A0 = null;
                    fx0Var.B0 = (byte) 0;
                    return;
                }
                return;
            default:
                AnimatorSet animatorSet2 = fx0Var.A0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    fx0Var.A0 = null;
                    fx0Var.B0 = (byte) 0;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        fx0 fx0Var = this.b;
        switch (b) {
            case 0:
                AnimatorSet animatorSet = fx0Var.A0;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    fx0Var.A0 = null;
                    fx0Var.B0 = (byte) 0;
                    fx0Var.x();
                    ax0 ax0Var = fx0Var.z0;
                    if (ax0Var != null) {
                        ax0Var.x();
                    }
                    if (fx0Var.K) {
                        fx0Var.c.setLayerType(0, null);
                    }
                    if (fx0Var.W) {
                        WindowManager.LayoutParams attributes = fx0Var.getWindow().getAttributes();
                        attributes.flags &= -1025;
                        fx0Var.getWindow().setAttributes(attributes);
                    }
                }
                if (fx0Var.L0) {
                    kk7.e().k(99, 512);
                }
                fx0Var.M0.e();
                return;
            default:
                AnimatorSet animatorSet2 = fx0Var.A0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    fx0Var.A0 = null;
                    fx0Var.B0 = (byte) 0;
                    gl.d3(new nv0(this, (byte) 3));
                }
                kk7.e().k(99, 512);
                return;
        }
    }
}
