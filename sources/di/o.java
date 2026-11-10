package di;

import android.animation.ValueAnimator;
import org.telegram.ui.sv;
public final class o implements Runnable {
    public final int f9421a;
    public final p f9422b;

    public o(p pVar, int i7) {
        this.f9421a = i7;
        this.f9422b = pVar;
    }

    @Override
    public final void run() {
        switch (this.f9421a) {
            case 0:
                sv svVar = this.f9422b.f9479b0;
                ValueAnimator valueAnimator = svVar.f9545j0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                svVar.f9546k0 = null;
                return;
            default:
                p pVar = this.f9422b;
                pVar.f9487x = false;
                pVar.invalidate();
                return;
        }
    }
}
