package ci;

import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.dw;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.fi1;
public final class ya implements ValueAnimator.AnimatorUpdateListener {
    public final int f5890a;
    public final float f5891b;
    public final float f5892c;
    public final Object d;

    public ya(Object obj, float f7, float f10, int i10) {
        this.f5890a = i10;
        this.d = obj;
        this.f5891b = f7;
        this.f5892c = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f5890a;
        float f7 = this.f5892c;
        float f10 = this.f5891b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                lc lcVar = (lc) obj;
                lcVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lcVar.f5079r.setTranslationY(f10 * floatValue);
                lcVar.f5079r.b(f7 * floatValue);
                return;
            case 1:
                le.f fVar = (le.f) obj;
                if (fVar.f13971g) {
                    DecelerateInterpolator decelerateInterpolator = ke.a.f13577a;
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    fVar.d((f7 * animatedFraction) + f10, animatedFraction);
                    return;
                }
                return;
            case 2:
                dw dwVar = (dw) obj;
                dwVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dwVar.L = floatValue2;
                dwVar.K = AndroidUtilities.lerp(f10, f7, floatValue2);
                dwVar.f26443b.invalidate();
                return;
            case 3:
                fi1 fi1Var = (fi1) obj;
                fi1Var.f28885y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float dp = f10 + AndroidUtilities.dp(28.0f);
                float dp2 = f7 + AndroidUtilities.dp(52.0f);
                float f11 = fi1Var.f28885y;
                fi1Var.G = dp - (dp * f11);
                fi1Var.H = dp2 - (f11 * dp2);
                fi1Var.invalidate();
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                CropAreaView cropAreaView = photoViewer.C1.f28468b.f14088a;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue() * f10;
                float f12 = photoViewer.f30876a6;
                cropAreaView.f21991n0 = floatValue3;
                cropAreaView.f21992o0 = ((photoViewer.f30914e6 - f12) * photoViewer.f30973l6) + f12;
                cropAreaView.f21993p0 = 0.0f;
                cropAreaView.f21994q0 = 0.0f;
                cropAreaView.invalidate();
                photoViewer.C1.f28469c.b(AndroidUtilities.lerp(f7, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
        }
    }
}
