package ag;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import f2.a0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.wk0;
public final class d implements Runnable {
    public final int f191a;
    public final float f192b;
    public final float f193c;
    public final Object d;

    public d(Object obj, float f10, float f11, int i9) {
        this.f191a = i9;
        this.d = obj;
        this.f192b = f10;
        this.f193c = f11;
    }

    @Override
    public final void run() {
        View view;
        int i9 = this.f191a;
        float f10 = this.f193c;
        float f11 = this.f192b;
        Object obj = this.d;
        switch (i9) {
            case 0:
                f fVar = (f) obj;
                j jVar = (j) fVar.f197b;
                ValueAnimator valueAnimator = jVar.O;
                b bVar = jVar.T;
                b bVar2 = jVar.S;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    jVar.O.cancel();
                    jVar.O = null;
                }
                AnimatorSet animatorSet = jVar.P;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    jVar.P.cancel();
                    jVar.P = null;
                }
                if (Math.abs(jVar.f205b.d) > 10.0f) {
                    jVar.i();
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(jVar.Q);
                jVar.P = new AnimatorSet();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(jVar.f205b.d, f11);
                ofFloat.addUpdateListener(bVar2);
                long j10 = 220;
                ofFloat.setDuration(j10);
                gr grVar = gr.h;
                ofFloat.setInterpolator(grVar);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f11, 0.0f);
                ofFloat2.addUpdateListener(bVar2);
                ofFloat2.setStartDelay(j10);
                ofFloat2.setDuration(600L);
                ofFloat2.setInterpolator(AndroidUtilities.overshootInterpolator);
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(jVar.f205b.f167g, f10);
                ofFloat3.addUpdateListener(bVar);
                ofFloat3.setDuration(j10);
                ofFloat3.setInterpolator(grVar);
                ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f10, 0.0f);
                ofFloat4.addUpdateListener(bVar);
                ofFloat4.setStartDelay(j10);
                ofFloat4.setDuration(600L);
                ofFloat4.setInterpolator(AndroidUtilities.overshootInterpolator);
                jVar.P.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
                jVar.P.addListener(new e(fVar, 0));
                jVar.P.start();
                return;
            default:
                wk0 wk0Var = (wk0) ((a0) obj).f5310b;
                if (wk0Var.f34239a1 != null && (view = wk0Var.J1) != null) {
                    wk0Var.h1(view, f11, f10, true);
                    wk0Var.f34239a1 = null;
                    return;
                }
                return;
        }
    }
}
