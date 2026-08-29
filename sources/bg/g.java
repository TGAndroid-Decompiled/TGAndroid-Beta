package bg;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class g implements ValueAnimator.AnimatorUpdateListener {
    public final int f2220a;
    public final k f2221b;

    public g(k kVar, int i10) {
        this.f2220a = i10;
        this.f2221b = kVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f2220a) {
            case 0:
                k kVar = this.f2221b;
                kVar.g(AndroidUtilities.lerpAngle(kVar.H, kVar.f2351e0, kVar.M.getAnimatedFraction()));
                return;
            case 1:
                k kVar2 = this.f2221b;
                kVar2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar2.f2357j0 = floatValue;
                kVar2.setAlpha(floatValue);
                j jVar = kVar2.D;
                if (jVar != null) {
                    jVar.setScaleX(Utilities.clamp(kVar2.f2357j0 * 1.25f, 1.0f, 0.0f) * AndroidUtilities.lerp(0.9f, 1.0f, kVar2.f2353f0));
                    kVar2.D.setScaleY(Utilities.clamp(kVar2.f2357j0 * 1.25f, 1.0f, 0.0f) * AndroidUtilities.lerp(0.9f, 1.0f, kVar2.f2353f0));
                    kVar2.D.setAlpha(Math.max(0.0f, kVar2.f2357j0 - 0.8f) * kVar2.f2353f0 * 5.0f);
                }
                kVar2.invalidate();
                return;
            case 2:
                k kVar3 = this.f2221b;
                kVar3.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar3.f2353f0 = floatValue2;
                j jVar2 = kVar3.D;
                if (jVar2 != null) {
                    jVar2.setScaleX(Utilities.clamp(kVar3.f2357j0 * 1.25f, 1.0f, 0.0f) * AndroidUtilities.lerp(0.9f, 1.0f, floatValue2));
                    kVar3.D.setScaleY(Utilities.clamp(kVar3.f2357j0 * 1.25f, 1.0f, 0.0f) * AndroidUtilities.lerp(0.9f, 1.0f, kVar3.f2353f0));
                    kVar3.D.setAlpha(Math.max(0.0f, kVar3.f2357j0 - 0.8f) * kVar3.f2353f0 * 5.0f);
                    return;
                }
                return;
            case 3:
                this.f2221b.k();
                return;
            case 4:
                this.f2221b.k();
                return;
            default:
                k kVar4 = this.f2221b;
                float lerpAngle = AndroidUtilities.lerpAngle(kVar4.f2351e0, kVar4.H, valueAnimator.getAnimatedFraction());
                kVar4.K = lerpAngle;
                kVar4.g(lerpAngle);
                return;
        }
    }
}
