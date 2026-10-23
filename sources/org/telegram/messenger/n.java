package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.RichMessageLayout;
public final class n implements ValueAnimator.AnimatorUpdateListener {
    public final int f19076a;
    public final Object f19077b;

    public n(Object obj, int i10) {
        this.f19076a = i10;
        this.f19077b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f19076a) {
            case 0:
                AndroidUtilities.lambda$shakeView$13((View) this.f19077b, valueAnimator);
                return;
            case 1:
                RichMessageLayout.RichButton.a((RichMessageLayout.RichButton) this.f19077b, valueAnimator);
                return;
            default:
                RichMessageLayout.RichSlideshowBlock.c((RichMessageLayout.RichSlideshowBlock) this.f19077b, valueAnimator);
                return;
        }
    }
}
