package oh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class k2 extends AnimatorListenerAdapter {
    public final int f17346a;
    public final boolean f17347b;
    public final f4 f17348c;

    public k2(f4 f4Var, boolean z4, int i10) {
        this.f17346a = i10;
        this.f17348c = f4Var;
        this.f17347b = z4;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        float hideInterfaceAlpha;
        switch (this.f17346a) {
            case 0:
                if (!this.f17347b) {
                    f4 f4Var = this.f17348c;
                    f4Var.f17096o3.setVisibility(8);
                    f4Var.f17096o3.n();
                    return;
                }
                return;
            default:
                f4 f4Var2 = this.f17348c;
                n8 n8Var = f4Var2.f17133z0;
                eh.d dVar = f4Var2.f17117v0;
                ImageView imageView = f4Var2.f17113u0;
                ImageView imageView2 = f4Var2.f17109t0;
                b4 b4Var = f4Var2.l1;
                float f11 = 0.0f;
                if (this.f17347b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                f4Var2.f17056a4 = f10;
                b4Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * f4Var2.f17056a4);
                b4Var.setAlpha(1.0f - f4Var2.f17056a4);
                imageView2.setTranslationY((-AndroidUtilities.dp(8.0f)) * f4Var2.f17056a4);
                imageView2.setAlpha(1.0f - f4Var2.f17056a4);
                imageView.setTranslationY((-AndroidUtilities.dp(8.0f)) * f4Var2.f17056a4);
                imageView.setAlpha(1.0f - f4Var2.f17056a4);
                dVar.setTranslationY((-AndroidUtilities.dp(8.0f)) * f4Var2.f17056a4);
                dVar.setAlpha((1.0f - f4Var2.f17056a4) * f4Var2.f17059b3);
                a3 a3Var = f4Var2.T1;
                if (a3Var != null) {
                    a3Var.setTranslationY(AndroidUtilities.dp(8.0f) * f4Var2.f17056a4);
                    f4Var2.T1.setAlpha(1.0f - f4Var2.f17056a4);
                }
                if (n8Var != null) {
                    n8Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * f4Var2.f17056a4);
                    n8Var.setAlpha(1.0f - f4Var2.f17056a4);
                }
                f4Var2.H0.setAlpha(1.0f - f4Var2.f17056a4);
                z3 z3Var = f4Var2.N1;
                if (z3Var != null) {
                    f11 = ((z8) z3Var).d.S;
                }
                hideInterfaceAlpha = f4Var2.getHideInterfaceAlpha();
                a3 a3Var2 = f4Var2.A0;
                if (a3Var2 != null) {
                    a3Var2.setAlpha((1.0f - f4Var2.f17056a4) * (1.0f - f11) * hideInterfaceAlpha);
                }
                ImageView imageView3 = f4Var2.K0;
                if (imageView3 != null) {
                    imageView3.setAlpha((1.0f - f4Var2.f17056a4) * (1.0f - f11) * hideInterfaceAlpha);
                }
                a3 a3Var3 = f4Var2.M0;
                if (a3Var3 != null) {
                    a3Var3.setAlpha((1.0f - f4Var2.f17056a4) * (1.0f - f11) * hideInterfaceAlpha);
                }
                p2 p2Var = f4Var2.Y1;
                if (p2Var != null) {
                    p2Var.setAlpha(1.0f - f4Var2.f17056a4);
                    f4Var2.invalidate();
                }
                f4Var2.Z0.invalidate();
                return;
        }
    }
}
