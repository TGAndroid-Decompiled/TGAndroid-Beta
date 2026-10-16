package di;

import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.ow;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.vi1;
public final class xa implements ValueAnimator.AnimatorUpdateListener {
    public final int f8106a;
    public final float f8107b;
    public final float f8108c;
    public final Object d;

    public xa(Object obj, float f7, float f10, int i10) {
        this.f8106a = i10;
        this.d = obj;
        this.f8107b = f7;
        this.f8108c = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        int i10 = this.f8106a;
        float f7 = this.f8108c;
        float f10 = this.f8107b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                kc kcVar = (kc) obj;
                kcVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kcVar.f7290r.setTranslationY(f10 * floatValue);
                kcVar.f7290r.b(f7 * floatValue);
                return;
            case 1:
                ne.e eVar = (ne.e) obj;
                if (eVar.f16012g) {
                    DecelerateInterpolator decelerateInterpolator = me.a.f15495a;
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
                owVar.f27691b.invalidate();
                return;
            case 3:
                vi1 vi1Var = (vi1) obj;
                vi1Var.f29783y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float dp = f10 + AndroidUtilities.dp(28.0f);
                float dp2 = f7 + AndroidUtilities.dp(52.0f);
                float f11 = vi1Var.f29783y;
                vi1Var.G = dp - (dp * f11);
                vi1Var.H = dp2 - (f11 * dp2);
                vi1Var.invalidate();
                return;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                CropAreaView cropAreaView = photoViewer.C1.f29367b.f15559a;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue() * f10;
                float f12 = photoViewer.f31896a6;
                cropAreaView.f22840n0 = floatValue3;
                cropAreaView.f22841o0 = ((photoViewer.f31934e6 - f12) * photoViewer.f31994l6) + f12;
                cropAreaView.f22842p0 = 0.0f;
                cropAreaView.f22843q0 = 0.0f;
                cropAreaView.invalidate();
                photoViewer.C1.f29368c.b(AndroidUtilities.lerp(f7, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 5:
                org.telegram.ui.Wallet.e3 e3Var = (org.telegram.ui.Wallet.e3) obj;
                float floatValue4 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e3Var.A = (f10 * floatValue4) + e3Var.g();
                e3Var.B = (f7 * floatValue4) + (e3Var.f32839k.E * 0.14f);
                if (floatValue4 > 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                e3Var.D = z10;
                e3Var.f32822a.invalidate();
                return;
            case 6:
                org.telegram.ui.Wallet.d5 d5Var = (org.telegram.ui.Wallet.d5) obj;
                d5Var.getClass();
                float floatValue5 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d5Var.J = f10 * floatValue5;
                d5Var.K = f7 * floatValue5;
                return;
            case 7:
                org.telegram.ui.Wallet.p5 p5Var = (org.telegram.ui.Wallet.p5) obj;
                p5Var.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Wallet.l5 l5Var = p5Var.f33336f0;
                float f13 = 1.0f - floatValue6;
                l5Var.d = f10 * f13;
                l5Var.f45708i = f7 * f13;
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
