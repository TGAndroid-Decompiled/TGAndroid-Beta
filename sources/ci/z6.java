package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.b81;
import org.telegram.ui.Components.j00;
import org.telegram.ui.Components.m00;
import org.telegram.ui.Components.m81;
public final class z6 implements Runnable {
    public final int f6422a;
    public final b7 f6423b;

    public z6(b7 b7Var, int i10) {
        this.f6422a = i10;
        this.f6423b = b7Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f6422a) {
            case 0:
                this.f6423b.r();
                return;
            case 1:
                this.f6423b.m(0L);
                return;
            case 2:
                b7 b7Var = this.f6423b;
                z6 z6Var = b7Var.K;
                m81 m81Var = b7Var.f4762e;
                if (m81Var != null && b7Var.F != null) {
                    long n10 = m81Var.n();
                    if (b7Var.getDuration() > 1) {
                        float duration = ((float) n10) / ((float) b7Var.getDuration());
                        boolean z11 = false;
                        if (!b7Var.F.f6254m1) {
                            l8 l8Var = b7Var.d;
                            if ((duration < l8Var.Z || duration > l8Var.f5394a0) && System.currentTimeMillis() - b7Var.J > 500) {
                                b7Var.J = System.currentTimeMillis();
                                m81 m81Var2 = b7Var.f4762e;
                                long duration2 = b7Var.d.Z * ((float) b7Var.getDuration());
                                m81Var2.L(duration2, false);
                                b7Var.w(true);
                                b7Var.y(true);
                                n10 = duration2;
                                b7Var.F.setProgress(b7Var.f4762e.n());
                            }
                        }
                        if (n10 < b7Var.I) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        b7Var.w(z10);
                        if (n10 < b7Var.I) {
                            z11 = true;
                        }
                        b7Var.y(z11);
                        b7Var.F.setProgress(b7Var.f4762e.n());
                    } else {
                        b7Var.F.setProgress(b7Var.f4762e.n());
                    }
                    if (b7Var.f4762e.y()) {
                        AndroidUtilities.cancelRunOnUIThread(z6Var);
                        AndroidUtilities.runOnUIThread(z6Var, 1000.0f / AndroidUtilities.screenRefreshRate);
                    }
                    b7Var.I = n10;
                    return;
                }
                return;
            case 3:
                b7 b7Var2 = this.f6423b;
                z6 z6Var2 = b7Var2.L;
                if (b7Var2.f4788y != null && b7Var2.f4762e == null && b7Var2.f4786x == null && b7Var2.F != null && !b7Var2.j()) {
                    long n11 = b7Var2.f4788y.n();
                    l8 l8Var2 = b7Var2.d;
                    if (l8Var2 != null) {
                        float f7 = (float) n11;
                        float f10 = l8Var2.E;
                        float f11 = (float) l8Var2.C;
                        if ((f7 < f10 * f11 || f7 > l8Var2.F * f11) && System.currentTimeMillis() - b7Var2.J > 500) {
                            b7Var2.J = System.currentTimeMillis();
                            m81 m81Var3 = b7Var2.f4788y;
                            l8 l8Var3 = b7Var2.d;
                            long j3 = l8Var3.E * ((float) l8Var3.C);
                            m81Var3.L(j3, false);
                            n11 = j3;
                        }
                    }
                    b7Var2.F.setProgress(n11);
                    if (b7Var2.f4788y.y()) {
                        AndroidUtilities.cancelRunOnUIThread(z6Var2);
                        AndroidUtilities.runOnUIThread(z6Var2, 1000.0f / AndroidUtilities.screenRefreshRate);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                b7 b7Var3 = this.f6423b;
                z6 z6Var3 = b7Var3.M;
                if (b7Var3.f4786x != null && b7Var3.f4762e == null && !b7Var3.j() && b7Var3.F != null) {
                    long n12 = b7Var3.f4786x.n();
                    l8 l8Var4 = b7Var3.d;
                    if (l8Var4 != null) {
                        float f12 = (float) n12;
                        float f13 = l8Var4.f5432s0;
                        float f14 = (float) l8Var4.f5428q0;
                        if ((f12 < f13 * f14 || f12 > l8Var4.f5434t0 * f14) && System.currentTimeMillis() - b7Var3.J > 500) {
                            b7Var3.J = System.currentTimeMillis();
                            m81 m81Var4 = b7Var3.f4786x;
                            l8 l8Var5 = b7Var3.d;
                            long j10 = l8Var5.f5432s0 * ((float) l8Var5.f5428q0);
                            m81Var4.L(j10, false);
                            b7Var3.w(true);
                            n12 = j10;
                        }
                    }
                    b7Var3.F.setProgress(n12);
                    if (b7Var3.f4786x.y()) {
                        AndroidUtilities.cancelRunOnUIThread(z6Var3);
                        AndroidUtilities.runOnUIThread(z6Var3, 1000.0f / AndroidUtilities.screenRefreshRate);
                        return;
                    }
                    return;
                }
                return;
            default:
                b7 b7Var4 = this.f6423b;
                b81 b81Var = b7Var4.f4772n;
                if (b81Var != null) {
                    m00 m00Var = b81Var.f24880b;
                    if (m00Var != null) {
                        m00Var.postRunnable(new j00(m00Var, 0));
                    }
                    b81Var.f24879a = null;
                    b7Var4.removeView(b7Var4.f4772n);
                    b7Var4.f4772n = null;
                    return;
                }
                return;
        }
    }
}
