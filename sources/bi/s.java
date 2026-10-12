package bi;

import android.animation.ValueAnimator;
import org.telegram.ui.px;
public final class s implements Runnable {
    public final int f3623a;
    public final u f3624b;

    public s(u uVar, int i10) {
        this.f3623a = i10;
        this.f3624b = uVar;
    }

    @Override
    public final void run() {
        switch (this.f3623a) {
            case 0:
                px pxVar = this.f3624b.f3761b0;
                ValueAnimator valueAnimator = pxVar.f3824j0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                pxVar.f3825k0 = null;
                return;
            default:
                u uVar = this.f3624b;
                uVar.f3767w = false;
                uVar.invalidate();
                return;
        }
    }
}
