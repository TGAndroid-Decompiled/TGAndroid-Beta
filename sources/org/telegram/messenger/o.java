package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;

public final class o implements ValueAnimator.AnimatorUpdateListener {

    public final int f21112a;

    public final Object f21113b;

    public o(Object obj, int i10) {
        this.f21112a = i10;
        this.f21113b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f21112a) {
            case 0:
                AndroidUtilities.lambda$shakeView$13((View) this.f21113b, valueAnimator);
                break;
            case 1:
                ((RichMessageLayout.RichButton) this.f21113b).lambda$setPressed$0(valueAnimator);
                break;
            default:
                ((RichMessageLayout.RichSlideshowBlock) this.f21113b).lambda$settle$0(valueAnimator);
                break;
        }
    }
}
