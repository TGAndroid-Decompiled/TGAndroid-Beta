package nh;

import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.tv;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.hh1;
public final class v9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f18763a;
    public final float f18764b;
    public final float f18765c;
    public final Object d;

    public v9(Object obj, float f9, float f10, int i10) {
        this.f18763a = i10;
        this.d = obj;
        this.f18764b = f9;
        this.f18765c = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f18763a;
        float f9 = this.f18765c;
        float f10 = this.f18764b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                gb gbVar = (gb) obj;
                gbVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gbVar.f17790r.setTranslationY(f10 * floatValue);
                gbVar.f17790r.b(f9 * floatValue);
                return;
            case 1:
                tv tvVar = (tv) obj;
                tvVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tvVar.H = floatValue2;
                tvVar.G = AndroidUtilities.lerp(f10, f9, floatValue2);
                tvVar.f30108b.invalidate();
                return;
            case 2:
                hh1 hh1Var = (hh1) obj;
                hh1Var.f33630y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float dp = f10 + AndroidUtilities.dp(28.0f);
                float dp2 = f9 + AndroidUtilities.dp(52.0f);
                float f11 = hh1Var.f33630y;
                hh1Var.C = dp - (dp * f11);
                hh1Var.D = dp2 - (f11 * dp2);
                hh1Var.invalidate();
                return;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                CropAreaView cropAreaView = photoViewer.f35866y1.f31657b.f49953a;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue() * f10;
                float f12 = photoViewer.W5;
                cropAreaView.f26372j0 = floatValue3;
                cropAreaView.f26373k0 = ((photoViewer.f35652a6 - f12) * photoViewer.f35717h6) + f12;
                cropAreaView.f26374l0 = 0.0f;
                cropAreaView.m0 = 0.0f;
                cropAreaView.invalidate();
                photoViewer.f35866y1.f31658c.b(AndroidUtilities.lerp(f9, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            default:
                vd.c cVar = (vd.c) obj;
                if (cVar.f49512g) {
                    DecelerateInterpolator decelerateInterpolator = ud.a.f49172a;
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    cVar.d((f9 * animatedFraction) + f10, animatedFraction);
                    return;
                }
                return;
        }
    }
}
