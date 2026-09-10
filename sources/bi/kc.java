package bi;

import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.gw;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.si1;
public final class kc implements ValueAnimator.AnimatorUpdateListener {
    public final int f3016a;
    public final float f3017b;
    public final float f3018c;
    public final Object d;

    public kc(Object obj, float f7, float f10, int i10) {
        this.f3016a = i10;
        this.d = obj;
        this.f3017b = f7;
        this.f3018c = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f3016a;
        float f7 = this.f3018c;
        float f10 = this.f3017b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                ce ceVar = (ce) obj;
                ceVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ceVar.f2483r.setTranslationY(f10 * floatValue);
                ceVar.f2483r.b(f7 * floatValue);
                return;
            case 1:
                le.e eVar = (le.e) obj;
                if (eVar.f12878g) {
                    DecelerateInterpolator decelerateInterpolator = ke.a.f12431a;
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
                gwVar.f28802b.invalidate();
                return;
            case 3:
                si1 si1Var = (si1) obj;
                si1Var.f28075y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float dp = f10 + AndroidUtilities.dp(28.0f);
                float dp2 = f7 + AndroidUtilities.dp(52.0f);
                float f11 = si1Var.f28075y;
                si1Var.G = dp - (dp * f11);
                si1Var.H = dp2 - (f11 * dp2);
                si1Var.invalidate();
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                CropAreaView cropAreaView = photoViewer.C1.f22405b.f12495a;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue() * f10;
                float f12 = photoViewer.f30017a6;
                cropAreaView.f21105n0 = floatValue3;
                cropAreaView.f21106o0 = ((photoViewer.f30055e6 - f12) * photoViewer.f30114l6) + f12;
                cropAreaView.f21107p0 = 0.0f;
                cropAreaView.f21108q0 = 0.0f;
                cropAreaView.invalidate();
                photoViewer.C1.f22406c.b(AndroidUtilities.lerp(f7, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
        }
    }
}
