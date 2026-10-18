package ei;

import android.animation.ValueAnimator;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.dd;
import org.telegram.ui.kp0;
import org.telegram.ui.mc1;
public final class eb implements ValueAnimator.AnimatorUpdateListener {
    public final int f8978a;
    public boolean f8979b = false;
    public final NotificationCenter.NotificationCenterDelegate f8980c;

    public eb(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f8978a = i10;
        this.f8980c = notificationCenterDelegate;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f8978a) {
            case 0:
                vb vbVar = (vb) this.f8980c;
                vbVar.D2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                db dbVar = vbVar.C2;
                if (dbVar != null) {
                    dbVar.invalidate();
                }
                if (!this.f8979b && vbVar.D2 > 0.5f) {
                    this.f8979b = true;
                    return;
                }
                return;
            case 1:
                dd ddVar = (dd) this.f8980c;
                ddVar.f36146n0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ddVar.m0.invalidate();
                if (!this.f8979b && ddVar.f36146n0 > 0.5f) {
                    this.f8979b = true;
                    return;
                }
                return;
            case 2:
                kp0 kp0Var = (kp0) this.f8980c;
                kp0Var.Y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kp0Var.X.invalidate();
                if (!this.f8979b && kp0Var.Y > 0.5f) {
                    this.f8979b = true;
                    return;
                }
                return;
            default:
                mc1 mc1Var = (mc1) this.f8980c;
                mc1Var.f39107i2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mc1Var.f39104h2.invalidate();
                if (!this.f8979b && mc1Var.f39107i2 > 0.5f) {
                    this.f8979b = true;
                    return;
                }
                return;
        }
    }
}
