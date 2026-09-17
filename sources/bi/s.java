package bi;

import android.animation.ValueAnimator;
import org.telegram.ui.lx;
public final class s implements Runnable {
    public final int f3706a;
    public final u f3707b;

    public s(u uVar, int i10) {
        this.f3706a = i10;
        this.f3707b = uVar;
    }

    @Override
    public final void run() {
        switch (this.f3706a) {
            case 0:
                lx lxVar = this.f3707b.f3797b0;
                ValueAnimator valueAnimator = lxVar.f3887j0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                lxVar.f3888k0 = null;
                return;
            default:
                u uVar = this.f3707b;
                uVar.f3804w = false;
                uVar.invalidate();
                return;
        }
    }
}
