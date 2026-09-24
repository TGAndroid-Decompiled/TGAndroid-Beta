package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.RichMessageLayout;
public final class n implements ValueAnimator.AnimatorUpdateListener {
    public final int f17045a;
    public final Object f17046b;

    public n(Object obj, int i10) {
        this.f17045a = i10;
        this.f17046b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f17045a) {
            case 0:
                AndroidUtilities.lambda$shakeView$13((View) this.f17046b, valueAnimator);
                return;
            case 1:
                RichMessageLayout.RichButton.a((RichMessageLayout.RichButton) this.f17046b, valueAnimator);
                return;
            default:
                RichMessageLayout.RichSlideshowBlock.c((RichMessageLayout.RichSlideshowBlock) this.f17046b, valueAnimator);
                return;
        }
    }
}
