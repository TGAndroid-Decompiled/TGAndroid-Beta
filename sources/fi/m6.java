package fi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.b00;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.h81;
import org.telegram.ui.Components.s81;
public final class m6 implements Runnable {
    public final int f11254a;
    public final o6 f11255b;

    public m6(o6 o6Var, int i10) {
        this.f11254a = i10;
        this.f11255b = o6Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f11254a) {
            case 0:
                this.f11255b.r();
                return;
            case 1:
                this.f11255b.r();
                return;
            case 2:
                this.f11255b.m(0L);
                return;
            case 3:
                o6 o6Var = this.f11255b;
                m6 m6Var = o6Var.K;
                s81 s81Var = o6Var.e;
                if (s81Var != null && o6Var.F != null) {
                    long n10 = s81Var.n();
                    if (o6Var.getDuration() > 1) {
                        float duration = ((float) n10) / ((float) o6Var.getDuration());
                        boolean z11 = false;
                        if (!o6Var.F.f10649m1) {
                            w7 w7Var = o6Var.d;
                            if ((duration < w7Var.Z || duration > w7Var.f11889a0) && System.currentTimeMillis() - o6Var.J > 500) {
                                o6Var.J = System.currentTimeMillis();
                                s81 s81Var2 = o6Var.e;
                                long duration2 = o6Var.d.Z * ((float) o6Var.getDuration());
                                s81Var2.L(duration2, false);
                                o6Var.w(true);
                                o6Var.y(true);
                                n10 = duration2;
                                o6Var.F.setProgress(o6Var.e.n());
                            }
                        }
                        if (n10 < o6Var.I) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        o6Var.w(z10);
                        if (n10 < o6Var.I) {
                            z11 = true;
                        }
                        o6Var.y(z11);
                        o6Var.F.setProgress(o6Var.e.n());
                    } else {
                        o6Var.F.setProgress(o6Var.e.n());
                    }
                    if (o6Var.e.y()) {
                        AndroidUtilities.cancelRunOnUIThread(m6Var);
                        AndroidUtilities.runOnUIThread(m6Var, 1000.0f / AndroidUtilities.screenRefreshRate);
                    }
                    o6Var.I = n10;
                    return;
                }
                return;
            case 4:
                o6 o6Var2 = this.f11255b;
                m6 m6Var2 = o6Var2.L;
                if (o6Var2.f11393y != null && o6Var2.e == null && o6Var2.f11391x == null && o6Var2.F != null && !o6Var2.j()) {
                    long n11 = o6Var2.f11393y.n();
                    w7 w7Var2 = o6Var2.d;
                    if (w7Var2 != null) {
                        float f7 = (float) n11;
                        float f10 = w7Var2.E;
                        float f11 = (float) w7Var2.C;
                        if ((f7 < f10 * f11 || f7 > w7Var2.F * f11) && System.currentTimeMillis() - o6Var2.J > 500) {
                            o6Var2.J = System.currentTimeMillis();
                            s81 s81Var3 = o6Var2.f11393y;
                            w7 w7Var3 = o6Var2.d;
                            long j10 = w7Var3.E * ((float) w7Var3.C);
                            s81Var3.L(j10, false);
                            n11 = j10;
                        }
                    }
                    o6Var2.F.setProgress(n11);
                    if (o6Var2.f11393y.y()) {
                        AndroidUtilities.cancelRunOnUIThread(m6Var2);
                        AndroidUtilities.runOnUIThread(m6Var2, 1000.0f / AndroidUtilities.screenRefreshRate);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                o6 o6Var3 = this.f11255b;
                m6 m6Var3 = o6Var3.M;
                if (o6Var3.f11391x != null && o6Var3.e == null && !o6Var3.j() && o6Var3.F != null) {
                    long n12 = o6Var3.f11391x.n();
                    w7 w7Var4 = o6Var3.d;
                    if (w7Var4 != null) {
                        float f12 = (float) n12;
                        float f13 = w7Var4.f11926s0;
                        float f14 = (float) w7Var4.f11922q0;
                        if ((f12 < f13 * f14 || f12 > w7Var4.f11928t0 * f14) && System.currentTimeMillis() - o6Var3.J > 500) {
                            o6Var3.J = System.currentTimeMillis();
                            s81 s81Var4 = o6Var3.f11391x;
                            w7 w7Var5 = o6Var3.d;
                            long j11 = w7Var5.f11926s0 * ((float) w7Var5.f11922q0);
                            s81Var4.L(j11, false);
                            o6Var3.w(true);
                            n12 = j11;
                        }
                    }
                    o6Var3.F.setProgress(n12);
                    if (o6Var3.f11391x.y()) {
                        AndroidUtilities.cancelRunOnUIThread(m6Var3);
                        AndroidUtilities.runOnUIThread(m6Var3, 1000.0f / AndroidUtilities.screenRefreshRate);
                        return;
                    }
                    return;
                }
                return;
            default:
                o6 o6Var4 = this.f11255b;
                h81 h81Var = o6Var4.f11377n;
                if (h81Var != null) {
                    e00 e00Var = h81Var.f28860b;
                    if (e00Var != null) {
                        e00Var.postRunnable(new b00(e00Var, 0));
                    }
                    h81Var.f28859a = null;
                    o6Var4.removeView(o6Var4.f11377n);
                    o6Var4.f11377n = null;
                    return;
                }
                return;
        }
    }
}
