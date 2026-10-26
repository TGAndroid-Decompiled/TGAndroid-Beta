package fi;

import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.kw;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ih1;
public final class fa implements ValueAnimator.AnimatorUpdateListener {
    public final int f10881a;
    public final float f10882b;
    public final float f10883c;
    public final Object d;

    public fa(Object obj, float f7, float f10, int i10) {
        this.f10881a = i10;
        this.d = obj;
        this.f10882b = f7;
        this.f10883c = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        int i10 = this.f10881a;
        float f7 = this.f10883c;
        float f10 = this.f10882b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                sb sbVar = (sb) obj;
                sbVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sbVar.f11658r.setTranslationY(f10 * floatValue);
                sbVar.f11658r.b(f7 * floatValue);
                return;
            case 1:
                oe.e eVar = (oe.e) obj;
                if (eVar.h) {
                    DecelerateInterpolator decelerateInterpolator = ne.a.f18779a;
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
                kwVar.f33114b.invalidate();
                return;
            case 3:
                ih1 ih1Var = (ih1) obj;
                ih1Var.f33743y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float dp = f10 + AndroidUtilities.dp(28.0f);
                float dp2 = f7 + AndroidUtilities.dp(52.0f);
                float f11 = ih1Var.f33743y;
                ih1Var.G = dp - (dp * f11);
                ih1Var.H = dp2 - (f11 * dp2);
                ih1Var.invalidate();
                return;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                CropAreaView cropAreaView = photoViewer.C1.f31285b.f18843a;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue() * f10;
                float f12 = photoViewer.f35614a6;
                cropAreaView.f26137n0 = floatValue3;
                cropAreaView.f26138o0 = ((photoViewer.f35652e6 - f12) * photoViewer.f35712l6) + f12;
                cropAreaView.f26139p0 = 0.0f;
                cropAreaView.f26140q0 = 0.0f;
                cropAreaView.invalidate();
                photoViewer.C1.f31286c.b(AndroidUtilities.lerp(f7, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 5:
                org.telegram.ui.Wallet.m3 m3Var = (org.telegram.ui.Wallet.m3) obj;
                float floatValue4 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m3Var.A = (f10 * floatValue4) + m3Var.g();
                m3Var.B = (f7 * floatValue4) + (m3Var.f36904k.E * 0.14f);
                if (floatValue4 > 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                m3Var.D = z10;
                m3Var.f36887a.invalidate();
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
                ug.g gVar = fVar.f49769a;
                gVar.d = f10 * floatValue6;
                gVar.f49784i = f7 * floatValue6;
                return;
        }
    }
}
