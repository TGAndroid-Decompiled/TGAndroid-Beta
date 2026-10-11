package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.ui.Components.l81;
public final class vh implements ValueAnimator.AnimatorUpdateListener {
    public final int f19477a;
    public final Object f19478b;
    public final Object f19479c;

    public vh(int i10, Object obj, Object obj2) {
        this.f19477a = i10;
        this.f19478b = obj;
        this.f19479c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f19477a) {
            case 0:
                ((RichMessageLayout.SpoilerReveal) this.f19478b).lambda$start$0((View) this.f19479c, valueAnimator);
                return;
            case 1:
                AndroidUtilities.lambda$setNavigationBarColor$23((AndroidUtilities.IntColorCallback) this.f19478b, (Window) this.f19479c, valueAnimator);
                return;
            default:
                ((MediaController) this.f19478b).lambda$cleanupPlayer$10((l81) this.f19479c, valueAnimator);
                return;
        }
    }
}
