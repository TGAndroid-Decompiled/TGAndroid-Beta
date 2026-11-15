package hi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class x4 extends AnimatorListenerAdapter {
    public final int f15336a;
    public final m5 f15337b;

    public x4(m5 m5Var, int i7) {
        this.f15336a = i7;
        this.f15337b = m5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f15336a) {
            case 0:
                m5 m5Var = this.f15337b;
                m5Var.L1 = 0.0f;
                m5Var.J1.setAlpha(1.0f);
                m5Var.J1.setVisibility(8);
                m5Var.J1.n();
                return;
            case 1:
                this.f15337b.Z1.setTranslationY(0.0f);
                return;
            default:
                m5 m5Var2 = this.f15337b;
                m5Var2.f14662c2 = false;
                m5Var2.Z1.setTranslationY(0.0f);
                m5Var2.t0();
                return;
        }
    }
}
