package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class h3 extends AnimatorListenerAdapter {
    public final int f3052a;
    public final boolean f3053b;
    public final o5 f3054c;

    public h3(o5 o5Var, boolean z10, int i10) {
        this.f3052a = i10;
        this.f3054c = o5Var;
        this.f3053b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        float hideInterfaceAlpha;
        switch (this.f3052a) {
            case 0:
                if (!this.f3053b) {
                    o5 o5Var = this.f3054c;
                    o5Var.f3456r3.setVisibility(8);
                    o5Var.f3456r3.n();
                    return;
                }
                return;
            default:
                o5 o5Var2 = this.f3054c;
                ua uaVar = o5Var2.C0;
                g5 g5Var = o5Var2.f3477y0;
                ImageView imageView = o5Var2.f3473x0;
                ImageView imageView2 = o5Var2.f3469w0;
                k5 k5Var = o5Var2.f3445o1;
                float f10 = 0.0f;
                if (this.f3053b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                o5Var2.f3416d4 = f7;
                k5Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * o5Var2.f3416d4);
                k5Var.setAlpha(1.0f - o5Var2.f3416d4);
                imageView2.setTranslationY((-AndroidUtilities.dp(8.0f)) * o5Var2.f3416d4);
                imageView2.setAlpha(1.0f - o5Var2.f3416d4);
                imageView.setTranslationY((-AndroidUtilities.dp(8.0f)) * o5Var2.f3416d4);
                imageView.setAlpha(1.0f - o5Var2.f3416d4);
                g5Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * o5Var2.f3416d4);
                g5Var.setAlpha((1.0f - o5Var2.f3416d4) * o5Var2.f3419e3);
                z3 z3Var = o5Var2.W1;
                if (z3Var != null) {
                    z3Var.setTranslationY(AndroidUtilities.dp(8.0f) * o5Var2.f3416d4);
                    o5Var2.W1.setAlpha(1.0f - o5Var2.f3416d4);
                }
                if (uaVar != null) {
                    uaVar.setTranslationY((-AndroidUtilities.dp(8.0f)) * o5Var2.f3416d4);
                    uaVar.setAlpha(1.0f - o5Var2.f3416d4);
                }
                o5Var2.K0.setAlpha(1.0f - o5Var2.f3416d4);
                h5 h5Var = o5Var2.Q1;
                if (h5Var != null) {
                    f10 = ((gb) h5Var).d.V;
                }
                hideInterfaceAlpha = o5Var2.getHideInterfaceAlpha();
                z3 z3Var2 = o5Var2.D0;
                if (z3Var2 != null) {
                    z3Var2.setAlpha((1.0f - o5Var2.f3416d4) * (1.0f - f10) * hideInterfaceAlpha);
                }
                ImageView imageView3 = o5Var2.N0;
                if (imageView3 != null) {
                    imageView3.setAlpha((1.0f - o5Var2.f3416d4) * (1.0f - f10) * hideInterfaceAlpha);
                }
                z3 z3Var3 = o5Var2.P0;
                if (z3Var3 != null) {
                    z3Var3.setAlpha((1.0f - o5Var2.f3416d4) * (1.0f - f10) * hideInterfaceAlpha);
                }
                n3 n3Var = o5Var2.f3406b2;
                if (n3Var != null) {
                    n3Var.setAlpha(1.0f - o5Var2.f3416d4);
                    o5Var2.invalidate();
                }
                o5Var2.f3409c1.invalidate();
                return;
        }
    }
}
