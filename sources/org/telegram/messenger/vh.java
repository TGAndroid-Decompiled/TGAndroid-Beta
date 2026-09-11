package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.ui.Components.g71;
public final class vh implements ValueAnimator.AnimatorUpdateListener {
    public final int f19248a;
    public final Object f19249b;
    public final Object f19250c;

    public vh(int i10, Object obj, Object obj2) {
        this.f19248a = i10;
        this.f19249b = obj;
        this.f19250c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f19248a) {
            case 0:
                ((RichMessageLayout.SpoilerReveal) this.f19249b).lambda$start$0((View) this.f19250c, valueAnimator);
                return;
            case 1:
                AndroidUtilities.lambda$setNavigationBarColor$23((AndroidUtilities.IntColorCallback) this.f19249b, (Window) this.f19250c, valueAnimator);
                return;
            default:
                ((MediaController) this.f19249b).lambda$cleanupPlayer$10((g71) this.f19250c, valueAnimator);
                return;
        }
    }
}
