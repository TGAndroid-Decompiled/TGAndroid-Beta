package jh;

import android.animation.ValueAnimator;
import org.telegram.ui.yw;

public final class n implements Runnable {

    public final int f13672a;

    public final o f13673b;

    public n(o oVar, int i10) {
        this.f13672a = i10;
        this.f13673b = oVar;
    }

    @Override
    public final void run() {
        switch (this.f13672a) {
            case 0:
                yw ywVar = this.f13673b.U;
                ValueAnimator valueAnimator = ywVar.f13781f0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                ywVar.f13782g0 = null;
                break;
            default:
                o oVar = this.f13673b;
                oVar.f13728w = false;
                oVar.invalidate();
                break;
        }
    }
}
