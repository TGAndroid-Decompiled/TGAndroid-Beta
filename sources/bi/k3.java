package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class k3 extends AnimatorListenerAdapter {
    public final int f3237a;
    public final boolean f3238b;
    public final q5 f3239c;

    public k3(q5 q5Var, boolean z10, int i10) {
        this.f3237a = i10;
        this.f3239c = q5Var;
        this.f3238b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        float hideInterfaceAlpha;
        switch (this.f3237a) {
            case 0:
                if (!this.f3238b) {
                    q5 q5Var = this.f3239c;
                    q5Var.f3563r3.setVisibility(8);
                    q5Var.f3563r3.n();
                    return;
                }
                return;
            default:
                q5 q5Var2 = this.f3239c;
                xa xaVar = q5Var2.C0;
                i5 i5Var = q5Var2.f3584y0;
                ImageView imageView = q5Var2.f3580x0;
                ImageView imageView2 = q5Var2.f3576w0;
                m5 m5Var = q5Var2.f3552o1;
                float f10 = 0.0f;
                if (this.f3238b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                q5Var2.f3522d4 = f7;
                m5Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * q5Var2.f3522d4);
                m5Var.setAlpha(1.0f - q5Var2.f3522d4);
                imageView2.setTranslationY((-AndroidUtilities.dp(8.0f)) * q5Var2.f3522d4);
                imageView2.setAlpha(1.0f - q5Var2.f3522d4);
                imageView.setTranslationY((-AndroidUtilities.dp(8.0f)) * q5Var2.f3522d4);
                imageView.setAlpha(1.0f - q5Var2.f3522d4);
                i5Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * q5Var2.f3522d4);
                i5Var.setAlpha((1.0f - q5Var2.f3522d4) * q5Var2.f3525e3);
                c4 c4Var = q5Var2.W1;
                if (c4Var != null) {
                    c4Var.setTranslationY(AndroidUtilities.dp(8.0f) * q5Var2.f3522d4);
                    q5Var2.W1.setAlpha(1.0f - q5Var2.f3522d4);
                }
                if (xaVar != null) {
                    xaVar.setTranslationY((-AndroidUtilities.dp(8.0f)) * q5Var2.f3522d4);
                    xaVar.setAlpha(1.0f - q5Var2.f3522d4);
                }
                q5Var2.K0.setAlpha(1.0f - q5Var2.f3522d4);
                j5 j5Var = q5Var2.Q1;
                if (j5Var != null) {
                    f10 = ((jb) j5Var).d.V;
                }
                hideInterfaceAlpha = q5Var2.getHideInterfaceAlpha();
                c4 c4Var2 = q5Var2.D0;
                if (c4Var2 != null) {
                    c4Var2.setAlpha((1.0f - q5Var2.f3522d4) * (1.0f - f10) * hideInterfaceAlpha);
                }
                ImageView imageView3 = q5Var2.N0;
                if (imageView3 != null) {
                    imageView3.setAlpha((1.0f - q5Var2.f3522d4) * (1.0f - f10) * hideInterfaceAlpha);
                }
                c4 c4Var3 = q5Var2.P0;
                if (c4Var3 != null) {
                    c4Var3.setAlpha((1.0f - q5Var2.f3522d4) * (1.0f - f10) * hideInterfaceAlpha);
                }
                q3 q3Var = q5Var2.f3512b2;
                if (q3Var != null) {
                    q3Var.setAlpha(1.0f - q5Var2.f3522d4);
                    q5Var2.invalidate();
                }
                q5Var2.f3515c1.invalidate();
                return;
        }
    }
}
