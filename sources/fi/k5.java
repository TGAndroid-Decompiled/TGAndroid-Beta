package fi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k5 extends AnimatorListenerAdapter {
    public final int f11115a;
    public final e6 f11116b;

    public k5(e6 e6Var, int i10) {
        this.f11115a = i10;
        this.f11116b = e6Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f11115a) {
            case 0:
                e6 e6Var = this.f11116b;
                e6Var.Q1 = 0.0f;
                e6Var.O1.setAlpha(1.0f);
                e6Var.O1.setVisibility(8);
                e6Var.O1.n();
                return;
            case 1:
                this.f11116b.f10786e2.setTranslationY(0.0f);
                return;
            default:
                e6 e6Var2 = this.f11116b;
                e6Var2.f10792h2 = false;
                e6Var2.f10786e2.setTranslationY(0.0f);
                e6Var2.t0();
                return;
        }
    }
}
