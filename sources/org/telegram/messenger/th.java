package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.ui.Components.j81;
public final class th implements ValueAnimator.AnimatorUpdateListener {
    public final int f19691a;
    public final Object f19692b;
    public final Object f19693c;

    public th(int i10, Object obj, Object obj2) {
        this.f19691a = i10;
        this.f19692b = obj;
        this.f19693c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f19691a) {
            case 0:
                ((RichMessageLayout.SpoilerReveal) this.f19692b).lambda$start$0((View) this.f19693c, valueAnimator);
                return;
            case 1:
                AndroidUtilities.lambda$setNavigationBarColor$23((AndroidUtilities.IntColorCallback) this.f19692b, (Window) this.f19693c, valueAnimator);
                return;
            default:
                ((MediaController) this.f19692b).lambda$cleanupPlayer$10((j81) this.f19693c, valueAnimator);
                return;
        }
    }
}
