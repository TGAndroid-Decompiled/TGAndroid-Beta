package oh;

import android.animation.ValueAnimator;
import org.telegram.ui.hx;
public final class n implements Runnable {
    public final int f17474a;
    public final o f17475b;

    public n(o oVar, int i10) {
        this.f17474a = i10;
        this.f17475b = oVar;
    }

    @Override
    public final void run() {
        switch (this.f17474a) {
            case 0:
                hx hxVar = this.f17475b.V;
                ValueAnimator valueAnimator = hxVar.f17585g0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                hxVar.f17586h0 = null;
                return;
            default:
                o oVar = this.f17475b;
                oVar.f17524w = false;
                oVar.invalidate();
                return;
        }
    }
}
