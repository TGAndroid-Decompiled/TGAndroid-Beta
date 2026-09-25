package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.ui.Components.s71;
public final class vh implements ValueAnimator.AnimatorUpdateListener {
    public final int f17775a;
    public final Object f17776b;
    public final Object f17777c;

    public vh(int i10, Object obj, Object obj2) {
        this.f17775a = i10;
        this.f17776b = obj;
        this.f17777c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f17775a) {
            case 0:
                ((RichMessageLayout.SpoilerReveal) this.f17776b).lambda$start$0((View) this.f17777c, valueAnimator);
                return;
            case 1:
                AndroidUtilities.lambda$setNavigationBarColor$23((AndroidUtilities.IntColorCallback) this.f17776b, (Window) this.f17777c, valueAnimator);
                return;
            default:
                ((MediaController) this.f17776b).lambda$cleanupPlayer$10((s71) this.f17777c, valueAnimator);
                return;
        }
    }
}
