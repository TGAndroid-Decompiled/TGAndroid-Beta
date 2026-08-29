package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.ui.Components.x61;
public final class vh implements ValueAnimator.AnimatorUpdateListener {
    public final int f21833a;
    public final Object f21834b;
    public final Object f21835c;

    public vh(int i10, Object obj, Object obj2) {
        this.f21833a = i10;
        this.f21834b = obj;
        this.f21835c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f21833a) {
            case 0:
                ((RichMessageLayout.SpoilerReveal) this.f21834b).lambda$start$0((View) this.f21835c, valueAnimator);
                return;
            case 1:
                AndroidUtilities.lambda$setNavigationBarColor$23((AndroidUtilities.IntColorCallback) this.f21834b, (Window) this.f21835c, valueAnimator);
                return;
            default:
                ((MediaController) this.f21834b).lambda$cleanupPlayer$10((x61) this.f21835c, valueAnimator);
                return;
        }
    }
}
