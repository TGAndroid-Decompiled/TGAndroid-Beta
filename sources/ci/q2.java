package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class q2 extends AnimatorListenerAdapter {
    public final int f5758a;
    public final boolean f5759b;
    public final q4 f5760c;

    public q2(q4 q4Var, boolean z10, int i10) {
        this.f5758a = i10;
        this.f5760c = q4Var;
        this.f5759b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        float hideInterfaceAlpha;
        switch (this.f5758a) {
            case 0:
                if (!this.f5759b) {
                    q4 q4Var = this.f5760c;
                    q4Var.f5817r3.setVisibility(8);
                    q4Var.f5817r3.n();
                    return;
                }
                return;
            default:
                q4 q4Var2 = this.f5760c;
                f9 f9Var = q4Var2.C0;
                i4 i4Var = q4Var2.f5838y0;
                ImageView imageView = q4Var2.f5834x0;
                ImageView imageView2 = q4Var2.f5830w0;
                m4 m4Var = q4Var2.f5806o1;
                float f10 = 0.0f;
                if (this.f5759b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                q4Var2.f5776d4 = f7;
                m4Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * q4Var2.f5776d4);
                m4Var.setAlpha(1.0f - q4Var2.f5776d4);
                imageView2.setTranslationY((-AndroidUtilities.dp(8.0f)) * q4Var2.f5776d4);
                imageView2.setAlpha(1.0f - q4Var2.f5776d4);
                imageView.setTranslationY((-AndroidUtilities.dp(8.0f)) * q4Var2.f5776d4);
                imageView.setAlpha(1.0f - q4Var2.f5776d4);
                i4Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * q4Var2.f5776d4);
                i4Var.setAlpha((1.0f - q4Var2.f5776d4) * q4Var2.f5779e3);
                h3 h3Var = q4Var2.W1;
                if (h3Var != null) {
                    h3Var.setTranslationY(AndroidUtilities.dp(8.0f) * q4Var2.f5776d4);
                    q4Var2.W1.setAlpha(1.0f - q4Var2.f5776d4);
                }
                if (f9Var != null) {
                    f9Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * q4Var2.f5776d4);
                    f9Var.setAlpha(1.0f - q4Var2.f5776d4);
                }
                q4Var2.K0.setAlpha(1.0f - q4Var2.f5776d4);
                j4 j4Var = q4Var2.Q1;
                if (j4Var != null) {
                    f10 = ((r9) j4Var).d.V;
                }
                hideInterfaceAlpha = q4Var2.getHideInterfaceAlpha();
                h3 h3Var2 = q4Var2.D0;
                if (h3Var2 != null) {
                    h3Var2.setAlpha((1.0f - q4Var2.f5776d4) * (1.0f - f10) * hideInterfaceAlpha);
                }
                ImageView imageView3 = q4Var2.N0;
                if (imageView3 != null) {
                    imageView3.setAlpha((1.0f - q4Var2.f5776d4) * (1.0f - f10) * hideInterfaceAlpha);
                }
                h3 h3Var3 = q4Var2.P0;
                if (h3Var3 != null) {
                    h3Var3.setAlpha((1.0f - q4Var2.f5776d4) * (1.0f - f10) * hideInterfaceAlpha);
                }
                v2 v2Var = q4Var2.f5766b2;
                if (v2Var != null) {
                    v2Var.setAlpha(1.0f - q4Var2.f5776d4);
                    q4Var2.invalidate();
                }
                q4Var2.f5769c1.invalidate();
                return;
        }
    }
}
