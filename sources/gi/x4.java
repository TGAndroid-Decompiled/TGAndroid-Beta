package gi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class x4 extends AnimatorListenerAdapter {
    public final int f13836a;
    public final m5 f13837b;

    public x4(m5 m5Var, int i3) {
        this.f13836a = i3;
        this.f13837b = m5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f13836a) {
            case 0:
                m5 m5Var = this.f13837b;
                m5Var.L1 = 0.0f;
                m5Var.J1.setAlpha(1.0f);
                m5Var.J1.setVisibility(8);
                m5Var.J1.n();
                return;
            case 1:
                this.f13837b.Z1.setTranslationY(0.0f);
                return;
            default:
                m5 m5Var2 = this.f13837b;
                m5Var2.c2 = false;
                m5Var2.Z1.setTranslationY(0.0f);
                m5Var2.t0();
                return;
        }
    }
}
