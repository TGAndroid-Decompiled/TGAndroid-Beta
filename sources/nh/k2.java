package nh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k2 extends AnimatorListenerAdapter {
    public final int f15530a;
    public final d4 f15531b;

    public k2(d4 d4Var, int i10) {
        this.f15530a = i10;
        this.f15531b = d4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        q2 q2Var;
        Runnable runnable;
        switch (this.f15530a) {
            case 0:
                d4 d4Var = this.f15531b;
                d4Var.f15230q3 = 0.0f;
                d4Var.f15224o3.setAlpha(1.0f);
                d4Var.f15224o3.setVisibility(8);
                d4Var.f15224o3.n();
                return;
            default:
                super.onAnimationEnd(animator);
                d4 d4Var2 = this.f15531b;
                d4Var2.K2.unlock();
                d4Var2.E2 = d4Var2.f15214l2;
                o2 o2Var = d4Var2.Y1;
                if (o2Var != null && (runnable = o2Var.f22852w) != null) {
                    runnable.run();
                    o2Var.f22852w = null;
                }
                if (d4Var2.H1 && !d4Var2.f15235s2) {
                    i9 i9Var = ((z8) d4Var2.N1).d;
                    if (i9Var.f15497x) {
                        i9Var.f15497x = false;
                        i9Var.P();
                    }
                }
                if (!d4Var2.f15235s2 && (q2Var = d4Var2.f15183a3) != null) {
                    q2Var.setVisibility(8);
                }
                d4Var2.S2 = true;
                d4Var2.invalidate();
                return;
        }
    }
}
