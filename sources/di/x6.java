package di;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.h00;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.y71;
public final class x6 implements Runnable {
    public final int f8091a;
    public final a7 f8092b;

    public x6(a7 a7Var, int i10) {
        this.f8091a = i10;
        this.f8092b = a7Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f8091a) {
            case 0:
                this.f8092b.r();
                return;
            case 1:
                this.f8092b.r();
                return;
            case 2:
                this.f8092b.m(0L);
                return;
            case 3:
                a7 a7Var = this.f8092b;
                x6 x6Var = a7Var.K;
                i81 i81Var = a7Var.e;
                if (i81Var != null && a7Var.F != null) {
                    long n10 = i81Var.n();
                    if (a7Var.getDuration() > 1) {
                        float duration = ((float) n10) / ((float) a7Var.getDuration());
                        boolean z11 = false;
                        if (!a7Var.F.f7938m1) {
                            k8 k8Var = a7Var.d;
                            if ((duration < k8Var.Z || duration > k8Var.f7176a0) && System.currentTimeMillis() - a7Var.J > 500) {
                                a7Var.J = System.currentTimeMillis();
                                i81 i81Var2 = a7Var.e;
                                long duration2 = a7Var.d.Z * ((float) a7Var.getDuration());
                                i81Var2.L(duration2, false);
                                a7Var.w(true);
                                a7Var.y(true);
                                n10 = duration2;
                                a7Var.F.setProgress(a7Var.e.n());
                            }
                        }
                        if (n10 < a7Var.I) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        a7Var.w(z10);
                        if (n10 < a7Var.I) {
                            z11 = true;
                        }
                        a7Var.y(z11);
                        a7Var.F.setProgress(a7Var.e.n());
                    } else {
                        a7Var.F.setProgress(a7Var.e.n());
                    }
                    if (a7Var.e.y()) {
                        AndroidUtilities.cancelRunOnUIThread(x6Var);
                        AndroidUtilities.runOnUIThread(x6Var, 1000.0f / AndroidUtilities.screenRefreshRate);
                    }
                    a7Var.I = n10;
                    return;
                }
                return;
            case 4:
                a7 a7Var2 = this.f8092b;
                x6 x6Var2 = a7Var2.L;
                if (a7Var2.f6628y != null && a7Var2.e == null && a7Var2.f6626x == null && a7Var2.F != null && !a7Var2.j()) {
                    long n11 = a7Var2.f6628y.n();
                    k8 k8Var2 = a7Var2.d;
                    if (k8Var2 != null) {
                        float f7 = (float) n11;
                        float f10 = k8Var2.E;
                        float f11 = (float) k8Var2.C;
                        if ((f7 < f10 * f11 || f7 > k8Var2.F * f11) && System.currentTimeMillis() - a7Var2.J > 500) {
                            a7Var2.J = System.currentTimeMillis();
                            i81 i81Var3 = a7Var2.f6628y;
                            k8 k8Var3 = a7Var2.d;
                            long j10 = k8Var3.E * ((float) k8Var3.C);
                            i81Var3.L(j10, false);
                            n11 = j10;
                        }
                    }
                    a7Var2.F.setProgress(n11);
                    if (a7Var2.f6628y.y()) {
                        AndroidUtilities.cancelRunOnUIThread(x6Var2);
                        AndroidUtilities.runOnUIThread(x6Var2, 1000.0f / AndroidUtilities.screenRefreshRate);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                a7 a7Var3 = this.f8092b;
                x6 x6Var3 = a7Var3.M;
                if (a7Var3.f6626x != null && a7Var3.e == null && !a7Var3.j() && a7Var3.F != null) {
                    long n12 = a7Var3.f6626x.n();
                    k8 k8Var4 = a7Var3.d;
                    if (k8Var4 != null) {
                        float f12 = (float) n12;
                        float f13 = k8Var4.f7213s0;
                        float f14 = (float) k8Var4.f7209q0;
                        if ((f12 < f13 * f14 || f12 > k8Var4.f7215t0 * f14) && System.currentTimeMillis() - a7Var3.J > 500) {
                            a7Var3.J = System.currentTimeMillis();
                            i81 i81Var4 = a7Var3.f6626x;
                            k8 k8Var5 = a7Var3.d;
                            long j11 = k8Var5.f7213s0 * ((float) k8Var5.f7209q0);
                            i81Var4.L(j11, false);
                            a7Var3.w(true);
                            n12 = j11;
                        }
                    }
                    a7Var3.F.setProgress(n12);
                    if (a7Var3.f6626x.y()) {
                        AndroidUtilities.cancelRunOnUIThread(x6Var3);
                        AndroidUtilities.runOnUIThread(x6Var3, 1000.0f / AndroidUtilities.screenRefreshRate);
                        return;
                    }
                    return;
                }
                return;
            default:
                a7 a7Var4 = this.f8092b;
                y71 y71Var = a7Var4.f6612n;
                if (y71Var != null) {
                    h00 h00Var = y71Var.f31176b;
                    if (h00Var != null) {
                        h00Var.postRunnable(new e00(h00Var, 0));
                    }
                    y71Var.f31175a = null;
                    a7Var4.removeView(a7Var4.f6612n);
                    a7Var4.f6612n = null;
                    return;
                }
                return;
        }
    }
}
