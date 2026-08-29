package nh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b5 extends AnimatorListenerAdapter {
    public final int f17414a;
    public final t5 f17415b;

    public b5(t5 t5Var, int i10) {
        this.f17414a = i10;
        this.f17415b = t5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f17414a) {
            case 0:
                t5 t5Var = this.f17415b;
                t5Var.X1 = 0.0f;
                t5Var.V1.setAlpha(1.0f);
                t5Var.V1.setVisibility(8);
                t5Var.V1.n();
                return;
            case 1:
                this.f17415b.f18644l2.setTranslationY(0.0f);
                return;
            default:
                t5 t5Var2 = this.f17415b;
                t5Var2.f18650o2 = false;
                t5Var2.f18644l2.setTranslationY(0.0f);
                t5Var2.w0();
                return;
        }
    }
}
