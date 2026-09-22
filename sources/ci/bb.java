package ci;

import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.cw;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ni1;
public final class bb implements ValueAnimator.AnimatorUpdateListener {
    public final int f4408a;
    public final float f4409b;
    public final float f4410c;
    public final Object d;

    public bb(Object obj, float f7, float f10, int i10) {
        this.f4408a = i10;
        this.d = obj;
        this.f4409b = f7;
        this.f4410c = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f4408a;
        float f7 = this.f4410c;
        float f10 = this.f4409b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                oc ocVar = (oc) obj;
                ocVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ocVar.f5254r.setTranslationY(f10 * floatValue);
                ocVar.f5254r.b(f7 * floatValue);
                return;
            case 1:
                le.e eVar = (le.e) obj;
                if (eVar.f13981g) {
                    DecelerateInterpolator decelerateInterpolator = ke.a.f13589a;
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
                cwVar.f26179b.invalidate();
                return;
            case 3:
                ni1 ni1Var = (ni1) obj;
                ni1Var.f28911y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float dp = f10 + AndroidUtilities.dp(28.0f);
                float dp2 = f7 + AndroidUtilities.dp(52.0f);
                float f11 = ni1Var.f28911y;
                ni1Var.G = dp - (dp * f11);
                ni1Var.H = dp2 - (f11 * dp2);
                ni1Var.invalidate();
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                CropAreaView cropAreaView = photoViewer.C1.f28379b.f14098a;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue() * f10;
                float f12 = photoViewer.f30902a6;
                cropAreaView.f22017n0 = floatValue3;
                cropAreaView.f22018o0 = ((photoViewer.f30940e6 - f12) * photoViewer.f30999l6) + f12;
                cropAreaView.f22019p0 = 0.0f;
                cropAreaView.f22020q0 = 0.0f;
                cropAreaView.invalidate();
                photoViewer.C1.f28380c.b(AndroidUtilities.lerp(f7, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
        }
    }
}
