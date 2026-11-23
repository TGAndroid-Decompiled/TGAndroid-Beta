package hi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class v4 extends AnimatorListenerAdapter {
    public final int f15617a;
    public final k5 f15618b;

    public v4(k5 k5Var, int i7) {
        this.f15617a = i7;
        this.f15618b = k5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f15617a) {
            case 0:
                k5 k5Var = this.f15618b;
                k5Var.L1 = 0.0f;
                k5Var.J1.setAlpha(1.0f);
                k5Var.J1.setVisibility(8);
                k5Var.J1.n();
                return;
            case 1:
                this.f15618b.Z1.setTranslationY(0.0f);
                return;
            default:
                k5 k5Var2 = this.f15618b;
                k5Var2.f14876c2 = false;
                k5Var2.Z1.setTranslationY(0.0f);
                k5Var2.t0();
                return;
        }
    }
}
