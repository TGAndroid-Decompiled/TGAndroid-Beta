package di;

import android.animation.ValueAnimator;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.bq0;
import org.telegram.ui.wd1;
public final class yb implements ValueAnimator.AnimatorUpdateListener {
    public final int f8519a;
    public boolean f8520b = false;
    public final NotificationCenter.NotificationCenterDelegate f8521c;

    public yb(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f8519a = i10;
        this.f8521c = notificationCenterDelegate;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f8519a) {
            case 0:
                pc pcVar = (pc) this.f8521c;
                pcVar.D2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xb xbVar = pcVar.C2;
                if (xbVar != null) {
                    xbVar.invalidate();
                }
                if (!this.f8520b && pcVar.D2 > 0.5f) {
                    this.f8520b = true;
                    return;
                }
                return;
            case 1:
                org.telegram.ui.bd bdVar = (org.telegram.ui.bd) this.f8521c;
                bdVar.f34779n0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bdVar.m0.invalidate();
                if (!this.f8520b && bdVar.f34779n0 > 0.5f) {
                    this.f8520b = true;
                    return;
                }
                return;
            case 2:
                bq0 bq0Var = (bq0) this.f8521c;
                bq0Var.Y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bq0Var.X.invalidate();
                if (!this.f8520b && bq0Var.Y > 0.5f) {
                    this.f8520b = true;
                    return;
                }
                return;
            default:
                wd1 wd1Var = (wd1) this.f8521c;
                wd1Var.f41971i2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wd1Var.f41968h2.invalidate();
                if (!this.f8520b && wd1Var.f41971i2 > 0.5f) {
                    this.f8520b = true;
                    return;
                }
                return;
        }
    }
}
