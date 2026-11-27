package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class rw7 extends AnimatorListenerAdapter {
    public final byte a;
    public final i49 b;

    public rw7(i49 i49Var, byte b) {
        this.a = b;
        this.b = i49Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        i49 i49Var = this.b;
        switch (b) {
            case 0:
                hl.B2(i49Var);
                return;
            case 1:
                super.onAnimationEnd(animator);
                i49Var.M0.e();
                return;
            default:
                super.onAnimationEnd(animator);
                i49Var.R = null;
                i49Var.o0 = 0.0f;
                i49Var.m0 = null;
                i49Var.invalidate();
                return;
        }
    }
}
