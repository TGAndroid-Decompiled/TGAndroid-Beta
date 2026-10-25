package fi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k5 extends AnimatorListenerAdapter {
    public final int f11116a;
    public final e6 f11117b;

    public k5(e6 e6Var, int i10) {
        this.f11116a = i10;
        this.f11117b = e6Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f11116a) {
            case 0:
                e6 e6Var = this.f11117b;
                e6Var.Q1 = 0.0f;
                e6Var.O1.setAlpha(1.0f);
                e6Var.O1.setVisibility(8);
                e6Var.O1.n();
                return;
            case 1:
                this.f11117b.f10787e2.setTranslationY(0.0f);
                return;
            default:
                e6 e6Var2 = this.f11117b;
                e6Var2.f10793h2 = false;
                e6Var2.f10787e2.setTranslationY(0.0f);
                e6Var2.t0();
                return;
        }
    }
}
