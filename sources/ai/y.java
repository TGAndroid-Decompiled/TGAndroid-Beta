package ai;

import android.animation.ValueAnimator;
import org.telegram.ui.jx;
public final class y implements Runnable {
    public final int f1890a;
    public final a0 f1891b;

    public y(a0 a0Var, int i10) {
        this.f1890a = i10;
        this.f1891b = a0Var;
    }

    @Override
    public final void run() {
        switch (this.f1890a) {
            case 0:
                jx jxVar = this.f1891b.f540b0;
                ValueAnimator valueAnimator = jxVar.f607j0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                jxVar.f608k0 = null;
                return;
            default:
                a0 a0Var = this.f1891b;
                a0Var.f547w = false;
                a0Var.invalidate();
                return;
        }
    }
}
