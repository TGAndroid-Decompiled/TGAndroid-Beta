package ci;

import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.fw;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.fi1;
public final class ya implements ValueAnimator.AnimatorUpdateListener {
    public final int f5902a;
    public final float f5903b;
    public final float f5904c;
    public final Object d;

    public ya(Object obj, float f7, float f10, int i10) {
        this.f5902a = i10;
        this.d = obj;
        this.f5903b = f7;
        this.f5904c = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f5902a;
        float f7 = this.f5904c;
        float f10 = this.f5903b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                lc lcVar = (lc) obj;
                lcVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lcVar.f5086r.setTranslationY(f10 * floatValue);
                lcVar.f5086r.b(f7 * floatValue);
                return;
            case 1:
                le.f fVar = (le.f) obj;
                if (fVar.f14225g) {
                    DecelerateInterpolator decelerateInterpolator = ke.a.f13590a;
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    fVar.d((f7 * animatedFraction) + f10, animatedFraction);
                    return;
                }
                return;
            case 2:
                fw fwVar = (fw) obj;
                fwVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fwVar.L = floatValue2;
                fwVar.K = AndroidUtilities.lerp(f10, f7, floatValue2);
                fwVar.f22984b.invalidate();
                return;
            case 3:
                fi1 fi1Var = (fi1) obj;
                fi1Var.f29228y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float dp = f10 + AndroidUtilities.dp(28.0f);
                float dp2 = f7 + AndroidUtilities.dp(52.0f);
                float f11 = fi1Var.f29228y;
                fi1Var.G = dp - (dp * f11);
                fi1Var.H = dp2 - (f11 * dp2);
                fi1Var.invalidate();
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                CropAreaView cropAreaView = photoViewer.C1.f24856b.f14339a;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue() * f10;
                float f12 = photoViewer.f31265a6;
                cropAreaView.f22264n0 = floatValue3;
                cropAreaView.f22265o0 = ((photoViewer.f31303e6 - f12) * photoViewer.f31362l6) + f12;
                cropAreaView.f22266p0 = 0.0f;
                cropAreaView.f22267q0 = 0.0f;
                cropAreaView.invalidate();
                photoViewer.C1.f24857c.b(AndroidUtilities.lerp(f7, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
        }
    }
}
