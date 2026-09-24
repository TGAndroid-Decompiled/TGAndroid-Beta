package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.ui.Components.s71;
public final class vh implements ValueAnimator.AnimatorUpdateListener {
    public final int f17760a;
    public final Object f17761b;
    public final Object f17762c;

    public vh(int i10, Object obj, Object obj2) {
        this.f17760a = i10;
        this.f17761b = obj;
        this.f17762c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f17760a) {
            case 0:
                ((RichMessageLayout.SpoilerReveal) this.f17761b).lambda$start$0((View) this.f17762c, valueAnimator);
                return;
            case 1:
                AndroidUtilities.lambda$setNavigationBarColor$23((AndroidUtilities.IntColorCallback) this.f17761b, (Window) this.f17762c, valueAnimator);
                return;
            default:
                ((MediaController) this.f17761b).lambda$cleanupPlayer$10((s71) this.f17762c, valueAnimator);
                return;
        }
    }
}
