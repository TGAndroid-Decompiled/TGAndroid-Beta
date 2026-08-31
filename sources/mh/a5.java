package mh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class a5 extends AnimatorListenerAdapter {
    public final int f13690a;
    public final c5 f13691b;

    public a5(c5 c5Var, int i10) {
        this.f13690a = i10;
        this.f13691b = c5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f13690a) {
            case 0:
                this.f13691b.f13796a0 = false;
                return;
            case 1:
                this.f13691b.f13796a0 = false;
                return;
            case 2:
                this.f13691b.K.setVisibility(4);
                return;
            case 3:
                c5 c5Var = this.f13691b;
                c5Var.f13815p0 = c5Var.f13814o0;
                c5Var.d(c5Var.R);
                return;
            default:
                c5 c5Var2 = this.f13691b;
                c5Var2.f13816q0 = 1.0f;
                c5Var2.f13797b.setScaleX(1.0f);
                c5Var2.f13797b.setScaleY(c5Var2.f13816q0);
                c5Var2.invalidate();
                return;
        }
    }
}
