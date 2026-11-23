package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class x5 extends AnimatorListenerAdapter {
    public final int f10042a;
    public final z5 f10043b;

    public x5(z5 z5Var, int i7) {
        this.f10042a = i7;
        this.f10043b = z5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f10042a) {
            case 0:
                this.f10043b.f10158k0 = false;
                return;
            case 1:
                this.f10043b.f10158k0 = false;
                return;
            case 2:
                this.f10043b.P.setVisibility(4);
                return;
            case 3:
                z5 z5Var = this.f10043b;
                z5Var.f10178z0 = z5Var.f10177y0;
                z5Var.d(z5Var.f10146b0);
                return;
            default:
                z5 z5Var2 = this.f10043b;
                z5Var2.A0 = 1.0f;
                z5Var2.f10145b.setScaleX(1.0f);
                z5Var2.f10145b.setScaleY(z5Var2.A0);
                z5Var2.invalidate();
                return;
        }
    }
}
