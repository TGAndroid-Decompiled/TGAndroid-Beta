package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k2 extends AnimatorListenerAdapter {
    public final int f9279a;
    public final j4 f9280b;

    public k2(j4 j4Var, int i7) {
        this.f9279a = i7;
        this.f9280b = j4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        q2 q2Var;
        Runnable runnable;
        switch (this.f9279a) {
            case 0:
                j4 j4Var = this.f9280b;
                j4Var.f9175c3 = 0.0f;
                j4Var.f9169a3.setAlpha(1.0f);
                j4Var.f9169a3.setVisibility(8);
                j4Var.f9169a3.n();
                return;
            default:
                super.onAnimationEnd(animator);
                j4 j4Var2 = this.f9280b;
                j4Var2.f9247w2.e();
                j4Var2.f9223q2 = j4Var2.X1;
                o2 o2Var = j4Var2.K1;
                if (o2Var != null && (runnable = o2Var.f31165x) != null) {
                    runnable.run();
                    o2Var.f31165x = null;
                }
                if (j4Var2.f9234t1 && !j4Var2.f9179e2) {
                    q9 q9Var = ((h9) j4Var2.f9258z1).d;
                    if (q9Var.f9652y) {
                        q9Var.f9652y = false;
                        q9Var.V();
                    }
                }
                if (!j4Var2.f9179e2 && (q2Var = j4Var2.M2) != null) {
                    q2Var.setVisibility(8);
                }
                j4Var2.E2 = true;
                j4Var2.invalidate();
                return;
        }
    }
}
