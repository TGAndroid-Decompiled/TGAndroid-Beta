package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u5 extends AnimatorListenerAdapter {
    public final int f9531a;
    public final w5 f9532b;

    public u5(w5 w5Var, int i7) {
        this.f9531a = i7;
        this.f9532b = w5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f9531a) {
            case 0:
                this.f9532b.f9669h0 = false;
                return;
            case 1:
                this.f9532b.f9669h0 = false;
                return;
            case 2:
                this.f9532b.P.setVisibility(4);
                return;
            case 3:
                w5 w5Var = this.f9532b;
                w5Var.f9687w0 = w5Var.f9685v0;
                w5Var.d(w5Var.f9660b0);
                return;
            default:
                w5 w5Var2 = this.f9532b;
                w5Var2.f9689x0 = 1.0f;
                w5Var2.f9659b.setScaleX(1.0f);
                w5Var2.f9659b.setScaleY(w5Var2.f9689x0);
                w5Var2.invalidate();
                return;
        }
    }
}
