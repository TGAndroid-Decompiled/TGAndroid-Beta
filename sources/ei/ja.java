package ei;

import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.kw;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ah1;
public final class ja implements ValueAnimator.AnimatorUpdateListener {
    public final int f9281a;
    public final float f9282b;
    public final float f9283c;
    public final Object d;

    public ja(Object obj, float f7, float f10, int i10) {
        this.f9281a = i10;
        this.d = obj;
        this.f9282b = f7;
        this.f9283c = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        int i10 = this.f9281a;
        float f7 = this.f9283c;
        float f10 = this.f9282b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                vb vbVar = (vb) obj;
                vbVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vbVar.f10000r.setTranslationY(f10 * floatValue);
                vbVar.f10000r.b(f7 * floatValue);
                return;
            case 1:
                ne.e eVar = (ne.e) obj;
                if (eVar.f17392g) {
                    DecelerateInterpolator decelerateInterpolator = me.a.f16853a;
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    eVar.d((f7 * animatedFraction) + f10, animatedFraction);
                    return;
                }
                return;
            case 2:
                kw kwVar = (kw) obj;
                kwVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kwVar.L = floatValue2;
                kwVar.K = AndroidUtilities.lerp(f10, f7, floatValue2);
                kwVar.f27922b.invalidate();
                return;
            case 3:
                ah1 ah1Var = (ah1) obj;
                ah1Var.f31404y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float dp = f10 + AndroidUtilities.dp(28.0f);
                float dp2 = f7 + AndroidUtilities.dp(52.0f);
                float f11 = ah1Var.f31404y;
                ah1Var.G = dp - (dp * f11);
                ah1Var.H = dp2 - (f11 * dp2);
                ah1Var.invalidate();
                return;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                CropAreaView cropAreaView = photoViewer.C1.f28763b.f16917a;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue() * f10;
                float f12 = photoViewer.f33240a6;
                cropAreaView.f24196n0 = floatValue3;
                cropAreaView.f24197o0 = ((photoViewer.f33278e6 - f12) * photoViewer.f33338l6) + f12;
                cropAreaView.f24198p0 = 0.0f;
                cropAreaView.f24199q0 = 0.0f;
                cropAreaView.invalidate();
                photoViewer.C1.f28764c.b(AndroidUtilities.lerp(f7, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 5:
                org.telegram.ui.Wallet.n3 n3Var = (org.telegram.ui.Wallet.n3) obj;
                float floatValue4 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n3Var.A = (f10 * floatValue4) + n3Var.g();
                n3Var.B = (f7 * floatValue4) + (n3Var.f34565k.E * 0.14f);
                if (floatValue4 > 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                n3Var.D = z10;
                n3Var.f34548a.invalidate();
                return;
            case 6:
                org.telegram.ui.Wallet.s5 s5Var = (org.telegram.ui.Wallet.s5) obj;
                s5Var.getClass();
                float floatValue5 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s5Var.N = f10 * floatValue5;
                s5Var.O = f7 * floatValue5;
                return;
            default:
                tg.f fVar = (tg.f) obj;
                fVar.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tg.g gVar = fVar.f47056a;
                gVar.d = f10 * floatValue6;
                gVar.f47071i = f7 * floatValue6;
                return;
        }
    }
}
