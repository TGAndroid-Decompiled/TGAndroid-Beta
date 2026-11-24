package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ct4 extends AnimatorListenerAdapter {
    public final byte a;
    public final ft4 b;

    public ct4(ft4 ft4Var, byte b) {
        this.a = b;
        this.b = ft4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        ft4 ft4Var = this.b;
        switch (b) {
            case 0:
                super.onAnimationEnd(animator);
                ft4Var.b.d = 0.0f;
                ft4Var.e0 = null;
                ft4Var.j(ft4Var.M);
                return;
            case 1:
                super.onAnimationEnd(animator);
                ft4Var.b.d = 0.0f;
                ft4Var.e0 = null;
                ft4Var.j(ft4Var.M);
                return;
            case 2:
                super.onAnimationEnd(animator);
                ft4Var.b.d = 0.0f;
                ft4Var.e0 = null;
                ft4Var.j(ft4Var.M);
                return;
            default:
                super.onAnimationEnd(animator);
                ft4Var.b.d = 0.0f;
                ft4Var.e0 = null;
                ft4Var.j(ft4Var.M);
                return;
        }
    }
}
