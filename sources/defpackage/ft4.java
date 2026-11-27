package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ft4 extends AnimatorListenerAdapter {
    public final byte a;
    public final it4 b;

    public ft4(it4 it4Var, byte b) {
        this.a = b;
        this.b = it4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        it4 it4Var = this.b;
        switch (b) {
            case 0:
                super.onAnimationEnd(animator);
                it4Var.b.d = 0.0f;
                it4Var.e0 = null;
                it4Var.j(it4Var.M);
                return;
            case 1:
                super.onAnimationEnd(animator);
                it4Var.b.d = 0.0f;
                it4Var.e0 = null;
                it4Var.j(it4Var.M);
                return;
            case 2:
                super.onAnimationEnd(animator);
                it4Var.b.d = 0.0f;
                it4Var.e0 = null;
                it4Var.j(it4Var.M);
                return;
            default:
                super.onAnimationEnd(animator);
                it4Var.b.d = 0.0f;
                it4Var.e0 = null;
                it4Var.j(it4Var.M);
                return;
        }
    }
}
