package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.ui.Components.j81;
public final class uh implements ValueAnimator.AnimatorUpdateListener {
    public final int f19767a;
    public final Object f19768b;
    public final Object f19769c;

    public uh(int i10, Object obj, Object obj2) {
        this.f19767a = i10;
        this.f19768b = obj;
        this.f19769c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f19767a) {
            case 0:
                ((RichMessageLayout.SpoilerReveal) this.f19768b).lambda$start$0((View) this.f19769c, valueAnimator);
                return;
            case 1:
                AndroidUtilities.lambda$setNavigationBarColor$23((AndroidUtilities.IntColorCallback) this.f19768b, (Window) this.f19769c, valueAnimator);
                return;
            default:
                ((MediaController) this.f19768b).lambda$cleanupPlayer$10((j81) this.f19769c, valueAnimator);
                return;
        }
    }
}
