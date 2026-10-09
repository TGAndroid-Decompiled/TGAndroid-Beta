package ci;

import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.sw;
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
                if (eVar.f16347g) {
                    DecelerateInterpolator decelerateInterpolator = le.a.f15501a;
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    eVar.d((f7 * animatedFraction) + f10, animatedFraction);
                    return;
                }
                return;
            case 2:
                sw swVar = (sw) obj;
                swVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                swVar.L = floatValue2;
                swVar.K = AndroidUtilities.lerp(f10, f7, floatValue2);
                swVar.f30856b.invalidate();
                return;
            case 3:
                pi1 pi1Var = (pi1) obj;
                pi1Var.f31899y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float dp = f10 + AndroidUtilities.dp(28.0f);
                float dp2 = f7 + AndroidUtilities.dp(52.0f);
                float f11 = pi1Var.f31899y;
                pi1Var.G = dp - (dp * f11);
                pi1Var.H = dp2 - (f11 * dp2);
                pi1Var.invalidate();
                return;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                CropAreaView cropAreaView = photoViewer.C1.f31768b.f15572a;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue() * f10;
                float f12 = photoViewer.f33871a6;
                cropAreaView.f24149n0 = floatValue3;
                cropAreaView.f24150o0 = ((photoViewer.f33910e6 - f12) * photoViewer.f33969l6) + f12;
                cropAreaView.f24151p0 = 0.0f;
                cropAreaView.f24152q0 = 0.0f;
                cropAreaView.invalidate();
                photoViewer.C1.f31769c.b(AndroidUtilities.lerp(f7, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 5:
                org.telegram.ui.Wallet.c3 c3Var = (org.telegram.ui.Wallet.c3) obj;
                float floatValue4 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c3Var.A = (f10 * floatValue4) + c3Var.g();
                c3Var.B = (f7 * floatValue4) + (c3Var.f34726k.E * 0.14f);
                if (floatValue4 > 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                c3Var.D = z10;
                c3Var.f34708a.invalidate();
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
                org.telegram.ui.Wallet.j5 j5Var = o5Var.f35315f0;
                float f13 = 1.0f - floatValue6;
                j5Var.d = f10 * f13;
                j5Var.f48044i = f7 * f13;
                return;
            default:
                sg.f fVar = (sg.f) obj;
                fVar.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sg.g gVar = fVar.f48027a;
                gVar.d = f10 * floatValue7;
                gVar.f48044i = f7 * floatValue7;
                return;
        }
    }
}
