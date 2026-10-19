package ci;

import android.animation.ValueAnimator;
import org.telegram.ui.tw;
public final class p implements Runnable {
    public final int f5708a;
    public final q f5709b;

    public p(q qVar, int i10) {
        this.f5708a = i10;
        this.f5709b = qVar;
    }

    @Override
    public final void run() {
        switch (this.f5708a) {
            case 0:
                tw twVar = this.f5709b.f5739b0;
                ValueAnimator valueAnimator = twVar.f5879j0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                twVar.f5880k0 = null;
                return;
            default:
                q qVar = this.f5709b;
                qVar.f5745w = false;
                qVar.invalidate();
                return;
        }
    }
}
