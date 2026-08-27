package cg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class x1 extends AnimatorListenerAdapter {

    public final u1 f2856a;

    public final y1 f2857b;

    public x1(y1 y1Var, u1 u1Var) {
        this.f2857b = y1Var;
        this.f2856a = u1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        u1 u1Var = this.f2856a;
        u1Var.setLayerType(0, null);
        this.f2857b.d.removeView(u1Var);
    }
}
