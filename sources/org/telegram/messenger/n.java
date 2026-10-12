package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.RichMessageLayout;
public final class n implements ValueAnimator.AnimatorUpdateListener {
    public final int f17906a;
    public final Object f17907b;

    public n(Object obj, int i10) {
        this.f17906a = i10;
        this.f17907b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f17906a) {
            case 0:
                AndroidUtilities.lambda$shakeView$13((View) this.f17907b, valueAnimator);
                return;
            case 1:
                ((RichMessageLayout.RichButton) this.f17907b).lambda$setPressed$0(valueAnimator);
                return;
            default:
                ((RichMessageLayout.RichSlideshowBlock) this.f17907b).lambda$settle$0(valueAnimator);
                return;
        }
    }
}
