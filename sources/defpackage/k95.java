package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k95 extends AnimatorListenerAdapter {
    public final byte a;
    public final l95 b;

    public k95(l95 l95Var, byte b) {
        this.a = b;
        this.b = l95Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        l95 l95Var = this.b;
        switch (b) {
            case 0:
                l95Var.O0 = null;
                l95Var.E.F = false;
                h85 h85Var = l95Var.F;
                if (h85Var != null) {
                    if (h85Var.getParent() != null) {
                        l95Var.removeView(l95Var.F);
                        l95Var.F.e();
                    }
                    l95Var.F = null;
                    return;
                }
                return;
            case 1:
                super.onAnimationEnd(animator);
                l95Var.K0 = null;
                l95Var.J0 = 0.0f;
                l95Var.invalidate();
                return;
            default:
                l95Var.C0 = null;
                l95Var.z0 = 1.0f;
                l95Var.s0 = 0.0f;
                l95Var.t0 = 0.0f;
                l95Var.invalidate();
                return;
        }
    }
}
