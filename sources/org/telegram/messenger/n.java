package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.RichMessageLayout;
public final class n implements ValueAnimator.AnimatorUpdateListener {
    public final int f16811a;
    public final Object f16812b;

    public n(Object obj, int i10) {
        this.f16811a = i10;
        this.f16812b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f16811a) {
            case 0:
                AndroidUtilities.lambda$shakeView$13((View) this.f16812b, valueAnimator);
                return;
            case 1:
                RichMessageLayout.RichButton.a((RichMessageLayout.RichButton) this.f16812b, valueAnimator);
                return;
            default:
                RichMessageLayout.RichSlideshowBlock.c((RichMessageLayout.RichSlideshowBlock) this.f16812b, valueAnimator);
                return;
        }
    }
}
