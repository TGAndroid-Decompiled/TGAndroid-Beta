package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c7 extends AnimatorListenerAdapter {
    public final int f3576a;
    public final e7 f3577b;

    public c7(e7 e7Var, int i7) {
        this.f3576a = i7;
        this.f3577b = e7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f3576a) {
            case 0:
                this.f3577b.f3776g0 = false;
                return;
            case 1:
                this.f3577b.f3776g0 = false;
                return;
            case 2:
                this.f3577b.O.setVisibility(4);
                return;
            case 3:
                e7 e7Var = this.f3577b;
                e7Var.f3793v0 = e7Var.f3792u0;
                e7Var.d(e7Var.f3766a0);
                return;
            default:
                e7 e7Var2 = this.f3577b;
                e7Var2.f3795w0 = 1.0f;
                e7Var2.f3767b.setScaleX(1.0f);
                e7Var2.f3767b.setScaleY(e7Var2.f3795w0);
                e7Var2.invalidate();
                return;
        }
    }
}
