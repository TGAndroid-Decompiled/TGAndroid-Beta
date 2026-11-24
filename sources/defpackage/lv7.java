package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class lv7 extends AnimatorListenerAdapter {
    public final byte a;
    public final v29 b;

    public lv7(v29 v29Var, byte b) {
        this.a = b;
        this.b = v29Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        v29 v29Var = this.b;
        switch (b) {
            case 0:
                gm.B2(v29Var);
                return;
            case 1:
                super.onAnimationEnd(animator);
                v29Var.M0.e();
                return;
            default:
                super.onAnimationEnd(animator);
                v29Var.R = null;
                v29Var.o0 = 0.0f;
                v29Var.m0 = null;
                v29Var.invalidate();
                return;
        }
    }
}
