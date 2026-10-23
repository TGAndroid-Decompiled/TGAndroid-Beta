package ei;

import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.kw;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.hh1;
public final class ja implements ValueAnimator.AnimatorUpdateListener {
    public final int f9292a;
    public final float f9293b;
    public final float f9294c;
    public final Object d;

    public ja(Object obj, float f7, float f10, int i10) {
        this.f9292a = i10;
        this.d = obj;
        this.f9293b = f7;
        this.f9294c = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        int i10 = this.f9292a;
        float f7 = this.f9294c;
        float f10 = this.f9293b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                vb vbVar = (vb) obj;
                vbVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vbVar.f10017r.setTranslationY(f10 * floatValue);
                vbVar.f10017r.b(f7 * floatValue);
                return;
            case 1:
                ne.e eVar = (ne.e) obj;
                if (eVar.f17455g) {
                    DecelerateInterpolator decelerateInterpolator = me.a.f16916a;
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    eVar.d((f7 * animatedFraction) + f10, animatedFraction);
                    return;
                }
                return;
            case 2:
                kw kwVar = (kw) obj;
                kwVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kwVar.L = floatValue2;
                kwVar.K = AndroidUtilities.lerp(f10, f7, floatValue2);
                kwVar.f29245b.invalidate();
                return;
            case 3:
                hh1 hh1Var = (hh1) obj;
                hh1Var.f31541y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float dp = f10 + AndroidUtilities.dp(28.0f);
                float dp2 = f7 + AndroidUtilities.dp(52.0f);
                float f11 = hh1Var.f31541y;
                hh1Var.G = dp - (dp * f11);
                hh1Var.H = dp2 - (f11 * dp2);
                hh1Var.invalidate();
                return;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                CropAreaView cropAreaView = photoViewer.C1.f30163b.f16980a;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue() * f10;
                float f12 = photoViewer.f33548a6;
                cropAreaView.f24344n0 = floatValue3;
                cropAreaView.f24345o0 = ((photoViewer.f33586e6 - f12) * photoViewer.f33646l6) + f12;
                cropAreaView.f24346p0 = 0.0f;
                cropAreaView.f24347q0 = 0.0f;
                cropAreaView.invalidate();
                photoViewer.C1.f30164c.b(AndroidUtilities.lerp(f7, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 5:
                org.telegram.ui.Wallet.m3 m3Var = (org.telegram.ui.Wallet.m3) obj;
                float floatValue4 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m3Var.A = (f10 * floatValue4) + m3Var.g();
                m3Var.B = (f7 * floatValue4) + (m3Var.f34821k.E * 0.14f);
                if (floatValue4 > 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                m3Var.D = z10;
                m3Var.f34804a.invalidate();
                return;
            case 6:
                org.telegram.ui.Wallet.s5 s5Var = (org.telegram.ui.Wallet.s5) obj;
                s5Var.getClass();
                float floatValue5 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s5Var.N = f10 * floatValue5;
                s5Var.O = f7 * floatValue5;
                return;
            default:
                tg.f fVar = (tg.f) obj;
                fVar.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tg.g gVar = fVar.f47500a;
                gVar.d = f10 * floatValue6;
                gVar.f47515i = f7 * floatValue6;
                return;
        }
    }
}
