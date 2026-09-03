package nh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b9 extends AnimatorListenerAdapter {
    public final int f15108a;
    public final r8 f15109b;

    public b9(r8 r8Var, int i10) {
        this.f15108a = i10;
        this.f15109b = r8Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f15108a) {
            case 0:
                super.onAnimationEnd(animator);
                i9 i9Var = this.f15109b.f15833b;
                x6 x6Var = i9Var.f15467r1;
                if (x6Var != null) {
                    x6Var.b();
                    i9Var.v.removeView(i9Var.f15467r1);
                }
                i9Var.f15467r1 = null;
                i9Var.P();
                return;
            default:
                super.onAnimationEnd(animator);
                x6 x6Var2 = this.f15109b.f15833b.f15467r1;
                if (x6Var2 != null) {
                    x6Var2.a(true);
                    return;
                }
                return;
        }
    }
}
