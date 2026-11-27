package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ud5 extends AnimatorListenerAdapter {
    public final byte a;
    public final wd5 b;

    public ud5(wd5 wd5Var, byte b) {
        this.a = b;
        this.b = wd5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        wd5 wd5Var = this.b;
        switch (b) {
            case 0:
                if (wd5Var.c0 == animator) {
                    wd5Var.c0 = null;
                    wd5Var.b();
                    return;
                }
                return;
            default:
                if (wd5Var.b0 == animator) {
                    wd5Var.b0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                vd5 vd5Var = this.b.a0;
                if (vd5Var != null) {
                    ((jb8) vd5Var).a.f0.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
