package gi;

import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.m51;
import org.telegram.ui.Components.my;
import org.telegram.ui.Components.py;
public final class u5 implements Runnable {
    public final int f13659a;
    public final y5 f13660b;

    public u5(y5 y5Var, int i3) {
        this.f13659a = i3;
        this.f13660b = y5Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f13659a) {
            case 0:
                this.f13660b.r();
                return;
            case 1:
                this.f13660b.r();
                return;
            case 2:
                this.f13660b.m(0L);
                return;
            case 3:
                y5 y5Var = this.f13660b;
                u5 u5Var = y5Var.L;
                m51 m51Var = y5Var.f13943e;
                if (m51Var != null && y5Var.G != null) {
                    long S = m51Var.S();
                    if (y5Var.getDuration() > 1) {
                        float duration = ((float) S) / ((float) y5Var.getDuration());
                        boolean z11 = false;
                        if (!y5Var.G.f12788n1) {
                            f7 f7Var = y5Var.d;
                            if ((duration < f7Var.Z || duration > f7Var.f12703a0) && System.currentTimeMillis() - y5Var.K > 500) {
                                y5Var.K = System.currentTimeMillis();
                                m51 m51Var2 = y5Var.f13943e;
                                long duration2 = y5Var.d.Z * ((float) y5Var.getDuration());
                                m51Var2.q0(duration2, false);
                                y5Var.w(true);
                                y5Var.y(true);
                                S = duration2;
                                y5Var.G.setProgress(y5Var.f13943e.S());
                            }
                        }
                        if (S < y5Var.J) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        y5Var.w(z10);
                        if (S < y5Var.J) {
                            z11 = true;
                        }
                        y5Var.y(z11);
                        y5Var.G.setProgress(y5Var.f13943e.S());
                    } else {
                        y5Var.G.setProgress(y5Var.f13943e.S());
                    }
                    if (y5Var.f13943e.d0()) {
                        org.telegram.messenger.g0.r(u5Var);
                        org.telegram.messenger.g0.i3(u5Var, 1000.0f / org.telegram.messenger.g0.f22609r);
                    }
                    y5Var.J = S;
                    return;
                }
                return;
            case 4:
                y5 y5Var2 = this.f13660b;
                u5 u5Var2 = y5Var2.M;
                if (y5Var2.E != null && y5Var2.f13943e == null && y5Var2.f13969y == null && y5Var2.G != null && !y5Var2.j()) {
                    long S2 = y5Var2.E.S();
                    f7 f7Var2 = y5Var2.d;
                    if (f7Var2 != null) {
                        float f10 = (float) S2;
                        float f11 = f7Var2.E;
                        float f12 = (float) f7Var2.C;
                        if ((f10 < f11 * f12 || f10 > f7Var2.F * f12) && System.currentTimeMillis() - y5Var2.K > 500) {
                            y5Var2.K = System.currentTimeMillis();
                            m51 m51Var3 = y5Var2.E;
                            f7 f7Var3 = y5Var2.d;
                            long j10 = f7Var3.E * ((float) f7Var3.C);
                            m51Var3.q0(j10, false);
                            S2 = j10;
                        }
                    }
                    y5Var2.G.setProgress(S2);
                    if (y5Var2.E.d0()) {
                        org.telegram.messenger.g0.r(u5Var2);
                        org.telegram.messenger.g0.i3(u5Var2, 1000.0f / org.telegram.messenger.g0.f22609r);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                y5 y5Var3 = this.f13660b;
                u5 u5Var3 = y5Var3.N;
                if (y5Var3.f13969y != null && y5Var3.f13943e == null && !y5Var3.j() && y5Var3.G != null) {
                    long S3 = y5Var3.f13969y.S();
                    f7 f7Var4 = y5Var3.d;
                    if (f7Var4 != null) {
                        float f13 = (float) S3;
                        float f14 = f7Var4.f12741s0;
                        float f15 = (float) f7Var4.f12737q0;
                        if ((f13 < f14 * f15 || f13 > f7Var4.f12743t0 * f15) && System.currentTimeMillis() - y5Var3.K > 500) {
                            y5Var3.K = System.currentTimeMillis();
                            m51 m51Var4 = y5Var3.f13969y;
                            f7 f7Var5 = y5Var3.d;
                            long j11 = f7Var5.f12741s0 * ((float) f7Var5.f12737q0);
                            m51Var4.q0(j11, false);
                            y5Var3.w(true);
                            S3 = j11;
                        }
                    }
                    y5Var3.G.setProgress(S3);
                    if (y5Var3.f13969y.d0()) {
                        org.telegram.messenger.g0.r(u5Var3);
                        org.telegram.messenger.g0.i3(u5Var3, 1000.0f / org.telegram.messenger.g0.f22609r);
                        return;
                    }
                    return;
                }
                return;
            default:
                y5 y5Var4 = this.f13660b;
                b51 b51Var = y5Var4.f13953n;
                if (b51Var != null) {
                    py pyVar = b51Var.f32088b;
                    if (pyVar != null) {
                        pyVar.postRunnable(new my(pyVar, 0));
                    }
                    b51Var.f32087a = null;
                    y5Var4.removeView(y5Var4.f13953n);
                    y5Var4.f13953n = null;
                    return;
                }
                return;
        }
    }
}
