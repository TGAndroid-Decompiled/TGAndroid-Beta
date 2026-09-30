package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.ui.Components.u71;
public final class vh implements ValueAnimator.AnimatorUpdateListener {
    public final int f17786a;
    public final Object f17787b;
    public final Object f17788c;

    public vh(int i10, Object obj, Object obj2) {
        this.f17786a = i10;
        this.f17787b = obj;
        this.f17788c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f17786a) {
            case 0:
                ((RichMessageLayout.SpoilerReveal) this.f17787b).lambda$start$0((View) this.f17788c, valueAnimator);
                return;
            case 1:
                AndroidUtilities.lambda$setNavigationBarColor$23((AndroidUtilities.IntColorCallback) this.f17787b, (Window) this.f17788c, valueAnimator);
                return;
            default:
                ((MediaController) this.f17787b).lambda$cleanupPlayer$10((u71) this.f17788c, valueAnimator);
                return;
        }
    }
}
