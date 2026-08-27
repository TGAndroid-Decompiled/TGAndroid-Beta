package bg;

import ag.r1;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import f2.z;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.zk0;

public final class d implements Runnable {

    public final int f2117a;

    public final float f2118b;

    public final float f2119c;
    public final Object d;

    public d(Object obj, float f10, float f11, int i10) {
        this.f2117a = i10;
        this.d = obj;
        this.f2118b = f10;
        this.f2119c = f11;
    }

    @Override
    public final void run() {
        View view;
        int i10 = this.f2117a;
        float f10 = this.f2119c;
        float f11 = this.f2118b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                e eVar = (e) obj;
                i iVar = (i) eVar.f2121b;
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
                if (Math.abs(iVar.f2129b.d) <= 10.0f) {
                    AndroidUtilities.cancelRunOnUIThread(iVar.Q);
                    iVar.P = new AnimatorSet();
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(iVar.f2129b.d, f11);
                    valueAnimatorOfFloat.addUpdateListener(bVar2);
                    long j10 = 220;
                    valueAnimatorOfFloat.setDuration(j10);
                    er erVar = er.h;
                    valueAnimatorOfFloat.setInterpolator(erVar);
                    ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(f11, 0.0f);
                    valueAnimatorOfFloat2.addUpdateListener(bVar2);
                    valueAnimatorOfFloat2.setStartDelay(j10);
                    valueAnimatorOfFloat2.setDuration(600L);
                    valueAnimatorOfFloat2.setInterpolator(AndroidUtilities.overshootInterpolator);
                    ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(iVar.f2129b.f2093g, f10);
                    valueAnimatorOfFloat3.addUpdateListener(bVar);
                    valueAnimatorOfFloat3.setDuration(j10);
                    valueAnimatorOfFloat3.setInterpolator(erVar);
                    ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(f10, 0.0f);
                    valueAnimatorOfFloat4.addUpdateListener(bVar);
                    valueAnimatorOfFloat4.setStartDelay(j10);
                    valueAnimatorOfFloat4.setDuration(600L);
                    valueAnimatorOfFloat4.setInterpolator(AndroidUtilities.overshootInterpolator);
                    iVar.P.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2, valueAnimatorOfFloat3, valueAnimatorOfFloat4);
                    iVar.P.addListener(new r1(eVar, 2));
                    iVar.P.start();
                } else {
                    iVar.i();
                }
                break;
            default:
                zk0 zk0Var = (zk0) ((z) obj).f5868b;
                if (zk0Var.f35256a1 != null && (view = zk0Var.J1) != null) {
                    zk0Var.h1(view, f11, f10, true);
                    zk0Var.f35256a1 = null;
                    break;
                }
                break;
        }
    }
}
