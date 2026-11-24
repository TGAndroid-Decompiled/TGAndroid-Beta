package defpackage;

import android.animation.ValueAnimator;
import org.telegram.ui.LaunchActivity;
public final class tx5 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final LaunchActivity b;

    public tx5(LaunchActivity launchActivity, byte b) {
        this.a = b;
        this.b = launchActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        LaunchActivity launchActivity = this.b;
        switch (b) {
            case 0:
                String str = LaunchActivity.C1;
                launchActivity.v0.invalidate();
                return;
            default:
                String str2 = LaunchActivity.C1;
                launchActivity.getClass();
                launchActivity.D0(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
