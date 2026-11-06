package fi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z4 extends AnimatorListenerAdapter {
    public final int f13244a;
    public final o5 f13245b;

    public z4(o5 o5Var, int i7) {
        this.f13244a = i7;
        this.f13245b = o5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f13244a) {
            case 0:
                o5 o5Var = this.f13245b;
                o5Var.K1 = 0.0f;
                o5Var.I1.setAlpha(1.0f);
                o5Var.I1.setVisibility(8);
                o5Var.I1.n();
                return;
            case 1:
                this.f13245b.Y1.setTranslationY(0.0f);
                return;
            default:
                o5 o5Var2 = this.f13245b;
                o5Var2.f12517b2 = false;
                o5Var2.Y1.setTranslationY(0.0f);
                o5Var2.t0();
                return;
        }
    }
}
