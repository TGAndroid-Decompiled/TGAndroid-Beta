package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class bx9 extends AnimatorListenerAdapter {
    public final byte a;
    public final dx9 b;

    public bx9(dx9 dx9Var, byte b) {
        this.a = b;
        this.b = dx9Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        dx9 dx9Var = this.b;
        switch (b) {
            case 0:
                super.onAnimationEnd(animator);
                dx9Var.J = null;
                return;
            case 1:
                super.onAnimationEnd(animator);
                dx9Var.J = null;
                return;
            default:
                super.onAnimationEnd(animator);
                dx9Var.O = 0.0f;
                dx9Var.J = null;
                dx9Var.N = false;
                dx9Var.d(true, false);
                return;
        }
    }
}
