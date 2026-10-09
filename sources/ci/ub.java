package ci;

import android.animation.ValueAnimator;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.aq0;
import org.telegram.ui.xd1;
public final class ub implements ValueAnimator.AnimatorUpdateListener {
    public final int f6103a;
    public boolean f6104b = false;
    public final NotificationCenter.NotificationCenterDelegate f6105c;

    public ub(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f6103a = i10;
        this.f6105c = notificationCenterDelegate;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f6103a) {
            case 0:
                lc lcVar = (lc) this.f6105c;
                lcVar.D2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tb tbVar = lcVar.C2;
                if (tbVar != null) {
                    tbVar.invalidate();
                }
                if (!this.f6104b && lcVar.D2 > 0.5f) {
                    this.f6104b = true;
                    return;
                }
                return;
            case 1:
                org.telegram.ui.bd bdVar = (org.telegram.ui.bd) this.f6105c;
                bdVar.f36263n0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bdVar.m0.invalidate();
                if (!this.f6104b && bdVar.f36263n0 > 0.5f) {
                    this.f6104b = true;
                    return;
                }
                return;
            case 2:
                aq0 aq0Var = (aq0) this.f6105c;
                aq0Var.Y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                aq0Var.X.invalidate();
                if (!this.f6104b && aq0Var.Y > 0.5f) {
                    this.f6104b = true;
                    return;
                }
                return;
            default:
                xd1 xd1Var = (xd1) this.f6105c;
                xd1Var.f43965i2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xd1Var.f43962h2.invalidate();
                if (!this.f6104b && xd1Var.f43965i2 > 0.5f) {
                    this.f6104b = true;
                    return;
                }
                return;
        }
    }
}
