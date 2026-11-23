package hi;

import org.telegram.ui.Components.bz;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.yy;
public final class d6 implements Runnable {
    public final int f14314a;
    public final f6 f14315b;

    public d6(f6 f6Var, int i7) {
        this.f14314a = i7;
        this.f14315b = f6Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f14314a) {
            case 0:
                this.f14315b.r();
                return;
            case 1:
                this.f14315b.m(0L);
                return;
            case 2:
                f6 f6Var = this.f14315b;
                d6 d6Var = f6Var.L;
                h61 h61Var = f6Var.f14451e;
                if (h61Var != null && f6Var.G != null) {
                    long S = h61Var.S();
                    if (f6Var.getDuration() > 1) {
                        float duration = ((float) S) / ((float) f6Var.getDuration());
                        boolean z11 = false;
                        if (!f6Var.G.n1) {
                            x7 x7Var = f6Var.d;
                            if ((duration < x7Var.Z || duration > x7Var.f15734a0) && System.currentTimeMillis() - f6Var.K > 500) {
                                f6Var.K = System.currentTimeMillis();
                                h61 h61Var2 = f6Var.f14451e;
                                long duration2 = f6Var.d.Z * ((float) f6Var.getDuration());
                                h61Var2.q0(duration2, false);
                                f6Var.w(true);
                                f6Var.y(true);
                                S = duration2;
                                f6Var.G.setProgress(f6Var.f14451e.S());
                            }
                        }
                        if (S < f6Var.J) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        f6Var.w(z10);
                        if (S < f6Var.J) {
                            z11 = true;
                        }
                        f6Var.y(z11);
                        f6Var.G.setProgress(f6Var.f14451e.S());
                    } else {
                        f6Var.G.setProgress(f6Var.f14451e.S());
                    }
                    if (f6Var.f14451e.d0()) {
                        org.telegram.messenger.g0.r(d6Var);
                        org.telegram.messenger.g0.h3(d6Var, 1000.0f / org.telegram.messenger.g0.f24227r);
                    }
                    f6Var.J = S;
                    return;
                }
                return;
            case 3:
                f6 f6Var2 = this.f14315b;
                d6 d6Var2 = f6Var2.M;
                if (f6Var2.E != null && f6Var2.f14451e == null && f6Var2.f14477y == null && f6Var2.G != null && !f6Var2.j()) {
                    long S2 = f6Var2.E.S();
                    x7 x7Var2 = f6Var2.d;
                    if (x7Var2 != null) {
                        float f10 = (float) S2;
                        float f11 = x7Var2.E;
                        float f12 = (float) x7Var2.C;
                        if ((f10 < f11 * f12 || f10 > x7Var2.F * f12) && System.currentTimeMillis() - f6Var2.K > 500) {
                            f6Var2.K = System.currentTimeMillis();
                            h61 h61Var3 = f6Var2.E;
                            x7 x7Var3 = f6Var2.d;
                            long j3 = x7Var3.E * ((float) x7Var3.C);
                            h61Var3.q0(j3, false);
                            S2 = j3;
                        }
                    }
                    f6Var2.G.setProgress(S2);
                    if (f6Var2.E.d0()) {
                        org.telegram.messenger.g0.r(d6Var2);
                        org.telegram.messenger.g0.h3(d6Var2, 1000.0f / org.telegram.messenger.g0.f24227r);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                f6 f6Var3 = this.f14315b;
                d6 d6Var3 = f6Var3.N;
                if (f6Var3.f14477y != null && f6Var3.f14451e == null && !f6Var3.j() && f6Var3.G != null) {
                    long S3 = f6Var3.f14477y.S();
                    x7 x7Var4 = f6Var3.d;
                    if (x7Var4 != null) {
                        float f13 = (float) S3;
                        float f14 = x7Var4.f15772s0;
                        float f15 = (float) x7Var4.f15768q0;
                        if ((f13 < f14 * f15 || f13 > x7Var4.f15774t0 * f15) && System.currentTimeMillis() - f6Var3.K > 500) {
                            f6Var3.K = System.currentTimeMillis();
                            h61 h61Var4 = f6Var3.f14477y;
                            x7 x7Var5 = f6Var3.d;
                            long j10 = x7Var5.f15772s0 * ((float) x7Var5.f15768q0);
                            h61Var4.q0(j10, false);
                            f6Var3.w(true);
                            S3 = j10;
                        }
                    }
                    f6Var3.G.setProgress(S3);
                    if (f6Var3.f14477y.d0()) {
                        org.telegram.messenger.g0.r(d6Var3);
                        org.telegram.messenger.g0.h3(d6Var3, 1000.0f / org.telegram.messenger.g0.f24227r);
                        return;
                    }
                    return;
                }
                return;
            default:
                f6 f6Var4 = this.f14315b;
                x51 x51Var = f6Var4.f14461n;
                if (x51Var != null) {
                    bz bzVar = x51Var.f41850b;
                    if (bzVar != null) {
                        bzVar.postRunnable(new yy(bzVar, 0));
                    }
                    x51Var.f41849a = null;
                    f6Var4.removeView(f6Var4.f14461n);
                    f6Var4.f14461n = null;
                    return;
                }
                return;
        }
    }
}
