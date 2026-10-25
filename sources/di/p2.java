package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class p2 extends AnimatorListenerAdapter {
    public final int f8896a;
    public final boolean f8897b;
    public final q4 f8898c;

    public p2(q4 q4Var, boolean z10, int i10) {
        this.f8896a = i10;
        this.f8898c = q4Var;
        this.f8897b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        float hideInterfaceAlpha;
        switch (this.f8896a) {
            case 0:
                if (!this.f8897b) {
                    q4 q4Var = this.f8898c;
                    q4Var.f8984g3.setVisibility(8);
                    q4Var.f8984g3.n();
                    return;
                }
                return;
            default:
                q4 q4Var2 = this.f8898c;
                d9 d9Var = q4Var2.f9019r0;
                i4 i4Var = q4Var2.f9003n0;
                ImageView imageView = q4Var2.m0;
                ImageView imageView2 = q4Var2.f8997l0;
                m4 m4Var = q4Var2.f8973d1;
                float f10 = 0.0f;
                if (this.f8897b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                q4Var2.S3 = f7;
                m4Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * q4Var2.S3);
                m4Var.setAlpha(1.0f - q4Var2.S3);
                imageView2.setTranslationY((-AndroidUtilities.dp(8.0f)) * q4Var2.S3);
                imageView2.setAlpha(1.0f - q4Var2.S3);
                imageView.setTranslationY((-AndroidUtilities.dp(8.0f)) * q4Var2.S3);
                imageView.setAlpha(1.0f - q4Var2.S3);
                i4Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * q4Var2.S3);
                i4Var.setAlpha((1.0f - q4Var2.S3) * q4Var2.T2);
                g3 g3Var = q4Var2.L1;
                if (g3Var != null) {
                    g3Var.setTranslationY(AndroidUtilities.dp(8.0f) * q4Var2.S3);
                    q4Var2.L1.setAlpha(1.0f - q4Var2.S3);
                }
                if (d9Var != null) {
                    d9Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * q4Var2.S3);
                    d9Var.setAlpha(1.0f - q4Var2.S3);
                }
                q4Var2.f9050z0.setAlpha(1.0f - q4Var2.S3);
                j4 j4Var = q4Var2.F1;
                if (j4Var != null) {
                    f10 = ((p9) j4Var).d.V;
                }
                hideInterfaceAlpha = q4Var2.getHideInterfaceAlpha();
                g3 g3Var2 = q4Var2.f9023s0;
                if (g3Var2 != null) {
                    g3Var2.setAlpha((1.0f - q4Var2.S3) * (1.0f - f10) * hideInterfaceAlpha);
                }
                ImageView imageView3 = q4Var2.C0;
                if (imageView3 != null) {
                    imageView3.setAlpha((1.0f - q4Var2.S3) * (1.0f - f10) * hideInterfaceAlpha);
                }
                g3 g3Var3 = q4Var2.E0;
                if (g3Var3 != null) {
                    g3Var3.setAlpha((1.0f - q4Var2.S3) * (1.0f - f10) * hideInterfaceAlpha);
                }
                u2 u2Var = q4Var2.Q1;
                if (u2Var != null) {
                    u2Var.setAlpha(1.0f - q4Var2.S3);
                    q4Var2.invalidate();
                }
                q4Var2.R0.invalidate();
                return;
        }
    }
}
