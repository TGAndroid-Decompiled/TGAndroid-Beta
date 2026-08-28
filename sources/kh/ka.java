package kh;

import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.nv;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.fh1;
public final class ka implements ValueAnimator.AnimatorUpdateListener {
    public final int f15552a;
    public final float f15553b;
    public final float f15554c;
    public final Object d;

    public ka(Object obj, float f10, float f11, int i9) {
        this.f15552a = i9;
        this.d = obj;
        this.f15553b = f10;
        this.f15554c = f11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i9 = this.f15552a;
        float f10 = this.f15554c;
        float f11 = this.f15553b;
        Object obj = this.d;
        switch (i9) {
            case 0:
                wb wbVar = (wb) obj;
                wbVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wbVar.f16300r.setTranslationY(f11 * floatValue);
                wbVar.f16300r.b(f10 * floatValue);
                return;
            case 1:
                nv nvVar = (nv) obj;
                nvVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nvVar.H = floatValue2;
                nvVar.G = AndroidUtilities.lerp(f11, f10, floatValue2);
                nvVar.f34720b.invalidate();
                return;
            case 2:
                fh1 fh1Var = (fh1) obj;
                fh1Var.f33435y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float dp = f11 + AndroidUtilities.dp(28.0f);
                float dp2 = f10 + AndroidUtilities.dp(52.0f);
                float f12 = fh1Var.f33435y;
                fh1Var.C = dp - (dp * f12);
                fh1Var.D = dp2 - (f12 * dp2);
                fh1Var.invalidate();
                return;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                CropAreaView cropAreaView = photoViewer.f35799y1.f27183b.f47904a;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue() * f11;
                float f13 = photoViewer.W5;
                cropAreaView.f26361j0 = floatValue3;
                cropAreaView.f26362k0 = ((photoViewer.f35584a6 - f13) * photoViewer.f35651h6) + f13;
                cropAreaView.f26363l0 = 0.0f;
                cropAreaView.m0 = 0.0f;
                cropAreaView.invalidate();
                photoViewer.f35799y1.f27184c.b(AndroidUtilities.lerp(f10, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            default:
                td.c cVar = (td.c) obj;
                if (cVar.f47782g) {
                    DecelerateInterpolator decelerateInterpolator = sd.a.f47511a;
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    cVar.d((f10 * animatedFraction) + f11, animatedFraction);
                    return;
                }
                return;
        }
    }
}
