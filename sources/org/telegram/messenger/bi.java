package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.ui.Components.q81;
public final class bi implements ValueAnimator.AnimatorUpdateListener {
    public final int f17194a;
    public final Object f17195b;
    public final Object f17196c;

    public bi(int i10, Object obj, Object obj2) {
        this.f17194a = i10;
        this.f17195b = obj;
        this.f17196c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f17194a) {
            case 0:
                ((RichMessageLayout.SpoilerReveal) this.f17195b).lambda$start$0((View) this.f17196c, valueAnimator);
                return;
            case 1:
                AndroidUtilities.lambda$setNavigationBarColor$23((AndroidUtilities.IntColorCallback) this.f17195b, (Window) this.f17196c, valueAnimator);
                return;
            default:
                ((MediaController) this.f17195b).lambda$cleanupPlayer$10((q81) this.f17196c, valueAnimator);
                return;
        }
    }
}
