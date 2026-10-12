package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.ui.Components.q81;
public final class bi implements ValueAnimator.AnimatorUpdateListener {
    public final int f17195a;
    public final Object f17196b;
    public final Object f17197c;

    public bi(int i10, Object obj, Object obj2) {
        this.f17195a = i10;
        this.f17196b = obj;
        this.f17197c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f17195a) {
            case 0:
                ((RichMessageLayout.SpoilerReveal) this.f17196b).lambda$start$0((View) this.f17197c, valueAnimator);
                return;
            case 1:
                AndroidUtilities.lambda$setNavigationBarColor$23((AndroidUtilities.IntColorCallback) this.f17196b, (Window) this.f17197c, valueAnimator);
                return;
            default:
                ((MediaController) this.f17196b).lambda$cleanupPlayer$10((q81) this.f17197c, valueAnimator);
                return;
        }
    }
}
