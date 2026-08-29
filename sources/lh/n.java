package lh;

import android.animation.ValueAnimator;
import org.telegram.ui.xw;
public final class n implements Runnable {
    public final int f15947a;
    public final o f15948b;

    public n(o oVar, int i10) {
        this.f15947a = i10;
        this.f15948b = oVar;
    }

    @Override
    public final void run() {
        switch (this.f15947a) {
            case 0:
                xw xwVar = this.f15948b.U;
                ValueAnimator valueAnimator = xwVar.f16052f0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                xwVar.f16053g0 = null;
                return;
            default:
                o oVar = this.f15948b;
                oVar.f16003w = false;
                oVar.invalidate();
                return;
        }
    }
}
