package nh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class b9 extends AnimatorListenerAdapter {
    public final int f15128a;
    public final r8 f15129b;

    public b9(r8 r8Var, int i10) {
        this.f15128a = i10;
        this.f15129b = r8Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f15128a) {
            case 0:
                super.onAnimationEnd(animator);
                i9 i9Var = this.f15129b.f15853b;
                x6 x6Var = i9Var.f15487r1;
                if (x6Var != null) {
                    x6Var.b();
                    i9Var.v.removeView(i9Var.f15487r1);
                }
                i9Var.f15487r1 = null;
                i9Var.P();
                return;
            default:
                super.onAnimationEnd(animator);
                x6 x6Var2 = this.f15129b.f15853b.f15487r1;
                if (x6Var2 != null) {
                    x6Var2.a(true);
                    return;
                }
                return;
        }
    }
}
