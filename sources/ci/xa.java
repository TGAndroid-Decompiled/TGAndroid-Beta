package ci;

import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.ew;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.di1;
public final class xa implements ValueAnimator.AnimatorUpdateListener {
    public final int f5860a;
    public final float f5861b;
    public final float f5862c;
    public final Object d;

    public xa(Object obj, float f7, float f10, int i10) {
        this.f5860a = i10;
        this.d = obj;
        this.f5861b = f7;
        this.f5862c = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f5860a;
        float f7 = this.f5862c;
        float f10 = this.f5861b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                kc kcVar = (kc) obj;
                kcVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kcVar.f5035r.setTranslationY(f10 * floatValue);
                kcVar.f5035r.b(f7 * floatValue);
                return;
            case 1:
                le.f fVar = (le.f) obj;
                if (fVar.f14211g) {
                    DecelerateInterpolator decelerateInterpolator = ke.a.f13577a;
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    fVar.d((f7 * animatedFraction) + f10, animatedFraction);
                    return;
                }
                return;
            case 2:
                ew ewVar = (ew) obj;
                ewVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ewVar.L = floatValue2;
                ewVar.K = AndroidUtilities.lerp(f10, f7, floatValue2);
                ewVar.f22722b.invalidate();
                return;
            case 3:
                di1 di1Var = (di1) obj;
                di1Var.f29253y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float dp = f10 + AndroidUtilities.dp(28.0f);
                float dp2 = f7 + AndroidUtilities.dp(52.0f);
                float f11 = di1Var.f29253y;
                di1Var.G = dp - (dp * f11);
                di1Var.H = dp2 - (f11 * dp2);
                di1Var.invalidate();
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                CropAreaView cropAreaView = photoViewer.C1.f24054b.f14325a;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue() * f10;
                float f12 = photoViewer.f31193a6;
                cropAreaView.f22245n0 = floatValue3;
                cropAreaView.f22246o0 = ((photoViewer.f31231e6 - f12) * photoViewer.f31290l6) + f12;
                cropAreaView.f22247p0 = 0.0f;
                cropAreaView.f22248q0 = 0.0f;
                cropAreaView.invalidate();
                photoViewer.C1.f24055c.b(AndroidUtilities.lerp(f7, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
        }
    }
}
