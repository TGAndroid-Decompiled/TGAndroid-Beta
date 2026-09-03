package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.RichMessageLayout;
public final class o implements ValueAnimator.AnimatorUpdateListener {
    public final int f19511a;
    public final Object f19512b;

    public o(Object obj, int i10) {
        this.f19511a = i10;
        this.f19512b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f19511a) {
            case 0:
                AndroidUtilities.lambda$shakeView$13((View) this.f19512b, valueAnimator);
                return;
            case 1:
                ((RichMessageLayout.RichButton) this.f19512b).lambda$setPressed$0(valueAnimator);
                return;
            default:
                ((RichMessageLayout.RichSlideshowBlock) this.f19512b).lambda$settle$0(valueAnimator);
                return;
        }
    }
}
