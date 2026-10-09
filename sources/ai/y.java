package ai;

import android.animation.ValueAnimator;
import org.telegram.ui.kx;
public final class y implements Runnable {
    public final int f1930a;
    public final a0 f1931b;

    public y(a0 a0Var, int i10) {
        this.f1930a = i10;
        this.f1931b = a0Var;
    }

    @Override
    public final void run() {
        switch (this.f1930a) {
            case 0:
                kx kxVar = this.f1931b.f623b0;
                ValueAnimator valueAnimator = kxVar.f674j0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                kxVar.f675k0 = null;
                return;
            default:
                a0 a0Var = this.f1931b;
                a0Var.f630w = false;
                a0Var.invalidate();
                return;
        }
    }
}
