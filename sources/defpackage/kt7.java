package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class kt7 extends AnimatorListenerAdapter {
    public final byte a;
    public final t09 b;

    public kt7(t09 t09Var, byte b) {
        this.a = b;
        this.b = t09Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        t09 t09Var = this.b;
        switch (b) {
            case 0:
                gl.B2(t09Var);
                return;
            case 1:
                super.onAnimationEnd(animator);
                t09Var.M0.e();
                return;
            default:
                super.onAnimationEnd(animator);
                t09Var.R = null;
                t09Var.o0 = 0.0f;
                t09Var.m0 = null;
                t09Var.invalidate();
                return;
        }
    }
}
