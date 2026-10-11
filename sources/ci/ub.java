package ci;

import android.animation.ValueAnimator;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.wd1;
import org.telegram.ui.zp0;
public final class ub implements ValueAnimator.AnimatorUpdateListener {
    public final int f6102a;
    public boolean f6103b = false;
    public final NotificationCenter.NotificationCenterDelegate f6104c;

    public ub(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f6102a = i10;
        this.f6104c = notificationCenterDelegate;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f6102a) {
            case 0:
                lc lcVar = (lc) this.f6104c;
                lcVar.D2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tb tbVar = lcVar.C2;
                if (tbVar != null) {
                    tbVar.invalidate();
                }
                if (!this.f6103b && lcVar.D2 > 0.5f) {
                    this.f6103b = true;
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ad adVar = (org.telegram.ui.ad) this.f6104c;
                adVar.f36056n0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                adVar.m0.invalidate();
                if (!this.f6103b && adVar.f36056n0 > 0.5f) {
                    this.f6103b = true;
                    return;
                }
                return;
            case 2:
                zp0 zp0Var = (zp0) this.f6104c;
                zp0Var.Y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zp0Var.X.invalidate();
                if (!this.f6103b && zp0Var.Y > 0.5f) {
                    this.f6103b = true;
                    return;
                }
                return;
            default:
                wd1 wd1Var = (wd1) this.f6104c;
                wd1Var.f43389i2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wd1Var.f43386h2.invalidate();
                if (!this.f6103b && wd1Var.f43389i2 > 0.5f) {
                    this.f6103b = true;
                    return;
                }
                return;
        }
    }
}
