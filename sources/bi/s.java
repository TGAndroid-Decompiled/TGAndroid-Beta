package bi;

import android.animation.ValueAnimator;
import org.telegram.ui.lx;
public final class s implements Runnable {
    public final int f3679a;
    public final u f3680b;

    public s(u uVar, int i10) {
        this.f3679a = i10;
        this.f3680b = uVar;
    }

    @Override
    public final void run() {
        switch (this.f3679a) {
            case 0:
                lx lxVar = this.f3680b.f3770b0;
                ValueAnimator valueAnimator = lxVar.f3860j0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                lxVar.f3861k0 = null;
                return;
            default:
                u uVar = this.f3680b;
                uVar.f3777w = false;
                uVar.invalidate();
                return;
        }
    }
}
