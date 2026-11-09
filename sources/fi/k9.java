package fi;

import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.bv;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.cc1;
public final class k9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f12278a;
    public final float f12279b;
    public final float f12280c;
    public final Object d;

    public k9(Object obj, float f10, float f11, int i7) {
        this.f12278a = i7;
        this.d = obj;
        this.f12279b = f10;
        this.f12280c = f11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z9;
        int i7 = this.f12278a;
        float f10 = this.f12280c;
        float f11 = this.f12279b;
        Object obj = this.d;
        switch (i7) {
            case 0:
                va vaVar = (va) obj;
                vaVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vaVar.f12987r.setTranslationY(f11 * floatValue);
                vaVar.f12987r.b(f10 * floatValue);
                return;
            case 1:
                bv bvVar = (bv) obj;
                bvVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bvVar.L = floatValue2;
                bvVar.K = org.telegram.messenger.g0.T1(f11, f10, floatValue2);
                bvVar.f40097b.invalidate();
                return;
            case 2:
                cc1 cc1Var = (cc1) obj;
                cc1Var.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float L = f11 + org.telegram.messenger.g0.L(28.0f);
                float L2 = f10 + org.telegram.messenger.g0.L(52.0f);
                float f12 = cc1Var.D;
                cc1Var.G = L - (L * f12);
                cc1Var.H = L2 - (f12 * L2);
                cc1Var.invalidate();
                return;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                CropAreaView cropAreaView = photoViewer.C1.f33932b.f21007a;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue() * f11;
                float f13 = photoViewer.Z5;
                cropAreaView.f31321n0 = floatValue3;
                cropAreaView.f31322o0 = ((photoViewer.f41387d6 - f13) * photoViewer.f41449k6) + f13;
                cropAreaView.f31323p0 = 0.0f;
                cropAreaView.f31324q0 = 0.0f;
                cropAreaView.invalidate();
                photoViewer.C1.f33933c.b(org.telegram.messenger.g0.T1(f10, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 4:
                org.telegram.ui.Wallet.b4 b4Var = (org.telegram.ui.Wallet.b4) obj;
                float floatValue4 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b4Var.A = (f11 * floatValue4) + b4Var.g();
                b4Var.B = (f10 * floatValue4) + (b4Var.f42240k.E * 0.14f);
                if (floatValue4 > 0.0f) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                b4Var.D = z9;
                b4Var.f42222a.invalidate();
                return;
            case 5:
                org.telegram.ui.Wallet.a6 a6Var = (org.telegram.ui.Wallet.a6) obj;
                a6Var.getClass();
                float floatValue5 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a6Var.N = f11 * floatValue5;
                a6Var.O = f10 * floatValue5;
                return;
            case 6:
                te.c cVar = (te.c) obj;
                if (cVar.h) {
                    DecelerateInterpolator decelerateInterpolator = se.a.f55017a;
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    cVar.d((f10 * animatedFraction) + f11, animatedFraction);
                    return;
                }
                return;
            default:
                vg.e eVar = (vg.e) obj;
                eVar.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vg.f fVar = eVar.f57375a;
                fVar.d = f11 * floatValue6;
                fVar.f57392i = f10 * floatValue6;
                return;
        }
    }
}
