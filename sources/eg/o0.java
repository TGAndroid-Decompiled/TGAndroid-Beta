package eg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class o0 extends AnimatorListenerAdapter {
    public final int f5386a;
    public final c1 f5387b;

    public o0(c1 c1Var, int i10) {
        this.f5386a = i10;
        this.f5387b = c1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5386a) {
            case 0:
                this.f5387b.f5105c2.setTranslationY(0.0f);
                return;
            default:
                c1 c1Var = this.f5387b;
                c1Var.f5111f2 = false;
                c1Var.f5105c2.setTranslationY(0.0f);
                c1Var.m0();
                return;
        }
    }
}
