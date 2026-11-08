package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k2 extends AnimatorListenerAdapter {
    public final int f9281a;
    public final i4 f9282b;

    public k2(i4 i4Var, int i7) {
        this.f9281a = i7;
        this.f9282b = i4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        q2 q2Var;
        Runnable runnable;
        switch (this.f9281a) {
            case 0:
                i4 i4Var = this.f9282b;
                i4Var.f9138c3 = 0.0f;
                i4Var.f9132a3.setAlpha(1.0f);
                i4Var.f9132a3.setVisibility(8);
                i4Var.f9132a3.n();
                return;
            default:
                super.onAnimationEnd(animator);
                i4 i4Var2 = this.f9282b;
                i4Var2.f9210w2.e();
                i4Var2.f9186q2 = i4Var2.X1;
                o2 o2Var = i4Var2.K1;
                if (o2Var != null && (runnable = o2Var.f31149x) != null) {
                    runnable.run();
                    o2Var.f31149x = null;
                }
                if (i4Var2.f9197t1 && !i4Var2.f9142e2) {
                    p9 p9Var = ((g9) i4Var2.f9221z1).d;
                    if (p9Var.f9582y) {
                        p9Var.f9582y = false;
                        p9Var.V();
                    }
                }
                if (!i4Var2.f9142e2 && (q2Var = i4Var2.M2) != null) {
                    q2Var.setVisibility(8);
                }
                i4Var2.E2 = true;
                i4Var2.invalidate();
                return;
        }
    }
}
