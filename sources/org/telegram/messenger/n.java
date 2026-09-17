package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.RichMessageLayout;
public final class n implements ValueAnimator.AnimatorUpdateListener {
    public final int f16820a;
    public final Object f16821b;

    public n(Object obj, int i10) {
        this.f16820a = i10;
        this.f16821b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f16820a) {
            case 0:
                AndroidUtilities.lambda$shakeView$13((View) this.f16821b, valueAnimator);
                return;
            case 1:
                RichMessageLayout.RichButton.a((RichMessageLayout.RichButton) this.f16821b, valueAnimator);
                return;
            default:
                RichMessageLayout.RichSlideshowBlock.c((RichMessageLayout.RichSlideshowBlock) this.f16821b, valueAnimator);
                return;
        }
    }
}
