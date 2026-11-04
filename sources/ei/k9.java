package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k9 extends AnimatorListenerAdapter {
    public final int f10596a;
    public final z8 f10597b;

    public k9(z8 z8Var, int i3) {
        this.f10596a = i3;
        this.f10597b = z8Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f10596a) {
            case 0:
                super.onAnimationEnd(animator);
                r9 r9Var = this.f10597b.f11301b;
                d7 d7Var = r9Var.f10956v1;
                if (d7Var != null) {
                    d7Var.b();
                    r9Var.f10957w.removeView(r9Var.f10956v1);
                }
                r9Var.f10956v1 = null;
                r9Var.d0();
                return;
            default:
                super.onAnimationEnd(animator);
                d7 d7Var2 = this.f10597b.f11301b.f10956v1;
                if (d7Var2 != null) {
                    d7Var2.a(true);
                    return;
                }
                return;
        }
    }
}
