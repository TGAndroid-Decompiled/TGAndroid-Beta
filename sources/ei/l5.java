package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l5 extends AnimatorListenerAdapter {
    public final int f9376a;
    public final f6 f9377b;

    public l5(f6 f6Var, int i10) {
        this.f9376a = i10;
        this.f9377b = f6Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f9376a) {
            case 0:
                f6 f6Var = this.f9377b;
                f6Var.f9003b2 = 0.0f;
                f6Var.Z1.setAlpha(1.0f);
                f6Var.Z1.setVisibility(8);
                f6Var.Z1.n();
                return;
            case 1:
                this.f9377b.f9030p2.setTranslationY(0.0f);
                return;
            default:
                f6 f6Var2 = this.f9377b;
                f6Var2.f9036s2 = false;
                f6Var2.f9030p2.setTranslationY(0.0f);
                f6Var2.v0();
                return;
        }
    }
}
