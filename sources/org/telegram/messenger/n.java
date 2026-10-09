package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.RichMessageLayout;
public final class n implements ValueAnimator.AnimatorUpdateListener {
    public final int f18571a;
    public final Object f18572b;

    public n(Object obj, int i10) {
        this.f18571a = i10;
        this.f18572b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f18571a) {
            case 0:
                AndroidUtilities.lambda$shakeView$13((View) this.f18572b, valueAnimator);
                return;
            case 1:
                RichMessageLayout.RichButton.a((RichMessageLayout.RichButton) this.f18572b, valueAnimator);
                return;
            default:
                RichMessageLayout.RichSlideshowBlock.c((RichMessageLayout.RichSlideshowBlock) this.f18572b, valueAnimator);
                return;
        }
    }
}
