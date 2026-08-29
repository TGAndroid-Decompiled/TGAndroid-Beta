package dg;

import ag.m0;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import f2.y;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jr;
public final class d implements Runnable {
    public final int f5578a;
    public final float f5579b;
    public final float f5580c;
    public final Object d;

    public d(Object obj, float f9, float f10, int i10) {
        this.f5578a = i10;
        this.d = obj;
        this.f5579b = f9;
        this.f5580c = f10;
    }

    @Override
    public final void run() {
        View view;
        int i10 = this.f5578a;
        float f9 = this.f5580c;
        float f10 = this.f5579b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                e eVar = (e) obj;
                i iVar = (i) eVar.f5582b;
                ValueAnimator valueAnimator = iVar.O;
                b bVar = iVar.T;
                b bVar2 = iVar.S;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    iVar.O.cancel();
                    iVar.O = null;
                }
                AnimatorSet animatorSet = iVar.P;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    iVar.P.cancel();
                    iVar.P = null;
                }
                if (Math.abs(iVar.f5590b.d) > 10.0f) {
                    iVar.i();
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(iVar.Q);
                iVar.P = new AnimatorSet();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(iVar.f5590b.d, f10);
                ofFloat.addUpdateListener(bVar2);
                long j10 = 220;
                ofFloat.setDuration(j10);
                jr jrVar = jr.h;
                ofFloat.setInterpolator(jrVar);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f10, 0.0f);
                ofFloat2.addUpdateListener(bVar2);
                ofFloat2.setStartDelay(j10);
                ofFloat2.setDuration(600L);
                ofFloat2.setInterpolator(AndroidUtilities.overshootInterpolator);
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(iVar.f5590b.f5554g, f9);
                ofFloat3.addUpdateListener(bVar);
                ofFloat3.setDuration(j10);
                ofFloat3.setInterpolator(jrVar);
                ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f9, 0.0f);
                ofFloat4.addUpdateListener(bVar);
                ofFloat4.setStartDelay(j10);
                ofFloat4.setDuration(600L);
                ofFloat4.setInterpolator(AndroidUtilities.overshootInterpolator);
                iVar.P.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
                iVar.P.addListener(new m0(eVar, 5));
                iVar.P.start();
                return;
            default:
                jl0 jl0Var = (jl0) ((y) obj).f6512b;
                if (jl0Var.f29688a1 != null && (view = jl0Var.J1) != null) {
                    jl0Var.h1(view, f10, f9, true);
                    jl0Var.f29688a1 = null;
                    return;
                }
                return;
        }
    }
}
