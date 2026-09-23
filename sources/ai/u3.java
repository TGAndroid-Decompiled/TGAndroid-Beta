package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class u3 extends AnimatorListenerAdapter {
    public final int f1573a;
    public final boolean f1574b;
    public final e6 f1575c;

    public u3(e6 e6Var, boolean z10, int i10) {
        this.f1573a = i10;
        this.f1575c = e6Var;
        this.f1574b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        float hideInterfaceAlpha;
        switch (this.f1573a) {
            case 0:
                if (!this.f1574b) {
                    e6 e6Var = this.f1575c;
                    e6Var.f823r3.setVisibility(8);
                    e6Var.f823r3.n();
                    return;
                }
                return;
            default:
                e6 e6Var2 = this.f1575c;
                nb nbVar = e6Var2.C0;
                w5 w5Var = e6Var2.f844y0;
                ImageView imageView = e6Var2.f840x0;
                ImageView imageView2 = e6Var2.f836w0;
                a6 a6Var = e6Var2.f812o1;
                float f10 = 0.0f;
                if (this.f1574b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                e6Var2.f783d4 = f7;
                a6Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * e6Var2.f783d4);
                a6Var.setAlpha(1.0f - e6Var2.f783d4);
                imageView2.setTranslationY((-AndroidUtilities.dp(8.0f)) * e6Var2.f783d4);
                imageView2.setAlpha(1.0f - e6Var2.f783d4);
                imageView.setTranslationY((-AndroidUtilities.dp(8.0f)) * e6Var2.f783d4);
                imageView.setAlpha(1.0f - e6Var2.f783d4);
                w5Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * e6Var2.f783d4);
                w5Var.setAlpha((1.0f - e6Var2.f783d4) * e6Var2.f786e3);
                m4 m4Var = e6Var2.W1;
                if (m4Var != null) {
                    m4Var.setTranslationY(AndroidUtilities.dp(8.0f) * e6Var2.f783d4);
                    e6Var2.W1.setAlpha(1.0f - e6Var2.f783d4);
                }
                if (nbVar != null) {
                    nbVar.setTranslationY((-AndroidUtilities.dp(8.0f)) * e6Var2.f783d4);
                    nbVar.setAlpha(1.0f - e6Var2.f783d4);
                }
                e6Var2.K0.setAlpha(1.0f - e6Var2.f783d4);
                x5 x5Var = e6Var2.Q1;
                if (x5Var != null) {
                    f10 = ((ac) x5Var).d.V;
                }
                hideInterfaceAlpha = e6Var2.getHideInterfaceAlpha();
                m4 m4Var2 = e6Var2.D0;
                if (m4Var2 != null) {
                    m4Var2.setAlpha((1.0f - e6Var2.f783d4) * (1.0f - f10) * hideInterfaceAlpha);
                }
                ImageView imageView3 = e6Var2.N0;
                if (imageView3 != null) {
                    imageView3.setAlpha((1.0f - e6Var2.f783d4) * (1.0f - f10) * hideInterfaceAlpha);
                }
                m4 m4Var3 = e6Var2.P0;
                if (m4Var3 != null) {
                    m4Var3.setAlpha((1.0f - e6Var2.f783d4) * (1.0f - f10) * hideInterfaceAlpha);
                }
                a4 a4Var = e6Var2.f773b2;
                if (a4Var != null) {
                    a4Var.setAlpha(1.0f - e6Var2.f783d4);
                    e6Var2.invalidate();
                }
                e6Var2.f776c1.invalidate();
                return;
        }
    }
}
