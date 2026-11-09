package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
public final class j2 extends AnimatorListenerAdapter {
    public final int f9151a;
    public final boolean f9152b;
    public final j4 f9153c;

    public j2(j4 j4Var, boolean z9, int i7) {
        this.f9151a = i7;
        this.f9153c = j4Var;
        this.f9152b = z9;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        float hideInterfaceAlpha;
        switch (this.f9151a) {
            case 0:
                if (!this.f9152b) {
                    j4 j4Var = this.f9153c;
                    j4Var.f9164a3.setVisibility(8);
                    j4Var.f9164a3.n();
                    return;
                }
                return;
            default:
                j4 j4Var2 = this.f9153c;
                v8 v8Var = j4Var2.f9199l0;
                b4 b4Var = j4Var2.f9184h0;
                ImageView imageView = j4Var2.f9180g0;
                ImageView imageView2 = j4Var2.f9176f0;
                f4 f4Var = j4Var2.X0;
                float f11 = 0.0f;
                if (this.f9152b) {
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
                j4Var2.f9228t0.setAlpha(1.0f - j4Var2.N3);
                c4 c4Var = j4Var2.f9253z1;
                if (c4Var != null) {
                    f11 = ((h9) c4Var).d.V;
                }
                hideInterfaceAlpha = j4Var2.getHideInterfaceAlpha();
                a3 a3Var2 = j4Var2.m0;
                if (a3Var2 != null) {
                    a3Var2.setAlpha((1.0f - j4Var2.N3) * (1.0f - f11) * hideInterfaceAlpha);
                }
                ImageView imageView3 = j4Var2.f9240w0;
                if (imageView3 != null) {
                    imageView3.setAlpha((1.0f - j4Var2.N3) * (1.0f - f11) * hideInterfaceAlpha);
                }
                a3 a3Var3 = j4Var2.f9248y0;
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
