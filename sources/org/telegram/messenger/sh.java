package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import org.telegram.ui.Components.m61;

public final class sh implements ValueAnimator.AnimatorUpdateListener {

    public final int f21551a;

    public final Object f21552b;

    public final Object f21553c;

    public sh(int i10, Object obj, Object obj2) {
        this.f21551a = i10;
        this.f21552b = obj;
        this.f21553c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f21551a) {
            case 0:
                ((RichMessageLayout.SpoilerReveal) this.f21552b).lambda$start$0((View) this.f21553c, valueAnimator);
                break;
            case 1:
                AndroidUtilities.lambda$setNavigationBarColor$23((AndroidUtilities.IntColorCallback) this.f21552b, (Window) this.f21553c, valueAnimator);
                break;
            default:
                ((MediaController) this.f21552b).lambda$cleanupPlayer$10((m61) this.f21553c, valueAnimator);
                break;
        }
    }
}
