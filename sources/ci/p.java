package ci;

import android.animation.ValueAnimator;
import org.telegram.ui.vw;
public final class p implements Runnable {
    public final int f5711a;
    public final q f5712b;

    public p(q qVar, int i10) {
        this.f5711a = i10;
        this.f5712b = qVar;
    }

    @Override
    public final void run() {
        switch (this.f5711a) {
            case 0:
                vw vwVar = this.f5712b.f5742b0;
                ValueAnimator valueAnimator = vwVar.f5882j0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                vwVar.f5883k0 = null;
                return;
            default:
                q qVar = this.f5712b;
                qVar.f5748w = false;
                qVar.invalidate();
                return;
        }
    }
}
