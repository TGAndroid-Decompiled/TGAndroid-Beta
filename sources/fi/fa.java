package fi;

import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.kw;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.kh1;
public final class fa implements ValueAnimator.AnimatorUpdateListener {
    public final int f10880a;
    public final float f10881b;
    public final float f10882c;
    public final Object d;

    public fa(Object obj, float f7, float f10, int i10) {
        this.f10880a = i10;
        this.d = obj;
        this.f10881b = f7;
        this.f10882c = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        int i10 = this.f10880a;
        float f7 = this.f10882c;
        float f10 = this.f10881b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                sb sbVar = (sb) obj;
                sbVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sbVar.f11657r.setTranslationY(f10 * floatValue);
                sbVar.f11657r.b(f7 * floatValue);
                return;
            case 1:
                oe.e eVar = (oe.e) obj;
                if (eVar.h) {
                    DecelerateInterpolator decelerateInterpolator = ne.a.f18778a;
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
                kwVar.f33435b.invalidate();
                return;
            case 3:
                kh1 kh1Var = (kh1) obj;
                kh1Var.f33848y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float dp = f10 + AndroidUtilities.dp(28.0f);
                float dp2 = f7 + AndroidUtilities.dp(52.0f);
                float f11 = kh1Var.f33848y;
                kh1Var.G = dp - (dp * f11);
                kh1Var.H = dp2 - (f11 * dp2);
                kh1Var.invalidate();
                return;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                CropAreaView cropAreaView = photoViewer.C1.f31597b.f18842a;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue() * f10;
                float f12 = photoViewer.f35638a6;
                cropAreaView.f26139n0 = floatValue3;
                cropAreaView.f26140o0 = ((photoViewer.f35676e6 - f12) * photoViewer.f35736l6) + f12;
                cropAreaView.f26141p0 = 0.0f;
                cropAreaView.f26142q0 = 0.0f;
                cropAreaView.invalidate();
                photoViewer.C1.f31598c.b(AndroidUtilities.lerp(f7, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 5:
                org.telegram.ui.Wallet.m3 m3Var = (org.telegram.ui.Wallet.m3) obj;
                float floatValue4 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m3Var.A = (f10 * floatValue4) + m3Var.g();
                m3Var.B = (f7 * floatValue4) + (m3Var.f36909k.E * 0.14f);
                if (floatValue4 > 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                m3Var.D = z10;
                m3Var.f36892a.invalidate();
                return;
            case 6:
                org.telegram.ui.Wallet.r5 r5Var = (org.telegram.ui.Wallet.r5) obj;
                r5Var.getClass();
                float floatValue5 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r5Var.N = f10 * floatValue5;
                r5Var.O = f7 * floatValue5;
                return;
            default:
                ug.f fVar = (ug.f) obj;
                fVar.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ug.g gVar = fVar.f49804a;
                gVar.d = f10 * floatValue6;
                gVar.f49819i = f7 * floatValue6;
                return;
        }
    }
}
