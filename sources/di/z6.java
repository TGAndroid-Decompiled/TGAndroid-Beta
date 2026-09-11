package di;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.sz;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.vz;
public final class z6 implements Runnable {
    public final int f8520a;
    public final d7 f8521b;

    public z6(d7 d7Var, int i10) {
        this.f8520a = i10;
        this.f8521b = d7Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f8520a) {
            case 0:
                this.f8521b.r();
                return;
            case 1:
                this.f8521b.r();
                return;
            case 2:
                this.f8521b.m(0L);
                return;
            case 3:
                d7 d7Var = this.f8521b;
                z6 z6Var = d7Var.K;
                g71 g71Var = d7Var.f7075e;
                if (g71Var != null && d7Var.F != null) {
                    long n10 = g71Var.n();
                    if (d7Var.getDuration() > 1) {
                        float duration = ((float) n10) / ((float) d7Var.getDuration());
                        boolean z11 = false;
                        if (!d7Var.F.f8563m1) {
                            o8 o8Var = d7Var.d;
                            if ((duration < o8Var.Z || duration > o8Var.f7741a0) && System.currentTimeMillis() - d7Var.J > 500) {
                                d7Var.J = System.currentTimeMillis();
                                g71 g71Var2 = d7Var.f7075e;
                                long duration2 = d7Var.d.Z * ((float) d7Var.getDuration());
                                g71Var2.L(duration2, false);
                                d7Var.w(true);
                                d7Var.y(true);
                                n10 = duration2;
                                d7Var.F.setProgress(d7Var.f7075e.n());
                            }
                        }
                        if (n10 < d7Var.I) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        d7Var.w(z10);
                        if (n10 < d7Var.I) {
                            z11 = true;
                        }
                        d7Var.y(z11);
                        d7Var.F.setProgress(d7Var.f7075e.n());
                    } else {
                        d7Var.F.setProgress(d7Var.f7075e.n());
                    }
                    if (d7Var.f7075e.y()) {
                        AndroidUtilities.cancelRunOnUIThread(z6Var);
                        AndroidUtilities.runOnUIThread(z6Var, 1000.0f / AndroidUtilities.screenRefreshRate);
                    }
                    d7Var.I = n10;
                    return;
                }
                return;
            case 4:
                d7 d7Var2 = this.f8521b;
                z6 z6Var2 = d7Var2.L;
                if (d7Var2.f7101y != null && d7Var2.f7075e == null && d7Var2.f7099x == null && d7Var2.F != null && !d7Var2.j()) {
                    long n11 = d7Var2.f7101y.n();
                    o8 o8Var2 = d7Var2.d;
                    if (o8Var2 != null) {
                        float f7 = (float) n11;
                        float f10 = o8Var2.E;
                        float f11 = (float) o8Var2.C;
                        if ((f7 < f10 * f11 || f7 > o8Var2.F * f11) && System.currentTimeMillis() - d7Var2.J > 500) {
                            d7Var2.J = System.currentTimeMillis();
                            g71 g71Var3 = d7Var2.f7101y;
                            o8 o8Var3 = d7Var2.d;
                            long j3 = o8Var3.E * ((float) o8Var3.C);
                            g71Var3.L(j3, false);
                            n11 = j3;
                        }
                    }
                    d7Var2.F.setProgress(n11);
                    if (d7Var2.f7101y.y()) {
                        AndroidUtilities.cancelRunOnUIThread(z6Var2);
                        AndroidUtilities.runOnUIThread(z6Var2, 1000.0f / AndroidUtilities.screenRefreshRate);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                d7 d7Var3 = this.f8521b;
                z6 z6Var3 = d7Var3.M;
                if (d7Var3.f7099x != null && d7Var3.f7075e == null && !d7Var3.j() && d7Var3.F != null) {
                    long n12 = d7Var3.f7099x.n();
                    o8 o8Var4 = d7Var3.d;
                    if (o8Var4 != null) {
                        float f12 = (float) n12;
                        float f13 = o8Var4.f7779s0;
                        float f14 = (float) o8Var4.f7775q0;
                        if ((f12 < f13 * f14 || f12 > o8Var4.f7781t0 * f14) && System.currentTimeMillis() - d7Var3.J > 500) {
                            d7Var3.J = System.currentTimeMillis();
                            g71 g71Var4 = d7Var3.f7099x;
                            o8 o8Var5 = d7Var3.d;
                            long j10 = o8Var5.f7779s0 * ((float) o8Var5.f7775q0);
                            g71Var4.L(j10, false);
                            d7Var3.w(true);
                            n12 = j10;
                        }
                    }
                    d7Var3.F.setProgress(n12);
                    if (d7Var3.f7099x.y()) {
                        AndroidUtilities.cancelRunOnUIThread(z6Var3);
                        AndroidUtilities.runOnUIThread(z6Var3, 1000.0f / AndroidUtilities.screenRefreshRate);
                        return;
                    }
                    return;
                }
                return;
            default:
                d7 d7Var4 = this.f8521b;
                u61 u61Var = d7Var4.f7085n;
                if (u61Var != null) {
                    vz vzVar = u61Var.f30821b;
                    if (vzVar != null) {
                        vzVar.postRunnable(new sz(vzVar, 0));
                    }
                    u61Var.f30820a = null;
                    d7Var4.removeView(d7Var4.f7085n);
                    d7Var4.f7085n = null;
                    return;
                }
                return;
        }
    }
}
