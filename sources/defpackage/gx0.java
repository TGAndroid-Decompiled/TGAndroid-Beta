package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.WindowManager;
public final class gx0 extends AnimatorListenerAdapter {
    public final byte a;
    public final nx0 b;

    public gx0(nx0 nx0Var, byte b) {
        this.a = b;
        this.b = nx0Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        byte b = this.a;
        nx0 nx0Var = this.b;
        switch (b) {
            case 0:
                AnimatorSet animatorSet = nx0Var.A0;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    nx0Var.A0 = null;
                    nx0Var.B0 = (byte) 0;
                    return;
                }
                return;
            default:
                AnimatorSet animatorSet2 = nx0Var.A0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    nx0Var.A0 = null;
                    nx0Var.B0 = (byte) 0;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        nx0 nx0Var = this.b;
        switch (b) {
            case 0:
                AnimatorSet animatorSet = nx0Var.A0;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    nx0Var.A0 = null;
                    nx0Var.B0 = (byte) 0;
                    nx0Var.x();
                    ix0 ix0Var = nx0Var.z0;
                    if (ix0Var != null) {
                        ix0Var.x();
                    }
                    if (nx0Var.K) {
                        nx0Var.c.setLayerType(0, null);
                    }
                    if (nx0Var.W) {
                        WindowManager.LayoutParams attributes = nx0Var.getWindow().getAttributes();
                        attributes.flags &= -1025;
                        nx0Var.getWindow().setAttributes(attributes);
                    }
                }
                if (nx0Var.L0) {
                    jn7.e().k(100, 512);
                }
                nx0Var.M0.e();
                return;
            default:
                AnimatorSet animatorSet2 = nx0Var.A0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    nx0Var.A0 = null;
                    nx0Var.B0 = (byte) 0;
                    hl.c3(new fv0(this, (byte) 5));
                }
                jn7.e().k(100, 512);
                return;
        }
    }
}
