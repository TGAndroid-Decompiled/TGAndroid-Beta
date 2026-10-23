package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class s9 extends AnimatorListenerAdapter {
    public final int f5937a;
    public final i9 f5938b;

    public s9(i9 i9Var, int i10) {
        this.f5937a = i10;
        this.f5938b = i9Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5937a) {
            case 0:
                super.onAnimationEnd(animator);
                z9 z9Var = this.f5938b.f5460b;
                l7 l7Var = z9Var.f6266u1;
                if (l7Var != null) {
                    l7Var.b();
                    z9Var.v.removeView(z9Var.f6266u1);
                }
                z9Var.f6266u1 = null;
                z9Var.P();
                return;
            default:
                super.onAnimationEnd(animator);
                l7 l7Var2 = this.f5938b.f5460b.f6266u1;
                if (l7Var2 != null) {
                    l7Var2.a(true);
                    return;
                }
                return;
        }
    }
}
