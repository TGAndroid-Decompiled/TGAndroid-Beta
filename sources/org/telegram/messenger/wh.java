package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.ui.Components.g71;
public final class wh implements ValueAnimator.AnimatorUpdateListener {
    public final int f17785a;
    public final Object f17786b;
    public final Object f17787c;

    public wh(int i10, Object obj, Object obj2) {
        this.f17785a = i10;
        this.f17786b = obj;
        this.f17787c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f17785a) {
            case 0:
                ((RichMessageLayout.SpoilerReveal) this.f17786b).lambda$start$0((View) this.f17787c, valueAnimator);
                return;
            case 1:
                AndroidUtilities.lambda$setNavigationBarColor$23((AndroidUtilities.IntColorCallback) this.f17786b, (Window) this.f17787c, valueAnimator);
                return;
            default:
                ((MediaController) this.f17786b).lambda$cleanupPlayer$10((g71) this.f17787c, valueAnimator);
                return;
        }
    }
}
