package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.ui.Components.t71;
public final class wh implements ValueAnimator.AnimatorUpdateListener {
    public final int f18013a;
    public final Object f18014b;
    public final Object f18015c;

    public wh(int i10, Object obj, Object obj2) {
        this.f18013a = i10;
        this.f18014b = obj;
        this.f18015c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f18013a) {
            case 0:
                ((RichMessageLayout.SpoilerReveal) this.f18014b).lambda$start$0((View) this.f18015c, valueAnimator);
                return;
            case 1:
                AndroidUtilities.lambda$setNavigationBarColor$23((AndroidUtilities.IntColorCallback) this.f18014b, (Window) this.f18015c, valueAnimator);
                return;
            default:
                ((MediaController) this.f18014b).lambda$cleanupPlayer$10((t71) this.f18015c, valueAnimator);
                return;
        }
    }
}
