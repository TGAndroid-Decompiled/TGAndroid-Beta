package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class rd5 extends AnimatorListenerAdapter {
    public final byte a;
    public final td5 b;

    public rd5(td5 td5Var, byte b) {
        this.a = b;
        this.b = td5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        td5 td5Var = this.b;
        switch (b) {
            case 0:
                if (td5Var.c0 == animator) {
                    td5Var.c0 = null;
                    td5Var.b();
                    return;
                }
                return;
            default:
                if (td5Var.b0 == animator) {
                    td5Var.b0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                sd5 sd5Var = this.b.a0;
                if (sd5Var != null) {
                    ((u98) sd5Var).a.f0.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
