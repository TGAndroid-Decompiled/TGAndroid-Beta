package gi;

import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.zu;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.sb1;
public final class l9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f13127a;
    public final float f13128b;
    public final float f13129c;
    public final Object d;

    public l9(Object obj, float f10, float f11, int i3) {
        this.f13127a = i3;
        this.d = obj;
        this.f13128b = f10;
        this.f13129c = f11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        int i3 = this.f13127a;
        float f10 = this.f13129c;
        float f11 = this.f13128b;
        Object obj = this.d;
        switch (i3) {
            case 0:
                va vaVar = (va) obj;
                vaVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vaVar.f13751r.setTranslationY(f11 * floatValue);
                vaVar.f13751r.b(f10 * floatValue);
                return;
            case 1:
                zu zuVar = (zu) obj;
                zuVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zuVar.M = floatValue2;
                zuVar.L = org.telegram.messenger.g0.T1(f11, f10, floatValue2);
                zuVar.f41058b.invalidate();
                return;
            case 2:
                sb1 sb1Var = (sb1) obj;
                sb1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float L = f11 + org.telegram.messenger.g0.L(28.0f);
                float L2 = f10 + org.telegram.messenger.g0.L(52.0f);
                float f12 = sb1Var.E;
                sb1Var.H = L - (L * f12);
                sb1Var.I = L2 - (f12 * L2);
                sb1Var.invalidate();
                return;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                CropAreaView cropAreaView = photoViewer.D1.f31808b.f53511a;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue() * f11;
                float f13 = photoViewer.f41388b6;
                cropAreaView.f31388o0 = floatValue3;
                cropAreaView.f31389p0 = ((photoViewer.f41426f6 - f13) * photoViewer.f41483m6) + f13;
                cropAreaView.f31390q0 = 0.0f;
                cropAreaView.f31392r0 = 0.0f;
                cropAreaView.invalidate();
                photoViewer.D1.f31809c.b(org.telegram.messenger.g0.T1(f10, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 4:
                org.telegram.ui.Wallet.b4 b4Var = (org.telegram.ui.Wallet.b4) obj;
                float floatValue4 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b4Var.A = (f11 * floatValue4) + b4Var.g();
                b4Var.B = (f10 * floatValue4) + (b4Var.f42250k.F * 0.14f);
                if (floatValue4 > 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                b4Var.D = z10;
                b4Var.f42232a.invalidate();
                return;
            case 5:
                org.telegram.ui.Wallet.a6 a6Var = (org.telegram.ui.Wallet.a6) obj;
                a6Var.getClass();
                float floatValue5 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a6Var.O = f11 * floatValue5;
                a6Var.P = f10 * floatValue5;
                return;
            case 6:
                qe.c cVar = (qe.c) obj;
                if (cVar.h) {
                    DecelerateInterpolator decelerateInterpolator = pe.a.f53446a;
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    cVar.d((f10 * animatedFraction) + f11, animatedFraction);
                    return;
                }
                return;
            default:
                wg.e eVar = (wg.e) obj;
                eVar.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wg.f fVar = eVar.f57617a;
                fVar.d = f11 * floatValue6;
                fVar.f57634i = f10 * floatValue6;
                return;
        }
    }
}
