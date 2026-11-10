package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c7 extends AnimatorListenerAdapter {
    public final int f3579a;
    public final e7 f3580b;

    public c7(e7 e7Var, int i7) {
        this.f3579a = i7;
        this.f3580b = e7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f3579a) {
            case 0:
                this.f3580b.f3773g0 = false;
                return;
            case 1:
                this.f3580b.f3773g0 = false;
                return;
            case 2:
                this.f3580b.O.setVisibility(4);
                return;
            case 3:
                e7 e7Var = this.f3580b;
                e7Var.f3790v0 = e7Var.f3789u0;
                e7Var.d(e7Var.f3763a0);
                return;
            default:
                e7 e7Var2 = this.f3580b;
                e7Var2.f3792w0 = 1.0f;
                e7Var2.f3764b.setScaleX(1.0f);
                e7Var2.f3764b.setScaleY(e7Var2.f3792w0);
                e7Var2.invalidate();
                return;
        }
    }
}
