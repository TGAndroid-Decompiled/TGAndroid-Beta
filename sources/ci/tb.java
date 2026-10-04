package ci;

import android.animation.ValueAnimator;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.rd1;
import org.telegram.ui.wp0;
public final class tb implements ValueAnimator.AnimatorUpdateListener {
    public final int f6021a;
    public boolean f6022b = false;
    public final NotificationCenter.NotificationCenterDelegate f6023c;

    public tb(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f6021a = i10;
        this.f6023c = notificationCenterDelegate;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f6021a) {
            case 0:
                kc kcVar = (kc) this.f6023c;
                kcVar.D2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sb sbVar = kcVar.C2;
                if (sbVar != null) {
                    sbVar.invalidate();
                }
                if (!this.f6022b && kcVar.D2 > 0.5f) {
                    this.f6022b = true;
                    return;
                }
                return;
            case 1:
                org.telegram.ui.cd cdVar = (org.telegram.ui.cd) this.f6023c;
                cdVar.f35426n0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cdVar.m0.invalidate();
                if (!this.f6022b && cdVar.f35426n0 > 0.5f) {
                    this.f6022b = true;
                    return;
                }
                return;
            case 2:
                wp0 wp0Var = (wp0) this.f6023c;
                wp0Var.Y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wp0Var.X.invalidate();
                if (!this.f6022b && wp0Var.Y > 0.5f) {
                    this.f6022b = true;
                    return;
                }
                return;
            default:
                rd1 rd1Var = (rd1) this.f6023c;
                rd1Var.f40061i2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rd1Var.f40058h2.invalidate();
                if (!this.f6022b && rd1Var.f40061i2 > 0.5f) {
                    this.f6022b = true;
                    return;
                }
                return;
        }
    }
}
