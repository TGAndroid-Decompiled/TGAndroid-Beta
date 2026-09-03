package oh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u8 extends AnimatorListenerAdapter {
    public final int f17827a;
    public final w8 f17828b;

    public u8(w8 w8Var, int i10) {
        this.f17827a = i10;
        this.f17828b = w8Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f17827a) {
            case 0:
                i9 i9Var = this.f17828b.F0;
                i9Var.U = 0.0f;
                i9.k(i9Var);
                return;
            default:
                i9 i9Var2 = this.f17828b.F0;
                i9Var2.T = 0.0f;
                i9Var2.W = 0.0f;
                i9.k(i9Var2);
                return;
        }
    }
}
