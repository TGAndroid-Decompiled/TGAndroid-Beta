package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public final class yq4 implements Runnable {
    public final byte a;
    public final float b;
    public final float c;
    public final Object d;

    public yq4(Object obj, float f, float f2, byte b) {
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
                zq4 zq4Var = (zq4) obj;
                er4 er4Var = zq4Var.b;
                ValueAnimator valueAnimator = er4Var.d0;
                wq4 wq4Var = er4Var.i0;
                wq4 wq4Var2 = er4Var.h0;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    er4Var.d0.cancel();
                    er4Var.d0 = null;
                }
                AnimatorSet animatorSet = er4Var.e0;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    er4Var.e0.cancel();
                    er4Var.e0 = null;
                }
                if (Math.abs(er4Var.b.d) > 10.0f) {
                    er4Var.l();
                    return;
                }
                gl.r(er4Var.f0);
                er4Var.e0 = new AnimatorSet();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(er4Var.b.d, f2);
                ofFloat.addUpdateListener(wq4Var2);
                ofFloat.setDuration(220L);
                s33 s33Var = s33.h;
                ofFloat.setInterpolator(s33Var);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f2, 0.0f);
                ofFloat2.addUpdateListener(wq4Var2);
                ofFloat2.setStartDelay(220L);
                ofFloat2.setDuration(600L);
                OvershootInterpolator overshootInterpolator = gl.H;
                ofFloat2.setInterpolator(overshootInterpolator);
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(er4Var.b.i, f);
                ofFloat3.addUpdateListener(wq4Var);
                ofFloat3.setDuration(220L);
                ofFloat3.setInterpolator(s33Var);
                ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f, 0.0f);
                ofFloat4.addUpdateListener(wq4Var);
                ofFloat4.setStartDelay(220L);
                ofFloat4.setDuration(600L);
                ofFloat4.setInterpolator(overshootInterpolator);
                er4Var.e0.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
                er4Var.e0.addListener(new im2(zq4Var, (byte) 24));
                er4Var.e0.start();
                return;
            default:
                o39 o39Var = (o39) ((ds5) obj).b;
                if (o39Var.d1 != null && (view = o39Var.M1) != null) {
                    o39Var.k1(view, f2, f, true);
                    o39Var.d1 = null;
                    return;
                }
                return;
        }
    }
}
