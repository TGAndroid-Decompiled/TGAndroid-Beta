package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class x5 extends AnimatorListenerAdapter {
    public final int f10005a;
    public final z5 f10006b;

    public x5(z5 z5Var, int i7) {
        this.f10005a = i7;
        this.f10006b = z5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f10005a) {
            case 0:
                this.f10006b.f10121k0 = false;
                return;
            case 1:
                this.f10006b.f10121k0 = false;
                return;
            case 2:
                this.f10006b.P.setVisibility(4);
                return;
            case 3:
                z5 z5Var = this.f10006b;
                z5Var.f10141z0 = z5Var.f10140y0;
                z5Var.d(z5Var.f10109b0);
                return;
            default:
                z5 z5Var2 = this.f10006b;
                z5Var2.A0 = 1.0f;
                z5Var2.f10108b.setScaleX(1.0f);
                z5Var2.f10108b.setScaleY(z5Var2.A0);
                z5Var2.invalidate();
                return;
        }
    }
}
