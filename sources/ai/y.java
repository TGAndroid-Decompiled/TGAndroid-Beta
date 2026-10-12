package ai;

import android.animation.ValueAnimator;
import org.telegram.ui.mx;
public final class y implements Runnable {
    public final int f1928a;
    public final a0 f1929b;

    public y(a0 a0Var, int i10) {
        this.f1928a = i10;
        this.f1929b = a0Var;
    }

    @Override
    public final void run() {
        switch (this.f1928a) {
            case 0:
                mx mxVar = this.f1929b.f625b0;
                ValueAnimator valueAnimator = mxVar.f676j0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                mxVar.f677k0 = null;
                return;
            default:
                a0 a0Var = this.f1929b;
                a0Var.f632w = false;
                a0Var.invalidate();
                return;
        }
    }
}
