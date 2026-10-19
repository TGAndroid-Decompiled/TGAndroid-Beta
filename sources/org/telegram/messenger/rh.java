package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.ui.Components.b81;
public final class rh implements ValueAnimator.AnimatorUpdateListener {
    public final int f19445a;
    public final Object f19446b;
    public final Object f19447c;

    public rh(int i10, Object obj, Object obj2) {
        this.f19445a = i10;
        this.f19446b = obj;
        this.f19447c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f19445a) {
            case 0:
                ((RichMessageLayout.SpoilerReveal) this.f19446b).lambda$start$0((View) this.f19447c, valueAnimator);
                return;
            case 1:
                AndroidUtilities.lambda$setNavigationBarColor$23((AndroidUtilities.IntColorCallback) this.f19446b, (Window) this.f19447c, valueAnimator);
                return;
            default:
                ((MediaController) this.f19446b).lambda$cleanupPlayer$10((b81) this.f19447c, valueAnimator);
                return;
        }
    }
}
