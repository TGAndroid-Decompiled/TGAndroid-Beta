package eg;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class f implements ValueAnimator.AnimatorUpdateListener {
    public final int f5200a;
    public final j f5201b;

    public f(j jVar, int i10) {
        this.f5200a = i10;
        this.f5201b = jVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5200a) {
            case 0:
                j jVar = this.f5201b;
                jVar.g(AndroidUtilities.lerpAngle(jVar.I, jVar.f5278f0, jVar.N.getAnimatedFraction()));
                return;
            case 1:
                j jVar2 = this.f5201b;
                jVar2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jVar2.f5283k0 = floatValue;
                jVar2.setAlpha(floatValue);
                i iVar = jVar2.E;
                if (iVar != null) {
                    iVar.setScaleX(Utilities.clamp(jVar2.f5283k0 * 1.25f, 1.0f, 0.0f) * AndroidUtilities.lerp(0.9f, 1.0f, jVar2.f5279g0));
                    jVar2.E.setScaleY(Utilities.clamp(jVar2.f5283k0 * 1.25f, 1.0f, 0.0f) * AndroidUtilities.lerp(0.9f, 1.0f, jVar2.f5279g0));
                    jVar2.E.setAlpha(Math.max(0.0f, jVar2.f5283k0 - 0.8f) * jVar2.f5279g0 * 5.0f);
                }
                jVar2.invalidate();
                return;
            case 2:
                j jVar3 = this.f5201b;
                jVar3.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jVar3.f5279g0 = floatValue2;
                i iVar2 = jVar3.E;
                if (iVar2 != null) {
                    iVar2.setScaleX(Utilities.clamp(jVar3.f5283k0 * 1.25f, 1.0f, 0.0f) * AndroidUtilities.lerp(0.9f, 1.0f, floatValue2));
                    jVar3.E.setScaleY(Utilities.clamp(jVar3.f5283k0 * 1.25f, 1.0f, 0.0f) * AndroidUtilities.lerp(0.9f, 1.0f, jVar3.f5279g0));
                    jVar3.E.setAlpha(Math.max(0.0f, jVar3.f5283k0 - 0.8f) * jVar3.f5279g0 * 5.0f);
                    return;
                }
                return;
            case 3:
                this.f5201b.k();
                return;
            case 4:
                this.f5201b.k();
                return;
            default:
                j jVar4 = this.f5201b;
                float lerpAngle = AndroidUtilities.lerpAngle(jVar4.f5278f0, jVar4.I, valueAnimator.getAnimatedFraction());
                jVar4.L = lerpAngle;
                jVar4.g(lerpAngle);
                return;
        }
    }
}
