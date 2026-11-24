package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class hb5 extends AnimatorListenerAdapter {
    public final byte a;
    public final ha5 b;
    public final jb5 c;

    public hb5(jb5 jb5Var, ha5 ha5Var, byte b) {
        this.a = b;
        this.c = jb5Var;
        this.b = ha5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f;
        byte b = this.a;
        jb5 jb5Var = this.c;
        ha5 ha5Var = this.b;
        switch (b) {
            case 0:
                jb5Var.O0 = null;
                ha5Var.F = false;
                ha5 ha5Var2 = jb5Var.F;
                if (ha5Var2 != null) {
                    if (ha5Var2.getParent() != null) {
                        jb5Var.removeView(jb5Var.F);
                        jb5Var.F.e();
                    }
                    jb5Var.F = null;
                    return;
                }
                return;
            case 1:
                jb5Var.y.e();
                jb5Var.r = null;
                ha5Var.r = false;
                if (!jb5Var.b) {
                    jb5Var.d();
                    jb5Var.E = null;
                    jb5Var.d = 0L;
                }
                if (jb5Var.b) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                jb5Var.c = f;
                jb5Var.j();
                jb5Var.g(false);
                if (!jb5Var.b) {
                    jb5Var.l0.setVisibility(8);
                    jb5Var.m0.setVisibility(8);
                    jb5Var.f0.setVisibility(8);
                    jb5Var.g0.setVisibility(8);
                    return;
                }
                return;
            case 2:
                if (ha5Var.getParent() != null) {
                    jb5Var.removeView(ha5Var);
                    ha5Var.e();
                    return;
                }
                return;
            default:
                if (ha5Var.getParent() != null) {
                    jb5Var.removeView(ha5Var);
                    ha5Var.e();
                    return;
                }
                return;
        }
    }
}
