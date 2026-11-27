package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
public final class d58 extends AnimatorListenerAdapter {
    public final byte a;
    public final boolean b;
    public final o68 c;

    public d58(o68 o68Var, boolean z, byte b) {
        this.a = b;
        this.c = o68Var;
        this.b = z;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f;
        float hideInterfaceAlpha;
        byte b = this.a;
        boolean z = this.b;
        o68 o68Var = this.c;
        switch (b) {
            case 0:
                if (!z) {
                    o68Var.b3.setVisibility(8);
                    o68Var.b3.k();
                    return;
                }
                return;
            default:
                x9b x9bVar = o68Var.m0;
                b6 b6Var = o68Var.i0;
                ImageView imageView = o68Var.h0;
                ImageView imageView2 = o68Var.g0;
                l68 l68Var = o68Var.Y0;
                float f2 = 0.0f;
                if (z) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                o68Var.N3 = f;
                l68Var.setTranslationY((-hl.L(8.0f)) * o68Var.N3);
                l68Var.setAlpha(1.0f - o68Var.N3);
                imageView2.setTranslationY((-hl.L(8.0f)) * o68Var.N3);
                imageView2.setAlpha(1.0f - o68Var.N3);
                imageView.setTranslationY((-hl.L(8.0f)) * o68Var.N3);
                imageView.setAlpha(1.0f - o68Var.N3);
                b6Var.setTranslationY((-hl.L(8.0f)) * o68Var.N3);
                b6Var.setAlpha((1.0f - o68Var.N3) * o68Var.O2);
                o58 o58Var = o68Var.G1;
                if (o58Var != null) {
                    o58Var.setTranslationY(hl.L(8.0f) * o68Var.N3);
                    o68Var.G1.setAlpha(1.0f - o68Var.N3);
                }
                if (x9bVar != null) {
                    x9bVar.setTranslationY((-hl.L(8.0f)) * o68Var.N3);
                    x9bVar.setAlpha(1.0f - o68Var.N3);
                }
                o68Var.u0.setAlpha(1.0f - o68Var.N3);
                k68 k68Var = o68Var.A1;
                if (k68Var != null) {
                    f2 = ((ccb) k68Var).d.W;
                }
                hideInterfaceAlpha = o68Var.getHideInterfaceAlpha();
                o58 o58Var2 = o68Var.n0;
                if (o58Var2 != null) {
                    o58Var2.setAlpha((1.0f - o68Var.N3) * (1.0f - f2) * hideInterfaceAlpha);
                }
                ImageView imageView3 = o68Var.x0;
                if (imageView3 != null) {
                    imageView3.setAlpha((1.0f - o68Var.N3) * (1.0f - f2) * hideInterfaceAlpha);
                }
                o58 o58Var3 = o68Var.z0;
                if (o58Var3 != null) {
                    o58Var3.setAlpha((1.0f - o68Var.N3) * (1.0f - f2) * hideInterfaceAlpha);
                }
                g58 g58Var = o68Var.L1;
                if (g58Var != null) {
                    g58Var.setAlpha(1.0f - o68Var.N3);
                    o68Var.invalidate();
                }
                o68Var.M0.invalidate();
                return;
        }
    }
}
