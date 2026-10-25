package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.ui.Components.s81;
public final class wh implements ValueAnimator.AnimatorUpdateListener {
    public final int f21768a;
    public final Object f21769b;
    public final Object f21770c;

    public wh(int i10, Object obj, Object obj2) {
        this.f21768a = i10;
        this.f21769b = obj;
        this.f21770c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f21768a) {
            case 0:
                ((RichMessageLayout.SpoilerReveal) this.f21769b).lambda$start$0((View) this.f21770c, valueAnimator);
                return;
            case 1:
                AndroidUtilities.lambda$setNavigationBarColor$23((AndroidUtilities.IntColorCallback) this.f21769b, (Window) this.f21770c, valueAnimator);
                return;
            default:
                ((MediaController) this.f21769b).lambda$cleanupPlayer$10((s81) this.f21770c, valueAnimator);
                return;
        }
    }
}
