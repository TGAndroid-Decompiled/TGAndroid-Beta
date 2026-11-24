package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class sc5 extends AnimatorListenerAdapter {
    public final byte a;
    public final boolean b;
    public final tc5 c;

    public sc5(tc5 tc5Var, boolean z, byte b) {
        this.a = b;
        this.c = tc5Var;
        this.b = z;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        tu1 tu1Var;
        fu fuVar;
        byte b = this.a;
        float f = 0.0f;
        boolean z = this.b;
        tc5 tc5Var = this.c;
        switch (b) {
            case 0:
                if (z) {
                    f = 1.0f;
                }
                tc5Var.x = f;
                tc5Var.e.setTranslationY(f * gl.L(48.0f));
                tc5Var.e.setPadding(0, 0, 0, (int) (tc5Var.x * gl.L(48.0f)));
                return;
            default:
                if (z) {
                    f = 1.0f;
                }
                tc5Var.F = f;
                tc5Var.n.setScaleX(gl.R1(0.95f, 1.0f, f));
                tc5Var.n.setScaleY(gl.R1(0.95f, 1.0f, tc5Var.F));
                wq1 wq1Var = tc5Var.f;
                if (wq1Var != null && (tu1Var = wq1Var.a) != null && (fuVar = tu1Var.a4) != null) {
                    fuVar.setScaleX(gl.R1(1.0f, 0.95f, tc5Var.F));
                    tc5Var.f.a.a4.setScaleY(gl.R1(1.0f, 0.95f, tc5Var.F));
                }
                tc5Var.h.setAlpha(tc5Var.F);
                if (!z) {
                    tc5Var.h.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
