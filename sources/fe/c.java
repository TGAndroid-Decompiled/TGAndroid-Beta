package fe;

import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.i0;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.mv;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Wallet.d4;
import org.telegram.ui.Wallet.g6;
import org.telegram.ui.sd1;
import vh.o8;
public final class c implements ValueAnimator.AnimatorUpdateListener {
    public final int f7023a;
    public final float f7024b;
    public final float f7025c;
    public final Object d;

    public c(Object obj, float f7, float f10, int i10) {
        this.f7023a = i10;
        this.d = obj;
        this.f7024b = f7;
        this.f7025c = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        int i10 = this.f7023a;
        float f7 = this.f7025c;
        float f10 = this.f7024b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                f fVar = (f) obj;
                if (fVar.h) {
                    DecelerateInterpolator decelerateInterpolator = ee.a.f6489a;
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    fVar.d((f7 * animatedFraction) + f10, animatedFraction);
                    return;
                }
                return;
            case 1:
                lg.g gVar = (lg.g) obj;
                gVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lg.h hVar = gVar.f11867a;
                hVar.d = f10 * floatValue;
                hVar.f11882i = f7 * floatValue;
                return;
            case 2:
                mv mvVar = (mv) obj;
                mvVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mvVar.L = floatValue2;
                mvVar.K = i0.T1(f10, f7, floatValue2);
                mvVar.f33184b.invalidate();
                return;
            case 3:
                sd1 sd1Var = (sd1) obj;
                sd1Var.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float L = f10 + i0.L(28.0f);
                float L2 = f7 + i0.L(52.0f);
                float f11 = sd1Var.D;
                sd1Var.G = L - (L * f11);
                sd1Var.H = L2 - (f11 * L2);
                sd1Var.invalidate();
                return;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                CropAreaView cropAreaView = photoViewer.C1.f24715b.f6583a;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue() * f10;
                float f12 = photoViewer.f33445a6;
                cropAreaView.f23969n0 = floatValue3;
                cropAreaView.f23970o0 = ((photoViewer.f33483e6 - f12) * photoViewer.f33543l6) + f12;
                cropAreaView.f23971p0 = 0.0f;
                cropAreaView.f23972q0 = 0.0f;
                cropAreaView.invalidate();
                photoViewer.C1.f24716c.b(i0.T1(f7, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 5:
                d4 d4Var = (d4) obj;
                float floatValue4 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d4Var.A = (f10 * floatValue4) + d4Var.g();
                d4Var.B = (f7 * floatValue4) + (d4Var.f34399k.E * 0.14f);
                if (floatValue4 > 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                d4Var.D = z10;
                d4Var.f34382a.invalidate();
                return;
            case 6:
                g6 g6Var = (g6) obj;
                g6Var.getClass();
                float floatValue5 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g6Var.N = f10 * floatValue5;
                g6Var.O = f7 * floatValue5;
                return;
            default:
                o8 o8Var = (o8) obj;
                o8Var.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o8Var.f51672r.setTranslationY(f10 * floatValue6);
                o8Var.f51672r.b(f7 * floatValue6);
                return;
        }
    }
}
