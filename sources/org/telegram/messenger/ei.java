package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.ui.Components.t71;
public final class ei implements ValueAnimator.AnimatorUpdateListener {
    public final int f15098a;
    public final Object f15099b;
    public final Object f15100c;

    public ei(int i10, Object obj, Object obj2) {
        this.f15098a = i10;
        this.f15099b = obj;
        this.f15100c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f15098a) {
            case 0:
                ((RichMessageLayout.SpoilerReveal) this.f15099b).lambda$start$0((View) this.f15100c, valueAnimator);
                return;
            case 1:
                AndroidUtilities.lambda$setNavigationBarColor$23((AndroidUtilities.IntColorCallback) this.f15099b, (Window) this.f15100c, valueAnimator);
                return;
            default:
                ((MediaController) this.f15099b).lambda$cleanupPlayer$10((t71) this.f15100c, valueAnimator);
                return;
        }
    }
}
