package ci;

import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.cw;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.mi1;
public final class bb implements ValueAnimator.AnimatorUpdateListener {
    public final int f4411a;
    public final float f4412b;
    public final float f4413c;
    public final Object d;

    public bb(Object obj, float f7, float f10, int i10) {
        this.f4411a = i10;
        this.d = obj;
        this.f4412b = f7;
        this.f4413c = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f4411a;
        float f7 = this.f4413c;
        float f10 = this.f4412b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                oc ocVar = (oc) obj;
                ocVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ocVar.f5257r.setTranslationY(f10 * floatValue);
                ocVar.f5257r.b(f7 * floatValue);
                return;
            case 1:
                le.e eVar = (le.e) obj;
                if (eVar.f13993g) {
                    DecelerateInterpolator decelerateInterpolator = ke.a.f13590a;
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    eVar.d((f7 * animatedFraction) + f10, animatedFraction);
                    return;
                }
                return;
            case 2:
                cw cwVar = (cw) obj;
                cwVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cwVar.L = floatValue2;
                cwVar.K = AndroidUtilities.lerp(f10, f7, floatValue2);
                cwVar.f26502b.invalidate();
                return;
            case 3:
                mi1 mi1Var = (mi1) obj;
                mi1Var.f28891y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float dp = f10 + AndroidUtilities.dp(28.0f);
                float dp2 = f7 + AndroidUtilities.dp(52.0f);
                float f11 = mi1Var.f28891y;
                mi1Var.G = dp - (dp * f11);
                mi1Var.H = dp2 - (f11 * dp2);
                mi1Var.invalidate();
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                CropAreaView cropAreaView = photoViewer.C1.f28369b.f14110a;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue() * f10;
                float f12 = photoViewer.f30918a6;
                cropAreaView.f22030n0 = floatValue3;
                cropAreaView.f22031o0 = ((photoViewer.f30956e6 - f12) * photoViewer.f31015l6) + f12;
                cropAreaView.f22032p0 = 0.0f;
                cropAreaView.f22033q0 = 0.0f;
                cropAreaView.invalidate();
                photoViewer.C1.f28370c.b(AndroidUtilities.lerp(f7, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
        }
    }
}
