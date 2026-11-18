package hi;

import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.lv;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bc1;
public final class j9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f14830a;
    public final float f14831b;
    public final float f14832c;
    public final Object d;

    public j9(Object obj, float f10, float f11, int i7) {
        this.f14830a = i7;
        this.d = obj;
        this.f14831b = f10;
        this.f14832c = f11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        int i7 = this.f14830a;
        float f10 = this.f14832c;
        float f11 = this.f14831b;
        Object obj = this.d;
        switch (i7) {
            case 0:
                ta taVar = (ta) obj;
                taVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                taVar.f15476r.setTranslationY(f11 * floatValue);
                taVar.f15476r.b(f10 * floatValue);
                return;
            case 1:
                lv lvVar = (lv) obj;
                lvVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lvVar.M = floatValue2;
                lvVar.L = org.telegram.messenger.g0.T1(f11, f10, floatValue2);
                lvVar.f36144b.invalidate();
                return;
            case 2:
                bc1 bc1Var = (bc1) obj;
                bc1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float L = f11 + org.telegram.messenger.g0.L(28.0f);
                float L2 = f10 + org.telegram.messenger.g0.L(52.0f);
                float f12 = bc1Var.E;
                bc1Var.H = L - (L * f12);
                bc1Var.I = L2 - (f12 * L2);
                bc1Var.invalidate();
                return;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                CropAreaView cropAreaView = photoViewer.D1.f38763b.f21896a;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue() * f11;
                float f13 = photoViewer.f43166a6;
                cropAreaView.f32892o0 = floatValue3;
                cropAreaView.f32893p0 = ((photoViewer.f43204e6 - f13) * photoViewer.f43264l6) + f13;
                cropAreaView.f32894q0 = 0.0f;
                cropAreaView.f32896r0 = 0.0f;
                cropAreaView.invalidate();
                photoViewer.D1.f38764c.b(org.telegram.messenger.g0.T1(f10, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 4:
                org.telegram.ui.Wallet.m4 m4Var = (org.telegram.ui.Wallet.m4) obj;
                float floatValue4 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m4Var.A = (f11 * floatValue4) + m4Var.g();
                m4Var.B = (f10 * floatValue4) + (m4Var.f44533k.F * 0.14f);
                if (floatValue4 > 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                m4Var.D = z10;
                m4Var.f44515a.invalidate();
                return;
            case 5:
                org.telegram.ui.Wallet.s6 s6Var = (org.telegram.ui.Wallet.s6) obj;
                s6Var.getClass();
                float floatValue5 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s6Var.O = f11 * floatValue5;
                s6Var.P = f10 * floatValue5;
                return;
            case 6:
                te.c cVar = (te.c) obj;
                if (cVar.h) {
                    DecelerateInterpolator decelerateInterpolator = se.a.f57146a;
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    cVar.d((f10 * animatedFraction) + f11, animatedFraction);
                    return;
                }
                return;
            default:
                vg.e eVar = (vg.e) obj;
                eVar.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vg.f fVar = eVar.f59413a;
                fVar.d = f11 * floatValue6;
                fVar.f59430i = f10 * floatValue6;
                return;
        }
    }
}
