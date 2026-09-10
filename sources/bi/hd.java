package bi;

import android.animation.ValueAnimator;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ae1;
import org.telegram.ui.bq0;
public final class hd implements ValueAnimator.AnimatorUpdateListener {
    public final int f2810a;
    public boolean f2811b = false;
    public final NotificationCenter.NotificationCenterDelegate f2812c;

    public hd(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f2810a = i10;
        this.f2812c = notificationCenterDelegate;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f2810a) {
            case 0:
                ce ceVar = (ce) this.f2812c;
                ceVar.D2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gd gdVar = ceVar.C2;
                if (gdVar != null) {
                    gdVar.invalidate();
                }
                if (!this.f2811b && ceVar.D2 > 0.5f) {
                    this.f2811b = true;
                    return;
                }
                return;
            case 1:
                org.telegram.ui.cd cdVar = (org.telegram.ui.cd) this.f2812c;
                cdVar.f31625n0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cdVar.m0.invalidate();
                if (!this.f2811b && cdVar.f31625n0 > 0.5f) {
                    this.f2811b = true;
                    return;
                }
                return;
            case 2:
                bq0 bq0Var = (bq0) this.f2812c;
                bq0Var.Y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bq0Var.X.invalidate();
                if (!this.f2811b && bq0Var.Y > 0.5f) {
                    this.f2811b = true;
                    return;
                }
                return;
            default:
                ae1 ae1Var = (ae1) this.f2812c;
                ae1Var.f30943i2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ae1Var.f30940h2.invalidate();
                if (!this.f2811b && ae1Var.f30943i2 > 0.5f) {
                    this.f2811b = true;
                    return;
                }
                return;
        }
    }
}
