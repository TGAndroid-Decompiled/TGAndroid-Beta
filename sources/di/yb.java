package di;

import android.animation.ValueAnimator;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.bq0;
import org.telegram.ui.wd1;
public final class yb implements ValueAnimator.AnimatorUpdateListener {
    public final int f8491a;
    public boolean f8492b = false;
    public final NotificationCenter.NotificationCenterDelegate f8493c;

    public yb(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f8491a = i10;
        this.f8493c = notificationCenterDelegate;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f8491a) {
            case 0:
                pc pcVar = (pc) this.f8493c;
                pcVar.D2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xb xbVar = pcVar.C2;
                if (xbVar != null) {
                    xbVar.invalidate();
                }
                if (!this.f8492b && pcVar.D2 > 0.5f) {
                    this.f8492b = true;
                    return;
                }
                return;
            case 1:
                org.telegram.ui.bd bdVar = (org.telegram.ui.bd) this.f8493c;
                bdVar.f34752n0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bdVar.m0.invalidate();
                if (!this.f8492b && bdVar.f34752n0 > 0.5f) {
                    this.f8492b = true;
                    return;
                }
                return;
            case 2:
                bq0 bq0Var = (bq0) this.f8493c;
                bq0Var.Y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bq0Var.X.invalidate();
                if (!this.f8492b && bq0Var.Y > 0.5f) {
                    this.f8492b = true;
                    return;
                }
                return;
            default:
                wd1 wd1Var = (wd1) this.f8493c;
                wd1Var.f41944i2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wd1Var.f41941h2.invalidate();
                if (!this.f8492b && wd1Var.f41944i2 > 0.5f) {
                    this.f8492b = true;
                    return;
                }
                return;
        }
    }
}
