package di;

import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.bw;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ni1;
public final class bb implements ValueAnimator.AnimatorUpdateListener {
    public final int f6995a;
    public final float f6996b;
    public final float f6997c;
    public final Object d;

    public bb(Object obj, float f7, float f10, int i10) {
        this.f6995a = i10;
        this.d = obj;
        this.f6996b = f7;
        this.f6997c = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f6995a;
        float f7 = this.f6997c;
        float f10 = this.f6996b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                pc pcVar = (pc) obj;
                pcVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pcVar.f7923r.setTranslationY(f10 * floatValue);
                pcVar.f7923r.b(f7 * floatValue);
                return;
            case 1:
                le.e eVar = (le.e) obj;
                if (eVar.f15405g) {
                    DecelerateInterpolator decelerateInterpolator = ke.a.f14926a;
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    eVar.d((f7 * animatedFraction) + f10, animatedFraction);
                    return;
                }
                return;
            case 2:
                bw bwVar = (bw) obj;
                bwVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bwVar.L = floatValue2;
                bwVar.K = AndroidUtilities.lerp(f10, f7, floatValue2);
                bwVar.f28497b.invalidate();
                return;
            case 3:
                ni1 ni1Var = (ni1) obj;
                ni1Var.f31451y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float dp = f10 + AndroidUtilities.dp(28.0f);
                float dp2 = f7 + AndroidUtilities.dp(52.0f);
                float f11 = ni1Var.f31451y;
                ni1Var.G = dp - (dp * f11);
                ni1Var.H = dp2 - (f11 * dp2);
                ni1Var.invalidate();
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                CropAreaView cropAreaView = photoViewer.C1.f30896b.f16330a;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue() * f10;
                float f12 = photoViewer.f33543a6;
                cropAreaView.f23986n0 = floatValue3;
                cropAreaView.f23987o0 = ((photoViewer.f33582e6 - f12) * photoViewer.f33641l6) + f12;
                cropAreaView.f23988p0 = 0.0f;
                cropAreaView.f23989q0 = 0.0f;
                cropAreaView.invalidate();
                photoViewer.C1.f30897c.b(AndroidUtilities.lerp(f7, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
        }
    }
}
