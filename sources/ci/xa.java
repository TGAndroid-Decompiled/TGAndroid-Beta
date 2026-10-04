package ci;

import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.gw;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.fi1;
public final class xa implements ValueAnimator.AnimatorUpdateListener {
    public final int f6313a;
    public final float f6314b;
    public final float f6315c;
    public final Object d;

    public xa(Object obj, float f7, float f10, int i10) {
        this.f6313a = i10;
        this.d = obj;
        this.f6314b = f7;
        this.f6315c = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f6313a;
        float f7 = this.f6315c;
        float f10 = this.f6314b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                kc kcVar = (kc) obj;
                kcVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kcVar.f5427r.setTranslationY(f10 * floatValue);
                kcVar.f5427r.b(f7 * floatValue);
                return;
            case 1:
                le.e eVar = (le.e) obj;
                if (eVar.f15444g) {
                    DecelerateInterpolator decelerateInterpolator = ke.a.f14758a;
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
                gwVar.f26089b.invalidate();
                return;
            case 3:
                fi1 fi1Var = (fi1) obj;
                fi1Var.f31812y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float dp = f10 + AndroidUtilities.dp(28.0f);
                float dp2 = f7 + AndroidUtilities.dp(52.0f);
                float f11 = fi1Var.f31812y;
                fi1Var.G = dp - (dp * f11);
                fi1Var.H = dp2 - (f11 * dp2);
                fi1Var.invalidate();
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                CropAreaView cropAreaView = photoViewer.C1.f26850b.f15574a;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue() * f10;
                float f12 = photoViewer.f33861a6;
                cropAreaView.f24145n0 = floatValue3;
                cropAreaView.f24146o0 = ((photoViewer.f33900e6 - f12) * photoViewer.f33959l6) + f12;
                cropAreaView.f24147p0 = 0.0f;
                cropAreaView.f24148q0 = 0.0f;
                cropAreaView.invalidate();
                photoViewer.C1.f26851c.b(AndroidUtilities.lerp(f7, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
        }
    }
}
