package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.RichMessageLayout;
public final class o implements ValueAnimator.AnimatorUpdateListener {
    public final int f18547a;
    public final Object f18548b;

    public o(Object obj, int i10) {
        this.f18547a = i10;
        this.f18548b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f18547a) {
            case 0:
                AndroidUtilities.lambda$shakeView$13((View) this.f18548b, valueAnimator);
                return;
            case 1:
                RichMessageLayout.RichButton.a((RichMessageLayout.RichButton) this.f18548b, valueAnimator);
                return;
            default:
                RichMessageLayout.RichSlideshowBlock.c((RichMessageLayout.RichSlideshowBlock) this.f18548b, valueAnimator);
                return;
        }
    }
}
