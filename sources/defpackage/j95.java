package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j95 extends AnimatorListenerAdapter {
    public final byte a;
    public final h85 b;
    public final l95 c;

    public j95(l95 l95Var, h85 h85Var, byte b) {
        this.a = b;
        this.c = l95Var;
        this.b = h85Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f;
        byte b = this.a;
        l95 l95Var = this.c;
        h85 h85Var = this.b;
        switch (b) {
            case 0:
                l95Var.O0 = null;
                h85Var.F = false;
                h85 h85Var2 = l95Var.F;
                if (h85Var2 != null) {
                    if (h85Var2.getParent() != null) {
                        l95Var.removeView(l95Var.F);
                        l95Var.F.e();
                    }
                    l95Var.F = null;
                    return;
                }
                return;
            case 1:
                l95Var.y.e();
                l95Var.r = null;
                h85Var.r = false;
                if (!l95Var.b) {
                    l95Var.d();
                    l95Var.E = null;
                    l95Var.d = 0L;
                }
                if (l95Var.b) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                l95Var.c = f;
                l95Var.j();
                l95Var.g(false);
                if (!l95Var.b) {
                    l95Var.l0.setVisibility(8);
                    l95Var.m0.setVisibility(8);
                    l95Var.f0.setVisibility(8);
                    l95Var.g0.setVisibility(8);
                    return;
                }
                return;
            case 2:
                if (h85Var.getParent() != null) {
                    l95Var.removeView(h85Var);
                    h85Var.e();
                    return;
                }
                return;
            default:
                if (h85Var.getParent() != null) {
                    l95Var.removeView(h85Var);
                    h85Var.e();
                    return;
                }
                return;
        }
    }
}
