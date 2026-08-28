package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.RichMessageLayout;
public final class o implements ValueAnimator.AnimatorUpdateListener {
    public final int f21099a;
    public final Object f21100b;

    public o(Object obj, int i9) {
        this.f21099a = i9;
        this.f21100b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f21099a) {
            case 0:
                AndroidUtilities.lambda$shakeView$13((View) this.f21100b, valueAnimator);
                return;
            case 1:
                RichMessageLayout.RichButton.a((RichMessageLayout.RichButton) this.f21100b, valueAnimator);
                return;
            default:
                RichMessageLayout.RichSlideshowBlock.c((RichMessageLayout.RichSlideshowBlock) this.f21100b, valueAnimator);
                return;
        }
    }
}
