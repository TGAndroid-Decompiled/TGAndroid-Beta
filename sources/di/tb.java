package di;

import android.animation.ValueAnimator;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ce1;
import org.telegram.ui.gq0;
public final class tb implements ValueAnimator.AnimatorUpdateListener {
    public final int f7860a;
    public boolean f7861b = false;
    public final NotificationCenter.NotificationCenterDelegate f7862c;

    public tb(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f7860a = i10;
        this.f7862c = notificationCenterDelegate;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f7860a) {
            case 0:
                kc kcVar = (kc) this.f7862c;
                kcVar.D2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sb sbVar = kcVar.C2;
                if (sbVar != null) {
                    sbVar.invalidate();
                }
                if (!this.f7861b && kcVar.D2 > 0.5f) {
                    this.f7861b = true;
                    return;
                }
                return;
            case 1:
                org.telegram.ui.hd hdVar = (org.telegram.ui.hd) this.f7862c;
                hdVar.f36741n0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hdVar.m0.invalidate();
                if (!this.f7861b && hdVar.f36741n0 > 0.5f) {
                    this.f7861b = true;
                    return;
                }
                return;
            case 2:
                gq0 gq0Var = (gq0) this.f7862c;
                gq0Var.Y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gq0Var.X.invalidate();
                if (!this.f7861b && gq0Var.Y > 0.5f) {
                    this.f7861b = true;
                    return;
                }
                return;
            default:
                ce1 ce1Var = (ce1) this.f7862c;
                ce1Var.f34882i2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ce1Var.f34879h2.invalidate();
                if (!this.f7861b && ce1Var.f34882i2 > 0.5f) {
                    this.f7861b = true;
                    return;
                }
                return;
        }
    }
}
