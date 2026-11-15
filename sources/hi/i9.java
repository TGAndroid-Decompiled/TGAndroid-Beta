package hi;

import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.gv;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.yb1;
public final class i9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f14431a;
    public final float f14432b;
    public final float f14433c;
    public final Object d;

    public i9(Object obj, float f10, float f11, int i7) {
        this.f14431a = i7;
        this.d = obj;
        this.f14432b = f10;
        this.f14433c = f11;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        int i7 = this.f14431a;
        float f10 = this.f14433c;
        float f11 = this.f14432b;
        Object obj = this.d;
        switch (i7) {
            case 0:
                sa saVar = (sa) obj;
                saVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                saVar.f15088r.setTranslationY(f11 * floatValue);
                saVar.f15088r.b(f10 * floatValue);
                return;
            case 1:
                gv gvVar = (gv) obj;
                gvVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gvVar.M = floatValue2;
                gvVar.L = org.telegram.messenger.g0.T1(f11, f10, floatValue2);
                gvVar.f33010b.invalidate();
                return;
            case 2:
                yb1 yb1Var = (yb1) obj;
                yb1Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float L = f11 + org.telegram.messenger.g0.L(28.0f);
                float L2 = f10 + org.telegram.messenger.g0.L(52.0f);
                float f12 = yb1Var.E;
                yb1Var.H = L - (L * f12);
                yb1Var.I = L2 - (f12 * L2);
                yb1Var.invalidate();
                return;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                CropAreaView cropAreaView = photoViewer.D1.f34907b.f21530a;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue() * f11;
                float f13 = photoViewer.f42721a6;
                cropAreaView.f32495o0 = floatValue3;
                cropAreaView.f32496p0 = ((photoViewer.f42759e6 - f13) * photoViewer.f42819l6) + f13;
                cropAreaView.f32497q0 = 0.0f;
                cropAreaView.f32499r0 = 0.0f;
                cropAreaView.invalidate();
                photoViewer.D1.f34908c.b(org.telegram.messenger.g0.T1(f10, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 4:
                org.telegram.ui.Wallet.c4 c4Var = (org.telegram.ui.Wallet.c4) obj;
                float floatValue4 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c4Var.A = (f11 * floatValue4) + c4Var.g();
                c4Var.B = (f10 * floatValue4) + (c4Var.f43589k.F * 0.14f);
                if (floatValue4 > 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                c4Var.D = z10;
                c4Var.f43571a.invalidate();
                return;
            case 5:
                org.telegram.ui.Wallet.c6 c6Var = (org.telegram.ui.Wallet.c6) obj;
                c6Var.getClass();
                float floatValue5 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c6Var.O = f11 * floatValue5;
                c6Var.P = f10 * floatValue5;
                return;
            case 6:
                te.c cVar = (te.c) obj;
                if (cVar.h) {
                    DecelerateInterpolator decelerateInterpolator = se.a.f56572a;
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    cVar.d((f10 * animatedFraction) + f11, animatedFraction);
                    return;
                }
                return;
            default:
                vg.e eVar = (vg.e) obj;
                eVar.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vg.f fVar = eVar.f58844a;
                fVar.d = f11 * floatValue6;
                fVar.f58861i = f10 * floatValue6;
                return;
        }
    }
}
