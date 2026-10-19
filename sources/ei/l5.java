package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l5 extends AnimatorListenerAdapter {
    public final int f9374a;
    public final f6 f9375b;

    public l5(f6 f6Var, int i10) {
        this.f9374a = i10;
        this.f9375b = f6Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f9374a) {
            case 0:
                f6 f6Var = this.f9375b;
                f6Var.f9001b2 = 0.0f;
                f6Var.Z1.setAlpha(1.0f);
                f6Var.Z1.setVisibility(8);
                f6Var.Z1.n();
                return;
            case 1:
                this.f9375b.f9028p2.setTranslationY(0.0f);
                return;
            default:
                f6 f6Var2 = this.f9375b;
                f6Var2.f9034s2 = false;
                f6Var2.f9028p2.setTranslationY(0.0f);
                f6Var2.v0();
                return;
        }
    }
}
