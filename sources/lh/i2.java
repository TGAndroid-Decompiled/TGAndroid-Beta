package lh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class i2 extends AnimatorListenerAdapter {
    public final int f15709a;
    public final boolean f15710b;
    public final d4 f15711c;

    public i2(d4 d4Var, boolean z10, int i10) {
        this.f15709a = i10;
        this.f15711c = d4Var;
        this.f15710b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f9;
        float hideInterfaceAlpha;
        switch (this.f15709a) {
            case 0:
                if (!this.f15710b) {
                    d4 d4Var = this.f15711c;
                    d4Var.f15506n3.setVisibility(8);
                    d4Var.f15506n3.n();
                    return;
                }
                return;
            default:
                d4 d4Var2 = this.f15711c;
                n8 n8Var = d4Var2.f15543y0;
                bh.d dVar = d4Var2.f15527u0;
                ImageView imageView = d4Var2.f15523t0;
                ImageView imageView2 = d4Var2.f15519s0;
                z3 z3Var = d4Var2.f15496k1;
                float f10 = 0.0f;
                if (this.f15710b) {
                    f9 = 1.0f;
                } else {
                    f9 = 0.0f;
                }
                d4Var2.Z3 = f9;
                z3Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * d4Var2.Z3);
                z3Var.setAlpha(1.0f - d4Var2.Z3);
                imageView2.setTranslationY((-AndroidUtilities.dp(8.0f)) * d4Var2.Z3);
                imageView2.setAlpha(1.0f - d4Var2.Z3);
                imageView.setTranslationY((-AndroidUtilities.dp(8.0f)) * d4Var2.Z3);
                imageView.setAlpha(1.0f - d4Var2.Z3);
                dVar.setTranslationY((-AndroidUtilities.dp(8.0f)) * d4Var2.Z3);
                dVar.setAlpha((1.0f - d4Var2.Z3) * d4Var2.f15469a3);
                y2 y2Var = d4Var2.S1;
                if (y2Var != null) {
                    y2Var.setTranslationY(AndroidUtilities.dp(8.0f) * d4Var2.Z3);
                    d4Var2.S1.setAlpha(1.0f - d4Var2.Z3);
                }
                if (n8Var != null) {
                    n8Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * d4Var2.Z3);
                    n8Var.setAlpha(1.0f - d4Var2.Z3);
                }
                d4Var2.G0.setAlpha(1.0f - d4Var2.Z3);
                x3 x3Var = d4Var2.M1;
                if (x3Var != null) {
                    f10 = ((z8) x3Var).d.R;
                }
                hideInterfaceAlpha = d4Var2.getHideInterfaceAlpha();
                y2 y2Var2 = d4Var2.f15547z0;
                if (y2Var2 != null) {
                    y2Var2.setAlpha((1.0f - d4Var2.Z3) * (1.0f - f10) * hideInterfaceAlpha);
                }
                ImageView imageView3 = d4Var2.J0;
                if (imageView3 != null) {
                    imageView3.setAlpha((1.0f - d4Var2.Z3) * (1.0f - f10) * hideInterfaceAlpha);
                }
                y2 y2Var3 = d4Var2.L0;
                if (y2Var3 != null) {
                    y2Var3.setAlpha((1.0f - d4Var2.Z3) * (1.0f - f10) * hideInterfaceAlpha);
                }
                n2 n2Var = d4Var2.X1;
                if (n2Var != null) {
                    n2Var.setAlpha(1.0f - d4Var2.Z3);
                    d4Var2.invalidate();
                }
                d4Var2.Y0.invalidate();
                return;
        }
    }
}
