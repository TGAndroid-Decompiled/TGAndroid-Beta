package hh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class c5 extends AnimatorListenerAdapter {

    public final int f9078a;

    public final e5 f9079b;

    public c5(e5 e5Var, int i10) {
        this.f9078a = i10;
        this.f9079b = e5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f9078a) {
            case 0:
                this.f9079b.W = false;
                break;
            case 1:
                this.f9079b.W = false;
                break;
            case 2:
                this.f9079b.J.setVisibility(4);
                break;
            case 3:
                e5 e5Var = this.f9079b;
                e5Var.f9191o0 = e5Var.f9190n0;
                e5Var.d(e5Var.Q);
                break;
            default:
                e5 e5Var2 = this.f9079b;
                e5Var2.f9192p0 = 1.0f;
                e5Var2.f9174b.setScaleX(1.0f);
                e5Var2.f9174b.setScaleY(e5Var2.f9192p0);
                e5Var2.invalidate();
                break;
        }
    }
}
