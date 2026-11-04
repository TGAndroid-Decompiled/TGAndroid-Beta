package ei;

import android.animation.ValueAnimator;
import org.telegram.ui.mv;
public final class p implements Runnable {
    public final int f10739a;
    public final q f10740b;

    public p(q qVar, int i3) {
        this.f10739a = i3;
        this.f10740b = qVar;
    }

    @Override
    public final void run() {
        switch (this.f10739a) {
            case 0:
                mv mvVar = this.f10740b.f10785c0;
                ValueAnimator valueAnimator = mvVar.f10837k0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                mvVar.f10838l0 = null;
                return;
            default:
                q qVar = this.f10740b;
                qVar.f10792x = false;
                qVar.invalidate();
                return;
        }
    }
}
