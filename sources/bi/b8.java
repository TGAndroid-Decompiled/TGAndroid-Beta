package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.c00;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.t71;
import org.telegram.ui.Components.zz;
public final class b8 implements Runnable {
    public final int f2369a;
    public final e8 f2370b;

    public b8(e8 e8Var, int i10) {
        this.f2369a = i10;
        this.f2370b = e8Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f2369a) {
            case 0:
                this.f2370b.r();
                return;
            case 1:
                this.f2370b.r();
                return;
            case 2:
                this.f2370b.m(0L);
                return;
            case 3:
                e8 e8Var = this.f2370b;
                b8 b8Var = e8Var.K;
                t71 t71Var = e8Var.e;
                if (t71Var != null && e8Var.F != null) {
                    long n10 = t71Var.n();
                    if (e8Var.getDuration() > 1) {
                        float duration = ((float) n10) / ((float) e8Var.getDuration());
                        boolean z11 = false;
                        if (!e8Var.F.f3175m1) {
                            r9 r9Var = e8Var.d;
                            if ((duration < r9Var.Z || duration > r9Var.f3560a0) && System.currentTimeMillis() - e8Var.J > 500) {
                                e8Var.J = System.currentTimeMillis();
                                t71 t71Var2 = e8Var.e;
                                long duration2 = e8Var.d.Z * ((float) e8Var.getDuration());
                                t71Var2.L(duration2, false);
                                e8Var.w(true);
                                e8Var.y(true);
                                n10 = duration2;
                                e8Var.F.setProgress(e8Var.e.n());
                            }
                        }
                        if (n10 < e8Var.I) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        e8Var.w(z10);
                        if (n10 < e8Var.I) {
                            z11 = true;
                        }
                        e8Var.y(z11);
                        e8Var.F.setProgress(e8Var.e.n());
                    } else {
                        e8Var.F.setProgress(e8Var.e.n());
                    }
                    if (e8Var.e.y()) {
                        AndroidUtilities.cancelRunOnUIThread(b8Var);
                        AndroidUtilities.runOnUIThread(b8Var, 1000.0f / AndroidUtilities.screenRefreshRate);
                    }
                    e8Var.I = n10;
                    return;
                }
                return;
            case 4:
                e8 e8Var2 = this.f2370b;
                b8 b8Var2 = e8Var2.L;
                if (e8Var2.f2663y != null && e8Var2.e == null && e8Var2.f2661x == null && e8Var2.F != null && !e8Var2.j()) {
                    long n11 = e8Var2.f2663y.n();
                    r9 r9Var2 = e8Var2.d;
                    if (r9Var2 != null) {
                        float f7 = (float) n11;
                        float f10 = r9Var2.E;
                        float f11 = (float) r9Var2.C;
                        if ((f7 < f10 * f11 || f7 > r9Var2.F * f11) && System.currentTimeMillis() - e8Var2.J > 500) {
                            e8Var2.J = System.currentTimeMillis();
                            t71 t71Var3 = e8Var2.f2663y;
                            r9 r9Var3 = e8Var2.d;
                            long j3 = r9Var3.E * ((float) r9Var3.C);
                            t71Var3.L(j3, false);
                            n11 = j3;
                        }
                    }
                    e8Var2.F.setProgress(n11);
                    if (e8Var2.f2663y.y()) {
                        AndroidUtilities.cancelRunOnUIThread(b8Var2);
                        AndroidUtilities.runOnUIThread(b8Var2, 1000.0f / AndroidUtilities.screenRefreshRate);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                e8 e8Var3 = this.f2370b;
                b8 b8Var3 = e8Var3.M;
                if (e8Var3.f2661x != null && e8Var3.e == null && !e8Var3.j() && e8Var3.F != null) {
                    long n12 = e8Var3.f2661x.n();
                    r9 r9Var4 = e8Var3.d;
                    if (r9Var4 != null) {
                        float f12 = (float) n12;
                        float f13 = r9Var4.f3597s0;
                        float f14 = (float) r9Var4.f3593q0;
                        if ((f12 < f13 * f14 || f12 > r9Var4.f3599t0 * f14) && System.currentTimeMillis() - e8Var3.J > 500) {
                            e8Var3.J = System.currentTimeMillis();
                            t71 t71Var4 = e8Var3.f2661x;
                            r9 r9Var5 = e8Var3.d;
                            long j10 = r9Var5.f3597s0 * ((float) r9Var5.f3593q0);
                            t71Var4.L(j10, false);
                            e8Var3.w(true);
                            n12 = j10;
                        }
                    }
                    e8Var3.F.setProgress(n12);
                    if (e8Var3.f2661x.y()) {
                        AndroidUtilities.cancelRunOnUIThread(b8Var3);
                        AndroidUtilities.runOnUIThread(b8Var3, 1000.0f / AndroidUtilities.screenRefreshRate);
                        return;
                    }
                    return;
                }
                return;
            default:
                e8 e8Var4 = this.f2370b;
                h71 h71Var = e8Var4.f2647n;
                if (h71Var != null) {
                    c00 c00Var = h71Var.f23538b;
                    if (c00Var != null) {
                        c00Var.postRunnable(new zz(c00Var, 0));
                    }
                    h71Var.f23537a = null;
                    e8Var4.removeView(e8Var4.f2647n);
                    e8Var4.f2647n = null;
                    return;
                }
                return;
        }
    }
}
