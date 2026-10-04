package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.ui.Components.d81;
public final class vh implements ValueAnimator.AnimatorUpdateListener {
    public final int f19428a;
    public final Object f19429b;
    public final Object f19430c;

    public vh(int i10, Object obj, Object obj2) {
        this.f19428a = i10;
        this.f19429b = obj;
        this.f19430c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f19428a) {
            case 0:
                ((RichMessageLayout.SpoilerReveal) this.f19429b).lambda$start$0((View) this.f19430c, valueAnimator);
                return;
            case 1:
                AndroidUtilities.lambda$setNavigationBarColor$23((AndroidUtilities.IntColorCallback) this.f19429b, (Window) this.f19430c, valueAnimator);
                return;
            default:
                ((MediaController) this.f19429b).lambda$cleanupPlayer$10((d81) this.f19430c, valueAnimator);
                return;
        }
    }
}
