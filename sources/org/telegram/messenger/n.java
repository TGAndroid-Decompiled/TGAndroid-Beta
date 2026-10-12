package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.RichMessageLayout;
public final class n implements ValueAnimator.AnimatorUpdateListener {
    public final int f18330a;
    public final Object f18331b;

    public n(Object obj, int i10) {
        this.f18330a = i10;
        this.f18331b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f18330a) {
            case 0:
                AndroidUtilities.lambda$shakeView$13((View) this.f18331b, valueAnimator);
                return;
            case 1:
                ((RichMessageLayout.RichButton) this.f18331b).lambda$setPressed$0(valueAnimator);
                return;
            default:
                ((RichMessageLayout.RichSlideshowBlock) this.f18331b).lambda$settle$0(valueAnimator);
                return;
        }
    }
}
