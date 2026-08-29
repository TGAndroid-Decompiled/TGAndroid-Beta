package nh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.qz;
import org.telegram.ui.Components.x61;
public final class a6 implements Runnable {
    public final int f17385a;
    public final f6 f17386b;

    public a6(f6 f6Var, int i10) {
        this.f17385a = i10;
        this.f17386b = f6Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f17385a) {
            case 0:
                this.f17386b.r();
                return;
            case 1:
                this.f17386b.r();
                return;
            case 2:
                this.f17386b.m(0L);
                return;
            case 3:
                f6 f6Var = this.f17386b;
                a6 a6Var = f6Var.G;
                x61 x61Var = f6Var.f17651e;
                if (x61Var != null && f6Var.B != null) {
                    long o10 = x61Var.o();
                    if (f6Var.getDuration() > 1) {
                        float duration = ((float) o10) / ((float) f6Var.getDuration());
                        boolean z11 = false;
                        if (!f6Var.B.f18435i1) {
                            o7 o7Var = f6Var.d;
                            if ((duration < o7Var.Z || duration > o7Var.f18255a0) && System.currentTimeMillis() - f6Var.F > 500) {
                                f6Var.F = System.currentTimeMillis();
                                x61 x61Var2 = f6Var.f17651e;
                                long duration2 = f6Var.d.Z * ((float) f6Var.getDuration());
                                x61Var2.M(duration2, false);
                                f6Var.w(true);
                                f6Var.y(true);
                                o10 = duration2;
                                f6Var.B.setProgress(f6Var.f17651e.o());
                            }
                        }
                        if (o10 < f6Var.E) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        f6Var.w(z10);
                        if (o10 < f6Var.E) {
                            z11 = true;
                        }
                        f6Var.y(z11);
                        f6Var.B.setProgress(f6Var.f17651e.o());
                    } else {
                        f6Var.B.setProgress(f6Var.f17651e.o());
                    }
                    if (f6Var.f17651e.z()) {
                        AndroidUtilities.cancelRunOnUIThread(a6Var);
                        AndroidUtilities.runOnUIThread(a6Var, 1000.0f / AndroidUtilities.screenRefreshRate);
                    }
                    f6Var.E = o10;
                    return;
                }
                return;
            case 4:
                f6 f6Var2 = this.f17386b;
                a6 a6Var2 = f6Var2.H;
                if (f6Var2.f17676y != null && f6Var2.f17651e == null && f6Var2.f17675x == null && f6Var2.B != null && !f6Var2.j()) {
                    long o11 = f6Var2.f17676y.o();
                    o7 o7Var2 = f6Var2.d;
                    if (o7Var2 != null) {
                        float f9 = (float) o11;
                        float f10 = o7Var2.E;
                        float f11 = (float) o7Var2.C;
                        if ((f9 < f10 * f11 || f9 > o7Var2.F * f11) && System.currentTimeMillis() - f6Var2.F > 500) {
                            f6Var2.F = System.currentTimeMillis();
                            x61 x61Var3 = f6Var2.f17676y;
                            o7 o7Var3 = f6Var2.d;
                            long j10 = o7Var3.E * ((float) o7Var3.C);
                            x61Var3.M(j10, false);
                            o11 = j10;
                        }
                    }
                    f6Var2.B.setProgress(o11);
                    if (f6Var2.f17676y.z()) {
                        AndroidUtilities.cancelRunOnUIThread(a6Var2);
                        AndroidUtilities.runOnUIThread(a6Var2, 1000.0f / AndroidUtilities.screenRefreshRate);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                f6 f6Var3 = this.f17386b;
                a6 a6Var3 = f6Var3.I;
                if (f6Var3.f17675x != null && f6Var3.f17651e == null && !f6Var3.j() && f6Var3.B != null) {
                    long o12 = f6Var3.f17675x.o();
                    o7 o7Var4 = f6Var3.d;
                    if (o7Var4 != null) {
                        float f12 = (float) o12;
                        float f13 = o7Var4.f18293s0;
                        float f14 = (float) o7Var4.f18289q0;
                        if ((f12 < f13 * f14 || f12 > o7Var4.f18295t0 * f14) && System.currentTimeMillis() - f6Var3.F > 500) {
                            f6Var3.F = System.currentTimeMillis();
                            x61 x61Var4 = f6Var3.f17675x;
                            o7 o7Var5 = f6Var3.d;
                            long j11 = o7Var5.f18293s0 * ((float) o7Var5.f18289q0);
                            x61Var4.M(j11, false);
                            f6Var3.w(true);
                            o12 = j11;
                        }
                    }
                    f6Var3.B.setProgress(o12);
                    if (f6Var3.f17675x.z()) {
                        AndroidUtilities.cancelRunOnUIThread(a6Var3);
                        AndroidUtilities.runOnUIThread(a6Var3, 1000.0f / AndroidUtilities.screenRefreshRate);
                        return;
                    }
                    return;
                }
                return;
            default:
                f6 f6Var4 = this.f17386b;
                l61 l61Var = f6Var4.f17661n;
                if (l61Var != null) {
                    qz qzVar = l61Var.f30235b;
                    if (qzVar != null) {
                        qzVar.postRunnable(new nz(qzVar, 0));
                    }
                    l61Var.f30234a = null;
                    f6Var4.removeView(f6Var4.f17661n);
                    f6Var4.f17661n = null;
                    return;
                }
                return;
        }
    }
}
