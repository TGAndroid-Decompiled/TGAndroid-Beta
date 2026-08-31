package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.RichMessageLayout;
public final class o implements ValueAnimator.AnimatorUpdateListener {
    public final int f19509a;
    public final Object f19510b;

    public o(Object obj, int i10) {
        this.f19509a = i10;
        this.f19510b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f19509a) {
            case 0:
                AndroidUtilities.lambda$shakeView$13((View) this.f19510b, valueAnimator);
                return;
            case 1:
                ((RichMessageLayout.RichButton) this.f19510b).lambda$setPressed$0(valueAnimator);
                return;
            default:
                ((RichMessageLayout.RichSlideshowBlock) this.f19510b).lambda$settle$0(valueAnimator);
                return;
        }
    }
}
