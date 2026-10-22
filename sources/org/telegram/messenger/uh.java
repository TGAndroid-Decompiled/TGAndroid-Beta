package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.ui.Components.c81;
public final class uh implements ValueAnimator.AnimatorUpdateListener {
    public final int f19702a;
    public final Object f19703b;
    public final Object f19704c;

    public uh(int i10, Object obj, Object obj2) {
        this.f19702a = i10;
        this.f19703b = obj;
        this.f19704c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f19702a) {
            case 0:
                ((RichMessageLayout.SpoilerReveal) this.f19703b).lambda$start$0((View) this.f19704c, valueAnimator);
                return;
            case 1:
                AndroidUtilities.lambda$setNavigationBarColor$23((AndroidUtilities.IntColorCallback) this.f19703b, (Window) this.f19704c, valueAnimator);
                return;
            default:
                ((MediaController) this.f19703b).lambda$cleanupPlayer$10((c81) this.f19704c, valueAnimator);
                return;
        }
    }
}
