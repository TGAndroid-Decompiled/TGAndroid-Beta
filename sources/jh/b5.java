package jh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b5 extends AnimatorListenerAdapter {
    public final int f11797a;
    public final d5 f11798b;

    public b5(d5 d5Var, int i10) {
        this.f11797a = i10;
        this.f11798b = d5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f11797a) {
            case 0:
                this.f11798b.W = false;
                return;
            case 1:
                this.f11798b.W = false;
                return;
            case 2:
                this.f11798b.J.setVisibility(4);
                return;
            case 3:
                d5 d5Var = this.f11798b;
                d5Var.f11924o0 = d5Var.f11923n0;
                d5Var.d(d5Var.Q);
                return;
            default:
                d5 d5Var2 = this.f11798b;
                d5Var2.f11925p0 = 1.0f;
                d5Var2.f11907b.setScaleX(1.0f);
                d5Var2.f11907b.setScaleY(d5Var2.f11925p0);
                d5Var2.invalidate();
                return;
        }
    }
}
