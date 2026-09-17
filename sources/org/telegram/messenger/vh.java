package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.ui.Components.g71;
public final class vh implements ValueAnimator.AnimatorUpdateListener {
    public final int f19275a;
    public final Object f19276b;
    public final Object f19277c;

    public vh(int i10, Object obj, Object obj2) {
        this.f19275a = i10;
        this.f19276b = obj;
        this.f19277c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f19275a) {
            case 0:
                ((RichMessageLayout.SpoilerReveal) this.f19276b).lambda$start$0((View) this.f19277c, valueAnimator);
                return;
            case 1:
                AndroidUtilities.lambda$setNavigationBarColor$23((AndroidUtilities.IntColorCallback) this.f19276b, (Window) this.f19277c, valueAnimator);
                return;
            default:
                ((MediaController) this.f19276b).lambda$cleanupPlayer$10((g71) this.f19277c, valueAnimator);
                return;
        }
    }
}
