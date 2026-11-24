package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class tb5 extends AnimatorListenerAdapter {
    public final byte a;
    public final vb5 b;

    public tb5(vb5 vb5Var, byte b) {
        this.a = b;
        this.b = vb5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        vb5 vb5Var = this.b;
        switch (b) {
            case 0:
                if (vb5Var.c0 == animator) {
                    vb5Var.c0 = null;
                    vb5Var.b();
                    return;
                }
                return;
            default:
                if (vb5Var.b0 == animator) {
                    vb5Var.b0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                ub5 ub5Var = this.b.a0;
                if (ub5Var != null) {
                    ((r78) ub5Var).a.f0.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
