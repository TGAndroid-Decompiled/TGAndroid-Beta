package lg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.i0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.mk0;
import org.telegram.ui.Components.tk0;
public final class k implements Runnable {
    public final int f11903a;
    public final float f11904b;
    public final float f11905c;
    public final Object d;

    public k(Object obj, float f7, float f10, int i10) {
        this.f11903a = i10;
        this.d = obj;
        this.f11904b = f7;
        this.f11905c = f10;
    }

    @Override
    public final void run() {
        View view;
        int i10 = this.f11903a;
        float f7 = this.f11905c;
        float f10 = this.f11904b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                l lVar = (l) obj;
                q qVar = lVar.f11907b;
                ValueAnimator valueAnimator = qVar.f11922c0;
                i iVar = qVar.f11928h0;
                i iVar2 = qVar.f11927g0;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    qVar.f11922c0.cancel();
                    qVar.f11922c0 = null;
                }
                AnimatorSet animatorSet = qVar.f11923d0;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    qVar.f11923d0.cancel();
                    qVar.f11923d0 = null;
                }
                if (Math.abs(qVar.f11919b.d) > 10.0f) {
                    qVar.l();
                    return;
                }
                i0.r(qVar.f11924e0);
                qVar.f11923d0 = new AnimatorSet();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(qVar.f11919b.d, f10);
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
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(qVar.f11919b.f11881i, f7);
                ofFloat3.addUpdateListener(iVar);
                ofFloat3.setDuration(j10);
                ofFloat3.setInterpolator(grVar);
                ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f7, 0.0f);
                ofFloat4.addUpdateListener(iVar);
                ofFloat4.setStartDelay(j10);
                ofFloat4.setDuration(600L);
                ofFloat4.setInterpolator(overshootInterpolator);
                qVar.f11923d0.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
                qVar.f11923d0.addListener(new bg.e(lVar, 11));
                qVar.f11923d0.start();
                return;
            default:
                tk0 tk0Var = (tk0) ((mk0) obj).f28546b;
                if (tk0Var.f30603c1 != null && (view = tk0Var.L1) != null) {
                    tk0Var.j1(view, f10, f7, true);
                    tk0Var.f30603c1 = null;
                    return;
                }
                return;
        }
    }
}
