package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.RichMessageLayout;
public final class n implements ValueAnimator.AnimatorUpdateListener {
    public final int f19065a;
    public final Object f19066b;

    public n(Object obj, int i10) {
        this.f19065a = i10;
        this.f19066b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f19065a) {
            case 0:
                AndroidUtilities.lambda$shakeView$13((View) this.f19066b, valueAnimator);
                return;
            case 1:
                RichMessageLayout.RichButton.a((RichMessageLayout.RichButton) this.f19066b, valueAnimator);
                return;
            default:
                RichMessageLayout.RichSlideshowBlock.c((RichMessageLayout.RichSlideshowBlock) this.f19066b, valueAnimator);
                return;
        }
    }
}
