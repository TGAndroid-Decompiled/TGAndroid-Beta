package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.RichMessageLayout;
public final class o implements ValueAnimator.AnimatorUpdateListener {
    public final int f18582a;
    public final Object f18583b;

    public o(Object obj, int i10) {
        this.f18582a = i10;
        this.f18583b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f18582a) {
            case 0:
                AndroidUtilities.lambda$shakeView$13((View) this.f18583b, valueAnimator);
                return;
            case 1:
                RichMessageLayout.RichButton.a((RichMessageLayout.RichButton) this.f18583b, valueAnimator);
                return;
            default:
                RichMessageLayout.RichSlideshowBlock.c((RichMessageLayout.RichSlideshowBlock) this.f18583b, valueAnimator);
                return;
        }
    }
}
