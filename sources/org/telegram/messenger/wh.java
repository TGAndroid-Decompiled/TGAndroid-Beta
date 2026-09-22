package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.ui.Components.v71;
public final class wh implements ValueAnimator.AnimatorUpdateListener {
    public final int f18028a;
    public final Object f18029b;
    public final Object f18030c;

    public wh(int i10, Object obj, Object obj2) {
        this.f18028a = i10;
        this.f18029b = obj;
        this.f18030c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f18028a) {
            case 0:
                ((RichMessageLayout.SpoilerReveal) this.f18029b).lambda$start$0((View) this.f18030c, valueAnimator);
                return;
            case 1:
                AndroidUtilities.lambda$setNavigationBarColor$23((AndroidUtilities.IntColorCallback) this.f18029b, (Window) this.f18030c, valueAnimator);
                return;
            default:
                ((MediaController) this.f18029b).lambda$cleanupPlayer$10((v71) this.f18030c, valueAnimator);
                return;
        }
    }
}
