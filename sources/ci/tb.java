package ci;

import android.animation.ValueAnimator;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.pd1;
import org.telegram.ui.wp0;
public final class tb implements ValueAnimator.AnimatorUpdateListener {
    public final int f5595a;
    public boolean f5596b = false;
    public final NotificationCenter.NotificationCenterDelegate f5597c;

    public tb(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f5595a = i10;
        this.f5597c = notificationCenterDelegate;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5595a) {
            case 0:
                kc kcVar = (kc) this.f5597c;
                kcVar.D2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sb sbVar = kcVar.C2;
                if (sbVar != null) {
                    sbVar.invalidate();
                }
                if (!this.f5596b && kcVar.D2 > 0.5f) {
                    this.f5596b = true;
                    return;
                }
                return;
            case 1:
                org.telegram.ui.cd cdVar = (org.telegram.ui.cd) this.f5597c;
                cdVar.f32678n0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cdVar.m0.invalidate();
                if (!this.f5596b && cdVar.f32678n0 > 0.5f) {
                    this.f5596b = true;
                    return;
                }
                return;
            case 2:
                wp0 wp0Var = (wp0) this.f5597c;
                wp0Var.Y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wp0Var.X.invalidate();
                if (!this.f5596b && wp0Var.Y > 0.5f) {
                    this.f5596b = true;
                    return;
                }
                return;
            default:
                pd1 pd1Var = (pd1) this.f5597c;
                pd1Var.f36419i2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pd1Var.f36416h2.invalidate();
                if (!this.f5596b && pd1Var.f36419i2 > 0.5f) {
                    this.f5596b = true;
                    return;
                }
                return;
        }
    }
}
