package kh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m5 extends AnimatorListenerAdapter {
    public final int f15699a;
    public final g6 f15700b;

    public m5(g6 g6Var, int i9) {
        this.f15699a = i9;
        this.f15700b = g6Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f15699a) {
            case 0:
                g6 g6Var = this.f15700b;
                g6Var.X1 = 0.0f;
                g6Var.V1.setAlpha(1.0f);
                g6Var.V1.setVisibility(8);
                g6Var.V1.n();
                return;
            case 1:
                this.f15700b.f15289l2.setTranslationY(0.0f);
                return;
            default:
                g6 g6Var2 = this.f15700b;
                g6Var2.f15295o2 = false;
                g6Var2.f15289l2.setTranslationY(0.0f);
                g6Var2.w0();
                return;
        }
    }
}
