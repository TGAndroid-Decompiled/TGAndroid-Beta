package ci;

import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.tw;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.pi1;
public final class ya implements ValueAnimator.AnimatorUpdateListener {
    public final int f6371a;
    public final float f6372b;
    public final float f6373c;
    public final Object d;

    public ya(Object obj, float f7, float f10, int i10) {
        this.f6371a = i10;
        this.d = obj;
        this.f6372b = f7;
        this.f6373c = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        int i10 = this.f6371a;
        float f7 = this.f6373c;
        float f10 = this.f6372b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                lc lcVar = (lc) obj;
                lcVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lcVar.f5512r.setTranslationY(f10 * floatValue);
                lcVar.f5512r.b(f7 * floatValue);
                return;
            case 1:
                me.e eVar = (me.e) obj;
                if (eVar.f16351g) {
                    DecelerateInterpolator decelerateInterpolator = le.a.f15505a;
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    eVar.d((f7 * animatedFraction) + f10, animatedFraction);
                    return;
                }
                return;
            case 2:
                tw twVar = (tw) obj;
                twVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                twVar.L = floatValue2;
                twVar.K = AndroidUtilities.lerp(f10, f7, floatValue2);
                twVar.f31187b.invalidate();
                return;
            case 3:
                pi1 pi1Var = (pi1) obj;
                pi1Var.f31964y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float dp = f10 + AndroidUtilities.dp(28.0f);
                float dp2 = f7 + AndroidUtilities.dp(52.0f);
                float f11 = pi1Var.f31964y;
                pi1Var.G = dp - (dp * f11);
                pi1Var.H = dp2 - (f11 * dp2);
                pi1Var.invalidate();
                return;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                CropAreaView cropAreaView = photoViewer.C1.f32908b.f15576a;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue() * f10;
                float f12 = photoViewer.f33909a6;
                cropAreaView.f24153n0 = floatValue3;
                cropAreaView.f24154o0 = ((photoViewer.f33948e6 - f12) * photoViewer.f34007l6) + f12;
                cropAreaView.f24155p0 = 0.0f;
                cropAreaView.f24156q0 = 0.0f;
                cropAreaView.invalidate();
                photoViewer.C1.f32909c.b(AndroidUtilities.lerp(f7, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 5:
                org.telegram.ui.Wallet.e3 e3Var = (org.telegram.ui.Wallet.e3) obj;
                float floatValue4 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e3Var.A = (f10 * floatValue4) + e3Var.g();
                e3Var.B = (f7 * floatValue4) + (e3Var.f34882k.E * 0.14f);
                if (floatValue4 > 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                e3Var.D = z10;
                e3Var.f34864a.invalidate();
                return;
            case 6:
                org.telegram.ui.Wallet.e5 e5Var = (org.telegram.ui.Wallet.e5) obj;
                e5Var.getClass();
                float floatValue5 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e5Var.J = f10 * floatValue5;
                e5Var.K = f7 * floatValue5;
                return;
            case 7:
                org.telegram.ui.Wallet.q5 q5Var = (org.telegram.ui.Wallet.q5) obj;
                q5Var.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Wallet.l5 l5Var = q5Var.f35474f0;
                float f13 = 1.0f - floatValue6;
                l5Var.d = f10 * f13;
                l5Var.f48090i = f7 * f13;
                return;
            default:
                sg.f fVar = (sg.f) obj;
                fVar.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sg.g gVar = fVar.f48073a;
                gVar.d = f10 * floatValue7;
                gVar.f48090i = f7 * floatValue7;
                return;
        }
    }
}
