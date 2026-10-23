package ci;

import android.animation.ValueAnimator;
import org.telegram.ui.vw;
public final class p implements Runnable {
    public final int f5642a;
    public final q f5643b;

    public p(q qVar, int i10) {
        this.f5642a = i10;
        this.f5643b = qVar;
    }

    @Override
    public final void run() {
        switch (this.f5642a) {
            case 0:
                vw vwVar = this.f5643b.f5756b0;
                ValueAnimator valueAnimator = vwVar.f5824j0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                vwVar.f5825k0 = null;
                return;
            default:
                q qVar = this.f5643b;
                qVar.f5762w = false;
                qVar.invalidate();
                return;
        }
    }
}
