package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
public final class j2 extends AnimatorListenerAdapter {
    public final int f9242a;
    public final boolean f9243b;
    public final i4 f9244c;

    public j2(i4 i4Var, boolean z9, int i7) {
        this.f9242a = i7;
        this.f9244c = i4Var;
        this.f9243b = z9;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        float hideInterfaceAlpha;
        switch (this.f9242a) {
            case 0:
                if (!this.f9243b) {
                    i4 i4Var = this.f9244c;
                    i4Var.f9132a3.setVisibility(8);
                    i4Var.f9132a3.n();
                    return;
                }
                return;
            default:
                i4 i4Var2 = this.f9244c;
                u8 u8Var = i4Var2.f9167l0;
                a4 a4Var = i4Var2.f9152h0;
                ImageView imageView = i4Var2.f9148g0;
                ImageView imageView2 = i4Var2.f9144f0;
                e4 e4Var = i4Var2.X0;
                float f11 = 0.0f;
                if (this.f9243b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                i4Var2.N3 = f10;
                e4Var.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * i4Var2.N3);
                e4Var.setAlpha(1.0f - i4Var2.N3);
                imageView2.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * i4Var2.N3);
                imageView2.setAlpha(1.0f - i4Var2.N3);
                imageView.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * i4Var2.N3);
                imageView.setAlpha(1.0f - i4Var2.N3);
                a4Var.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * i4Var2.N3);
                a4Var.setAlpha((1.0f - i4Var2.N3) * i4Var2.N2);
                a3 a3Var = i4Var2.F1;
                if (a3Var != null) {
                    a3Var.setTranslationY(org.telegram.messenger.g0.L(8.0f) * i4Var2.N3);
                    i4Var2.F1.setAlpha(1.0f - i4Var2.N3);
                }
                if (u8Var != null) {
                    u8Var.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * i4Var2.N3);
                    u8Var.setAlpha(1.0f - i4Var2.N3);
                }
                i4Var2.f9196t0.setAlpha(1.0f - i4Var2.N3);
                b4 b4Var = i4Var2.f9221z1;
                if (b4Var != null) {
                    f11 = ((g9) b4Var).d.V;
                }
                hideInterfaceAlpha = i4Var2.getHideInterfaceAlpha();
                a3 a3Var2 = i4Var2.m0;
                if (a3Var2 != null) {
                    a3Var2.setAlpha((1.0f - i4Var2.N3) * (1.0f - f11) * hideInterfaceAlpha);
                }
                ImageView imageView3 = i4Var2.f9208w0;
                if (imageView3 != null) {
                    imageView3.setAlpha((1.0f - i4Var2.N3) * (1.0f - f11) * hideInterfaceAlpha);
                }
                a3 a3Var3 = i4Var2.f9216y0;
                if (a3Var3 != null) {
                    a3Var3.setAlpha((1.0f - i4Var2.N3) * (1.0f - f11) * hideInterfaceAlpha);
                }
                o2 o2Var = i4Var2.K1;
                if (o2Var != null) {
                    o2Var.setAlpha(1.0f - i4Var2.N3);
                    i4Var2.invalidate();
                }
                i4Var2.L0.invalidate();
                return;
        }
    }
}
