package defpackage;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.view.animation.LinearInterpolator;
public final class thc implements Runnable {
    public final byte a;
    public final iic b;

    public thc(iic iicVar, byte b) {
        this.a = b;
        this.b = iicVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        boolean z = true;
        iic iicVar = this.b;
        switch (b) {
            case 0:
                iicVar.u0.b();
                return;
            case 1:
                iicVar.u0.b();
                return;
            case 2:
                iicVar.u0.b();
                return;
            case 3:
                iicVar.u0.b();
                return;
            case 4:
                phc phcVar = iicVar.a0;
                phcVar.d0 = false;
                phcVar.invalidate();
                return;
            case 5:
                iicVar.q0 = iicVar.p0;
                iicVar.y();
                return;
            case 6:
                iicVar.s();
                return;
            case 7:
                int[] iArr = new int[2];
                iicVar.f0.getLocationOnScreen(iArr);
                int i = iArr[0];
                int i2 = iArr[1];
                iicVar.e.getLocationOnScreen(iArr);
                iicVar.e.setTranslationX(gm.L(42.0f) + (i - iArr[0]));
                iicVar.e.setTranslationY(gm.L(44.0f) + (i2 - iArr[1]));
                iicVar.h.getLocationOnScreen(iArr);
                iicVar.h.setTranslationX(gm.L(42.0f) + (i - iArr[0]));
                iicVar.h.setTranslationY(gm.L(44.0f) + (i2 - iArr[1]));
                iicVar.f.getLocationOnScreen(iArr);
                iicVar.f.setTranslationX(gm.L(42.0f) + (i - iArr[0]));
                iicVar.f.setTranslationY(gm.L(44.0f) + (i2 - iArr[1]));
                iicVar.n.getLocationOnScreen(iArr);
                iicVar.n.setTranslationX((((iicVar.f0.getWidth() + i) - iArr[0]) - gm.L(49.0f)) - gm.L(60.0f));
                iicVar.n.setTranslationY(gm.L(44.0f) + (i2 - iArr[1]));
                iicVar.n.setAlpha(1.0f);
                iicVar.e.setAlpha(1.0f);
                iicVar.h.setAlpha(1.0f);
                iicVar.f.setAlpha(1.0f);
                iicVar.n.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(200L).start();
                iicVar.e.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(200L).start();
                iicVar.h.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(200L).start();
                iicVar.f.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(200L).start();
                return;
            case 8:
                iicVar.u0.b();
                return;
            case 9:
                int i3 = gda.b1;
                if (i3 < 2) {
                    gda.b1 = i3 + 1;
                    SharedPreferences.Editor edit = oc7.d1().edit();
                    edit.putInt("callEncryptionHintDisplayedCount", gda.b1);
                    edit.apply();
                    iicVar.O0.setTranslationY(iicVar.O.getY() + gm.L(36.0f));
                    iicVar.O0.v();
                    return;
                }
                return;
            case 10:
                iicVar.u0.b();
                return;
            case 11:
                iicVar.u0.setAlpha(1.0f);
                iicVar.u0.invalidate();
                ValueAnimator a = iicVar.a(true);
                iicVar.I.setAlpha(0.0f);
                iicVar.J.setAlpha(0.0f);
                iicVar.O.setAlpha(0.0f);
                iicVar.Y.setAlpha(0.0f);
                iicVar.j0.setAlpha(0.0f);
                iicVar.h0.setAlpha(0.0f);
                iicVar.i0.setAlpha(0.0f);
                iicVar.L.setAlpha(0.0f);
                iicVar.M0.setAlpha(0.0f);
                iicVar.Z.c0 = true;
                gm.d3(new qhc(iicVar, a, (byte) 1), 32L);
                return;
            case 12:
                iicVar.R0 = false;
                qh2 qh2Var = iicVar.N0;
                if (qh2Var == null || !qh2Var.W) {
                    z = false;
                }
                if (iicVar.z0 && iicVar.x0 && !iicVar.C0 && !z) {
                    iicVar.K0 = System.currentTimeMillis();
                    iicVar.r(false);
                    iicVar.q0 = iicVar.p0;
                    iicVar.y();
                    return;
                }
                return;
            case 13:
                if (iicVar.p0 == 3) {
                    iicVar.E.b(true, false);
                    kkc kkcVar = iicVar.w;
                    if (!kkcVar.S) {
                        kkcVar.S = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                if (!iicVar.G0 && !iicVar.E0) {
                    iicVar.g();
                    return;
                }
                return;
        }
    }
}
