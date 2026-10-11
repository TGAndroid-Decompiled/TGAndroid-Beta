package ci;

import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.tw;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ni1;
public final class ya implements ValueAnimator.AnimatorUpdateListener {
    public final int f6370a;
    public final float f6371b;
    public final float f6372c;
    public final Object d;

    public ya(Object obj, float f7, float f10, int i10) {
        this.f6370a = i10;
        this.d = obj;
        this.f6371b = f7;
        this.f6372c = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        int i10 = this.f6370a;
        float f7 = this.f6372c;
        float f10 = this.f6371b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                lc lcVar = (lc) obj;
                lcVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lcVar.f5511r.setTranslationY(f10 * floatValue);
                lcVar.f5511r.b(f7 * floatValue);
                return;
            case 1:
                me.e eVar = (me.e) obj;
                if (eVar.f16375g) {
                    DecelerateInterpolator decelerateInterpolator = le.a.f15504a;
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
                twVar.f31503b.invalidate();
                return;
            case 3:
                ni1 ni1Var = (ni1) obj;
                ni1Var.f31968y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float dp = f10 + AndroidUtilities.dp(28.0f);
                float dp2 = f7 + AndroidUtilities.dp(52.0f);
                float f11 = ni1Var.f31968y;
                ni1Var.G = dp - (dp * f11);
                ni1Var.H = dp2 - (f11 * dp2);
                ni1Var.invalidate();
                return;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                CropAreaView cropAreaView = photoViewer.C1.f32884b.f15575a;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue() * f10;
                float f12 = photoViewer.f33899a6;
                cropAreaView.f24141n0 = floatValue3;
                cropAreaView.f24142o0 = ((photoViewer.f33938e6 - f12) * photoViewer.f33997l6) + f12;
                cropAreaView.f24143p0 = 0.0f;
                cropAreaView.f24144q0 = 0.0f;
                cropAreaView.invalidate();
                photoViewer.C1.f32885c.b(AndroidUtilities.lerp(f7, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 5:
                org.telegram.ui.Wallet.f3 f3Var = (org.telegram.ui.Wallet.f3) obj;
                float floatValue4 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f3Var.A = (f10 * floatValue4) + f3Var.g();
                f3Var.B = (f7 * floatValue4) + (f3Var.f34914k.E * 0.14f);
                if (floatValue4 > 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                f3Var.D = z10;
                f3Var.f34896a.invalidate();
                return;
            case 6:
                org.telegram.ui.Wallet.f5 f5Var = (org.telegram.ui.Wallet.f5) obj;
                f5Var.getClass();
                float floatValue5 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f5Var.J = f10 * floatValue5;
                f5Var.K = f7 * floatValue5;
                return;
            case 7:
                org.telegram.ui.Wallet.r5 r5Var = (org.telegram.ui.Wallet.r5) obj;
                r5Var.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Wallet.m5 m5Var = r5Var.f35504f0;
                float f13 = 1.0f - floatValue6;
                m5Var.d = f10 * f13;
                m5Var.f48136i = f7 * f13;
                return;
            default:
                sg.f fVar = (sg.f) obj;
                fVar.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sg.g gVar = fVar.f48119a;
                gVar.d = f10 * floatValue7;
                gVar.f48136i = f7 * floatValue7;
                return;
        }
    }
}
