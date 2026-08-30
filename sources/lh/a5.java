package lh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class a5 extends AnimatorListenerAdapter {
    public final int f12104a;
    public final c5 f12105b;

    public a5(c5 c5Var, int i10) {
        this.f12104a = i10;
        this.f12105b = c5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f12104a) {
            case 0:
                this.f12105b.f12214a0 = false;
                return;
            case 1:
                this.f12105b.f12214a0 = false;
                return;
            case 2:
                this.f12105b.K.setVisibility(4);
                return;
            case 3:
                c5 c5Var = this.f12105b;
                c5Var.f12232p0 = c5Var.f12231o0;
                c5Var.d(c5Var.R);
                return;
            default:
                c5 c5Var2 = this.f12105b;
                c5Var2.f12233q0 = 1.0f;
                c5Var2.f12215b.setScaleX(1.0f);
                c5Var2.f12215b.setScaleY(c5Var2.f12233q0);
                c5Var2.invalidate();
                return;
        }
    }
}
