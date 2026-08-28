package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.ui.Components.k61;
public final class oh implements ValueAnimator.AnimatorUpdateListener {
    public final int f21154a;
    public final Object f21155b;
    public final Object f21156c;

    public oh(int i9, Object obj, Object obj2) {
        this.f21154a = i9;
        this.f21155b = obj;
        this.f21156c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f21154a) {
            case 0:
                ((RichMessageLayout.SpoilerReveal) this.f21155b).lambda$start$0((View) this.f21156c, valueAnimator);
                return;
            case 1:
                AndroidUtilities.lambda$setNavigationBarColor$23((AndroidUtilities.IntColorCallback) this.f21155b, (Window) this.f21156c, valueAnimator);
                return;
            default:
                ((MediaController) this.f21155b).lambda$cleanupPlayer$10((k61) this.f21156c, valueAnimator);
                return;
        }
    }
}
