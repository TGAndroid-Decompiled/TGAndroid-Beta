package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.wz;
public final class z6 implements Runnable {
    public final int f5912a;
    public final b7 f5913b;

    public z6(b7 b7Var, int i10) {
        this.f5912a = i10;
        this.f5913b = b7Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f5912a) {
            case 0:
                this.f5913b.r();
                return;
            case 1:
                this.f5913b.r();
                return;
            case 2:
                this.f5913b.m(0L);
                return;
            case 3:
                b7 b7Var = this.f5913b;
                z6 z6Var = b7Var.K;
                s71 s71Var = b7Var.e;
                if (s71Var != null && b7Var.F != null) {
                    long n10 = s71Var.n();
                    if (b7Var.getDuration() > 1) {
                        float duration = ((float) n10) / ((float) b7Var.getDuration());
                        boolean z11 = false;
                        if (!b7Var.F.f5770m1) {
                            l8 l8Var = b7Var.d;
                            if ((duration < l8Var.Z || duration > l8Var.f4965a0) && System.currentTimeMillis() - b7Var.J > 500) {
                                b7Var.J = System.currentTimeMillis();
                                s71 s71Var2 = b7Var.e;
                                long duration2 = b7Var.d.Z * ((float) b7Var.getDuration());
                                s71Var2.L(duration2, false);
                                b7Var.w(true);
                                b7Var.y(true);
                                n10 = duration2;
                                b7Var.F.setProgress(b7Var.e.n());
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
                        b7Var.F.setProgress(b7Var.e.n());
                    } else {
                        b7Var.F.setProgress(b7Var.e.n());
                    }
                    if (b7Var.e.y()) {
                        AndroidUtilities.cancelRunOnUIThread(z6Var);
                        AndroidUtilities.runOnUIThread(z6Var, 1000.0f / AndroidUtilities.screenRefreshRate);
                    }
                    b7Var.I = n10;
                    return;
                }
                return;
            case 4:
                b7 b7Var2 = this.f5913b;
                z6 z6Var2 = b7Var2.L;
                if (b7Var2.f4409y != null && b7Var2.e == null && b7Var2.f4407x == null && b7Var2.F != null && !b7Var2.j()) {
                    long n11 = b7Var2.f4409y.n();
                    l8 l8Var2 = b7Var2.d;
                    if (l8Var2 != null) {
                        float f7 = (float) n11;
                        float f10 = l8Var2.E;
                        float f11 = (float) l8Var2.C;
                        if ((f7 < f10 * f11 || f7 > l8Var2.F * f11) && System.currentTimeMillis() - b7Var2.J > 500) {
                            b7Var2.J = System.currentTimeMillis();
                            s71 s71Var3 = b7Var2.f4409y;
                            l8 l8Var3 = b7Var2.d;
                            long j3 = l8Var3.E * ((float) l8Var3.C);
                            s71Var3.L(j3, false);
                            n11 = j3;
                        }
                    }
                    b7Var2.F.setProgress(n11);
                    if (b7Var2.f4409y.y()) {
                        AndroidUtilities.cancelRunOnUIThread(z6Var2);
                        AndroidUtilities.runOnUIThread(z6Var2, 1000.0f / AndroidUtilities.screenRefreshRate);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                b7 b7Var3 = this.f5913b;
                z6 z6Var3 = b7Var3.M;
                if (b7Var3.f4407x != null && b7Var3.e == null && !b7Var3.j() && b7Var3.F != null) {
                    long n12 = b7Var3.f4407x.n();
                    l8 l8Var4 = b7Var3.d;
                    if (l8Var4 != null) {
                        float f12 = (float) n12;
                        float f13 = l8Var4.f5002s0;
                        float f14 = (float) l8Var4.f4998q0;
                        if ((f12 < f13 * f14 || f12 > l8Var4.f5004t0 * f14) && System.currentTimeMillis() - b7Var3.J > 500) {
                            b7Var3.J = System.currentTimeMillis();
                            s71 s71Var4 = b7Var3.f4407x;
                            l8 l8Var5 = b7Var3.d;
                            long j10 = l8Var5.f5002s0 * ((float) l8Var5.f4998q0);
                            s71Var4.L(j10, false);
                            b7Var3.w(true);
                            n12 = j10;
                        }
                    }
                    b7Var3.F.setProgress(n12);
                    if (b7Var3.f4407x.y()) {
                        AndroidUtilities.cancelRunOnUIThread(z6Var3);
                        AndroidUtilities.runOnUIThread(z6Var3, 1000.0f / AndroidUtilities.screenRefreshRate);
                        return;
                    }
                    return;
                }
                return;
            default:
                b7 b7Var4 = this.f5913b;
                i71 i71Var = b7Var4.f4393n;
                if (i71Var != null) {
                    wz wzVar = i71Var.f24961b;
                    if (wzVar != null) {
                        wzVar.postRunnable(new tz(wzVar, 0));
                    }
                    i71Var.f24960a = null;
                    b7Var4.removeView(b7Var4.f4393n);
                    b7Var4.f4393n = null;
                    return;
                }
                return;
        }
    }
}
