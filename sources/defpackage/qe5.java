package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class qe5 extends AnimatorListenerAdapter {
    public final byte a;
    public final boolean b;
    public final re5 c;

    public qe5(re5 re5Var, boolean z, byte b) {
        this.a = b;
        this.c = re5Var;
        this.b = z;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        fw1 fw1Var;
        fv fvVar;
        byte b = this.a;
        float f = 0.0f;
        boolean z = this.b;
        re5 re5Var = this.c;
        switch (b) {
            case 0:
                if (z) {
                    f = 1.0f;
                }
                re5Var.x = f;
                re5Var.e.setTranslationY(f * gm.L(48.0f));
                re5Var.e.setPadding(0, 0, 0, (int) (re5Var.x * gm.L(48.0f)));
                return;
            default:
                if (z) {
                    f = 1.0f;
                }
                re5Var.F = f;
                re5Var.n.setScaleX(gm.R1(0.95f, 1.0f, f));
                re5Var.n.setScaleY(gm.R1(0.95f, 1.0f, re5Var.F));
                is1 is1Var = re5Var.f;
                if (is1Var != null && (fw1Var = is1Var.a) != null && (fvVar = fw1Var.a4) != null) {
                    fvVar.setScaleX(gm.R1(1.0f, 0.95f, re5Var.F));
                    re5Var.f.a.a4.setScaleY(gm.R1(1.0f, 0.95f, re5Var.F));
                }
                re5Var.h.setAlpha(re5Var.F);
                if (!z) {
                    re5Var.h.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
