package ei;

import android.animation.ValueAnimator;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.dd;
import org.telegram.ui.jp0;
import org.telegram.ui.mc1;
public final class eb implements ValueAnimator.AnimatorUpdateListener {
    public final int f8979a;
    public boolean f8980b = false;
    public final NotificationCenter.NotificationCenterDelegate f8981c;

    public eb(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f8979a = i10;
        this.f8981c = notificationCenterDelegate;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f8979a) {
            case 0:
                vb vbVar = (vb) this.f8981c;
                vbVar.D2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                db dbVar = vbVar.C2;
                if (dbVar != null) {
                    dbVar.invalidate();
                }
                if (!this.f8980b && vbVar.D2 > 0.5f) {
                    this.f8980b = true;
                    return;
                }
                return;
            case 1:
                dd ddVar = (dd) this.f8981c;
                ddVar.f36153n0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ddVar.m0.invalidate();
                if (!this.f8980b && ddVar.f36153n0 > 0.5f) {
                    this.f8980b = true;
                    return;
                }
                return;
            case 2:
                jp0 jp0Var = (jp0) this.f8981c;
                jp0Var.Y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jp0Var.X.invalidate();
                if (!this.f8980b && jp0Var.Y > 0.5f) {
                    this.f8980b = true;
                    return;
                }
                return;
            default:
                mc1 mc1Var = (mc1) this.f8981c;
                mc1Var.f39126i2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mc1Var.f39123h2.invalidate();
                if (!this.f8980b && mc1Var.f39126i2 > 0.5f) {
                    this.f8980b = true;
                    return;
                }
                return;
        }
    }
}
