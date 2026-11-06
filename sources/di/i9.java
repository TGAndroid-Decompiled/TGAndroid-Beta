package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i9 extends AnimatorListenerAdapter {
    public final int f9236a;
    public final y8 f9237b;

    public i9(y8 y8Var, int i7) {
        this.f9236a = i7;
        this.f9237b = y8Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f9236a) {
            case 0:
                super.onAnimationEnd(animator);
                p9 p9Var = this.f9237b.f9992b;
                c7 c7Var = p9Var.f9573t1;
                if (c7Var != null) {
                    c7Var.b();
                    p9Var.f9578w.removeView(p9Var.f9573t1);
                }
                p9Var.f9573t1 = null;
                p9Var.V();
                return;
            default:
                super.onAnimationEnd(animator);
                c7 c7Var2 = this.f9237b.f9992b.f9573t1;
                if (c7Var2 != null) {
                    c7Var2.a(true);
                    return;
                }
                return;
        }
    }
}
