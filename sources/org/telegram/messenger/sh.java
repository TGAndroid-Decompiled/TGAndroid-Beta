package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.ui.Components.c81;
public final class sh implements ValueAnimator.AnimatorUpdateListener {
    public final int f19538a;
    public final Object f19539b;
    public final Object f19540c;

    public sh(int i10, Object obj, Object obj2) {
        this.f19538a = i10;
        this.f19539b = obj;
        this.f19540c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f19538a) {
            case 0:
                ((RichMessageLayout.SpoilerReveal) this.f19539b).lambda$start$0((View) this.f19540c, valueAnimator);
                return;
            case 1:
                AndroidUtilities.lambda$setNavigationBarColor$23((AndroidUtilities.IntColorCallback) this.f19539b, (Window) this.f19540c, valueAnimator);
                return;
            default:
                ((MediaController) this.f19539b).lambda$cleanupPlayer$10((c81) this.f19540c, valueAnimator);
                return;
        }
    }
}
