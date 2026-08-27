package lh;

import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.mv;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.eh1;

public final class ha implements ValueAnimator.AnimatorUpdateListener {

    public final int f16079a;

    public final float f16080b;

    public final float f16081c;
    public final Object d;

    public ha(Object obj, float f10, float f11, int i10) {
        this.f16079a = i10;
        this.d = obj;
        this.f16080b = f10;
        this.f16081c = f11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f16079a;
        float f10 = this.f16081c;
        float f11 = this.f16080b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                sb sbVar = (sb) obj;
                sbVar.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sbVar.f16796r.setTranslationY(f11 * fFloatValue);
                sbVar.f16796r.b(f10 * fFloatValue);
                break;
            case 1:
                mv mvVar = (mv) obj;
                mvVar.getClass();
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mvVar.H = fFloatValue2;
                mvVar.G = AndroidUtilities.lerp(f11, f10, fFloatValue2);
                mvVar.f26767b.invalidate();
                break;
            case 2:
                eh1 eh1Var = (eh1) obj;
                eh1Var.f33485y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float fDp = f11 + AndroidUtilities.dp(28.0f);
                float fDp2 = f10 + AndroidUtilities.dp(52.0f);
                float f12 = eh1Var.f33485y;
                eh1Var.C = fDp - (fDp * f12);
                eh1Var.D = fDp2 - (f12 * fDp2);
                eh1Var.invalidate();
                break;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                CropAreaView cropAreaView = photoViewer.f35802y1.f28602b.f48626a;
                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue() * f11;
                float f13 = photoViewer.W5;
                float f14 = ((photoViewer.f35587a6 - f13) * photoViewer.f35654h6) + f13;
                cropAreaView.f26357j0 = fFloatValue3;
                cropAreaView.f26358k0 = f14;
                cropAreaView.f26359l0 = 0.0f;
                cropAreaView.m0 = 0.0f;
                cropAreaView.invalidate();
                photoViewer.f35802y1.f28603c.b(AndroidUtilities.lerp(f10, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                break;
            default:
                ud.c cVar = (ud.c) obj;
                if (cVar.f48504g) {
                    DecelerateInterpolator decelerateInterpolator = td.a.f48160a;
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    cVar.d((f10 * animatedFraction) + f11, animatedFraction);
                }
                break;
        }
    }
}
