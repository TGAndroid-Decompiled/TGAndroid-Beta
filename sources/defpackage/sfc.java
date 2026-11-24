package defpackage;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.view.animation.LinearInterpolator;
public final class sfc implements Runnable {
    public final byte a;
    public final hgc b;

    public sfc(hgc hgcVar, byte b) {
        this.a = b;
        this.b = hgcVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        boolean z = true;
        hgc hgcVar = this.b;
        switch (b) {
            case 0:
                hgcVar.u0.b();
                return;
            case 1:
                hgcVar.u0.b();
                return;
            case 2:
                hgcVar.u0.b();
                return;
            case 3:
                hgcVar.u0.b();
                return;
            case 4:
                pfc pfcVar = hgcVar.a0;
                pfcVar.d0 = false;
                pfcVar.invalidate();
                return;
            case 5:
                hgcVar.q0 = hgcVar.p0;
                hgcVar.y();
                return;
            case 6:
                hgcVar.s();
                return;
            case 7:
                int[] iArr = new int[2];
                hgcVar.f0.getLocationOnScreen(iArr);
                int i = iArr[0];
                int i2 = iArr[1];
                hgcVar.e.getLocationOnScreen(iArr);
                hgcVar.e.setTranslationX(gl.L(42.0f) + (i - iArr[0]));
                hgcVar.e.setTranslationY(gl.L(44.0f) + (i2 - iArr[1]));
                hgcVar.h.getLocationOnScreen(iArr);
                hgcVar.h.setTranslationX(gl.L(42.0f) + (i - iArr[0]));
                hgcVar.h.setTranslationY(gl.L(44.0f) + (i2 - iArr[1]));
                hgcVar.f.getLocationOnScreen(iArr);
                hgcVar.f.setTranslationX(gl.L(42.0f) + (i - iArr[0]));
                hgcVar.f.setTranslationY(gl.L(44.0f) + (i2 - iArr[1]));
                hgcVar.n.getLocationOnScreen(iArr);
                hgcVar.n.setTranslationX((((hgcVar.f0.getWidth() + i) - iArr[0]) - gl.L(49.0f)) - gl.L(60.0f));
                hgcVar.n.setTranslationY(gl.L(44.0f) + (i2 - iArr[1]));
                hgcVar.n.setAlpha(1.0f);
                hgcVar.e.setAlpha(1.0f);
                hgcVar.h.setAlpha(1.0f);
                hgcVar.f.setAlpha(1.0f);
                hgcVar.n.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(200L).start();
                hgcVar.e.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(200L).start();
                hgcVar.h.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(200L).start();
                hgcVar.f.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(200L).start();
                return;
            case 8:
                hgcVar.u0.b();
                return;
            case 9:
                int i3 = gba.b1;
                if (i3 < 2) {
                    gba.b1 = i3 + 1;
                    SharedPreferences.Editor edit = na7.c1().edit();
                    edit.putInt("callEncryptionHintDisplayedCount", gba.b1);
                    edit.apply();
                    hgcVar.O0.setTranslationY(hgcVar.O.getY() + gl.L(36.0f));
                    hgcVar.O0.v();
                    return;
                }
                return;
            case 10:
                hgcVar.u0.b();
                return;
            case 11:
                hgcVar.u0.setAlpha(1.0f);
                hgcVar.u0.invalidate();
                ValueAnimator a = hgcVar.a(true);
                hgcVar.I.setAlpha(0.0f);
                hgcVar.J.setAlpha(0.0f);
                hgcVar.O.setAlpha(0.0f);
                hgcVar.Y.setAlpha(0.0f);
                hgcVar.j0.setAlpha(0.0f);
                hgcVar.h0.setAlpha(0.0f);
                hgcVar.i0.setAlpha(0.0f);
                hgcVar.L.setAlpha(0.0f);
                hgcVar.M0.setAlpha(0.0f);
                hgcVar.Z.c0 = true;
                gl.d3(new l3c(hgcVar, a, (byte) 29), 32L);
                return;
            case 12:
                hgcVar.R0 = false;
                cg2 cg2Var = hgcVar.N0;
                if (cg2Var == null || !cg2Var.W) {
                    z = false;
                }
                if (hgcVar.z0 && hgcVar.x0 && !hgcVar.C0 && !z) {
                    hgcVar.K0 = System.currentTimeMillis();
                    hgcVar.r(false);
                    hgcVar.q0 = hgcVar.p0;
                    hgcVar.y();
                    return;
                }
                return;
            case 13:
                if (hgcVar.p0 == 3) {
                    hgcVar.E.b(true, false);
                    kic kicVar = hgcVar.w;
                    if (!kicVar.S) {
                        kicVar.S = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                if (!hgcVar.G0 && !hgcVar.E0) {
                    hgcVar.g();
                    return;
                }
                return;
        }
    }
}
