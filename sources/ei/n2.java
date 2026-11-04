package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
public final class n2 extends AnimatorListenerAdapter {
    public final int f10659a;
    public final boolean f10660b;
    public final j4 f10661c;

    public n2(j4 j4Var, boolean z10, int i3) {
        this.f10659a = i3;
        this.f10661c = j4Var;
        this.f10660b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        float hideInterfaceAlpha;
        switch (this.f10659a) {
            case 0:
                if (!this.f10660b) {
                    j4 j4Var = this.f10661c;
                    j4Var.f10446b3.setVisibility(8);
                    j4Var.f10446b3.n();
                    return;
                }
                return;
            default:
                j4 j4Var2 = this.f10661c;
                u8 u8Var = j4Var2.m0;
                ai.d2 d2Var = j4Var2.f10466i0;
                ImageView imageView = j4Var2.f10462h0;
                ImageView imageView2 = j4Var2.f10458g0;
                f4 f4Var = j4Var2.Y0;
                float f11 = 0.0f;
                if (this.f10660b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                j4Var2.O3 = f10;
                f4Var.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * j4Var2.O3);
                f4Var.setAlpha(1.0f - j4Var2.O3);
                imageView2.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * j4Var2.O3);
                imageView2.setAlpha(1.0f - j4Var2.O3);
                imageView.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * j4Var2.O3);
                imageView.setAlpha(1.0f - j4Var2.O3);
                d2Var.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * j4Var2.O3);
                d2Var.setAlpha((1.0f - j4Var2.O3) * j4Var2.O2);
                d3 d3Var = j4Var2.G1;
                if (d3Var != null) {
                    d3Var.setTranslationY(org.telegram.messenger.g0.L(8.0f) * j4Var2.O3);
                    j4Var2.G1.setAlpha(1.0f - j4Var2.O3);
                }
                if (u8Var != null) {
                    u8Var.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * j4Var2.O3);
                    u8Var.setAlpha(1.0f - j4Var2.O3);
                }
                j4Var2.f10510u0.setAlpha(1.0f - j4Var2.O3);
                c4 c4Var = j4Var2.A1;
                if (c4Var != null) {
                    f11 = ((i9) c4Var).d.W;
                }
                hideInterfaceAlpha = j4Var2.getHideInterfaceAlpha();
                d3 d3Var2 = j4Var2.f10482n0;
                if (d3Var2 != null) {
                    d3Var2.setAlpha((1.0f - j4Var2.O3) * (1.0f - f11) * hideInterfaceAlpha);
                }
                ImageView imageView3 = j4Var2.f10522x0;
                if (imageView3 != null) {
                    imageView3.setAlpha((1.0f - j4Var2.O3) * (1.0f - f11) * hideInterfaceAlpha);
                }
                d3 d3Var3 = j4Var2.f10530z0;
                if (d3Var3 != null) {
                    d3Var3.setAlpha((1.0f - j4Var2.O3) * (1.0f - f11) * hideInterfaceAlpha);
                }
                s2 s2Var = j4Var2.L1;
                if (s2Var != null) {
                    s2Var.setAlpha(1.0f - j4Var2.O3);
                    j4Var2.invalidate();
                }
                j4Var2.M0.invalidate();
                return;
        }
    }
}
