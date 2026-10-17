package ei;

import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.kw;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ch1;
public final class ja implements ValueAnimator.AnimatorUpdateListener {
    public final int f9283a;
    public final float f9284b;
    public final float f9285c;
    public final Object d;

    public ja(Object obj, float f7, float f10, int i10) {
        this.f9283a = i10;
        this.d = obj;
        this.f9284b = f7;
        this.f9285c = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        int i10 = this.f9283a;
        float f7 = this.f9285c;
        float f10 = this.f9284b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                vb vbVar = (vb) obj;
                vbVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vbVar.f10001r.setTranslationY(f10 * floatValue);
                vbVar.f10001r.b(f7 * floatValue);
                return;
            case 1:
                ne.e eVar = (ne.e) obj;
                if (eVar.f17388g) {
                    DecelerateInterpolator decelerateInterpolator = me.a.f16847a;
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
                kwVar.f27944b.invalidate();
                return;
            case 3:
                ch1 ch1Var = (ch1) obj;
                ch1Var.f31395y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float dp = f10 + AndroidUtilities.dp(28.0f);
                float dp2 = f7 + AndroidUtilities.dp(52.0f);
                float f11 = ch1Var.f31395y;
                ch1Var.G = dp - (dp * f11);
                ch1Var.H = dp2 - (f11 * dp2);
                ch1Var.invalidate();
                return;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                CropAreaView cropAreaView = photoViewer.C1.f28747b.f16911a;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue() * f10;
                float f12 = photoViewer.f33234a6;
                cropAreaView.f24195n0 = floatValue3;
                cropAreaView.f24196o0 = ((photoViewer.f33272e6 - f12) * photoViewer.f33332l6) + f12;
                cropAreaView.f24197p0 = 0.0f;
                cropAreaView.f24198q0 = 0.0f;
                cropAreaView.invalidate();
                photoViewer.C1.f28748c.b(AndroidUtilities.lerp(f7, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 5:
                org.telegram.ui.Wallet.k3 k3Var = (org.telegram.ui.Wallet.k3) obj;
                float floatValue4 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k3Var.A = (f10 * floatValue4) + k3Var.i();
                k3Var.B = (f7 * floatValue4) + (k3Var.f34402k.E * 0.14f);
                if (floatValue4 > 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                k3Var.D = z10;
                k3Var.f34385a.invalidate();
                return;
            case 6:
                org.telegram.ui.Wallet.o5 o5Var = (org.telegram.ui.Wallet.o5) obj;
                o5Var.getClass();
                float floatValue5 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o5Var.J = f10 * floatValue5;
                o5Var.K = f7 * floatValue5;
                return;
            case 7:
                org.telegram.ui.Wallet.b6 b6Var = (org.telegram.ui.Wallet.b6) obj;
                b6Var.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Wallet.y5 y5Var = b6Var.f34039f0;
                float f13 = 1.0f - floatValue6;
                y5Var.d = f10 * f13;
                y5Var.f47095i = f7 * f13;
                return;
            default:
                tg.f fVar = (tg.f) obj;
                fVar.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tg.g gVar = fVar.f47080a;
                gVar.d = f10 * floatValue7;
                gVar.f47095i = f7 * floatValue7;
                return;
        }
    }
}
