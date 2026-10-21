package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.ui.Components.c81;
public final class sh implements ValueAnimator.AnimatorUpdateListener {
    public final int f19535a;
    public final Object f19536b;
    public final Object f19537c;

    public sh(int i10, Object obj, Object obj2) {
        this.f19535a = i10;
        this.f19536b = obj;
        this.f19537c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f19535a) {
            case 0:
                ((RichMessageLayout.SpoilerReveal) this.f19536b).lambda$start$0((View) this.f19537c, valueAnimator);
                return;
            case 1:
                AndroidUtilities.lambda$setNavigationBarColor$23((AndroidUtilities.IntColorCallback) this.f19536b, (Window) this.f19537c, valueAnimator);
                return;
            default:
                ((MediaController) this.f19536b).lambda$cleanupPlayer$10((c81) this.f19537c, valueAnimator);
                return;
        }
    }
}
