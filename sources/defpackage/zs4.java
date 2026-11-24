package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
public final class zs4 implements Runnable {
    public final byte a;
    public final float b;
    public final float c;
    public final Object d;

    public zs4(Object obj, float f, float f2, byte b) {
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
                at4 at4Var = (at4) obj;
                ft4 ft4Var = at4Var.b;
                ValueAnimator valueAnimator = ft4Var.d0;
                xs4 xs4Var = ft4Var.i0;
                xs4 xs4Var2 = ft4Var.h0;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    ft4Var.d0.cancel();
                    ft4Var.d0 = null;
                }
                AnimatorSet animatorSet = ft4Var.e0;
                if (animatorSet != null) {
                    animatorSet.removeAllListeners();
                    ft4Var.e0.cancel();
                    ft4Var.e0 = null;
                }
                if (Math.abs(ft4Var.b.d) > 10.0f) {
                    ft4Var.l();
                    return;
                }
                gm.r(ft4Var.f0);
                ft4Var.e0 = new AnimatorSet();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(ft4Var.b.d, f2);
                ofFloat.addUpdateListener(xs4Var2);
                ofFloat.setDuration(220L);
                d53 d53Var = d53.h;
                ofFloat.setInterpolator(d53Var);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f2, 0.0f);
                ofFloat2.addUpdateListener(xs4Var2);
                ofFloat2.setStartDelay(220L);
                ofFloat2.setDuration(600L);
                OvershootInterpolator overshootInterpolator = gm.H;
                ofFloat2.setInterpolator(overshootInterpolator);
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(ft4Var.b.i, f);
                ofFloat3.addUpdateListener(xs4Var);
                ofFloat3.setDuration(220L);
                ofFloat3.setInterpolator(d53Var);
                ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f, 0.0f);
                ofFloat4.addUpdateListener(xs4Var);
                ofFloat4.setStartDelay(220L);
                ofFloat4.setDuration(600L);
                ofFloat4.setInterpolator(overshootInterpolator);
                ft4Var.e0.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
                ft4Var.e0.addListener(new kh2(at4Var, (byte) 26));
                ft4Var.e0.start();
                return;
            default:
                r59 r59Var = (r59) ((cu5) obj).b;
                if (r59Var.d1 != null && (view = r59Var.M1) != null) {
                    r59Var.k1(view, f2, f, true);
                    r59Var.d1 = null;
                    return;
                }
                return;
        }
    }
}
