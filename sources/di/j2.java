package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
public final class j2 extends AnimatorListenerAdapter {
    public final int f9156a;
    public final boolean f9157b;
    public final j4 f9158c;

    public j2(j4 j4Var, boolean z9, int i7) {
        this.f9156a = i7;
        this.f9158c = j4Var;
        this.f9157b = z9;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        float hideInterfaceAlpha;
        switch (this.f9156a) {
            case 0:
                if (!this.f9157b) {
                    j4 j4Var = this.f9158c;
                    j4Var.f9169a3.setVisibility(8);
                    j4Var.f9169a3.n();
                    return;
                }
                return;
            default:
                j4 j4Var2 = this.f9158c;
                v8 v8Var = j4Var2.f9204l0;
                b4 b4Var = j4Var2.f9189h0;
                ImageView imageView = j4Var2.f9185g0;
                ImageView imageView2 = j4Var2.f9181f0;
                f4 f4Var = j4Var2.X0;
                float f11 = 0.0f;
                if (this.f9157b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                j4Var2.N3 = f10;
                f4Var.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * j4Var2.N3);
                f4Var.setAlpha(1.0f - j4Var2.N3);
                imageView2.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * j4Var2.N3);
                imageView2.setAlpha(1.0f - j4Var2.N3);
                imageView.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * j4Var2.N3);
                imageView.setAlpha(1.0f - j4Var2.N3);
                b4Var.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * j4Var2.N3);
                b4Var.setAlpha((1.0f - j4Var2.N3) * j4Var2.N2);
                a3 a3Var = j4Var2.F1;
                if (a3Var != null) {
                    a3Var.setTranslationY(org.telegram.messenger.g0.L(8.0f) * j4Var2.N3);
                    j4Var2.F1.setAlpha(1.0f - j4Var2.N3);
                }
                if (v8Var != null) {
                    v8Var.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * j4Var2.N3);
                    v8Var.setAlpha(1.0f - j4Var2.N3);
                }
                j4Var2.f9233t0.setAlpha(1.0f - j4Var2.N3);
                c4 c4Var = j4Var2.f9258z1;
                if (c4Var != null) {
                    f11 = ((h9) c4Var).d.V;
                }
                hideInterfaceAlpha = j4Var2.getHideInterfaceAlpha();
                a3 a3Var2 = j4Var2.m0;
                if (a3Var2 != null) {
                    a3Var2.setAlpha((1.0f - j4Var2.N3) * (1.0f - f11) * hideInterfaceAlpha);
                }
                ImageView imageView3 = j4Var2.f9245w0;
                if (imageView3 != null) {
                    imageView3.setAlpha((1.0f - j4Var2.N3) * (1.0f - f11) * hideInterfaceAlpha);
                }
                a3 a3Var3 = j4Var2.f9253y0;
                if (a3Var3 != null) {
                    a3Var3.setAlpha((1.0f - j4Var2.N3) * (1.0f - f11) * hideInterfaceAlpha);
                }
                o2 o2Var = j4Var2.K1;
                if (o2Var != null) {
                    o2Var.setAlpha(1.0f - j4Var2.N3);
                    j4Var2.invalidate();
                }
                j4Var2.L0.invalidate();
                return;
        }
    }
}
