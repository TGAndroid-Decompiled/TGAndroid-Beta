package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.ui.Components.a81;
public final class rh implements ValueAnimator.AnimatorUpdateListener {
    public final int f19442a;
    public final Object f19443b;
    public final Object f19444c;

    public rh(int i10, Object obj, Object obj2) {
        this.f19442a = i10;
        this.f19443b = obj;
        this.f19444c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f19442a) {
            case 0:
                ((RichMessageLayout.SpoilerReveal) this.f19443b).lambda$start$0((View) this.f19444c, valueAnimator);
                return;
            case 1:
                AndroidUtilities.lambda$setNavigationBarColor$23((AndroidUtilities.IntColorCallback) this.f19443b, (Window) this.f19444c, valueAnimator);
                return;
            default:
                ((MediaController) this.f19443b).lambda$cleanupPlayer$10((a81) this.f19444c, valueAnimator);
                return;
        }
    }
}
