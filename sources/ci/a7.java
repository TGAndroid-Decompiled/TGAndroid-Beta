package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.sz;
import org.telegram.ui.Components.v71;
import org.telegram.ui.Components.vz;
public final class a7 implements Runnable {
    public final int f4351a;
    public final d7 f4352b;

    public a7(d7 d7Var, int i10) {
        this.f4351a = i10;
        this.f4352b = d7Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f4351a) {
            case 0:
                this.f4352b.r();
                return;
            case 1:
                this.f4352b.r();
                return;
            case 2:
                this.f4352b.m(0L);
                return;
            case 3:
                d7 d7Var = this.f4352b;
                a7 a7Var = d7Var.K;
                v71 v71Var = d7Var.e;
                if (v71Var != null && d7Var.F != null) {
                    long n10 = v71Var.n();
                    if (d7Var.getDuration() > 1) {
                        float duration = ((float) n10) / ((float) d7Var.getDuration());
                        boolean z11 = false;
                        if (!d7Var.F.f5909m1) {
                            o8 o8Var = d7Var.d;
                            if ((duration < o8Var.Z || duration > o8Var.f5142a0) && System.currentTimeMillis() - d7Var.J > 500) {
                                d7Var.J = System.currentTimeMillis();
                                v71 v71Var2 = d7Var.e;
                                long duration2 = d7Var.d.Z * ((float) d7Var.getDuration());
                                v71Var2.L(duration2, false);
                                d7Var.w(true);
                                d7Var.y(true);
                                n10 = duration2;
                                d7Var.F.setProgress(d7Var.e.n());
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
                        d7Var.F.setProgress(d7Var.e.n());
                    } else {
                        d7Var.F.setProgress(d7Var.e.n());
                    }
                    if (d7Var.e.y()) {
                        AndroidUtilities.cancelRunOnUIThread(a7Var);
                        AndroidUtilities.runOnUIThread(a7Var, 1000.0f / AndroidUtilities.screenRefreshRate);
                    }
                    d7Var.I = n10;
                    return;
                }
                return;
            case 4:
                d7 d7Var2 = this.f4352b;
                a7 a7Var2 = d7Var2.L;
                if (d7Var2.f4535y != null && d7Var2.e == null && d7Var2.f4533x == null && d7Var2.F != null && !d7Var2.j()) {
                    long n11 = d7Var2.f4535y.n();
                    o8 o8Var2 = d7Var2.d;
                    if (o8Var2 != null) {
                        float f7 = (float) n11;
                        float f10 = o8Var2.E;
                        float f11 = (float) o8Var2.C;
                        if ((f7 < f10 * f11 || f7 > o8Var2.F * f11) && System.currentTimeMillis() - d7Var2.J > 500) {
                            d7Var2.J = System.currentTimeMillis();
                            v71 v71Var3 = d7Var2.f4535y;
                            o8 o8Var3 = d7Var2.d;
                            long j3 = o8Var3.E * ((float) o8Var3.C);
                            v71Var3.L(j3, false);
                            n11 = j3;
                        }
                    }
                    d7Var2.F.setProgress(n11);
                    if (d7Var2.f4535y.y()) {
                        AndroidUtilities.cancelRunOnUIThread(a7Var2);
                        AndroidUtilities.runOnUIThread(a7Var2, 1000.0f / AndroidUtilities.screenRefreshRate);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                d7 d7Var3 = this.f4352b;
                a7 a7Var3 = d7Var3.M;
                if (d7Var3.f4533x != null && d7Var3.e == null && !d7Var3.j() && d7Var3.F != null) {
                    long n12 = d7Var3.f4533x.n();
                    o8 o8Var4 = d7Var3.d;
                    if (o8Var4 != null) {
                        float f12 = (float) n12;
                        float f13 = o8Var4.f5179s0;
                        float f14 = (float) o8Var4.f5175q0;
                        if ((f12 < f13 * f14 || f12 > o8Var4.f5181t0 * f14) && System.currentTimeMillis() - d7Var3.J > 500) {
                            d7Var3.J = System.currentTimeMillis();
                            v71 v71Var4 = d7Var3.f4533x;
                            o8 o8Var5 = d7Var3.d;
                            long j10 = o8Var5.f5179s0 * ((float) o8Var5.f5175q0);
                            v71Var4.L(j10, false);
                            d7Var3.w(true);
                            n12 = j10;
                        }
                    }
                    d7Var3.F.setProgress(n12);
                    if (d7Var3.f4533x.y()) {
                        AndroidUtilities.cancelRunOnUIThread(a7Var3);
                        AndroidUtilities.runOnUIThread(a7Var3, 1000.0f / AndroidUtilities.screenRefreshRate);
                        return;
                    }
                    return;
                }
                return;
            default:
                d7 d7Var4 = this.f4352b;
                l71 l71Var = d7Var4.f4519n;
                if (l71Var != null) {
                    vz vzVar = l71Var.f26011b;
                    if (vzVar != null) {
                        vzVar.postRunnable(new sz(vzVar, 0));
                    }
                    l71Var.f26010a = null;
                    d7Var4.removeView(d7Var4.f4519n);
                    d7Var4.f4519n = null;
                    return;
                }
                return;
        }
    }
}
