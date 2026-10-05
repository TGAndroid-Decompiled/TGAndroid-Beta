package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.e81;
import org.telegram.ui.Components.u71;
import org.telegram.ui.Components.vz;
import org.telegram.ui.Components.yz;
public final class z6 implements Runnable {
    public final int f6372a;
    public final b7 f6373b;

    public z6(b7 b7Var, int i10) {
        this.f6372a = i10;
        this.f6373b = b7Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f6372a) {
            case 0:
                this.f6373b.r();
                return;
            case 1:
                this.f6373b.r();
                return;
            case 2:
                this.f6373b.m(0L);
                return;
            case 3:
                b7 b7Var = this.f6373b;
                z6 z6Var = b7Var.K;
                e81 e81Var = b7Var.f4745e;
                if (e81Var != null && b7Var.F != null) {
                    long n10 = e81Var.n();
                    if (b7Var.getDuration() > 1) {
                        float duration = ((float) n10) / ((float) b7Var.getDuration());
                        boolean z11 = false;
                        if (!b7Var.F.f6163m1) {
                            k8 k8Var = b7Var.d;
                            if ((duration < k8Var.Z || duration > k8Var.f5311a0) && System.currentTimeMillis() - b7Var.J > 500) {
                                b7Var.J = System.currentTimeMillis();
                                e81 e81Var2 = b7Var.f4745e;
                                long duration2 = b7Var.d.Z * ((float) b7Var.getDuration());
                                e81Var2.L(duration2, false);
                                b7Var.w(true);
                                b7Var.y(true);
                                n10 = duration2;
                                b7Var.F.setProgress(b7Var.f4745e.n());
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
                        b7Var.F.setProgress(b7Var.f4745e.n());
                    } else {
                        b7Var.F.setProgress(b7Var.f4745e.n());
                    }
                    if (b7Var.f4745e.y()) {
                        AndroidUtilities.cancelRunOnUIThread(z6Var);
                        AndroidUtilities.runOnUIThread(z6Var, 1000.0f / AndroidUtilities.screenRefreshRate);
                    }
                    b7Var.I = n10;
                    return;
                }
                return;
            case 4:
                b7 b7Var2 = this.f6373b;
                z6 z6Var2 = b7Var2.L;
                if (b7Var2.f4771y != null && b7Var2.f4745e == null && b7Var2.f4769x == null && b7Var2.F != null && !b7Var2.j()) {
                    long n11 = b7Var2.f4771y.n();
                    k8 k8Var2 = b7Var2.d;
                    if (k8Var2 != null) {
                        float f7 = (float) n11;
                        float f10 = k8Var2.E;
                        float f11 = (float) k8Var2.C;
                        if ((f7 < f10 * f11 || f7 > k8Var2.F * f11) && System.currentTimeMillis() - b7Var2.J > 500) {
                            b7Var2.J = System.currentTimeMillis();
                            e81 e81Var3 = b7Var2.f4771y;
                            k8 k8Var3 = b7Var2.d;
                            long j3 = k8Var3.E * ((float) k8Var3.C);
                            e81Var3.L(j3, false);
                            n11 = j3;
                        }
                    }
                    b7Var2.F.setProgress(n11);
                    if (b7Var2.f4771y.y()) {
                        AndroidUtilities.cancelRunOnUIThread(z6Var2);
                        AndroidUtilities.runOnUIThread(z6Var2, 1000.0f / AndroidUtilities.screenRefreshRate);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                b7 b7Var3 = this.f6373b;
                z6 z6Var3 = b7Var3.M;
                if (b7Var3.f4769x != null && b7Var3.f4745e == null && !b7Var3.j() && b7Var3.F != null) {
                    long n12 = b7Var3.f4769x.n();
                    k8 k8Var4 = b7Var3.d;
                    if (k8Var4 != null) {
                        float f12 = (float) n12;
                        float f13 = k8Var4.f5349s0;
                        float f14 = (float) k8Var4.f5345q0;
                        if ((f12 < f13 * f14 || f12 > k8Var4.f5351t0 * f14) && System.currentTimeMillis() - b7Var3.J > 500) {
                            b7Var3.J = System.currentTimeMillis();
                            e81 e81Var4 = b7Var3.f4769x;
                            k8 k8Var5 = b7Var3.d;
                            long j10 = k8Var5.f5349s0 * ((float) k8Var5.f5345q0);
                            e81Var4.L(j10, false);
                            b7Var3.w(true);
                            n12 = j10;
                        }
                    }
                    b7Var3.F.setProgress(n12);
                    if (b7Var3.f4769x.y()) {
                        AndroidUtilities.cancelRunOnUIThread(z6Var3);
                        AndroidUtilities.runOnUIThread(z6Var3, 1000.0f / AndroidUtilities.screenRefreshRate);
                        return;
                    }
                    return;
                }
                return;
            default:
                b7 b7Var4 = this.f6373b;
                u71 u71Var = b7Var4.f4755n;
                if (u71Var != null) {
                    yz yzVar = u71Var.f31370b;
                    if (yzVar != null) {
                        yzVar.postRunnable(new vz(yzVar, 0));
                    }
                    u71Var.f31369a = null;
                    b7Var4.removeView(b7Var4.f4755n);
                    b7Var4.f4755n = null;
                    return;
                }
                return;
        }
    }
}
