package bi;

import android.animation.ValueAnimator;
import org.telegram.ui.nx;
public final class vd implements Runnable {
    public final int f3806a;
    public final zh.k f3807b;

    public vd(zh.k kVar, int i10) {
        this.f3806a = i10;
        this.f3807b = kVar;
    }

    @Override
    public final void run() {
        switch (this.f3806a) {
            case 0:
                zh.k kVar = this.f3807b;
                kVar.f48572w = false;
                kVar.invalidate();
                return;
            default:
                nx nxVar = this.f3807b.f48566b0;
                ValueAnimator valueAnimator = nxVar.f48609j0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                nxVar.f48610k0 = null;
                return;
        }
    }
}
