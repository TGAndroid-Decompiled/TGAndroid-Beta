package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.RichMessageLayout;
public final class o implements ValueAnimator.AnimatorUpdateListener {
    public final int f17949a;
    public final Object f17950b;

    public o(Object obj, int i10) {
        this.f17949a = i10;
        this.f17950b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f17949a) {
            case 0:
                AndroidUtilities.lambda$shakeView$13((View) this.f17950b, valueAnimator);
                return;
            case 1:
                ((RichMessageLayout.RichButton) this.f17950b).lambda$setPressed$0(valueAnimator);
                return;
            default:
                ((RichMessageLayout.RichSlideshowBlock) this.f17950b).lambda$settle$0(valueAnimator);
                return;
        }
    }
}
