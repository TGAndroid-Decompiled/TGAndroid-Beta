package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
public final class p38 extends AnimatorListenerAdapter {
    public final byte a;
    public final boolean b;
    public final a58 c;

    public p38(a58 a58Var, boolean z, byte b) {
        this.a = b;
        this.c = a58Var;
        this.b = z;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f;
        float hideInterfaceAlpha;
        byte b = this.a;
        boolean z = this.b;
        a58 a58Var = this.c;
        switch (b) {
            case 0:
                if (!z) {
                    a58Var.h3.setVisibility(8);
                    a58Var.h3.k();
                    return;
                }
                return;
            default:
                b8b b8bVar = a58Var.s0;
                a6 a6Var = a58Var.o0;
                ImageView imageView = a58Var.n0;
                ImageView imageView2 = a58Var.m0;
                x48 x48Var = a58Var.e1;
                float f2 = 0.0f;
                if (z) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                a58Var.T3 = f;
                x48Var.setTranslationY((-gm.L(8.0f)) * a58Var.T3);
                x48Var.setAlpha(1.0f - a58Var.T3);
                imageView2.setTranslationY((-gm.L(8.0f)) * a58Var.T3);
                imageView2.setAlpha(1.0f - a58Var.T3);
                imageView.setTranslationY((-gm.L(8.0f)) * a58Var.T3);
                imageView.setAlpha(1.0f - a58Var.T3);
                a6Var.setTranslationY((-gm.L(8.0f)) * a58Var.T3);
                a6Var.setAlpha((1.0f - a58Var.T3) * a58Var.U2);
                b48 b48Var = a58Var.M1;
                if (b48Var != null) {
                    b48Var.setTranslationY(gm.L(8.0f) * a58Var.T3);
                    a58Var.M1.setAlpha(1.0f - a58Var.T3);
                }
                if (b8bVar != null) {
                    b8bVar.setTranslationY((-gm.L(8.0f)) * a58Var.T3);
                    b8bVar.setAlpha(1.0f - a58Var.T3);
                }
                a58Var.A0.setAlpha(1.0f - a58Var.T3);
                w48 w48Var = a58Var.G1;
                if (w48Var != null) {
                    f2 = ((fab) w48Var).d.W;
                }
                hideInterfaceAlpha = a58Var.getHideInterfaceAlpha();
                b48 b48Var2 = a58Var.t0;
                if (b48Var2 != null) {
                    b48Var2.setAlpha((1.0f - a58Var.T3) * (1.0f - f2) * hideInterfaceAlpha);
                }
                ImageView imageView3 = a58Var.D0;
                if (imageView3 != null) {
                    imageView3.setAlpha((1.0f - a58Var.T3) * (1.0f - f2) * hideInterfaceAlpha);
                }
                b48 b48Var3 = a58Var.F0;
                if (b48Var3 != null) {
                    b48Var3.setAlpha((1.0f - a58Var.T3) * (1.0f - f2) * hideInterfaceAlpha);
                }
                t38 t38Var = a58Var.R1;
                if (t38Var != null) {
                    t38Var.setAlpha(1.0f - a58Var.T3);
                    a58Var.invalidate();
                }
                a58Var.S0.invalidate();
                return;
        }
    }
}
