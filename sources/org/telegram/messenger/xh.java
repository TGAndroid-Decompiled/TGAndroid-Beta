package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.ui.Components.t81;
public final class xh implements ValueAnimator.AnimatorUpdateListener {
    public final int f21850a;
    public final Object f21851b;
    public final Object f21852c;

    public xh(int i10, Object obj, Object obj2) {
        this.f21850a = i10;
        this.f21851b = obj;
        this.f21852c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f21850a) {
            case 0:
                ((RichMessageLayout.SpoilerReveal) this.f21851b).lambda$start$0((View) this.f21852c, valueAnimator);
                return;
            case 1:
                AndroidUtilities.lambda$setNavigationBarColor$23((AndroidUtilities.IntColorCallback) this.f21851b, (Window) this.f21852c, valueAnimator);
                return;
            default:
                ((MediaController) this.f21851b).lambda$cleanupPlayer$10((t81) this.f21852c, valueAnimator);
                return;
        }
    }
}
