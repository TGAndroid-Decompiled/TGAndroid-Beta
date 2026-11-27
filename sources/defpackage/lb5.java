package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class lb5 extends AnimatorListenerAdapter {
    public final byte a;
    public final mb5 b;

    public lb5(mb5 mb5Var, byte b) {
        this.a = b;
        this.b = mb5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        mb5 mb5Var = this.b;
        switch (b) {
            case 0:
                mb5Var.O0 = null;
                mb5Var.E.F = false;
                ka5 ka5Var = mb5Var.F;
                if (ka5Var != null) {
                    if (ka5Var.getParent() != null) {
                        mb5Var.removeView(mb5Var.F);
                        mb5Var.F.e();
                    }
                    mb5Var.F = null;
                    return;
                }
                return;
            case 1:
                super.onAnimationEnd(animator);
                mb5Var.K0 = null;
                mb5Var.J0 = 0.0f;
                mb5Var.invalidate();
                return;
            default:
                mb5Var.C0 = null;
                mb5Var.z0 = 1.0f;
                mb5Var.s0 = 0.0f;
                mb5Var.t0 = 0.0f;
                mb5Var.invalidate();
                return;
        }
    }
}
