package hi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class w4 extends AnimatorListenerAdapter {
    public final int f15592a;
    public final l5 f15593b;

    public w4(l5 l5Var, int i7) {
        this.f15592a = i7;
        this.f15593b = l5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f15592a) {
            case 0:
                l5 l5Var = this.f15593b;
                l5Var.L1 = 0.0f;
                l5Var.J1.setAlpha(1.0f);
                l5Var.J1.setVisibility(8);
                l5Var.J1.n();
                return;
            case 1:
                this.f15593b.Z1.setTranslationY(0.0f);
                return;
            default:
                l5 l5Var2 = this.f15593b;
                l5Var2.f14888c2 = false;
                l5Var2.Z1.setTranslationY(0.0f);
                l5Var2.t0();
                return;
        }
    }
}
