package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r9 extends AnimatorListenerAdapter {
    public final int f9127a;
    public final h9 f9128b;

    public r9(h9 h9Var, int i10) {
        this.f9127a = i10;
        this.f9128b = h9Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f9127a) {
            case 0:
                super.onAnimationEnd(animator);
                y9 y9Var = this.f9128b.f8655b;
                l7 l7Var = y9Var.f9461u1;
                if (l7Var != null) {
                    l7Var.b();
                    y9Var.v.removeView(y9Var.f9461u1);
                }
                y9Var.f9461u1 = null;
                y9Var.Q();
                return;
            default:
                super.onAnimationEnd(animator);
                l7 l7Var2 = this.f9128b.f8655b.f9461u1;
                if (l7Var2 != null) {
                    l7Var2.a(true);
                    return;
                }
                return;
        }
    }
}
