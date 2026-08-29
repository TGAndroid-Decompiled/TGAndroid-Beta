package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.RichMessageLayout;
public final class o implements ValueAnimator.AnimatorUpdateListener {
    public final int f21103a;
    public final Object f21104b;

    public o(Object obj, int i10) {
        this.f21103a = i10;
        this.f21104b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f21103a) {
            case 0:
                AndroidUtilities.lambda$shakeView$13((View) this.f21104b, valueAnimator);
                return;
            case 1:
                RichMessageLayout.RichButton.a((RichMessageLayout.RichButton) this.f21104b, valueAnimator);
                return;
            default:
                RichMessageLayout.RichSlideshowBlock.c((RichMessageLayout.RichSlideshowBlock) this.f21104b, valueAnimator);
                return;
        }
    }
}
