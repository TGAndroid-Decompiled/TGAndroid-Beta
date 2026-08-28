package ih;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class k2 extends AnimatorListenerAdapter {
    public final int f11667a;
    public final boolean f11668b;
    public final i4 f11669c;

    public k2(i4 i4Var, boolean z10, int i9) {
        this.f11667a = i9;
        this.f11669c = i4Var;
        this.f11668b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        float hideInterfaceAlpha;
        switch (this.f11667a) {
            case 0:
                if (!this.f11668b) {
                    i4 i4Var = this.f11669c;
                    i4Var.f11570n3.setVisibility(8);
                    i4Var.f11570n3.n();
                    return;
                }
                return;
            default:
                i4 i4Var2 = this.f11669c;
                r8 r8Var = i4Var2.f11607y0;
                dh.g gVar = i4Var2.f11591u0;
                ImageView imageView = i4Var2.f11587t0;
                ImageView imageView2 = i4Var2.f11583s0;
                e4 e4Var = i4Var2.f11560k1;
                float f11 = 0.0f;
                if (this.f11668b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                i4Var2.Z3 = f10;
                e4Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * i4Var2.Z3);
                e4Var.setAlpha(1.0f - i4Var2.Z3);
                imageView2.setTranslationY((-AndroidUtilities.dp(8.0f)) * i4Var2.Z3);
                imageView2.setAlpha(1.0f - i4Var2.Z3);
                imageView.setTranslationY((-AndroidUtilities.dp(8.0f)) * i4Var2.Z3);
                imageView.setAlpha(1.0f - i4Var2.Z3);
                gVar.setTranslationY((-AndroidUtilities.dp(8.0f)) * i4Var2.Z3);
                gVar.setAlpha((1.0f - i4Var2.Z3) * i4Var2.a3);
                a3 a3Var = i4Var2.S1;
                if (a3Var != null) {
                    a3Var.setTranslationY(AndroidUtilities.dp(8.0f) * i4Var2.Z3);
                    i4Var2.S1.setAlpha(1.0f - i4Var2.Z3);
                }
                if (r8Var != null) {
                    r8Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * i4Var2.Z3);
                    r8Var.setAlpha(1.0f - i4Var2.Z3);
                }
                i4Var2.G0.setAlpha(1.0f - i4Var2.Z3);
                c4 c4Var = i4Var2.M1;
                if (c4Var != null) {
                    f11 = ((d9) c4Var).d.R;
                }
                hideInterfaceAlpha = i4Var2.getHideInterfaceAlpha();
                a3 a3Var2 = i4Var2.f11611z0;
                if (a3Var2 != null) {
                    a3Var2.setAlpha((1.0f - i4Var2.Z3) * (1.0f - f11) * hideInterfaceAlpha);
                }
                ImageView imageView3 = i4Var2.J0;
                if (imageView3 != null) {
                    imageView3.setAlpha((1.0f - i4Var2.Z3) * (1.0f - f11) * hideInterfaceAlpha);
                }
                a3 a3Var3 = i4Var2.L0;
                if (a3Var3 != null) {
                    a3Var3.setAlpha((1.0f - i4Var2.Z3) * (1.0f - f11) * hideInterfaceAlpha);
                }
                p2 p2Var = i4Var2.X1;
                if (p2Var != null) {
                    p2Var.setAlpha(1.0f - i4Var2.Z3);
                    i4Var2.invalidate();
                }
                i4Var2.Y0.invalidate();
                return;
        }
    }
}
