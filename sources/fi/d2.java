package fi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
public final class d2 extends AnimatorListenerAdapter {
    public final int f11883a;
    public final boolean f11884b;
    public final z3 f11885c;

    public d2(z3 z3Var, boolean z10, int i7) {
        this.f11883a = i7;
        this.f11885c = z3Var;
        this.f11884b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        float hideInterfaceAlpha;
        switch (this.f11883a) {
            case 0:
                if (!this.f11884b) {
                    z3 z3Var = this.f11885c;
                    z3Var.f12856b3.setVisibility(8);
                    z3Var.f12856b3.n();
                    return;
                }
                return;
            default:
                z3 z3Var2 = this.f11885c;
                k8 k8Var = z3Var2.m0;
                bi.t2 t2Var = z3Var2.f12876i0;
                ImageView imageView = z3Var2.f12872h0;
                ImageView imageView2 = z3Var2.f12868g0;
                v3 v3Var = z3Var2.Y0;
                float f11 = 0.0f;
                if (this.f11884b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                z3Var2.O3 = f10;
                v3Var.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * z3Var2.O3);
                v3Var.setAlpha(1.0f - z3Var2.O3);
                imageView2.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * z3Var2.O3);
                imageView2.setAlpha(1.0f - z3Var2.O3);
                imageView.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * z3Var2.O3);
                imageView.setAlpha(1.0f - z3Var2.O3);
                t2Var.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * z3Var2.O3);
                t2Var.setAlpha((1.0f - z3Var2.O3) * z3Var2.O2);
                t2 t2Var2 = z3Var2.G1;
                if (t2Var2 != null) {
                    t2Var2.setTranslationY(org.telegram.messenger.g0.L(8.0f) * z3Var2.O3);
                    z3Var2.G1.setAlpha(1.0f - z3Var2.O3);
                }
                if (k8Var != null) {
                    k8Var.setTranslationY((-org.telegram.messenger.g0.L(8.0f)) * z3Var2.O3);
                    k8Var.setAlpha(1.0f - z3Var2.O3);
                }
                z3Var2.f12920u0.setAlpha(1.0f - z3Var2.O3);
                s3 s3Var = z3Var2.A1;
                if (s3Var != null) {
                    f11 = ((w8) s3Var).d.W;
                }
                hideInterfaceAlpha = z3Var2.getHideInterfaceAlpha();
                t2 t2Var3 = z3Var2.f12893n0;
                if (t2Var3 != null) {
                    t2Var3.setAlpha((1.0f - z3Var2.O3) * (1.0f - f11) * hideInterfaceAlpha);
                }
                ImageView imageView3 = z3Var2.f12932x0;
                if (imageView3 != null) {
                    imageView3.setAlpha((1.0f - z3Var2.O3) * (1.0f - f11) * hideInterfaceAlpha);
                }
                t2 t2Var4 = z3Var2.f12940z0;
                if (t2Var4 != null) {
                    t2Var4.setAlpha((1.0f - z3Var2.O3) * (1.0f - f11) * hideInterfaceAlpha);
                }
                i2 i2Var = z3Var2.L1;
                if (i2Var != null) {
                    i2Var.setAlpha(1.0f - z3Var2.O3);
                    z3Var2.invalidate();
                }
                z3Var2.M0.invalidate();
                return;
        }
    }
}
