package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.RichMessageLayout;
public final class n implements ValueAnimator.AnimatorUpdateListener {
    public final int f19013a;
    public final Object f19014b;

    public n(Object obj, int i10) {
        this.f19013a = i10;
        this.f19014b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f19013a) {
            case 0:
                AndroidUtilities.lambda$shakeView$13((View) this.f19014b, valueAnimator);
                return;
            case 1:
                RichMessageLayout.RichButton.a((RichMessageLayout.RichButton) this.f19014b, valueAnimator);
                return;
            default:
                RichMessageLayout.RichSlideshowBlock.c((RichMessageLayout.RichSlideshowBlock) this.f19014b, valueAnimator);
                return;
        }
    }
}
