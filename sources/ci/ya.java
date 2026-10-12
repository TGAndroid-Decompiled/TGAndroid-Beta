package ci;

import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.vw;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.qi1;
public final class ya implements ValueAnimator.AnimatorUpdateListener {
    public final int f6369a;
    public final float f6370b;
    public final float f6371c;
    public final Object d;

    public ya(Object obj, float f7, float f10, int i10) {
        this.f6369a = i10;
        this.d = obj;
        this.f6370b = f7;
        this.f6371c = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        int i10 = this.f6369a;
        float f7 = this.f6371c;
        float f10 = this.f6370b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                lc lcVar = (lc) obj;
                lcVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lcVar.f5510r.setTranslationY(f10 * floatValue);
                lcVar.f5510r.b(f7 * floatValue);
                return;
            case 1:
                me.e eVar = (me.e) obj;
                if (eVar.f16098g) {
                    DecelerateInterpolator decelerateInterpolator = le.a.f15248a;
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    eVar.d((f7 * animatedFraction) + f10, animatedFraction);
                    return;
                }
                return;
            case 2:
                vw vwVar = (vw) obj;
                vwVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vwVar.L = floatValue2;
                vwVar.K = AndroidUtilities.lerp(f10, f7, floatValue2);
                vwVar.f33147b.invalidate();
                return;
            case 3:
                qi1 qi1Var = (qi1) obj;
                qi1Var.f31654y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float dp = f10 + AndroidUtilities.dp(28.0f);
                float dp2 = f7 + AndroidUtilities.dp(52.0f);
                float f11 = qi1Var.f31654y;
                qi1Var.G = dp - (dp * f11);
                qi1Var.H = dp2 - (f11 * dp2);
                qi1Var.invalidate();
                return;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                CropAreaView cropAreaView = photoViewer.C1.f33350b.f15319a;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue() * f10;
                float f12 = photoViewer.f33710a6;
                cropAreaView.f23927n0 = floatValue3;
                cropAreaView.f23928o0 = ((photoViewer.f33749e6 - f12) * photoViewer.f33808l6) + f12;
                cropAreaView.f23929p0 = 0.0f;
                cropAreaView.f23930q0 = 0.0f;
                cropAreaView.invalidate();
                photoViewer.C1.f33351c.b(AndroidUtilities.lerp(f7, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 5:
                org.telegram.ui.Wallet.f3 f3Var = (org.telegram.ui.Wallet.f3) obj;
                float floatValue4 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f3Var.A = (f10 * floatValue4) + f3Var.g();
                f3Var.B = (f7 * floatValue4) + (f3Var.f34725k.E * 0.14f);
                if (floatValue4 > 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                f3Var.D = z10;
                f3Var.f34707a.invalidate();
                return;
            case 6:
                org.telegram.ui.Wallet.f5 f5Var = (org.telegram.ui.Wallet.f5) obj;
                f5Var.getClass();
                float floatValue5 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f5Var.J = f10 * floatValue5;
                f5Var.K = f7 * floatValue5;
                return;
            case 7:
                org.telegram.ui.Wallet.r5 r5Var = (org.telegram.ui.Wallet.r5) obj;
                r5Var.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Wallet.n5 n5Var = r5Var.f35317f0;
                float f13 = 1.0f - floatValue6;
                n5Var.d = f10 * f13;
                n5Var.f48285i = f7 * f13;
                return;
            default:
                sg.f fVar = (sg.f) obj;
                fVar.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sg.g gVar = fVar.f48268a;
                gVar.d = f10 * floatValue7;
                gVar.f48285i = f7 * floatValue7;
                return;
        }
    }
}
