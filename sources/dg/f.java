package dg;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class f implements ValueAnimator.AnimatorUpdateListener {
    public final int f4500a;
    public final j f4501b;

    public f(j jVar, int i10) {
        this.f4500a = i10;
        this.f4501b = jVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f4500a) {
            case 0:
                j jVar = this.f4501b;
                jVar.g(AndroidUtilities.lerpAngle(jVar.I, jVar.f4587f0, jVar.N.getAnimatedFraction()));
                return;
            case 1:
                j jVar2 = this.f4501b;
                jVar2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jVar2.f4592k0 = floatValue;
                jVar2.setAlpha(floatValue);
                i iVar = jVar2.E;
                if (iVar != null) {
                    iVar.setScaleX(Utilities.clamp(jVar2.f4592k0 * 1.25f, 1.0f, 0.0f) * AndroidUtilities.lerp(0.9f, 1.0f, jVar2.f4588g0));
                    jVar2.E.setScaleY(Utilities.clamp(jVar2.f4592k0 * 1.25f, 1.0f, 0.0f) * AndroidUtilities.lerp(0.9f, 1.0f, jVar2.f4588g0));
                    jVar2.E.setAlpha(Math.max(0.0f, jVar2.f4592k0 - 0.8f) * jVar2.f4588g0 * 5.0f);
                }
                jVar2.invalidate();
                return;
            case 2:
                j jVar3 = this.f4501b;
                jVar3.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jVar3.f4588g0 = floatValue2;
                i iVar2 = jVar3.E;
                if (iVar2 != null) {
                    iVar2.setScaleX(Utilities.clamp(jVar3.f4592k0 * 1.25f, 1.0f, 0.0f) * AndroidUtilities.lerp(0.9f, 1.0f, floatValue2));
                    jVar3.E.setScaleY(Utilities.clamp(jVar3.f4592k0 * 1.25f, 1.0f, 0.0f) * AndroidUtilities.lerp(0.9f, 1.0f, jVar3.f4588g0));
                    jVar3.E.setAlpha(Math.max(0.0f, jVar3.f4592k0 - 0.8f) * jVar3.f4588g0 * 5.0f);
                    return;
                }
                return;
            case 3:
                this.f4501b.k();
                return;
            case 4:
                this.f4501b.k();
                return;
            default:
                j jVar4 = this.f4501b;
                float lerpAngle = AndroidUtilities.lerpAngle(jVar4.f4587f0, jVar4.I, valueAnimator.getAnimatedFraction());
                jVar4.L = lerpAngle;
                jVar4.g(lerpAngle);
                return;
        }
    }
}
