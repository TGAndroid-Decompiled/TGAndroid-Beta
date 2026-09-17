package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class w5 extends AnimatorListenerAdapter {
    public final int f8356a;
    public final q6 f8357b;

    public w5(q6 q6Var, int i10) {
        this.f8356a = i10;
        this.f8357b = q6Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f8356a) {
            case 0:
                q6 q6Var = this.f8357b;
                q6Var.f7983b2 = 0.0f;
                q6Var.Z1.setAlpha(1.0f);
                q6Var.Z1.setVisibility(8);
                q6Var.Z1.n();
                return;
            case 1:
                this.f8357b.f8010p2.setTranslationY(0.0f);
                return;
            default:
                q6 q6Var2 = this.f8357b;
                q6Var2.f8016s2 = false;
                q6Var2.f8010p2.setTranslationY(0.0f);
                q6Var2.w0();
                return;
        }
    }
}
