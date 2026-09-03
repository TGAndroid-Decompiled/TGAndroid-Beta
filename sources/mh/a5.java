package mh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class a5 extends AnimatorListenerAdapter {
    public final int f13692a;
    public final c5 f13693b;

    public a5(c5 c5Var, int i10) {
        this.f13692a = i10;
        this.f13693b = c5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f13692a) {
            case 0:
                this.f13693b.f13798a0 = false;
                return;
            case 1:
                this.f13693b.f13798a0 = false;
                return;
            case 2:
                this.f13693b.K.setVisibility(4);
                return;
            case 3:
                c5 c5Var = this.f13693b;
                c5Var.f13817p0 = c5Var.f13816o0;
                c5Var.d(c5Var.R);
                return;
            default:
                c5 c5Var2 = this.f13693b;
                c5Var2.f13818q0 = 1.0f;
                c5Var2.f13799b.setScaleX(1.0f);
                c5Var2.f13799b.setScaleY(c5Var2.f13818q0);
                c5Var2.invalidate();
                return;
        }
    }
}
