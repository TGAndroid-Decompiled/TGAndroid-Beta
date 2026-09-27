package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.ui.Components.u71;
public final class vh implements ValueAnimator.AnimatorUpdateListener {
    public final int f17769a;
    public final Object f17770b;
    public final Object f17771c;

    public vh(int i10, Object obj, Object obj2) {
        this.f17769a = i10;
        this.f17770b = obj;
        this.f17771c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f17769a) {
            case 0:
                ((RichMessageLayout.SpoilerReveal) this.f17770b).lambda$start$0((View) this.f17771c, valueAnimator);
                return;
            case 1:
                AndroidUtilities.lambda$setNavigationBarColor$23((AndroidUtilities.IntColorCallback) this.f17770b, (Window) this.f17771c, valueAnimator);
                return;
            default:
                ((MediaController) this.f17770b).lambda$cleanupPlayer$10((u71) this.f17771c, valueAnimator);
                return;
        }
    }
}
