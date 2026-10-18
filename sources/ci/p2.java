package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class p2 extends AnimatorListenerAdapter {
    public final int f5641a;
    public final boolean f5642b;
    public final p4 f5643c;

    public p2(p4 p4Var, boolean z10, int i10) {
        this.f5641a = i10;
        this.f5643c = p4Var;
        this.f5642b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        float hideInterfaceAlpha;
        switch (this.f5641a) {
            case 0:
                if (!this.f5642b) {
                    p4 p4Var = this.f5643c;
                    p4Var.f5700r3.setVisibility(8);
                    p4Var.f5700r3.n();
                    return;
                }
                return;
            default:
                p4 p4Var2 = this.f5643c;
                e9 e9Var = p4Var2.C0;
                h4 h4Var = p4Var2.f5721y0;
                ImageView imageView = p4Var2.f5717x0;
                ImageView imageView2 = p4Var2.f5713w0;
                l4 l4Var = p4Var2.f5689o1;
                float f10 = 0.0f;
                if (this.f5642b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                p4Var2.f5659d4 = f7;
                l4Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * p4Var2.f5659d4);
                l4Var.setAlpha(1.0f - p4Var2.f5659d4);
                imageView2.setTranslationY((-AndroidUtilities.dp(8.0f)) * p4Var2.f5659d4);
                imageView2.setAlpha(1.0f - p4Var2.f5659d4);
                imageView.setTranslationY((-AndroidUtilities.dp(8.0f)) * p4Var2.f5659d4);
                imageView.setAlpha(1.0f - p4Var2.f5659d4);
                h4Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * p4Var2.f5659d4);
                h4Var.setAlpha((1.0f - p4Var2.f5659d4) * p4Var2.f5662e3);
                g3 g3Var = p4Var2.W1;
                if (g3Var != null) {
                    g3Var.setTranslationY(AndroidUtilities.dp(8.0f) * p4Var2.f5659d4);
                    p4Var2.W1.setAlpha(1.0f - p4Var2.f5659d4);
                }
                if (e9Var != null) {
                    e9Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * p4Var2.f5659d4);
                    e9Var.setAlpha(1.0f - p4Var2.f5659d4);
                }
                p4Var2.K0.setAlpha(1.0f - p4Var2.f5659d4);
                i4 i4Var = p4Var2.Q1;
                if (i4Var != null) {
                    f10 = ((q9) i4Var).d.V;
                }
                hideInterfaceAlpha = p4Var2.getHideInterfaceAlpha();
                g3 g3Var2 = p4Var2.D0;
                if (g3Var2 != null) {
                    g3Var2.setAlpha((1.0f - p4Var2.f5659d4) * (1.0f - f10) * hideInterfaceAlpha);
                }
                ImageView imageView3 = p4Var2.N0;
                if (imageView3 != null) {
                    imageView3.setAlpha((1.0f - p4Var2.f5659d4) * (1.0f - f10) * hideInterfaceAlpha);
                }
                g3 g3Var3 = p4Var2.P0;
                if (g3Var3 != null) {
                    g3Var3.setAlpha((1.0f - p4Var2.f5659d4) * (1.0f - f10) * hideInterfaceAlpha);
                }
                u2 u2Var = p4Var2.f5649b2;
                if (u2Var != null) {
                    u2Var.setAlpha(1.0f - p4Var2.f5659d4);
                    p4Var2.invalidate();
                }
                p4Var2.f5652c1.invalidate();
                return;
        }
    }
}
