package lh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class l5 extends AnimatorListenerAdapter {

    public final int f16311a;

    public final f6 f16312b;

    public l5(f6 f6Var, int i10) {
        this.f16311a = i10;
        this.f16312b = f6Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f16311a) {
            case 0:
                f6 f6Var = this.f16312b;
                f6Var.X1 = 0.0f;
                f6Var.V1.setAlpha(1.0f);
                f6Var.V1.setVisibility(8);
                f6Var.V1.n();
                break;
            case 1:
                this.f16312b.f15979l2.setTranslationY(0.0f);
                break;
            default:
                f6 f6Var2 = this.f16312b;
                f6Var2.f15985o2 = false;
                f6Var2.f15979l2.setTranslationY(0.0f);
                f6Var2.w0();
                break;
        }
    }
}
