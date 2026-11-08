package fi;

import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.py;
import org.telegram.ui.Components.sy;
import org.telegram.ui.Components.t51;
public final class w5 implements Runnable {
    public final int f13031a;
    public final y5 f13032b;

    public w5(y5 y5Var, int i7) {
        this.f13031a = i7;
        this.f13032b = y5Var;
    }

    @Override
    public final void run() {
        boolean z9;
        switch (this.f13031a) {
            case 0:
                this.f13032b.r();
                return;
            case 1:
                this.f13032b.r();
                return;
            case 2:
                this.f13032b.m(0L);
                return;
            case 3:
                y5 y5Var = this.f13032b;
                w5 w5Var = y5Var.K;
                t51 t51Var = y5Var.f13169e;
                if (t51Var != null && y5Var.F != null) {
                    long S = t51Var.S();
                    if (y5Var.getDuration() > 1) {
                        float duration = ((float) S) / ((float) y5Var.getDuration());
                        boolean z10 = false;
                        if (!y5Var.F.f12021m1) {
                            e7 e7Var = y5Var.d;
                            if ((duration < e7Var.Z || duration > e7Var.f11877a0) && System.currentTimeMillis() - y5Var.J > 500) {
                                y5Var.J = System.currentTimeMillis();
                                t51 t51Var2 = y5Var.f13169e;
                                long duration2 = y5Var.d.Z * ((float) y5Var.getDuration());
                                t51Var2.q0(duration2, false);
                                y5Var.w(true);
                                y5Var.y(true);
                                S = duration2;
                                y5Var.F.setProgress(y5Var.f13169e.S());
                            }
                        }
                        if (S < y5Var.I) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        y5Var.w(z9);
                        if (S < y5Var.I) {
                            z10 = true;
                        }
                        y5Var.y(z10);
                        y5Var.F.setProgress(y5Var.f13169e.S());
                    } else {
                        y5Var.F.setProgress(y5Var.f13169e.S());
                    }
                    if (y5Var.f13169e.d0()) {
                        org.telegram.messenger.g0.r(w5Var);
                        org.telegram.messenger.g0.i3(w5Var, 1000.0f / org.telegram.messenger.g0.f22564r);
                    }
                    y5Var.I = S;
                    return;
                }
                return;
            case 4:
                y5 y5Var2 = this.f13032b;
                w5 w5Var2 = y5Var2.L;
                if (y5Var2.D != null && y5Var2.f13169e == null && y5Var2.f13195y == null && y5Var2.F != null && !y5Var2.j()) {
                    long S2 = y5Var2.D.S();
                    e7 e7Var2 = y5Var2.d;
                    if (e7Var2 != null) {
                        float f10 = (float) S2;
                        float f11 = e7Var2.E;
                        float f12 = (float) e7Var2.C;
                        if ((f10 < f11 * f12 || f10 > e7Var2.F * f12) && System.currentTimeMillis() - y5Var2.J > 500) {
                            y5Var2.J = System.currentTimeMillis();
                            t51 t51Var3 = y5Var2.D;
                            e7 e7Var3 = y5Var2.d;
                            long j3 = e7Var3.E * ((float) e7Var3.C);
                            t51Var3.q0(j3, false);
                            S2 = j3;
                        }
                    }
                    y5Var2.F.setProgress(S2);
                    if (y5Var2.D.d0()) {
                        org.telegram.messenger.g0.r(w5Var2);
                        org.telegram.messenger.g0.i3(w5Var2, 1000.0f / org.telegram.messenger.g0.f22564r);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                y5 y5Var3 = this.f13032b;
                w5 w5Var3 = y5Var3.M;
                if (y5Var3.f13195y != null && y5Var3.f13169e == null && !y5Var3.j() && y5Var3.F != null) {
                    long S3 = y5Var3.f13195y.S();
                    e7 e7Var4 = y5Var3.d;
                    if (e7Var4 != null) {
                        float f13 = (float) S3;
                        float f14 = e7Var4.f11915s0;
                        float f15 = (float) e7Var4.f11911q0;
                        if ((f13 < f14 * f15 || f13 > e7Var4.f11917t0 * f15) && System.currentTimeMillis() - y5Var3.J > 500) {
                            y5Var3.J = System.currentTimeMillis();
                            t51 t51Var4 = y5Var3.f13195y;
                            e7 e7Var5 = y5Var3.d;
                            long j10 = e7Var5.f11915s0 * ((float) e7Var5.f11911q0);
                            t51Var4.q0(j10, false);
                            y5Var3.w(true);
                            S3 = j10;
                        }
                    }
                    y5Var3.F.setProgress(S3);
                    if (y5Var3.f13195y.d0()) {
                        org.telegram.messenger.g0.r(w5Var3);
                        org.telegram.messenger.g0.i3(w5Var3, 1000.0f / org.telegram.messenger.g0.f22564r);
                        return;
                    }
                    return;
                }
                return;
            default:
                y5 y5Var4 = this.f13032b;
                h51 h51Var = y5Var4.f13179n;
                if (h51Var != null) {
                    sy syVar = h51Var.f34116b;
                    if (syVar != null) {
                        syVar.postRunnable(new py(syVar, 0));
                    }
                    h51Var.f34115a = null;
                    y5Var4.removeView(y5Var4.f13179n);
                    y5Var4.f13179n = null;
                    return;
                }
                return;
        }
    }
}
