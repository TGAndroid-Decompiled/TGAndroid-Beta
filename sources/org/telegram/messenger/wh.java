package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.ui.Components.g71;
public final class wh implements ValueAnimator.AnimatorUpdateListener {
    public final int f19507a;
    public final Object f19508b;
    public final Object f19509c;

    public wh(int i10, Object obj, Object obj2) {
        this.f19507a = i10;
        this.f19508b = obj;
        this.f19509c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f19507a) {
            case 0:
                ((RichMessageLayout.SpoilerReveal) this.f19508b).lambda$start$0((View) this.f19509c, valueAnimator);
                return;
            case 1:
                AndroidUtilities.lambda$setNavigationBarColor$23((AndroidUtilities.IntColorCallback) this.f19508b, (Window) this.f19509c, valueAnimator);
                return;
            default:
                ((MediaController) this.f19508b).lambda$cleanupPlayer$10((g71) this.f19509c, valueAnimator);
                return;
        }
    }
}
