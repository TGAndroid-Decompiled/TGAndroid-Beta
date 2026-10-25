package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.RichMessageLayout;
public final class p implements ValueAnimator.AnimatorUpdateListener {
    public final int f20910a;
    public final Object f20911b;

    public p(Object obj, int i10) {
        this.f20910a = i10;
        this.f20911b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f20910a) {
            case 0:
                AndroidUtilities.lambda$shakeView$13((View) this.f20911b, valueAnimator);
                return;
            case 1:
                RichMessageLayout.RichButton.a((RichMessageLayout.RichButton) this.f20911b, valueAnimator);
                return;
            default:
                RichMessageLayout.RichSlideshowBlock.c((RichMessageLayout.RichSlideshowBlock) this.f20911b, valueAnimator);
                return;
        }
    }
}
