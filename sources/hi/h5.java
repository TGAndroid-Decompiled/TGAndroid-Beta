package hi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class h5 extends AnimatorListenerAdapter {
    public final int f14581a;
    public final v5 f14582b;

    public h5(v5 v5Var, int i7) {
        this.f14581a = i7;
        this.f14582b = v5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f14581a) {
            case 0:
                v5 v5Var = this.f14582b;
                v5Var.L1 = 0.0f;
                v5Var.J1.setAlpha(1.0f);
                v5Var.J1.setVisibility(8);
                v5Var.J1.n();
                return;
            case 1:
                this.f14582b.d2.setTranslationY(0.0f);
                return;
            default:
                v5 v5Var2 = this.f14582b;
                v5Var2.f15565g2 = false;
                v5Var2.d2.setTranslationY(0.0f);
                v5Var2.v0();
                return;
        }
    }
}
