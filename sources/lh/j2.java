package lh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j2 extends AnimatorListenerAdapter {
    public final int f15800a;
    public final d4 f15801b;

    public j2(d4 d4Var, int i10) {
        this.f15800a = i10;
        this.f15801b = d4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        p2 p2Var;
        Runnable runnable;
        switch (this.f15800a) {
            case 0:
                d4 d4Var = this.f15801b;
                d4Var.f15512p3 = 0.0f;
                d4Var.f15506n3.setAlpha(1.0f);
                d4Var.f15506n3.setVisibility(8);
                d4Var.f15506n3.n();
                return;
            default:
                super.onAnimationEnd(animator);
                d4 d4Var2 = this.f15801b;
                d4Var2.J2.unlock();
                d4Var2.D2 = d4Var2.f15497k2;
                n2 n2Var = d4Var2.X1;
                if (n2Var != null && (runnable = n2Var.f26208w) != null) {
                    runnable.run();
                    n2Var.f26208w = null;
                }
                if (d4Var2.G1 && !d4Var2.f15517r2) {
                    i9 i9Var = ((z8) d4Var2.M1).d;
                    if (i9Var.f15791x) {
                        i9Var.f15791x = false;
                        i9Var.P();
                    }
                }
                if (!d4Var2.f15517r2 && (p2Var = d4Var2.Z2) != null) {
                    p2Var.setVisibility(8);
                }
                d4Var2.R2 = true;
                d4Var2.invalidate();
                return;
        }
    }
}
