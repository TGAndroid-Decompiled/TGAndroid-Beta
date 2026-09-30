package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.ui.Components.v71;
public final class vh implements ValueAnimator.AnimatorUpdateListener {
    public final int f17802a;
    public final Object f17803b;
    public final Object f17804c;

    public vh(int i10, Object obj, Object obj2) {
        this.f17802a = i10;
        this.f17803b = obj;
        this.f17804c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f17802a) {
            case 0:
                ((RichMessageLayout.SpoilerReveal) this.f17803b).lambda$start$0((View) this.f17804c, valueAnimator);
                return;
            case 1:
                AndroidUtilities.lambda$setNavigationBarColor$23((AndroidUtilities.IntColorCallback) this.f17803b, (Window) this.f17804c, valueAnimator);
                return;
            default:
                ((MediaController) this.f17803b).lambda$cleanupPlayer$10((v71) this.f17804c, valueAnimator);
                return;
        }
    }
}
