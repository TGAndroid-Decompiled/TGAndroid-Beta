package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.RichMessageLayout;
public final class n implements ValueAnimator.AnimatorUpdateListener {
    public final int f17049a;
    public final Object f17050b;

    public n(Object obj, int i10) {
        this.f17049a = i10;
        this.f17050b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f17049a) {
            case 0:
                AndroidUtilities.lambda$shakeView$13((View) this.f17050b, valueAnimator);
                return;
            case 1:
                RichMessageLayout.RichButton.a((RichMessageLayout.RichButton) this.f17050b, valueAnimator);
                return;
            default:
                RichMessageLayout.RichSlideshowBlock.c((RichMessageLayout.RichSlideshowBlock) this.f17050b, valueAnimator);
                return;
        }
    }
}
