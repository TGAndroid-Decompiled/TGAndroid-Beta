package ei;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.c00;
import org.telegram.ui.Components.j81;
import org.telegram.ui.Components.y71;
import org.telegram.ui.Components.zz;
public final class o6 implements Runnable {
    public final int f9568a;
    public final r6 f9569b;

    public o6(r6 r6Var, int i10) {
        this.f9568a = i10;
        this.f9569b = r6Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f9568a) {
            case 0:
                this.f9569b.r();
                return;
            case 1:
                this.f9569b.r();
                return;
            case 2:
                this.f9569b.m(0L);
                return;
            case 3:
                r6 r6Var = this.f9569b;
                o6 o6Var = r6Var.K;
                j81 j81Var = r6Var.e;
                if (j81Var != null && r6Var.F != null) {
                    long n10 = j81Var.n();
                    if (r6Var.getDuration() > 1) {
                        float duration = ((float) n10) / ((float) r6Var.getDuration());
                        boolean z11 = false;
                        if (!r6Var.F.f9116m1) {
                            a8 a8Var = r6Var.d;
                            if ((duration < a8Var.Z || duration > a8Var.f8704a0) && System.currentTimeMillis() - r6Var.J > 500) {
                                r6Var.J = System.currentTimeMillis();
                                j81 j81Var2 = r6Var.e;
                                long duration2 = r6Var.d.Z * ((float) r6Var.getDuration());
                                j81Var2.L(duration2, false);
                                r6Var.w(true);
                                r6Var.y(true);
                                n10 = duration2;
                                r6Var.F.setProgress(r6Var.e.n());
                            }
                        }
                        if (n10 < r6Var.I) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        r6Var.w(z10);
                        if (n10 < r6Var.I) {
                            z11 = true;
                        }
                        r6Var.y(z11);
                        r6Var.F.setProgress(r6Var.e.n());
                    } else {
                        r6Var.F.setProgress(r6Var.e.n());
                    }
                    if (r6Var.e.y()) {
                        AndroidUtilities.cancelRunOnUIThread(o6Var);
                        AndroidUtilities.runOnUIThread(o6Var, 1000.0f / AndroidUtilities.screenRefreshRate);
                    }
                    r6Var.I = n10;
                    return;
                }
                return;
            case 4:
                r6 r6Var2 = this.f9569b;
                o6 o6Var2 = r6Var2.L;
                if (r6Var2.f9753y != null && r6Var2.e == null && r6Var2.f9751x == null && r6Var2.F != null && !r6Var2.j()) {
                    long n11 = r6Var2.f9753y.n();
                    a8 a8Var2 = r6Var2.d;
                    if (a8Var2 != null) {
                        float f7 = (float) n11;
                        float f10 = a8Var2.E;
                        float f11 = (float) a8Var2.C;
                        if ((f7 < f10 * f11 || f7 > a8Var2.F * f11) && System.currentTimeMillis() - r6Var2.J > 500) {
                            r6Var2.J = System.currentTimeMillis();
                            j81 j81Var3 = r6Var2.f9753y;
                            a8 a8Var3 = r6Var2.d;
                            long j10 = a8Var3.E * ((float) a8Var3.C);
                            j81Var3.L(j10, false);
                            n11 = j10;
                        }
                    }
                    r6Var2.F.setProgress(n11);
                    if (r6Var2.f9753y.y()) {
                        AndroidUtilities.cancelRunOnUIThread(o6Var2);
                        AndroidUtilities.runOnUIThread(o6Var2, 1000.0f / AndroidUtilities.screenRefreshRate);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                r6 r6Var3 = this.f9569b;
                o6 o6Var3 = r6Var3.M;
                if (r6Var3.f9751x != null && r6Var3.e == null && !r6Var3.j() && r6Var3.F != null) {
                    long n12 = r6Var3.f9751x.n();
                    a8 a8Var4 = r6Var3.d;
                    if (a8Var4 != null) {
                        float f12 = (float) n12;
                        float f13 = a8Var4.f8741s0;
                        float f14 = (float) a8Var4.f8737q0;
                        if ((f12 < f13 * f14 || f12 > a8Var4.f8743t0 * f14) && System.currentTimeMillis() - r6Var3.J > 500) {
                            r6Var3.J = System.currentTimeMillis();
                            j81 j81Var4 = r6Var3.f9751x;
                            a8 a8Var5 = r6Var3.d;
                            long j11 = a8Var5.f8741s0 * ((float) a8Var5.f8737q0);
                            j81Var4.L(j11, false);
                            r6Var3.w(true);
                            n12 = j11;
                        }
                    }
                    r6Var3.F.setProgress(n12);
                    if (r6Var3.f9751x.y()) {
                        AndroidUtilities.cancelRunOnUIThread(o6Var3);
                        AndroidUtilities.runOnUIThread(o6Var3, 1000.0f / AndroidUtilities.screenRefreshRate);
                        return;
                    }
                    return;
                }
                return;
            default:
                r6 r6Var4 = this.f9569b;
                y71 y71Var = r6Var4.f9737n;
                if (y71Var != null) {
                    c00 c00Var = y71Var.f32834b;
                    if (c00Var != null) {
                        c00Var.postRunnable(new zz(c00Var, 0));
                    }
                    y71Var.f32833a = null;
                    r6Var4.removeView(r6Var4.f9737n);
                    r6Var4.f9737n = null;
                    return;
                }
                return;
        }
    }
}
