package fi;

import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.bv;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.zb1;
public final class l9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f12348a;
    public final float f12349b;
    public final float f12350c;
    public final Object d;

    public l9(Object obj, float f10, float f11, int i7) {
        this.f12348a = i7;
        this.d = obj;
        this.f12349b = f10;
        this.f12350c = f11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z9;
        int i7 = this.f12348a;
        float f10 = this.f12350c;
        float f11 = this.f12349b;
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
                bvVar.f39027b.invalidate();
                return;
            case 2:
                zb1 zb1Var = (zb1) obj;
                zb1Var.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float L = f11 + org.telegram.messenger.g0.L(28.0f);
                float L2 = f10 + org.telegram.messenger.g0.L(52.0f);
                float f12 = zb1Var.D;
                zb1Var.G = L - (L * f12);
                zb1Var.H = L2 - (f12 * L2);
                zb1Var.invalidate();
                return;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                CropAreaView cropAreaView = photoViewer.C1.f33525b.f21007a;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue() * f11;
                float f13 = photoViewer.Z5;
                cropAreaView.f31316n0 = floatValue3;
                cropAreaView.f31317o0 = ((photoViewer.f41380d6 - f13) * photoViewer.f41442k6) + f13;
                cropAreaView.f31318p0 = 0.0f;
                cropAreaView.f31319q0 = 0.0f;
                cropAreaView.invalidate();
                photoViewer.C1.f33526c.b(org.telegram.messenger.g0.T1(f10, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 4:
                org.telegram.ui.Wallet.c4 c4Var = (org.telegram.ui.Wallet.c4) obj;
                float floatValue4 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c4Var.A = (f11 * floatValue4) + c4Var.g();
                c4Var.B = (f10 * floatValue4) + (c4Var.f42326k.E * 0.14f);
                if (floatValue4 > 0.0f) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                c4Var.D = z9;
                c4Var.f42308a.invalidate();
                return;
            case 5:
                org.telegram.ui.Wallet.b6 b6Var = (org.telegram.ui.Wallet.b6) obj;
                b6Var.getClass();
                float floatValue5 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b6Var.N = f11 * floatValue5;
                b6Var.O = f10 * floatValue5;
                return;
            case 6:
                te.c cVar = (te.c) obj;
                if (cVar.h) {
                    DecelerateInterpolator decelerateInterpolator = se.a.f55005a;
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    cVar.d((f10 * animatedFraction) + f11, animatedFraction);
                    return;
                }
                return;
            default:
                vg.e eVar = (vg.e) obj;
                eVar.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vg.f fVar = eVar.f57363a;
                fVar.d = f11 * floatValue6;
                fVar.f57380i = f10 * floatValue6;
                return;
        }
    }
}
