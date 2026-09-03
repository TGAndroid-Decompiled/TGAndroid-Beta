package oh;

import android.animation.ValueAnimator;
import org.telegram.ui.hx;
public final class n implements Runnable {
    public final int f17476a;
    public final o f17477b;

    public n(o oVar, int i10) {
        this.f17476a = i10;
        this.f17477b = oVar;
    }

    @Override
    public final void run() {
        switch (this.f17476a) {
            case 0:
                hx hxVar = this.f17477b.V;
                ValueAnimator valueAnimator = hxVar.f17587g0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                hxVar.f17588h0 = null;
                return;
            default:
                o oVar = this.f17477b;
                oVar.f17526w = false;
                oVar.invalidate();
                return;
        }
    }
}
