package bi;

import android.animation.ValueAnimator;
import org.telegram.ui.px;
public final class s implements Runnable {
    public final int f3627a;
    public final u f3628b;

    public s(u uVar, int i10) {
        this.f3627a = i10;
        this.f3628b = uVar;
    }

    @Override
    public final void run() {
        switch (this.f3627a) {
            case 0:
                px pxVar = this.f3628b.f3765b0;
                ValueAnimator valueAnimator = pxVar.f3828j0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                pxVar.f3829k0 = null;
                return;
            default:
                u uVar = this.f3628b;
                uVar.f3771w = false;
                uVar.invalidate();
                return;
        }
    }
}
