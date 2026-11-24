package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class dz9 extends AnimatorListenerAdapter {
    public final byte a;
    public final fz9 b;

    public dz9(fz9 fz9Var, byte b) {
        this.a = b;
        this.b = fz9Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        fz9 fz9Var = this.b;
        switch (b) {
            case 0:
                super.onAnimationEnd(animator);
                fz9Var.J = null;
                return;
            case 1:
                super.onAnimationEnd(animator);
                fz9Var.J = null;
                return;
            default:
                super.onAnimationEnd(animator);
                fz9Var.O = 0.0f;
                fz9Var.J = null;
                fz9Var.N = false;
                fz9Var.d(true, false);
                return;
        }
    }
}
