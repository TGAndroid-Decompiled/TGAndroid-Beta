package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.RichMessageLayout;
public final class p implements ValueAnimator.AnimatorUpdateListener {
    public final int f20906a;
    public final Object f20907b;

    public p(Object obj, int i10) {
        this.f20906a = i10;
        this.f20907b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f20906a) {
            case 0:
                AndroidUtilities.lambda$shakeView$13((View) this.f20907b, valueAnimator);
                return;
            case 1:
                RichMessageLayout.RichButton.a((RichMessageLayout.RichButton) this.f20907b, valueAnimator);
                return;
            default:
                RichMessageLayout.RichSlideshowBlock.h((RichMessageLayout.RichSlideshowBlock) this.f20907b, valueAnimator);
                return;
        }
    }
}
