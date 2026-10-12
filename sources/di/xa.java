package di;

import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.ow;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.wi1;
public final class xa implements ValueAnimator.AnimatorUpdateListener {
    public final int f8104a;
    public final float f8105b;
    public final float f8106c;
    public final Object d;

    public xa(Object obj, float f7, float f10, int i10) {
        this.f8104a = i10;
        this.d = obj;
        this.f8105b = f7;
        this.f8106c = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        int i10 = this.f8104a;
        float f7 = this.f8106c;
        float f10 = this.f8105b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                kc kcVar = (kc) obj;
                kcVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kcVar.f7287r.setTranslationY(f10 * floatValue);
                kcVar.f7287r.b(f7 * floatValue);
                return;
            case 1:
                ne.e eVar = (ne.e) obj;
                if (eVar.f16301g) {
                    DecelerateInterpolator decelerateInterpolator = me.a.f15760a;
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    eVar.d((f7 * animatedFraction) + f10, animatedFraction);
                    return;
                }
                return;
            case 2:
                ow owVar = (ow) obj;
                owVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                owVar.L = floatValue2;
                owVar.K = AndroidUtilities.lerp(f10, f7, floatValue2);
                owVar.f28000b.invalidate();
                return;
            case 3:
                wi1 wi1Var = (wi1) obj;
                wi1Var.f30114y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float dp = f10 + AndroidUtilities.dp(28.0f);
                float dp2 = f7 + AndroidUtilities.dp(52.0f);
                float f11 = wi1Var.f30114y;
                wi1Var.G = dp - (dp * f11);
                wi1Var.H = dp2 - (f11 * dp2);
                wi1Var.invalidate();
                return;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                CropAreaView cropAreaView = photoViewer.C1.f29369b.f15824a;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue() * f10;
                float f12 = photoViewer.f32194a6;
                cropAreaView.f23140n0 = floatValue3;
                cropAreaView.f23141o0 = ((photoViewer.f32232e6 - f12) * photoViewer.f32292l6) + f12;
                cropAreaView.f23142p0 = 0.0f;
                cropAreaView.f23143q0 = 0.0f;
                cropAreaView.invalidate();
                photoViewer.C1.f29370c.b(AndroidUtilities.lerp(f7, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 5:
                org.telegram.ui.Wallet.d3 d3Var = (org.telegram.ui.Wallet.d3) obj;
                float floatValue4 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d3Var.A = (f10 * floatValue4) + d3Var.g();
                d3Var.B = (f7 * floatValue4) + (d3Var.f33062k.E * 0.14f);
                if (floatValue4 > 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                d3Var.D = z10;
                d3Var.f33045a.invalidate();
                return;
            case 6:
                org.telegram.ui.Wallet.c5 c5Var = (org.telegram.ui.Wallet.c5) obj;
                c5Var.getClass();
                float floatValue5 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c5Var.J = f10 * floatValue5;
                c5Var.K = f7 * floatValue5;
                return;
            case 7:
                org.telegram.ui.Wallet.o5 o5Var = (org.telegram.ui.Wallet.o5) obj;
                o5Var.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Wallet.j5 j5Var = o5Var.f33562f0;
                float f13 = 1.0f - floatValue6;
                j5Var.d = f10 * f13;
                j5Var.f45708i = f7 * f13;
                return;
            default:
                tg.f fVar = (tg.f) obj;
                fVar.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tg.g gVar = fVar.f45693a;
                gVar.d = f10 * floatValue7;
                gVar.f45708i = f7 * floatValue7;
                return;
        }
    }
}
