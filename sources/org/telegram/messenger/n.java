package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.RichMessageLayout;
public final class n implements ValueAnimator.AnimatorUpdateListener {
    public final int f17603a;
    public final Object f17604b;

    public n(Object obj, int i10) {
        this.f17603a = i10;
        this.f17604b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f17603a) {
            case 0:
                AndroidUtilities.lambda$shakeView$13((View) this.f17604b, valueAnimator);
                return;
            case 1:
                ((RichMessageLayout.RichButton) this.f17604b).lambda$setPressed$0(valueAnimator);
                return;
            default:
                ((RichMessageLayout.RichSlideshowBlock) this.f17604b).lambda$settle$0(valueAnimator);
                return;
        }
    }
}
