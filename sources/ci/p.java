package ci;

import android.animation.ValueAnimator;
import org.telegram.ui.tw;
public final class p implements Runnable {
    public final int f5710a;
    public final q f5711b;

    public p(q qVar, int i10) {
        this.f5710a = i10;
        this.f5711b = qVar;
    }

    @Override
    public final void run() {
        switch (this.f5710a) {
            case 0:
                tw twVar = this.f5711b.f5741b0;
                ValueAnimator valueAnimator = twVar.f5881j0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                twVar.f5882k0 = null;
                return;
            default:
                q qVar = this.f5711b;
                qVar.f5747w = false;
                qVar.invalidate();
                return;
        }
    }
}
