package lg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.i0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.nk0;
import org.telegram.ui.Components.uk0;
public final class k implements Runnable {
    public final int f11904a;
    public final float f11905b;
    public final float f11906c;
    public final Object d;

    public k(Object obj, float f7, float f10, int i10) {
        this.f11904a = i10;
        this.d = obj;
        this.f11905b = f7;
        this.f11906c = f10;
    }

    @Override
    public final void run() {
        View view;
        int i10 = this.f11904a;
        float f7 = this.f11906c;
        float f10 = this.f11905b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                l lVar = (l) obj;
                q qVar = lVar.f11908b;
                ValueAnimator valueAnimator = qVar.f11923c0;
                i iVar = qVar.f11929h0;
                i iVar2 = qVar.f11928g0;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    qVar.f11923c0.cancel();
                    qVar.f11923c0 = null;
                }
                AnimatorSet animatorSet = qVar.f11924d0;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    qVar.f11924d0.cancel();
                    qVar.f11924d0 = null;
                }
                if (Math.abs(qVar.f11920b.d) > 10.0f) {
                    qVar.l();
                    return;
                }
                i0.r(qVar.f11925e0);
                qVar.f11924d0 = new AnimatorSet();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(qVar.f11920b.d, f10);
                ofFloat.addUpdateListener(iVar2);
                long j10 = 220;
                ofFloat.setDuration(j10);
                gr grVar = gr.h;
                ofFloat.setInterpolator(grVar);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f10, 0.0f);
                ofFloat2.addUpdateListener(iVar2);
                ofFloat2.setStartDelay(j10);
                ofFloat2.setDuration(600L);
                OvershootInterpolator overshootInterpolator = i0.H;
                ofFloat2.setInterpolator(overshootInterpolator);
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(qVar.f11920b.f11882i, f7);
                ofFloat3.addUpdateListener(iVar);
                ofFloat3.setDuration(j10);
                ofFloat3.setInterpolator(grVar);
                ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f7, 0.0f);
                ofFloat4.addUpdateListener(iVar);
                ofFloat4.setStartDelay(j10);
                ofFloat4.setDuration(600L);
                ofFloat4.setInterpolator(overshootInterpolator);
                qVar.f11924d0.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
                qVar.f11924d0.addListener(new bg.e(lVar, 11));
                qVar.f11924d0.start();
                return;
            default:
                uk0 uk0Var = (uk0) ((nk0) obj).f28908b;
                if (uk0Var.f30986c1 != null && (view = uk0Var.L1) != null) {
                    uk0Var.j1(view, f10, f7, true);
                    uk0Var.f30986c1 = null;
                    return;
                }
                return;
        }
    }
}
