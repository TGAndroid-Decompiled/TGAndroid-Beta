package hi;

import org.telegram.ui.Components.bz;
import org.telegram.ui.Components.ez;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.y51;
public final class t5 implements Runnable {
    public final int f15378a;
    public final w5 f15379b;

    public t5(w5 w5Var, int i7) {
        this.f15378a = i7;
        this.f15379b = w5Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f15378a) {
            case 0:
                this.f15379b.r();
                return;
            case 1:
                this.f15379b.r();
                return;
            case 2:
                this.f15379b.m(0L);
                return;
            case 3:
                w5 w5Var = this.f15379b;
                t5 t5Var = w5Var.L;
                i61 i61Var = w5Var.f15601e;
                if (i61Var != null && w5Var.G != null) {
                    long S = i61Var.S();
                    if (w5Var.getDuration() > 1) {
                        float duration = ((float) S) / ((float) w5Var.getDuration());
                        boolean z11 = false;
                        if (!w5Var.G.n1) {
                            d7 d7Var = w5Var.d;
                            if ((duration < d7Var.Z || duration > d7Var.f14363a0) && System.currentTimeMillis() - w5Var.K > 500) {
                                w5Var.K = System.currentTimeMillis();
                                i61 i61Var2 = w5Var.f15601e;
                                long duration2 = w5Var.d.Z * ((float) w5Var.getDuration());
                                i61Var2.q0(duration2, false);
                                w5Var.w(true);
                                w5Var.y(true);
                                S = duration2;
                                w5Var.G.setProgress(w5Var.f15601e.S());
                            }
                        }
                        if (S < w5Var.J) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        w5Var.w(z10);
                        if (S < w5Var.J) {
                            z11 = true;
                        }
                        w5Var.y(z11);
                        w5Var.G.setProgress(w5Var.f15601e.S());
                    } else {
                        w5Var.G.setProgress(w5Var.f15601e.S());
                    }
                    if (w5Var.f15601e.d0()) {
                        org.telegram.messenger.g0.r(t5Var);
                        org.telegram.messenger.g0.h3(t5Var, 1000.0f / org.telegram.messenger.g0.f24011r);
                    }
                    w5Var.J = S;
                    return;
                }
                return;
            case 4:
                w5 w5Var2 = this.f15379b;
                t5 t5Var2 = w5Var2.M;
                if (w5Var2.E != null && w5Var2.f15601e == null && w5Var2.f15627y == null && w5Var2.G != null && !w5Var2.j()) {
                    long S2 = w5Var2.E.S();
                    d7 d7Var2 = w5Var2.d;
                    if (d7Var2 != null) {
                        float f10 = (float) S2;
                        float f11 = d7Var2.E;
                        float f12 = (float) d7Var2.C;
                        if ((f10 < f11 * f12 || f10 > d7Var2.F * f12) && System.currentTimeMillis() - w5Var2.K > 500) {
                            w5Var2.K = System.currentTimeMillis();
                            i61 i61Var3 = w5Var2.E;
                            d7 d7Var3 = w5Var2.d;
                            long j3 = d7Var3.E * ((float) d7Var3.C);
                            i61Var3.q0(j3, false);
                            S2 = j3;
                        }
                    }
                    w5Var2.G.setProgress(S2);
                    if (w5Var2.E.d0()) {
                        org.telegram.messenger.g0.r(t5Var2);
                        org.telegram.messenger.g0.h3(t5Var2, 1000.0f / org.telegram.messenger.g0.f24011r);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                w5 w5Var3 = this.f15379b;
                t5 t5Var3 = w5Var3.N;
                if (w5Var3.f15627y != null && w5Var3.f15601e == null && !w5Var3.j() && w5Var3.G != null) {
                    long S3 = w5Var3.f15627y.S();
                    d7 d7Var4 = w5Var3.d;
                    if (d7Var4 != null) {
                        float f13 = (float) S3;
                        float f14 = d7Var4.f14401s0;
                        float f15 = (float) d7Var4.f14397q0;
                        if ((f13 < f14 * f15 || f13 > d7Var4.f14403t0 * f15) && System.currentTimeMillis() - w5Var3.K > 500) {
                            w5Var3.K = System.currentTimeMillis();
                            i61 i61Var4 = w5Var3.f15627y;
                            d7 d7Var5 = w5Var3.d;
                            long j10 = d7Var5.f14401s0 * ((float) d7Var5.f14397q0);
                            i61Var4.q0(j10, false);
                            w5Var3.w(true);
                            S3 = j10;
                        }
                    }
                    w5Var3.G.setProgress(S3);
                    if (w5Var3.f15627y.d0()) {
                        org.telegram.messenger.g0.r(t5Var3);
                        org.telegram.messenger.g0.h3(t5Var3, 1000.0f / org.telegram.messenger.g0.f24011r);
                        return;
                    }
                    return;
                }
                return;
            default:
                w5 w5Var4 = this.f15379b;
                y51 y51Var = w5Var4.f15611n;
                if (y51Var != null) {
                    ez ezVar = y51Var.f42300b;
                    if (ezVar != null) {
                        ezVar.postRunnable(new bz(ezVar, 0));
                    }
                    y51Var.f42299a = null;
                    w5Var4.removeView(w5Var4.f15611n);
                    w5Var4.f15611n = null;
                    return;
                }
                return;
        }
    }
}
