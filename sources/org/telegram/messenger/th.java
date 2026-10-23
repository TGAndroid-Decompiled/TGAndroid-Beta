package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.ui.Components.c81;
public final class th implements ValueAnimator.AnimatorUpdateListener {
    public final int f19626a;
    public final Object f19627b;
    public final Object f19628c;

    public th(int i10, Object obj, Object obj2) {
        this.f19626a = i10;
        this.f19627b = obj;
        this.f19628c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f19626a) {
            case 0:
                ((RichMessageLayout.SpoilerReveal) this.f19627b).lambda$start$0((View) this.f19628c, valueAnimator);
                return;
            case 1:
                AndroidUtilities.lambda$setNavigationBarColor$23((AndroidUtilities.IntColorCallback) this.f19627b, (Window) this.f19628c, valueAnimator);
                return;
            default:
                ((MediaController) this.f19627b).lambda$cleanupPlayer$10((c81) this.f19628c, valueAnimator);
                return;
        }
    }
}
