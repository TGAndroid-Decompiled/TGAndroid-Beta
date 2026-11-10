package fi;

import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.av;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.dc1;
public final class k9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f12279a;
    public final float f12280b;
    public final float f12281c;
    public final Object d;

    public k9(Object obj, float f10, float f11, int i7) {
        this.f12279a = i7;
        this.d = obj;
        this.f12280b = f10;
        this.f12281c = f11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z9;
        int i7 = this.f12279a;
        float f10 = this.f12281c;
        float f11 = this.f12280b;
        Object obj = this.d;
        switch (i7) {
            case 0:
                va vaVar = (va) obj;
                vaVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vaVar.f12989r.setTranslationY(f11 * floatValue);
                vaVar.f12989r.b(f10 * floatValue);
                return;
            case 1:
                av avVar = (av) obj;
                avVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                avVar.L = floatValue2;
                avVar.K = org.telegram.messenger.g0.T1(f11, f10, floatValue2);
                avVar.f39048b.invalidate();
                return;
            case 2:
                dc1 dc1Var = (dc1) obj;
                dc1Var.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float L = f11 + org.telegram.messenger.g0.L(28.0f);
                float L2 = f10 + org.telegram.messenger.g0.L(52.0f);
                float f12 = dc1Var.D;
                dc1Var.G = L - (L * f12);
                dc1Var.H = L2 - (f12 * L2);
                dc1Var.invalidate();
                return;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                CropAreaView cropAreaView = photoViewer.C1.f33527b.f21012a;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue() * f11;
                float f13 = photoViewer.Z5;
                cropAreaView.f31332n0 = floatValue3;
                cropAreaView.f31333o0 = ((photoViewer.f41378d6 - f13) * photoViewer.f41440k6) + f13;
                cropAreaView.f31334p0 = 0.0f;
                cropAreaView.f31335q0 = 0.0f;
                cropAreaView.invalidate();
                photoViewer.C1.f33528c.b(org.telegram.messenger.g0.T1(f10, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 4:
                org.telegram.ui.Wallet.d4 d4Var = (org.telegram.ui.Wallet.d4) obj;
                float floatValue4 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d4Var.A = (f11 * floatValue4) + d4Var.g();
                d4Var.B = (f10 * floatValue4) + (d4Var.f42320k.E * 0.14f);
                if (floatValue4 > 0.0f) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                d4Var.D = z9;
                d4Var.f42302a.invalidate();
                return;
            case 5:
                org.telegram.ui.Wallet.d6 d6Var = (org.telegram.ui.Wallet.d6) obj;
                d6Var.getClass();
                float floatValue5 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d6Var.N = f11 * floatValue5;
                d6Var.O = f10 * floatValue5;
                return;
            case 6:
                te.c cVar = (te.c) obj;
                if (cVar.h) {
                    DecelerateInterpolator decelerateInterpolator = se.a.f55016a;
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    cVar.d((f10 * animatedFraction) + f11, animatedFraction);
                    return;
                }
                return;
            default:
                vg.e eVar = (vg.e) obj;
                eVar.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vg.f fVar = eVar.f57371a;
                fVar.d = f11 * floatValue6;
                fVar.f57388i = f10 * floatValue6;
                return;
        }
    }
}
