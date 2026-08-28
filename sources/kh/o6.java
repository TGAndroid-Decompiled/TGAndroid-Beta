package kh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ez;
import org.telegram.ui.Components.hz;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.y51;
public final class o6 implements Runnable {
    public final int f15797a;
    public final r6 f15798b;

    public o6(r6 r6Var, int i9) {
        this.f15797a = i9;
        this.f15798b = r6Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f15797a) {
            case 0:
                this.f15798b.r();
                return;
            case 1:
                this.f15798b.r();
                return;
            case 2:
                this.f15798b.m(0L);
                return;
            case 3:
                r6 r6Var = this.f15798b;
                o6 o6Var = r6Var.G;
                k61 k61Var = r6Var.f15936e;
                if (k61Var != null && r6Var.B != null) {
                    long o6 = k61Var.o();
                    if (r6Var.getDuration() > 1) {
                        float duration = ((float) o6) / ((float) r6Var.getDuration());
                        boolean z11 = false;
                        if (!r6Var.B.f15348i1) {
                            a8 a8Var = r6Var.d;
                            if ((duration < a8Var.Z || duration > a8Var.f14902a0) && System.currentTimeMillis() - r6Var.F > 500) {
                                r6Var.F = System.currentTimeMillis();
                                k61 k61Var2 = r6Var.f15936e;
                                long duration2 = r6Var.d.Z * ((float) r6Var.getDuration());
                                k61Var2.M(duration2, false);
                                r6Var.w(true);
                                r6Var.y(true);
                                o6 = duration2;
                                r6Var.B.setProgress(r6Var.f15936e.o());
                            }
                        }
                        if (o6 < r6Var.E) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        r6Var.w(z10);
                        if (o6 < r6Var.E) {
                            z11 = true;
                        }
                        r6Var.y(z11);
                        r6Var.B.setProgress(r6Var.f15936e.o());
                    } else {
                        r6Var.B.setProgress(r6Var.f15936e.o());
                    }
                    if (r6Var.f15936e.z()) {
                        AndroidUtilities.cancelRunOnUIThread(o6Var);
                        AndroidUtilities.runOnUIThread(o6Var, 1000.0f / AndroidUtilities.screenRefreshRate);
                    }
                    r6Var.E = o6;
                    return;
                }
                return;
            case 4:
                r6 r6Var2 = this.f15798b;
                o6 o6Var2 = r6Var2.H;
                if (r6Var2.f15961y != null && r6Var2.f15936e == null && r6Var2.f15960x == null && r6Var2.B != null && !r6Var2.j()) {
                    long o9 = r6Var2.f15961y.o();
                    a8 a8Var2 = r6Var2.d;
                    if (a8Var2 != null) {
                        float f10 = (float) o9;
                        float f11 = a8Var2.E;
                        float f12 = (float) a8Var2.C;
                        if ((f10 < f11 * f12 || f10 > a8Var2.F * f12) && System.currentTimeMillis() - r6Var2.F > 500) {
                            r6Var2.F = System.currentTimeMillis();
                            k61 k61Var3 = r6Var2.f15961y;
                            a8 a8Var3 = r6Var2.d;
                            long j10 = a8Var3.E * ((float) a8Var3.C);
                            k61Var3.M(j10, false);
                            o9 = j10;
                        }
                    }
                    r6Var2.B.setProgress(o9);
                    if (r6Var2.f15961y.z()) {
                        AndroidUtilities.cancelRunOnUIThread(o6Var2);
                        AndroidUtilities.runOnUIThread(o6Var2, 1000.0f / AndroidUtilities.screenRefreshRate);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                r6 r6Var3 = this.f15798b;
                o6 o6Var3 = r6Var3.I;
                if (r6Var3.f15960x != null && r6Var3.f15936e == null && !r6Var3.j() && r6Var3.B != null) {
                    long o10 = r6Var3.f15960x.o();
                    a8 a8Var4 = r6Var3.d;
                    if (a8Var4 != null) {
                        float f13 = (float) o10;
                        float f14 = a8Var4.f14940s0;
                        float f15 = (float) a8Var4.f14936q0;
                        if ((f13 < f14 * f15 || f13 > a8Var4.f14942t0 * f15) && System.currentTimeMillis() - r6Var3.F > 500) {
                            r6Var3.F = System.currentTimeMillis();
                            k61 k61Var4 = r6Var3.f15960x;
                            a8 a8Var5 = r6Var3.d;
                            long j11 = a8Var5.f14940s0 * ((float) a8Var5.f14936q0);
                            k61Var4.M(j11, false);
                            r6Var3.w(true);
                            o10 = j11;
                        }
                    }
                    r6Var3.B.setProgress(o10);
                    if (r6Var3.f15960x.z()) {
                        AndroidUtilities.cancelRunOnUIThread(o6Var3);
                        AndroidUtilities.runOnUIThread(o6Var3, 1000.0f / AndroidUtilities.screenRefreshRate);
                        return;
                    }
                    return;
                }
                return;
            default:
                r6 r6Var4 = this.f15798b;
                y51 y51Var = r6Var4.f15946n;
                if (y51Var != null) {
                    hz hzVar = y51Var.f34862b;
                    if (hzVar != null) {
                        hzVar.postRunnable(new ez(hzVar, 0));
                    }
                    y51Var.f34861a = null;
                    r6Var4.removeView(r6Var4.f15946n);
                    r6Var4.f15946n = null;
                    return;
                }
                return;
        }
    }
}
