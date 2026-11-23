package hi;

import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.lv;
import org.telegram.ui.Components.yf;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.zb1;
public final class da implements ValueAnimator.AnimatorUpdateListener {
    public final int f14324a;
    public final float f14325b;
    public final float f14326c;
    public final Object d;

    public da(Object obj, float f10, float f11, int i7) {
        this.f14324a = i7;
        this.d = obj;
        this.f14325b = f10;
        this.f14326c = f11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        int i7 = this.f14324a;
        float f10 = this.f14326c;
        float f11 = this.f14325b;
        Object obj = this.d;
        switch (i7) {
            case 0:
                nb nbVar = (nb) obj;
                nbVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nbVar.f15107r.setTranslationY(f11 * floatValue);
                nbVar.f15107r.b(f10 * floatValue);
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ChatActivityEnterView chatActivityEnterView = ((yf) obj).d;
                chatActivityEnterView.H = f11 * floatValue2;
                chatActivityEnterView.s2();
                chatActivityEnterView.R0.setTranslationX(f10 * floatValue2);
                return;
            case 2:
                lv lvVar = (lv) obj;
                lvVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lvVar.M = floatValue3;
                lvVar.L = org.telegram.messenger.g0.T1(f11, f10, floatValue3);
                lvVar.f36804b.invalidate();
                return;
            case 3:
                zb1 zb1Var = (zb1) obj;
                zb1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float L = f11 + org.telegram.messenger.g0.L(28.0f);
                float L2 = f10 + org.telegram.messenger.g0.L(52.0f);
                float f12 = zb1Var.E;
                zb1Var.H = L - (L * f12);
                zb1Var.I = L2 - (f12 * L2);
                zb1Var.invalidate();
                return;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                CropAreaView cropAreaView = photoViewer.D1.f38811b.f21987a;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue() * f11;
                float f13 = photoViewer.f43287a6;
                cropAreaView.f32992o0 = floatValue4;
                cropAreaView.f32993p0 = ((photoViewer.f43329e6 - f13) * photoViewer.f43390l6) + f13;
                cropAreaView.f32994q0 = 0.0f;
                cropAreaView.f32996r0 = 0.0f;
                cropAreaView.invalidate();
                photoViewer.D1.f38812c.b(org.telegram.messenger.g0.T1(f10, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 5:
                org.telegram.ui.Wallet.n4 n4Var = (org.telegram.ui.Wallet.n4) obj;
                float floatValue5 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n4Var.A = (f11 * floatValue5) + n4Var.g();
                n4Var.B = (f10 * floatValue5) + (n4Var.f44713k.F * 0.14f);
                if (floatValue5 > 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                n4Var.D = z10;
                n4Var.f44695a.invalidate();
                return;
            case 6:
                org.telegram.ui.Wallet.t6 t6Var = (org.telegram.ui.Wallet.t6) obj;
                t6Var.getClass();
                float floatValue6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t6Var.O = f11 * floatValue6;
                t6Var.P = f10 * floatValue6;
                return;
            case 7:
                te.c cVar = (te.c) obj;
                if (cVar.h) {
                    DecelerateInterpolator decelerateInterpolator = se.a.f57270a;
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    cVar.d((f10 * animatedFraction) + f11, animatedFraction);
                    return;
                }
                return;
            default:
                vg.e eVar = (vg.e) obj;
                eVar.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vg.f fVar = eVar.f59541a;
                fVar.d = f11 * floatValue7;
                fVar.f59558i = f10 * floatValue7;
                return;
        }
    }
}
