package ei;

import android.animation.ValueAnimator;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.bd;
import org.telegram.ui.kp0;
import org.telegram.ui.pc1;
public final class eb implements ValueAnimator.AnimatorUpdateListener {
    public final int f8988a;
    public boolean f8989b = false;
    public final NotificationCenter.NotificationCenterDelegate f8990c;

    public eb(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f8988a = i10;
        this.f8990c = notificationCenterDelegate;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f8988a) {
            case 0:
                vb vbVar = (vb) this.f8990c;
                vbVar.D2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                db dbVar = vbVar.C2;
                if (dbVar != null) {
                    dbVar.invalidate();
                }
                if (!this.f8989b && vbVar.D2 > 0.5f) {
                    this.f8989b = true;
                    return;
                }
                return;
            case 1:
                bd bdVar = (bd) this.f8990c;
                bdVar.f36032n0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bdVar.m0.invalidate();
                if (!this.f8989b && bdVar.f36032n0 > 0.5f) {
                    this.f8989b = true;
                    return;
                }
                return;
            case 2:
                kp0 kp0Var = (kp0) this.f8990c;
                kp0Var.Y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kp0Var.X.invalidate();
                if (!this.f8989b && kp0Var.Y > 0.5f) {
                    this.f8989b = true;
                    return;
                }
                return;
            default:
                pc1 pc1Var = (pc1) this.f8990c;
                pc1Var.f40474j2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pc1Var.f40471i2.invalidate();
                if (!this.f8989b && pc1Var.f40474j2 > 0.5f) {
                    this.f8989b = true;
                    return;
                }
                return;
        }
    }
}
