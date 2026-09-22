package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class u3 extends AnimatorListenerAdapter {
    public final int f1567a;
    public final boolean f1568b;
    public final f6 f1569c;

    public u3(f6 f6Var, boolean z10, int i10) {
        this.f1567a = i10;
        this.f1569c = f6Var;
        this.f1568b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        float hideInterfaceAlpha;
        switch (this.f1567a) {
            case 0:
                if (!this.f1568b) {
                    f6 f6Var = this.f1569c;
                    f6Var.f847r3.setVisibility(8);
                    f6Var.f847r3.n();
                    return;
                }
                return;
            default:
                f6 f6Var2 = this.f1569c;
                nb nbVar = f6Var2.C0;
                x5 x5Var = f6Var2.f868y0;
                ImageView imageView = f6Var2.f864x0;
                ImageView imageView2 = f6Var2.f860w0;
                b6 b6Var = f6Var2.f836o1;
                float f10 = 0.0f;
                if (this.f1568b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                f6Var2.f807d4 = f7;
                b6Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * f6Var2.f807d4);
                b6Var.setAlpha(1.0f - f6Var2.f807d4);
                imageView2.setTranslationY((-AndroidUtilities.dp(8.0f)) * f6Var2.f807d4);
                imageView2.setAlpha(1.0f - f6Var2.f807d4);
                imageView.setTranslationY((-AndroidUtilities.dp(8.0f)) * f6Var2.f807d4);
                imageView.setAlpha(1.0f - f6Var2.f807d4);
                x5Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * f6Var2.f807d4);
                x5Var.setAlpha((1.0f - f6Var2.f807d4) * f6Var2.f810e3);
                m4 m4Var = f6Var2.W1;
                if (m4Var != null) {
                    m4Var.setTranslationY(AndroidUtilities.dp(8.0f) * f6Var2.f807d4);
                    f6Var2.W1.setAlpha(1.0f - f6Var2.f807d4);
                }
                if (nbVar != null) {
                    nbVar.setTranslationY((-AndroidUtilities.dp(8.0f)) * f6Var2.f807d4);
                    nbVar.setAlpha(1.0f - f6Var2.f807d4);
                }
                f6Var2.K0.setAlpha(1.0f - f6Var2.f807d4);
                y5 y5Var = f6Var2.Q1;
                if (y5Var != null) {
                    f10 = ((ac) y5Var).d.V;
                }
                hideInterfaceAlpha = f6Var2.getHideInterfaceAlpha();
                m4 m4Var2 = f6Var2.D0;
                if (m4Var2 != null) {
                    m4Var2.setAlpha((1.0f - f6Var2.f807d4) * (1.0f - f10) * hideInterfaceAlpha);
                }
                ImageView imageView3 = f6Var2.N0;
                if (imageView3 != null) {
                    imageView3.setAlpha((1.0f - f6Var2.f807d4) * (1.0f - f10) * hideInterfaceAlpha);
                }
                m4 m4Var3 = f6Var2.P0;
                if (m4Var3 != null) {
                    m4Var3.setAlpha((1.0f - f6Var2.f807d4) * (1.0f - f10) * hideInterfaceAlpha);
                }
                a4 a4Var = f6Var2.f797b2;
                if (a4Var != null) {
                    a4Var.setAlpha(1.0f - f6Var2.f807d4);
                    f6Var2.invalidate();
                }
                f6Var2.f800c1.invalidate();
                return;
        }
    }
}
