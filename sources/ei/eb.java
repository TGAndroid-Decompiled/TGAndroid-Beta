package ei;

import android.animation.ValueAnimator;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.bd;
import org.telegram.ui.lp0;
import org.telegram.ui.qc1;
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
                bdVar.f36034n0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bdVar.m0.invalidate();
                if (!this.f8989b && bdVar.f36034n0 > 0.5f) {
                    this.f8989b = true;
                    return;
                }
                return;
            case 2:
                lp0 lp0Var = (lp0) this.f8990c;
                lp0Var.Y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lp0Var.X.invalidate();
                if (!this.f8989b && lp0Var.Y > 0.5f) {
                    this.f8989b = true;
                    return;
                }
                return;
            default:
                qc1 qc1Var = (qc1) this.f8990c;
                qc1Var.f40745j2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qc1Var.f40742i2.invalidate();
                if (!this.f8989b && qc1Var.f40745j2 > 0.5f) {
                    this.f8989b = true;
                    return;
                }
                return;
        }
    }
}
