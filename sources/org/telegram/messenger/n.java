package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.RichMessageLayout;
public final class n implements ValueAnimator.AnimatorUpdateListener {
    public final int f15817a;
    public final Object f15818b;

    public n(Object obj, int i10) {
        this.f15817a = i10;
        this.f15818b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f15817a) {
            case 0:
                AndroidUtilities.lambda$shakeView$13((View) this.f15818b, valueAnimator);
                return;
            case 1:
                ((RichMessageLayout.RichButton) this.f15818b).lambda$setPressed$0(valueAnimator);
                return;
            default:
                ((RichMessageLayout.RichSlideshowBlock) this.f15818b).lambda$settle$0(valueAnimator);
                return;
        }
    }
}
