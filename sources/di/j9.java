package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j9 extends AnimatorListenerAdapter {
    public final int f9273a;
    public final z8 f9274b;

    public j9(z8 z8Var, int i7) {
        this.f9273a = i7;
        this.f9274b = z8Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f9273a) {
            case 0:
                super.onAnimationEnd(animator);
                q9 q9Var = this.f9274b.f10024b;
                d7 d7Var = q9Var.f9643t1;
                if (d7Var != null) {
                    d7Var.b();
                    q9Var.f9648w.removeView(q9Var.f9643t1);
                }
                q9Var.f9643t1 = null;
                q9Var.V();
                return;
            default:
                super.onAnimationEnd(animator);
                d7 d7Var2 = this.f9274b.f10024b.f9643t1;
                if (d7Var2 != null) {
                    d7Var2.a(true);
                    return;
                }
                return;
        }
    }
}
