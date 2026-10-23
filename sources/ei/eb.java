package ei;

import android.animation.ValueAnimator;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.bd;
import org.telegram.ui.ip0;
import org.telegram.ui.kc1;
public final class eb implements ValueAnimator.AnimatorUpdateListener {
    public final int f8977a;
    public boolean f8978b = false;
    public final NotificationCenter.NotificationCenterDelegate f8979c;

    public eb(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f8977a = i10;
        this.f8979c = notificationCenterDelegate;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f8977a) {
            case 0:
                vb vbVar = (vb) this.f8979c;
                vbVar.D2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                db dbVar = vbVar.C2;
                if (dbVar != null) {
                    dbVar.invalidate();
                }
                if (!this.f8978b && vbVar.D2 > 0.5f) {
                    this.f8978b = true;
                    return;
                }
                return;
            case 1:
                bd bdVar = (bd) this.f8979c;
                bdVar.f35594n0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bdVar.m0.invalidate();
                if (!this.f8978b && bdVar.f35594n0 > 0.5f) {
                    this.f8978b = true;
                    return;
                }
                return;
            case 2:
                ip0 ip0Var = (ip0) this.f8979c;
                ip0Var.Y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ip0Var.X.invalidate();
                if (!this.f8978b && ip0Var.Y > 0.5f) {
                    this.f8978b = true;
                    return;
                }
                return;
            default:
                kc1 kc1Var = (kc1) this.f8979c;
                kc1Var.f38550i2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kc1Var.f38547h2.invalidate();
                if (!this.f8978b && kc1Var.f38550i2 > 0.5f) {
                    this.f8978b = true;
                    return;
                }
                return;
        }
    }
}
