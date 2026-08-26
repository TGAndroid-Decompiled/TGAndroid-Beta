package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;

public final class AndroidUtilities$$ExternalSyntheticLambda37 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final Object f$0;

    public AndroidUtilities$$ExternalSyntheticLambda37(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                AndroidUtilities.lambda$shakeView$13((View) this.f$0, valueAnimator);
                break;
            case 1:
                ((RichMessageLayout.RichButton) this.f$0).lambda$setPressed$0(valueAnimator);
                break;
            default:
                ((RichMessageLayout.RichSlideshowBlock) this.f$0).lambda$settle$0(valueAnimator);
                break;
        }
    }
}
