package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class br4 extends AnimatorListenerAdapter {
    public final byte a;
    public final er4 b;

    public br4(er4 er4Var, byte b) {
        this.a = b;
        this.b = er4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        er4 er4Var = this.b;
        switch (b) {
            case 0:
                super.onAnimationEnd(animator);
                er4Var.b.d = 0.0f;
                er4Var.e0 = null;
                er4Var.j(er4Var.M);
                return;
            case 1:
                super.onAnimationEnd(animator);
                er4Var.b.d = 0.0f;
                er4Var.e0 = null;
                er4Var.j(er4Var.M);
                return;
            case 2:
                super.onAnimationEnd(animator);
                er4Var.b.d = 0.0f;
                er4Var.e0 = null;
                er4Var.j(er4Var.M);
                return;
            default:
                super.onAnimationEnd(animator);
                er4Var.b.d = 0.0f;
                er4Var.e0 = null;
                er4Var.j(er4Var.M);
                return;
        }
    }
}
