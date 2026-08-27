package jh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class b9 extends AnimatorListenerAdapter {

    public final int f13130a;

    public final r8 f13131b;

    public b9(r8 r8Var, int i10) {
        this.f13130a = i10;
        this.f13131b = r8Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f13130a) {
            case 0:
                super.onAnimationEnd(animator);
                i9 i9Var = this.f13131b.f13922b;
                w6 w6Var = i9Var.f13501q1;
                if (w6Var != null) {
                    w6Var.b();
                    i9Var.v.removeView(i9Var.f13501q1);
                }
                i9Var.f13501q1 = null;
                i9Var.P();
                break;
            default:
                super.onAnimationEnd(animator);
                w6 w6Var2 = this.f13131b.f13922b.f13501q1;
                if (w6Var2 != null) {
                    w6Var2.a(true);
                }
                break;
        }
    }
}
