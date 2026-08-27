package jh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

public final class j2 extends AnimatorListenerAdapter {

    public final int f13522a;

    public final boolean f13523b;

    public final e4 f13524c;

    public j2(e4 e4Var, boolean z10, int i10) {
        this.f13522a = i10;
        this.f13524c = e4Var;
        this.f13523b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f13522a) {
            case 0:
                if (!this.f13523b) {
                    e4 e4Var = this.f13524c;
                    e4Var.f13257n3.setVisibility(8);
                    e4Var.f13257n3.n();
                }
                break;
            default:
                e4 e4Var2 = this.f13524c;
                n8 n8Var = e4Var2.f13294y0;
                ag.d dVar = e4Var2.f13278u0;
                ImageView imageView = e4Var2.f13274t0;
                ImageView imageView2 = e4Var2.f13270s0;
                a4 a4Var = e4Var2.f13247k1;
                e4Var2.Z3 = this.f13523b ? 1.0f : 0.0f;
                a4Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * e4Var2.Z3);
                a4Var.setAlpha(1.0f - e4Var2.Z3);
                imageView2.setTranslationY((-AndroidUtilities.dp(8.0f)) * e4Var2.Z3);
                imageView2.setAlpha(1.0f - e4Var2.Z3);
                imageView.setTranslationY((-AndroidUtilities.dp(8.0f)) * e4Var2.Z3);
                imageView.setAlpha(1.0f - e4Var2.Z3);
                dVar.setTranslationY((-AndroidUtilities.dp(8.0f)) * e4Var2.Z3);
                dVar.setAlpha((1.0f - e4Var2.Z3) * e4Var2.a3);
                z2 z2Var = e4Var2.S1;
                if (z2Var != null) {
                    z2Var.setTranslationY(AndroidUtilities.dp(8.0f) * e4Var2.Z3);
                    e4Var2.S1.setAlpha(1.0f - e4Var2.Z3);
                }
                if (n8Var != null) {
                    n8Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * e4Var2.Z3);
                    n8Var.setAlpha(1.0f - e4Var2.Z3);
                }
                e4Var2.G0.setAlpha(1.0f - e4Var2.Z3);
                y3 y3Var = e4Var2.M1;
                float f10 = y3Var != null ? ((z8) y3Var).d.R : 0.0f;
                float hideInterfaceAlpha = e4Var2.getHideInterfaceAlpha();
                z2 z2Var2 = e4Var2.f13298z0;
                if (z2Var2 != null) {
                    z2Var2.setAlpha((1.0f - e4Var2.Z3) * (1.0f - f10) * hideInterfaceAlpha);
                }
                ImageView imageView3 = e4Var2.J0;
                if (imageView3 != null) {
                    imageView3.setAlpha((1.0f - e4Var2.Z3) * (1.0f - f10) * hideInterfaceAlpha);
                }
                z2 z2Var3 = e4Var2.L0;
                if (z2Var3 != null) {
                    z2Var3.setAlpha((1.0f - e4Var2.Z3) * (1.0f - f10) * hideInterfaceAlpha);
                }
                o2 o2Var = e4Var2.X1;
                if (o2Var != null) {
                    o2Var.setAlpha(1.0f - e4Var2.Z3);
                    e4Var2.invalidate();
                }
                e4Var2.Y0.invalidate();
                break;
        }
    }
}
