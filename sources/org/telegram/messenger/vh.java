package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.ui.Components.m81;
public final class vh implements ValueAnimator.AnimatorUpdateListener {
    public final int f19441a;
    public final Object f19442b;
    public final Object f19443c;

    public vh(int i10, Object obj, Object obj2) {
        this.f19441a = i10;
        this.f19442b = obj;
        this.f19443c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f19441a) {
            case 0:
                ((RichMessageLayout.SpoilerReveal) this.f19442b).lambda$start$0((View) this.f19443c, valueAnimator);
                return;
            case 1:
                AndroidUtilities.lambda$setNavigationBarColor$23((AndroidUtilities.IntColorCallback) this.f19442b, (Window) this.f19443c, valueAnimator);
                return;
            default:
                ((MediaController) this.f19442b).lambda$cleanupPlayer$10((m81) this.f19443c, valueAnimator);
                return;
        }
    }
}
