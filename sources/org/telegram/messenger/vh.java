package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.ui.Components.f71;
public final class vh implements ValueAnimator.AnimatorUpdateListener {
    public final int f17520a;
    public final Object f17521b;
    public final Object f17522c;

    public vh(int i10, Object obj, Object obj2) {
        this.f17520a = i10;
        this.f17521b = obj;
        this.f17522c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f17520a) {
            case 0:
                ((RichMessageLayout.SpoilerReveal) this.f17521b).lambda$start$0((View) this.f17522c, valueAnimator);
                return;
            case 1:
                AndroidUtilities.lambda$setNavigationBarColor$23((AndroidUtilities.IntColorCallback) this.f17521b, (Window) this.f17522c, valueAnimator);
                return;
            default:
                ((MediaController) this.f17521b).lambda$cleanupPlayer$10((f71) this.f17522c, valueAnimator);
                return;
        }
    }
}
