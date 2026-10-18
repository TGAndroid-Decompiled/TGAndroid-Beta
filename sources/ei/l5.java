package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class l5 extends AnimatorListenerAdapter {
    public final int f9377a;
    public final f6 f9378b;

    public l5(f6 f6Var, int i10) {
        this.f9377a = i10;
        this.f9378b = f6Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f9377a) {
            case 0:
                f6 f6Var = this.f9378b;
                f6Var.f9004b2 = 0.0f;
                f6Var.Z1.setAlpha(1.0f);
                f6Var.Z1.setVisibility(8);
                f6Var.Z1.n();
                return;
            case 1:
                this.f9378b.f9031p2.setTranslationY(0.0f);
                return;
            default:
                f6 f6Var2 = this.f9378b;
                f6Var2.f9037s2 = false;
                f6Var2.f9031p2.setTranslationY(0.0f);
                f6Var2.v0();
                return;
        }
    }
}
