package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.u71;
import org.telegram.ui.Components.uz;
import org.telegram.ui.Components.xz;
public final class z6 implements Runnable {
    public final int f5913a;
    public final b7 f5914b;

    public z6(b7 b7Var, int i10) {
        this.f5913a = i10;
        this.f5914b = b7Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f5913a) {
            case 0:
                this.f5914b.r();
                return;
            case 1:
                this.f5914b.r();
                return;
            case 2:
                this.f5914b.m(0L);
                return;
            case 3:
                b7 b7Var = this.f5914b;
                z6 z6Var = b7Var.K;
                u71 u71Var = b7Var.e;
                if (u71Var != null && b7Var.F != null) {
                    long n10 = u71Var.n();
                    if (b7Var.getDuration() > 1) {
                        float duration = ((float) n10) / ((float) b7Var.getDuration());
                        boolean z11 = false;
                        if (!b7Var.F.f5720m1) {
                            k8 k8Var = b7Var.d;
                            if ((duration < k8Var.Z || duration > k8Var.f4921a0) && System.currentTimeMillis() - b7Var.J > 500) {
                                b7Var.J = System.currentTimeMillis();
                                u71 u71Var2 = b7Var.e;
                                long duration2 = b7Var.d.Z * ((float) b7Var.getDuration());
                                u71Var2.L(duration2, false);
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
                b7 b7Var2 = this.f5914b;
                z6 z6Var2 = b7Var2.L;
                if (b7Var2.f4413y != null && b7Var2.e == null && b7Var2.f4411x == null && b7Var2.F != null && !b7Var2.j()) {
                    long n11 = b7Var2.f4413y.n();
                    k8 k8Var2 = b7Var2.d;
                    if (k8Var2 != null) {
                        float f7 = (float) n11;
                        float f10 = k8Var2.E;
                        float f11 = (float) k8Var2.C;
                        if ((f7 < f10 * f11 || f7 > k8Var2.F * f11) && System.currentTimeMillis() - b7Var2.J > 500) {
                            b7Var2.J = System.currentTimeMillis();
                            u71 u71Var3 = b7Var2.f4413y;
                            k8 k8Var3 = b7Var2.d;
                            long j3 = k8Var3.E * ((float) k8Var3.C);
                            u71Var3.L(j3, false);
                            n11 = j3;
                        }
                    }
                    b7Var2.F.setProgress(n11);
                    if (b7Var2.f4413y.y()) {
                        AndroidUtilities.cancelRunOnUIThread(z6Var2);
                        AndroidUtilities.runOnUIThread(z6Var2, 1000.0f / AndroidUtilities.screenRefreshRate);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                b7 b7Var3 = this.f5914b;
                z6 z6Var3 = b7Var3.M;
                if (b7Var3.f4411x != null && b7Var3.e == null && !b7Var3.j() && b7Var3.F != null) {
                    long n12 = b7Var3.f4411x.n();
                    k8 k8Var4 = b7Var3.d;
                    if (k8Var4 != null) {
                        float f12 = (float) n12;
                        float f13 = k8Var4.f4958s0;
                        float f14 = (float) k8Var4.f4954q0;
                        if ((f12 < f13 * f14 || f12 > k8Var4.f4960t0 * f14) && System.currentTimeMillis() - b7Var3.J > 500) {
                            b7Var3.J = System.currentTimeMillis();
                            u71 u71Var4 = b7Var3.f4411x;
                            k8 k8Var5 = b7Var3.d;
                            long j10 = k8Var5.f4958s0 * ((float) k8Var5.f4954q0);
                            u71Var4.L(j10, false);
                            b7Var3.w(true);
                            n12 = j10;
                        }
                    }
                    b7Var3.F.setProgress(n12);
                    if (b7Var3.f4411x.y()) {
                        AndroidUtilities.cancelRunOnUIThread(z6Var3);
                        AndroidUtilities.runOnUIThread(z6Var3, 1000.0f / AndroidUtilities.screenRefreshRate);
                        return;
                    }
                    return;
                }
                return;
            default:
                b7 b7Var4 = this.f5914b;
                k71 k71Var = b7Var4.f4397n;
                if (k71Var != null) {
                    xz xzVar = k71Var.f25646b;
                    if (xzVar != null) {
                        xzVar.postRunnable(new uz(xzVar, 0));
                    }
                    k71Var.f25645a = null;
                    b7Var4.removeView(b7Var4.f4397n);
                    b7Var4.f4397n = null;
                    return;
                }
                return;
        }
    }
}
