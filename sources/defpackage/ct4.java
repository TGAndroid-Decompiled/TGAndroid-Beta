package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public final class ct4 implements Runnable {
    public final byte a;
    public final float b;
    public final float c;
    public final Object d;

    public ct4(Object obj, float f, float f2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = f;
        this.c = f2;
    }

    @Override
    public final void run() {
        View view;
        byte b = this.a;
        float f = this.c;
        float f2 = this.b;
        Object obj = this.d;
        switch (b) {
            case 0:
                dt4 dt4Var = (dt4) obj;
                it4 it4Var = dt4Var.b;
                ValueAnimator valueAnimator = it4Var.d0;
                at4 at4Var = it4Var.i0;
                at4 at4Var2 = it4Var.h0;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    it4Var.d0.cancel();
                    it4Var.d0 = null;
                }
                AnimatorSet animatorSet = it4Var.e0;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    it4Var.e0.cancel();
                    it4Var.e0 = null;
                }
                if (Math.abs(it4Var.b.d) > 10.0f) {
                    it4Var.l();
                    return;
                }
                hl.r(it4Var.f0);
                it4Var.e0 = new AnimatorSet();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(it4Var.b.d, f2);
                ofFloat.addUpdateListener(at4Var2);
                ofFloat.setDuration(220L);
                k43 k43Var = k43.h;
                ofFloat.setInterpolator(k43Var);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f2, 0.0f);
                ofFloat2.addUpdateListener(at4Var2);
                ofFloat2.setStartDelay(220L);
                ofFloat2.setDuration(600L);
                OvershootInterpolator overshootInterpolator = hl.H;
                ofFloat2.setInterpolator(overshootInterpolator);
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(it4Var.b.i, f);
                ofFloat3.addUpdateListener(at4Var);
                ofFloat3.setDuration(220L);
                ofFloat3.setInterpolator(k43Var);
                ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f, 0.0f);
                ofFloat4.addUpdateListener(at4Var);
                ofFloat4.setStartDelay(220L);
                ofFloat4.setDuration(600L);
                ofFloat4.setInterpolator(overshootInterpolator);
                it4Var.e0.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
                it4Var.e0.addListener(new cn2(dt4Var, (byte) 23));
                it4Var.e0.start();
                return;
            default:
                d79 d79Var = (d79) ((gu5) obj).b;
                if (d79Var.d1 != null && (view = d79Var.M1) != null) {
                    d79Var.l1(view, f2, f, true);
                    d79Var.d1 = null;
                    return;
                }
                return;
        }
    }
}
