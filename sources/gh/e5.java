package gh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class e5 extends AnimatorListenerAdapter {
    public final int f8018a;
    public final g5 f8019b;

    public e5(g5 g5Var, int i9) {
        this.f8018a = i9;
        this.f8019b = g5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f8018a) {
            case 0:
                this.f8019b.W = false;
                return;
            case 1:
                this.f8019b.W = false;
                return;
            case 2:
                this.f8019b.J.setVisibility(4);
                return;
            case 3:
                g5 g5Var = this.f8019b;
                g5Var.f8125o0 = g5Var.f8124n0;
                g5Var.d(g5Var.Q);
                return;
            default:
                g5 g5Var2 = this.f8019b;
                g5Var2.f8126p0 = 1.0f;
                g5Var2.f8108b.setScaleX(1.0f);
                g5Var2.f8108b.setScaleY(g5Var2.f8126p0);
                g5Var2.invalidate();
                return;
        }
    }
}
