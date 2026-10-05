package ci;

import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.gw;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.di1;
public final class xa implements ValueAnimator.AnimatorUpdateListener {
    public final int f6314a;
    public final float f6315b;
    public final float f6316c;
    public final Object d;

    public xa(Object obj, float f7, float f10, int i10) {
        this.f6314a = i10;
        this.d = obj;
        this.f6315b = f7;
        this.f6316c = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f6314a;
        float f7 = this.f6316c;
        float f10 = this.f6315b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                kc kcVar = (kc) obj;
                kcVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kcVar.f5428r.setTranslationY(f10 * floatValue);
                kcVar.f5428r.b(f7 * floatValue);
                return;
            case 1:
                le.e eVar = (le.e) obj;
                if (eVar.f15446g) {
                    DecelerateInterpolator decelerateInterpolator = ke.a.f14759a;
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    eVar.d((f7 * animatedFraction) + f10, animatedFraction);
                    return;
                }
                return;
            case 2:
                gw gwVar = (gw) obj;
                gwVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gwVar.L = floatValue2;
                gwVar.K = AndroidUtilities.lerp(f10, f7, floatValue2);
                gwVar.f26164b.invalidate();
                return;
            case 3:
                di1 di1Var = (di1) obj;
                di1Var.f31886y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float dp = f10 + AndroidUtilities.dp(28.0f);
                float dp2 = f7 + AndroidUtilities.dp(52.0f);
                float f11 = di1Var.f31886y;
                di1Var.G = dp - (dp * f11);
                di1Var.H = dp2 - (f11 * dp2);
                di1Var.invalidate();
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                CropAreaView cropAreaView = photoViewer.C1.f26905b.f15576a;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue() * f10;
                float f12 = photoViewer.f33881a6;
                cropAreaView.f24153n0 = floatValue3;
                cropAreaView.f24154o0 = ((photoViewer.f33920e6 - f12) * photoViewer.f33979l6) + f12;
                cropAreaView.f24155p0 = 0.0f;
                cropAreaView.f24156q0 = 0.0f;
                cropAreaView.invalidate();
                photoViewer.C1.f26906c.b(AndroidUtilities.lerp(f7, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
        }
    }
}
