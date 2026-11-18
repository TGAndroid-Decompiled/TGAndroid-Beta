package hi;

import org.telegram.ui.Components.cz;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.zy;
public final class t5 implements Runnable {
    public final int f15414a;
    public final w5 f15415b;

    public t5(w5 w5Var, int i7) {
        this.f15414a = i7;
        this.f15415b = w5Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f15414a) {
            case 0:
                this.f15415b.r();
                return;
            case 1:
                this.f15415b.r();
                return;
            case 2:
                this.f15415b.m(0L);
                return;
            case 3:
                w5 w5Var = this.f15415b;
                t5 t5Var = w5Var.L;
                f61 f61Var = w5Var.f15653e;
                if (f61Var != null && w5Var.G != null) {
                    long S = f61Var.S();
                    if (w5Var.getDuration() > 1) {
                        float duration = ((float) S) / ((float) w5Var.getDuration());
                        boolean z11 = false;
                        if (!w5Var.G.n1) {
                            d7 d7Var = w5Var.d;
                            if ((duration < d7Var.Z || duration > d7Var.f14389a0) && System.currentTimeMillis() - w5Var.K > 500) {
                                w5Var.K = System.currentTimeMillis();
                                f61 f61Var2 = w5Var.f15653e;
                                long duration2 = w5Var.d.Z * ((float) w5Var.getDuration());
                                f61Var2.q0(duration2, false);
                                w5Var.w(true);
                                w5Var.y(true);
                                S = duration2;
                                w5Var.G.setProgress(w5Var.f15653e.S());
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
                        w5Var.G.setProgress(w5Var.f15653e.S());
                    } else {
                        w5Var.G.setProgress(w5Var.f15653e.S());
                    }
                    if (w5Var.f15653e.d0()) {
                        org.telegram.messenger.g0.r(t5Var);
                        org.telegram.messenger.g0.h3(t5Var, 1000.0f / org.telegram.messenger.g0.f24122r);
                    }
                    w5Var.J = S;
                    return;
                }
                return;
            case 4:
                w5 w5Var2 = this.f15415b;
                t5 t5Var2 = w5Var2.M;
                if (w5Var2.E != null && w5Var2.f15653e == null && w5Var2.f15679y == null && w5Var2.G != null && !w5Var2.j()) {
                    long S2 = w5Var2.E.S();
                    d7 d7Var2 = w5Var2.d;
                    if (d7Var2 != null) {
                        float f10 = (float) S2;
                        float f11 = d7Var2.E;
                        float f12 = (float) d7Var2.C;
                        if ((f10 < f11 * f12 || f10 > d7Var2.F * f12) && System.currentTimeMillis() - w5Var2.K > 500) {
                            w5Var2.K = System.currentTimeMillis();
                            f61 f61Var3 = w5Var2.E;
                            d7 d7Var3 = w5Var2.d;
                            long j3 = d7Var3.E * ((float) d7Var3.C);
                            f61Var3.q0(j3, false);
                            S2 = j3;
                        }
                    }
                    w5Var2.G.setProgress(S2);
                    if (w5Var2.E.d0()) {
                        org.telegram.messenger.g0.r(t5Var2);
                        org.telegram.messenger.g0.h3(t5Var2, 1000.0f / org.telegram.messenger.g0.f24122r);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                w5 w5Var3 = this.f15415b;
                t5 t5Var3 = w5Var3.N;
                if (w5Var3.f15679y != null && w5Var3.f15653e == null && !w5Var3.j() && w5Var3.G != null) {
                    long S3 = w5Var3.f15679y.S();
                    d7 d7Var4 = w5Var3.d;
                    if (d7Var4 != null) {
                        float f13 = (float) S3;
                        float f14 = d7Var4.f14427s0;
                        float f15 = (float) d7Var4.f14423q0;
                        if ((f13 < f14 * f15 || f13 > d7Var4.f14429t0 * f15) && System.currentTimeMillis() - w5Var3.K > 500) {
                            w5Var3.K = System.currentTimeMillis();
                            f61 f61Var4 = w5Var3.f15679y;
                            d7 d7Var5 = w5Var3.d;
                            long j10 = d7Var5.f14427s0 * ((float) d7Var5.f14423q0);
                            f61Var4.q0(j10, false);
                            w5Var3.w(true);
                            S3 = j10;
                        }
                    }
                    w5Var3.G.setProgress(S3);
                    if (w5Var3.f15679y.d0()) {
                        org.telegram.messenger.g0.r(t5Var3);
                        org.telegram.messenger.g0.h3(t5Var3, 1000.0f / org.telegram.messenger.g0.f24122r);
                        return;
                    }
                    return;
                }
                return;
            default:
                w5 w5Var4 = this.f15415b;
                v51 v51Var = w5Var4.f15663n;
                if (v51Var != null) {
                    cz czVar = v51Var.f40501b;
                    if (czVar != null) {
                        czVar.postRunnable(new zy(czVar, 0));
                    }
                    v51Var.f40500a = null;
                    w5Var4.removeView(w5Var4.f15663n);
                    w5Var4.f15663n = null;
                    return;
                }
                return;
        }
    }
}
