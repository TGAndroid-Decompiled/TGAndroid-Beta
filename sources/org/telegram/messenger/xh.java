package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.ui.Components.u71;
public final class xh implements ValueAnimator.AnimatorUpdateListener {
    public final int f18063a;
    public final Object f18064b;
    public final Object f18065c;

    public xh(int i10, Object obj, Object obj2) {
        this.f18063a = i10;
        this.f18064b = obj;
        this.f18065c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f18063a) {
            case 0:
                ((RichMessageLayout.SpoilerReveal) this.f18064b).lambda$start$0((View) this.f18065c, valueAnimator);
                return;
            case 1:
                AndroidUtilities.lambda$setNavigationBarColor$23((AndroidUtilities.IntColorCallback) this.f18064b, (Window) this.f18065c, valueAnimator);
                return;
            default:
                ((MediaController) this.f18064b).lambda$cleanupPlayer$10((u71) this.f18065c, valueAnimator);
                return;
        }
    }
}
