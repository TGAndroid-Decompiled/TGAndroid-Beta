package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class x5 extends AnimatorListenerAdapter {
    public final int f10004a;
    public final z5 f10005b;

    public x5(z5 z5Var, int i7) {
        this.f10004a = i7;
        this.f10005b = z5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f10004a) {
            case 0:
                this.f10005b.f10134k0 = false;
                return;
            case 1:
                this.f10005b.f10134k0 = false;
                return;
            case 2:
                this.f10005b.P.setVisibility(4);
                return;
            case 3:
                z5 z5Var = this.f10005b;
                z5Var.f10154z0 = z5Var.f10153y0;
                z5Var.d(z5Var.f10122b0);
                return;
            default:
                z5 z5Var2 = this.f10005b;
                z5Var2.A0 = 1.0f;
                z5Var2.f10121b.setScaleX(1.0f);
                z5Var2.f10121b.setScaleY(z5Var2.A0);
                z5Var2.invalidate();
                return;
        }
    }
}
