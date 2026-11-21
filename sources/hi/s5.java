package hi;

import org.telegram.ui.Components.bz;
import org.telegram.ui.Components.ez;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.y51;
public final class s5 implements Runnable {
    public final int f15372a;
    public final v5 f15373b;

    public s5(v5 v5Var, int i7) {
        this.f15372a = i7;
        this.f15373b = v5Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f15372a) {
            case 0:
                this.f15373b.r();
                return;
            case 1:
                this.f15373b.r();
                return;
            case 2:
                this.f15373b.m(0L);
                return;
            case 3:
                v5 v5Var = this.f15373b;
                s5 s5Var = v5Var.L;
                i61 i61Var = v5Var.f15623e;
                if (i61Var != null && v5Var.G != null) {
                    long S = i61Var.S();
                    if (v5Var.getDuration() > 1) {
                        float duration = ((float) S) / ((float) v5Var.getDuration());
                        boolean z11 = false;
                        if (!v5Var.G.n1) {
                            c7 c7Var = v5Var.d;
                            if ((duration < c7Var.Z || duration > c7Var.f14336a0) && System.currentTimeMillis() - v5Var.K > 500) {
                                v5Var.K = System.currentTimeMillis();
                                i61 i61Var2 = v5Var.f15623e;
                                long duration2 = v5Var.d.Z * ((float) v5Var.getDuration());
                                i61Var2.q0(duration2, false);
                                v5Var.w(true);
                                v5Var.y(true);
                                S = duration2;
                                v5Var.G.setProgress(v5Var.f15623e.S());
                            }
                        }
                        if (S < v5Var.J) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        v5Var.w(z10);
                        if (S < v5Var.J) {
                            z11 = true;
                        }
                        v5Var.y(z11);
                        v5Var.G.setProgress(v5Var.f15623e.S());
                    } else {
                        v5Var.G.setProgress(v5Var.f15623e.S());
                    }
                    if (v5Var.f15623e.d0()) {
                        org.telegram.messenger.g0.r(s5Var);
                        org.telegram.messenger.g0.h3(s5Var, 1000.0f / org.telegram.messenger.g0.f24147r);
                    }
                    v5Var.J = S;
                    return;
                }
                return;
            case 4:
                v5 v5Var2 = this.f15373b;
                s5 s5Var2 = v5Var2.M;
                if (v5Var2.E != null && v5Var2.f15623e == null && v5Var2.f15649y == null && v5Var2.G != null && !v5Var2.j()) {
                    long S2 = v5Var2.E.S();
                    c7 c7Var2 = v5Var2.d;
                    if (c7Var2 != null) {
                        float f10 = (float) S2;
                        float f11 = c7Var2.E;
                        float f12 = (float) c7Var2.C;
                        if ((f10 < f11 * f12 || f10 > c7Var2.F * f12) && System.currentTimeMillis() - v5Var2.K > 500) {
                            v5Var2.K = System.currentTimeMillis();
                            i61 i61Var3 = v5Var2.E;
                            c7 c7Var3 = v5Var2.d;
                            long j3 = c7Var3.E * ((float) c7Var3.C);
                            i61Var3.q0(j3, false);
                            S2 = j3;
                        }
                    }
                    v5Var2.G.setProgress(S2);
                    if (v5Var2.E.d0()) {
                        org.telegram.messenger.g0.r(s5Var2);
                        org.telegram.messenger.g0.h3(s5Var2, 1000.0f / org.telegram.messenger.g0.f24147r);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                v5 v5Var3 = this.f15373b;
                s5 s5Var3 = v5Var3.N;
                if (v5Var3.f15649y != null && v5Var3.f15623e == null && !v5Var3.j() && v5Var3.G != null) {
                    long S3 = v5Var3.f15649y.S();
                    c7 c7Var4 = v5Var3.d;
                    if (c7Var4 != null) {
                        float f13 = (float) S3;
                        float f14 = c7Var4.f14374s0;
                        float f15 = (float) c7Var4.f14370q0;
                        if ((f13 < f14 * f15 || f13 > c7Var4.f14376t0 * f15) && System.currentTimeMillis() - v5Var3.K > 500) {
                            v5Var3.K = System.currentTimeMillis();
                            i61 i61Var4 = v5Var3.f15649y;
                            c7 c7Var5 = v5Var3.d;
                            long j10 = c7Var5.f14374s0 * ((float) c7Var5.f14370q0);
                            i61Var4.q0(j10, false);
                            v5Var3.w(true);
                            S3 = j10;
                        }
                    }
                    v5Var3.G.setProgress(S3);
                    if (v5Var3.f15649y.d0()) {
                        org.telegram.messenger.g0.r(s5Var3);
                        org.telegram.messenger.g0.h3(s5Var3, 1000.0f / org.telegram.messenger.g0.f24147r);
                        return;
                    }
                    return;
                }
                return;
            default:
                v5 v5Var4 = this.f15373b;
                y51 y51Var = v5Var4.f15633n;
                if (y51Var != null) {
                    ez ezVar = y51Var.f42330b;
                    if (ezVar != null) {
                        ezVar.postRunnable(new bz(ezVar, 0));
                    }
                    y51Var.f42329a = null;
                    v5Var4.removeView(v5Var4.f15633n);
                    v5Var4.f15633n = null;
                    return;
                }
                return;
        }
    }
}
