package bg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r0 extends AnimatorListenerAdapter {
    public final int f2467a;
    public final g1 f2468b;

    public r0(g1 g1Var, int i10) {
        this.f2467a = i10;
        this.f2468b = g1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2467a) {
            case 0:
                this.f2468b.f2226b2.setTranslationY(0.0f);
                return;
            default:
                g1 g1Var = this.f2468b;
                g1Var.f2232e2 = false;
                g1Var.f2226b2.setTranslationY(0.0f);
                g1Var.m0();
                return;
        }
    }
}
