package fi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
public final class f2 extends AnimatorListenerAdapter {
    public final int f11695a;
    public final boolean f11696b;
    public final b4 f11697c;

    public f2(b4 b4Var, boolean z10, int i7) {
        this.f11695a = i7;
        this.f11697c = b4Var;
        this.f11696b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        float hideInterfaceAlpha;
        switch (this.f11695a) {
            case 0:
                if (!this.f11696b) {
                    b4 b4Var = this.f11697c;
                    b4Var.f11462b3.setVisibility(8);
                    b4Var.f11462b3.n();
                    return;
                }
                return;
            default:
                b4 b4Var2 = this.f11697c;
                n8 n8Var = b4Var2.m0;
                bi.v1 v1Var = b4Var2.f11482i0;
                ImageView imageView = b4Var2.f11478h0;
                ImageView imageView2 = b4Var2.f11474g0;
                x3 x3Var = b4Var2.Y0;
                float f11 = 0.0f;
                if (this.f11696b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                b4Var2.O3 = f10;
                x3Var.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * b4Var2.O3);
                x3Var.setAlpha(1.0f - b4Var2.O3);
                imageView2.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * b4Var2.O3);
                imageView2.setAlpha(1.0f - b4Var2.O3);
                imageView.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * b4Var2.O3);
                imageView.setAlpha(1.0f - b4Var2.O3);
                v1Var.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * b4Var2.O3);
                v1Var.setAlpha((1.0f - b4Var2.O3) * b4Var2.O2);
                v2 v2Var = b4Var2.G1;
                if (v2Var != null) {
                    v2Var.setTranslationY(org.telegram.messenger.g0.L(8.0f) * b4Var2.O3);
                    b4Var2.G1.setAlpha(1.0f - b4Var2.O3);
                }
                if (n8Var != null) {
                    n8Var.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * b4Var2.O3);
                    n8Var.setAlpha(1.0f - b4Var2.O3);
                }
                b4Var2.f11526u0.setAlpha(1.0f - b4Var2.O3);
                u3 u3Var = b4Var2.A1;
                if (u3Var != null) {
                    f11 = ((z8) u3Var).d.W;
                }
                hideInterfaceAlpha = b4Var2.getHideInterfaceAlpha();
                v2 v2Var2 = b4Var2.f11499n0;
                if (v2Var2 != null) {
                    v2Var2.setAlpha((1.0f - b4Var2.O3) * (1.0f - f11) * hideInterfaceAlpha);
                }
                ImageView imageView3 = b4Var2.f11538x0;
                if (imageView3 != null) {
                    imageView3.setAlpha((1.0f - b4Var2.O3) * (1.0f - f11) * hideInterfaceAlpha);
                }
                v2 v2Var3 = b4Var2.f11546z0;
                if (v2Var3 != null) {
                    v2Var3.setAlpha((1.0f - b4Var2.O3) * (1.0f - f11) * hideInterfaceAlpha);
                }
                k2 k2Var = b4Var2.L1;
                if (k2Var != null) {
                    k2Var.setAlpha(1.0f - b4Var2.O3);
                    b4Var2.invalidate();
                }
                b4Var2.M0.invalidate();
                return;
        }
    }
}
