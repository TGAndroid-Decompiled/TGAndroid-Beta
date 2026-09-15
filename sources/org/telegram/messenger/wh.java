package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.ui.Components.g71;
public final class wh implements ValueAnimator.AnimatorUpdateListener {
    public final int f17788a;
    public final Object f17789b;
    public final Object f17790c;

    public wh(int i10, Object obj, Object obj2) {
        this.f17788a = i10;
        this.f17789b = obj;
        this.f17790c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f17788a) {
            case 0:
                ((RichMessageLayout.SpoilerReveal) this.f17789b).lambda$start$0((View) this.f17790c, valueAnimator);
                return;
            case 1:
                AndroidUtilities.lambda$setNavigationBarColor$23((AndroidUtilities.IntColorCallback) this.f17789b, (Window) this.f17790c, valueAnimator);
                return;
            default:
                ((MediaController) this.f17789b).lambda$cleanupPlayer$10((g71) this.f17790c, valueAnimator);
                return;
        }
    }
}
