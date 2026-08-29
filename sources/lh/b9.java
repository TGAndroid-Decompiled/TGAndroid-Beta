package lh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b9 extends AnimatorListenerAdapter {
    public final int f15413a;
    public final r8 f15414b;

    public b9(r8 r8Var, int i10) {
        this.f15413a = i10;
        this.f15414b = r8Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f15413a) {
            case 0:
                super.onAnimationEnd(animator);
                i9 i9Var = this.f15414b.f16187b;
                w6 w6Var = i9Var.f15779q1;
                if (w6Var != null) {
                    w6Var.b();
                    i9Var.v.removeView(i9Var.f15779q1);
                }
                i9Var.f15779q1 = null;
                i9Var.P();
                return;
            default:
                super.onAnimationEnd(animator);
                w6 w6Var2 = this.f15414b.f16187b.f15779q1;
                if (w6Var2 != null) {
                    w6Var2.a(true);
                    return;
                }
                return;
        }
    }
}
