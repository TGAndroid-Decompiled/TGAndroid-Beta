package nh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class j2 extends AnimatorListenerAdapter {
    public final int f15512a;
    public final boolean f15513b;
    public final d4 f15514c;

    public j2(d4 d4Var, boolean z4, int i10) {
        this.f15512a = i10;
        this.f15514c = d4Var;
        this.f15513b = z4;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        float hideInterfaceAlpha;
        switch (this.f15512a) {
            case 0:
                if (!this.f15513b) {
                    d4 d4Var = this.f15514c;
                    d4Var.f15224o3.setVisibility(8);
                    d4Var.f15224o3.n();
                    return;
                }
                return;
            default:
                d4 d4Var2 = this.f15514c;
                n8 n8Var = d4Var2.f15261z0;
                dh.d dVar = d4Var2.f15245v0;
                ImageView imageView = d4Var2.f15241u0;
                ImageView imageView2 = d4Var2.f15237t0;
                z3 z3Var = d4Var2.l1;
                float f11 = 0.0f;
                if (this.f15513b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                d4Var2.f15184a4 = f10;
                z3Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * d4Var2.f15184a4);
                z3Var.setAlpha(1.0f - d4Var2.f15184a4);
                imageView2.setTranslationY((-AndroidUtilities.dp(8.0f)) * d4Var2.f15184a4);
                imageView2.setAlpha(1.0f - d4Var2.f15184a4);
                imageView.setTranslationY((-AndroidUtilities.dp(8.0f)) * d4Var2.f15184a4);
                imageView.setAlpha(1.0f - d4Var2.f15184a4);
                dVar.setTranslationY((-AndroidUtilities.dp(8.0f)) * d4Var2.f15184a4);
                dVar.setAlpha((1.0f - d4Var2.f15184a4) * d4Var2.f15187b3);
                z2 z2Var = d4Var2.T1;
                if (z2Var != null) {
                    z2Var.setTranslationY(AndroidUtilities.dp(8.0f) * d4Var2.f15184a4);
                    d4Var2.T1.setAlpha(1.0f - d4Var2.f15184a4);
                }
                if (n8Var != null) {
                    n8Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * d4Var2.f15184a4);
                    n8Var.setAlpha(1.0f - d4Var2.f15184a4);
                }
                d4Var2.H0.setAlpha(1.0f - d4Var2.f15184a4);
                x3 x3Var = d4Var2.N1;
                if (x3Var != null) {
                    f11 = ((z8) x3Var).d.S;
                }
                hideInterfaceAlpha = d4Var2.getHideInterfaceAlpha();
                z2 z2Var2 = d4Var2.A0;
                if (z2Var2 != null) {
                    z2Var2.setAlpha((1.0f - d4Var2.f15184a4) * (1.0f - f11) * hideInterfaceAlpha);
                }
                ImageView imageView3 = d4Var2.K0;
                if (imageView3 != null) {
                    imageView3.setAlpha((1.0f - d4Var2.f15184a4) * (1.0f - f11) * hideInterfaceAlpha);
                }
                z2 z2Var3 = d4Var2.M0;
                if (z2Var3 != null) {
                    z2Var3.setAlpha((1.0f - d4Var2.f15184a4) * (1.0f - f11) * hideInterfaceAlpha);
                }
                o2 o2Var = d4Var2.Y1;
                if (o2Var != null) {
                    o2Var.setAlpha(1.0f - d4Var2.f15184a4);
                    d4Var2.invalidate();
                }
                d4Var2.Z0.invalidate();
                return;
        }
    }
}
