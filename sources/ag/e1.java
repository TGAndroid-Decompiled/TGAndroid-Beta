package ag;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class e1 extends AnimatorListenerAdapter {
    public final int f458a;
    public final f1 f459b;

    public e1(f1 f1Var, int i10) {
        this.f458a = i10;
        this.f459b = f1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f458a) {
            case 0:
                f1 f1Var = this.f459b;
                f1Var.K = null;
                f1Var.f473f.f(new a4.g(this, 1));
                return;
            default:
                this.f459b.f473f.f(new a4.g(this, 2));
                return;
        }
    }
}
