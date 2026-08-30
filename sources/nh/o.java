package nh;

import android.animation.ValueAnimator;
import org.telegram.ui.gx;
public final class o implements Runnable {
    public final int f15680a;
    public final p f15681b;

    public o(p pVar, int i10) {
        this.f15680a = i10;
        this.f15681b = pVar;
    }

    @Override
    public final void run() {
        switch (this.f15680a) {
            case 0:
                gx gxVar = this.f15681b.V;
                ValueAnimator valueAnimator = gxVar.f15765g0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                gxVar.f15766h0 = null;
                return;
            default:
                p pVar = this.f15681b;
                pVar.f15733w = false;
                pVar.invalidate();
                return;
        }
    }
}
