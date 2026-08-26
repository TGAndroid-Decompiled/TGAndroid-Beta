package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import org.telegram.ui.Components.VideoPlayer;

public final class MediaController$$ExternalSyntheticLambda20 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public MediaController$$ExternalSyntheticLambda20(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                ((MediaController) this.f$0).lambda$cleanupPlayer$10((VideoPlayer) this.f$1, valueAnimator);
                break;
            case 1:
                ((RichMessageLayout.SpoilerReveal) this.f$0).lambda$start$0((View) this.f$1, valueAnimator);
                break;
            default:
                AndroidUtilities.lambda$setNavigationBarColor$23((AndroidUtilities.IntColorCallback) this.f$0, (Window) this.f$1, valueAnimator);
                break;
        }
    }
}
