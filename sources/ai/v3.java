package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class v3 extends AnimatorListenerAdapter {
    public final int f1821a;
    public final boolean f1822b;
    public final f6 f1823c;

    public v3(f6 f6Var, boolean z10, int i10) {
        this.f1821a = i10;
        this.f1823c = f6Var;
        this.f1822b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        float hideInterfaceAlpha;
        switch (this.f1821a) {
            case 0:
                if (!this.f1822b) {
                    f6 f6Var = this.f1823c;
                    f6Var.f1002r3.setVisibility(8);
                    f6Var.f1002r3.n();
                    return;
                }
                return;
            default:
                f6 f6Var2 = this.f1823c;
                ob obVar = f6Var2.C0;
                x5 x5Var = f6Var2.f1023y0;
                ImageView imageView = f6Var2.f1019x0;
                ImageView imageView2 = f6Var2.f1015w0;
                b6 b6Var = f6Var2.f991o1;
                float f10 = 0.0f;
                if (this.f1822b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                f6Var2.f962d4 = f7;
                b6Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * f6Var2.f962d4);
                b6Var.setAlpha(1.0f - f6Var2.f962d4);
                imageView2.setTranslationY((-AndroidUtilities.dp(8.0f)) * f6Var2.f962d4);
                imageView2.setAlpha(1.0f - f6Var2.f962d4);
                imageView.setTranslationY((-AndroidUtilities.dp(8.0f)) * f6Var2.f962d4);
                imageView.setAlpha(1.0f - f6Var2.f962d4);
                x5Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * f6Var2.f962d4);
                x5Var.setAlpha((1.0f - f6Var2.f962d4) * f6Var2.f965e3);
                n4 n4Var = f6Var2.W1;
                if (n4Var != null) {
                    n4Var.setTranslationY(AndroidUtilities.dp(8.0f) * f6Var2.f962d4);
                    f6Var2.W1.setAlpha(1.0f - f6Var2.f962d4);
                }
                if (obVar != null) {
                    obVar.setTranslationY((-AndroidUtilities.dp(8.0f)) * f6Var2.f962d4);
                    obVar.setAlpha(1.0f - f6Var2.f962d4);
                }
                f6Var2.K0.setAlpha(1.0f - f6Var2.f962d4);
                y5 y5Var = f6Var2.Q1;
                if (y5Var != null) {
                    f10 = ((bc) y5Var).d.V;
                }
                hideInterfaceAlpha = f6Var2.getHideInterfaceAlpha();
                n4 n4Var2 = f6Var2.D0;
                if (n4Var2 != null) {
                    n4Var2.setAlpha((1.0f - f6Var2.f962d4) * (1.0f - f10) * hideInterfaceAlpha);
                }
                ImageView imageView3 = f6Var2.N0;
                if (imageView3 != null) {
                    imageView3.setAlpha((1.0f - f6Var2.f962d4) * (1.0f - f10) * hideInterfaceAlpha);
                }
                n4 n4Var3 = f6Var2.P0;
                if (n4Var3 != null) {
                    n4Var3.setAlpha((1.0f - f6Var2.f962d4) * (1.0f - f10) * hideInterfaceAlpha);
                }
                b4 b4Var = f6Var2.f952b2;
                if (b4Var != null) {
                    b4Var.setAlpha(1.0f - f6Var2.f962d4);
                    f6Var2.invalidate();
                }
                f6Var2.f955c1.invalidate();
                return;
        }
    }
}
