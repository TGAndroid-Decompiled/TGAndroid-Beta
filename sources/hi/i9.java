package hi;

import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.ov;
import org.telegram.ui.Components.zf;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bc1;
public final class i9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f14808a;
    public final float f14809b;
    public final float f14810c;
    public final Object d;

    public i9(Object obj, float f10, float f11, int i7) {
        this.f14808a = i7;
        this.d = obj;
        this.f14809b = f10;
        this.f14810c = f11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        int i7 = this.f14808a;
        float f10 = this.f14810c;
        float f11 = this.f14809b;
        Object obj = this.d;
        switch (i7) {
            case 0:
                sa saVar = (sa) obj;
                saVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                saVar.f15437r.setTranslationY(f11 * floatValue);
                saVar.f15437r.b(f10 * floatValue);
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ChatActivityEnterView chatActivityEnterView = ((zf) obj).d;
                chatActivityEnterView.H = f11 * floatValue2;
                chatActivityEnterView.q2();
                chatActivityEnterView.R0.setTranslationX(f10 * floatValue2);
                return;
            case 2:
                ov ovVar = (ov) obj;
                ovVar.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ovVar.M = floatValue3;
                ovVar.L = org.telegram.messenger.g0.T1(f11, f10, floatValue3);
                ovVar.f36929b.invalidate();
                return;
            case 3:
                bc1 bc1Var = (bc1) obj;
                bc1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float L = f11 + org.telegram.messenger.g0.L(28.0f);
                float L2 = f10 + org.telegram.messenger.g0.L(52.0f);
                float f12 = bc1Var.E;
                bc1Var.H = L - (L * f12);
                bc1Var.I = L2 - (f12 * L2);
                bc1Var.invalidate();
                return;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                CropAreaView cropAreaView = photoViewer.D1.f39164b.f21921a;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue() * f11;
                float f13 = photoViewer.f43211a6;
                cropAreaView.f32928o0 = floatValue4;
                cropAreaView.f32929p0 = ((photoViewer.f43249e6 - f13) * photoViewer.f43309l6) + f13;
                cropAreaView.f32930q0 = 0.0f;
                cropAreaView.f32932r0 = 0.0f;
                cropAreaView.invalidate();
                photoViewer.D1.f39165c.b(org.telegram.messenger.g0.T1(f10, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 5:
                org.telegram.ui.Wallet.m4 m4Var = (org.telegram.ui.Wallet.m4) obj;
                float floatValue5 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m4Var.A = (f11 * floatValue5) + m4Var.g();
                m4Var.B = (f10 * floatValue5) + (m4Var.f44577k.F * 0.14f);
                if (floatValue5 > 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                m4Var.D = z10;
                m4Var.f44559a.invalidate();
                return;
            case 6:
                org.telegram.ui.Wallet.s6 s6Var = (org.telegram.ui.Wallet.s6) obj;
                s6Var.getClass();
                float floatValue6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s6Var.O = f11 * floatValue6;
                s6Var.P = f10 * floatValue6;
                return;
            case 7:
                te.c cVar = (te.c) obj;
                if (cVar.h) {
                    DecelerateInterpolator decelerateInterpolator = se.a.f57191a;
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    cVar.d((f10 * animatedFraction) + f11, animatedFraction);
                    return;
                }
                return;
            default:
                vg.e eVar = (vg.e) obj;
                eVar.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vg.f fVar = eVar.f59456a;
                fVar.d = f11 * floatValue7;
                fVar.f59473i = f10 * floatValue7;
                return;
        }
    }
}
