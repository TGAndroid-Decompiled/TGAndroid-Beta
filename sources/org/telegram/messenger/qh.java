package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.ui.Components.a81;
public final class qh implements ValueAnimator.AnimatorUpdateListener {
    public final int f19363a;
    public final Object f19364b;
    public final Object f19365c;

    public qh(int i10, Object obj, Object obj2) {
        this.f19363a = i10;
        this.f19364b = obj;
        this.f19365c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f19363a) {
            case 0:
                ((RichMessageLayout.SpoilerReveal) this.f19364b).lambda$start$0((View) this.f19365c, valueAnimator);
                return;
            case 1:
                AndroidUtilities.lambda$setNavigationBarColor$23((AndroidUtilities.IntColorCallback) this.f19364b, (Window) this.f19365c, valueAnimator);
                return;
            default:
                ((MediaController) this.f19364b).lambda$cleanupPlayer$10((a81) this.f19365c, valueAnimator);
                return;
        }
    }
}
