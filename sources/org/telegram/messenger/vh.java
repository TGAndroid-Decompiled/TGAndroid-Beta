package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.ui.Components.k81;
public final class vh implements ValueAnimator.AnimatorUpdateListener {
    public final int f19440a;
    public final Object f19441b;
    public final Object f19442c;

    public vh(int i10, Object obj, Object obj2) {
        this.f19440a = i10;
        this.f19441b = obj;
        this.f19442c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f19440a) {
            case 0:
                ((RichMessageLayout.SpoilerReveal) this.f19441b).lambda$start$0((View) this.f19442c, valueAnimator);
                return;
            case 1:
                AndroidUtilities.lambda$setNavigationBarColor$23((AndroidUtilities.IntColorCallback) this.f19441b, (Window) this.f19442c, valueAnimator);
                return;
            default:
                ((MediaController) this.f19441b).lambda$cleanupPlayer$10((k81) this.f19442c, valueAnimator);
                return;
        }
    }
}
