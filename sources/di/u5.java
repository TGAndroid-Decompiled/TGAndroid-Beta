package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u5 extends AnimatorListenerAdapter {
    public final int f7896a;
    public final o6 f7897b;

    public u5(o6 o6Var, int i10) {
        this.f7896a = i10;
        this.f7897b = o6Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f7896a) {
            case 0:
                o6 o6Var = this.f7897b;
                o6Var.f7517b2 = 0.0f;
                o6Var.Z1.setAlpha(1.0f);
                o6Var.Z1.setVisibility(8);
                o6Var.Z1.n();
                return;
            case 1:
                this.f7897b.f7544p2.setTranslationY(0.0f);
                return;
            default:
                o6 o6Var2 = this.f7897b;
                o6Var2.f7550s2 = false;
                o6Var2.f7544p2.setTranslationY(0.0f);
                o6Var2.v0();
                return;
        }
    }
}
