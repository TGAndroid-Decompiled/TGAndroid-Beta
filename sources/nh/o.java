package nh;

import android.animation.ValueAnimator;
import org.telegram.ui.ix;
public final class o implements Runnable {
    public final int f15660a;
    public final p f15661b;

    public o(p pVar, int i10) {
        this.f15660a = i10;
        this.f15661b = pVar;
    }

    @Override
    public final void run() {
        switch (this.f15660a) {
            case 0:
                ix ixVar = this.f15661b.V;
                ValueAnimator valueAnimator = ixVar.f15745g0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                ixVar.f15746h0 = null;
                return;
            default:
                p pVar = this.f15661b;
                pVar.f15713w = false;
                pVar.invalidate();
                return;
        }
    }
}
