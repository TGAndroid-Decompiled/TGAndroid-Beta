package fg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import cg.l0;
import f2.y;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.sl0;
public final class d implements Runnable {
    public final int f6144a;
    public final float f6145b;
    public final float f6146c;
    public final Object d;

    public d(Object obj, float f10, float f11, int i10) {
        this.f6144a = i10;
        this.d = obj;
        this.f6145b = f10;
        this.f6146c = f11;
    }

    @Override
    public final void run() {
        View view;
        int i10 = this.f6144a;
        float f10 = this.f6146c;
        float f11 = this.f6145b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                e eVar = (e) obj;
                i iVar = (i) eVar.f6148b;
                ValueAnimator valueAnimator = iVar.P;
                b bVar = iVar.U;
                b bVar2 = iVar.T;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    iVar.P.cancel();
                    iVar.P = null;
                }
                AnimatorSet animatorSet = iVar.Q;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    iVar.Q.cancel();
                    iVar.Q = null;
                }
                if (Math.abs(iVar.f6156b.d) > 10.0f) {
                    iVar.i();
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(iVar.R);
                iVar.Q = new AnimatorSet();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(iVar.f6156b.d, f11);
                ofFloat.addUpdateListener(bVar2);
                long j10 = 220;
                ofFloat.setDuration(j10);
                nr nrVar = nr.h;
                ofFloat.setInterpolator(nrVar);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f11, 0.0f);
                ofFloat2.addUpdateListener(bVar2);
                ofFloat2.setStartDelay(j10);
                ofFloat2.setDuration(600L);
                ofFloat2.setInterpolator(AndroidUtilities.overshootInterpolator);
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(iVar.f6156b.f6121g, f10);
                ofFloat3.addUpdateListener(bVar);
                ofFloat3.setDuration(j10);
                ofFloat3.setInterpolator(nrVar);
                ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f10, 0.0f);
                ofFloat4.addUpdateListener(bVar);
                ofFloat4.setStartDelay(j10);
                ofFloat4.setDuration(600L);
                ofFloat4.setInterpolator(AndroidUtilities.overshootInterpolator);
                iVar.Q.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
                iVar.Q.addListener(new l0(eVar, 5));
                iVar.Q.start();
                return;
            default:
                sl0 sl0Var = (sl0) ((y) obj).f5862b;
                if (sl0Var.f28728b1 != null && (view = sl0Var.K1) != null) {
                    sl0Var.h1(view, f11, f10, true);
                    sl0Var.f28728b1 = null;
                    return;
                }
                return;
        }
    }
}
