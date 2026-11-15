package hi;

import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.ty;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.wy;
public final class v5 implements Runnable {
    public final int f15218a;
    public final x5 f15219b;

    public v5(x5 x5Var, int i7) {
        this.f15218a = i7;
        this.f15219b = x5Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f15218a) {
            case 0:
                this.f15219b.r();
                return;
            case 1:
                this.f15219b.r();
                return;
            case 2:
                this.f15219b.m(0L);
                return;
            case 3:
                x5 x5Var = this.f15219b;
                v5 v5Var = x5Var.L;
                u51 u51Var = x5Var.f15345e;
                if (u51Var != null && x5Var.G != null) {
                    long S = u51Var.S();
                    if (x5Var.getDuration() > 1) {
                        float duration = ((float) S) / ((float) x5Var.getDuration());
                        boolean z11 = false;
                        if (!x5Var.G.n1) {
                            d7 d7Var = x5Var.d;
                            if ((duration < d7Var.Z || duration > d7Var.f14124a0) && System.currentTimeMillis() - x5Var.K > 500) {
                                x5Var.K = System.currentTimeMillis();
                                u51 u51Var2 = x5Var.f15345e;
                                long duration2 = x5Var.d.Z * ((float) x5Var.getDuration());
                                u51Var2.q0(duration2, false);
                                x5Var.w(true);
                                x5Var.y(true);
                                S = duration2;
                                x5Var.G.setProgress(x5Var.f15345e.S());
                            }
                        }
                        if (S < x5Var.J) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        x5Var.w(z10);
                        if (S < x5Var.J) {
                            z11 = true;
                        }
                        x5Var.y(z11);
                        x5Var.G.setProgress(x5Var.f15345e.S());
                    } else {
                        x5Var.G.setProgress(x5Var.f15345e.S());
                    }
                    if (x5Var.f15345e.d0()) {
                        org.telegram.messenger.g0.r(v5Var);
                        org.telegram.messenger.g0.i3(v5Var, 1000.0f / org.telegram.messenger.g0.f23612r);
                    }
                    x5Var.J = S;
                    return;
                }
                return;
            case 4:
                x5 x5Var2 = this.f15219b;
                v5 v5Var2 = x5Var2.M;
                if (x5Var2.E != null && x5Var2.f15345e == null && x5Var2.f15371y == null && x5Var2.G != null && !x5Var2.j()) {
                    long S2 = x5Var2.E.S();
                    d7 d7Var2 = x5Var2.d;
                    if (d7Var2 != null) {
                        float f10 = (float) S2;
                        float f11 = d7Var2.E;
                        float f12 = (float) d7Var2.C;
                        if ((f10 < f11 * f12 || f10 > d7Var2.F * f12) && System.currentTimeMillis() - x5Var2.K > 500) {
                            x5Var2.K = System.currentTimeMillis();
                            u51 u51Var3 = x5Var2.E;
                            d7 d7Var3 = x5Var2.d;
                            long j3 = d7Var3.E * ((float) d7Var3.C);
                            u51Var3.q0(j3, false);
                            S2 = j3;
                        }
                    }
                    x5Var2.G.setProgress(S2);
                    if (x5Var2.E.d0()) {
                        org.telegram.messenger.g0.r(v5Var2);
                        org.telegram.messenger.g0.i3(v5Var2, 1000.0f / org.telegram.messenger.g0.f23612r);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                x5 x5Var3 = this.f15219b;
                v5 v5Var3 = x5Var3.N;
                if (x5Var3.f15371y != null && x5Var3.f15345e == null && !x5Var3.j() && x5Var3.G != null) {
                    long S3 = x5Var3.f15371y.S();
                    d7 d7Var4 = x5Var3.d;
                    if (d7Var4 != null) {
                        float f13 = (float) S3;
                        float f14 = d7Var4.f14162s0;
                        float f15 = (float) d7Var4.f14158q0;
                        if ((f13 < f14 * f15 || f13 > d7Var4.f14164t0 * f15) && System.currentTimeMillis() - x5Var3.K > 500) {
                            x5Var3.K = System.currentTimeMillis();
                            u51 u51Var4 = x5Var3.f15371y;
                            d7 d7Var5 = x5Var3.d;
                            long j10 = d7Var5.f14162s0 * ((float) d7Var5.f14158q0);
                            u51Var4.q0(j10, false);
                            x5Var3.w(true);
                            S3 = j10;
                        }
                    }
                    x5Var3.G.setProgress(S3);
                    if (x5Var3.f15371y.d0()) {
                        org.telegram.messenger.g0.r(v5Var3);
                        org.telegram.messenger.g0.i3(v5Var3, 1000.0f / org.telegram.messenger.g0.f23612r);
                        return;
                    }
                    return;
                }
                return;
            default:
                x5 x5Var4 = this.f15219b;
                k51 k51Var = x5Var4.f15355n;
                if (k51Var != null) {
                    wy wyVar = k51Var.f36280b;
                    if (wyVar != null) {
                        wyVar.postRunnable(new ty(wyVar, 0));
                    }
                    k51Var.f36279a = null;
                    x5Var4.removeView(x5Var4.f15355n);
                    x5Var4.f15355n = null;
                    return;
                }
                return;
        }
    }
}
