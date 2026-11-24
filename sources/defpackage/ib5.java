package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ib5 extends AnimatorListenerAdapter {
    public final byte a;
    public final jb5 b;

    public ib5(jb5 jb5Var, byte b) {
        this.a = b;
        this.b = jb5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        jb5 jb5Var = this.b;
        switch (b) {
            case 0:
                jb5Var.O0 = null;
                jb5Var.E.F = false;
                ha5 ha5Var = jb5Var.F;
                if (ha5Var != null) {
                    if (ha5Var.getParent() != null) {
                        jb5Var.removeView(jb5Var.F);
                        jb5Var.F.e();
                    }
                    jb5Var.F = null;
                    return;
                }
                return;
            case 1:
                super.onAnimationEnd(animator);
                jb5Var.K0 = null;
                jb5Var.J0 = 0.0f;
                jb5Var.invalidate();
                return;
            default:
                jb5Var.C0 = null;
                jb5Var.z0 = 1.0f;
                jb5Var.s0 = 0.0f;
                jb5Var.t0 = 0.0f;
                jb5Var.invalidate();
                return;
        }
    }
}
