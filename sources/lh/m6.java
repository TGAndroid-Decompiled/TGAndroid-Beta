package lh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.a61;
import org.telegram.ui.Components.gz;
import org.telegram.ui.Components.jz;
import org.telegram.ui.Components.m61;

public final class m6 implements Runnable {

    public final int f16385a;

    public final q6 f16386b;

    public m6(q6 q6Var, int i10) {
        this.f16385a = i10;
        this.f16386b = q6Var;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f16385a) {
            case 0:
                this.f16386b.r();
                break;
            case 1:
                this.f16386b.r();
                break;
            case 2:
                this.f16386b.m(0L);
                break;
            case 3:
                q6 q6Var = this.f16386b;
                m6 m6Var = q6Var.G;
                m61 m61Var = q6Var.f16565e;
                if (m61Var != null && q6Var.B != null) {
                    long jO = m61Var.o();
                    if (q6Var.getDuration() > 1) {
                        float duration = jO / q6Var.getDuration();
                        if (q6Var.B.f15786i1) {
                            if (jO < q6Var.E) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            q6Var.w(z10);
                            q6Var.y(jO < q6Var.E);
                        } else {
                            z7 z7Var = q6Var.d;
                            if ((duration < z7Var.Z || duration > z7Var.f17194a0) && System.currentTimeMillis() - q6Var.F > 500) {
                                q6Var.F = System.currentTimeMillis();
                                m61 m61Var2 = q6Var.f16565e;
                                long duration2 = (long) (q6Var.d.Z * q6Var.getDuration());
                                m61Var2.M(duration2, false);
                                q6Var.w(true);
                                q6Var.y(true);
                                jO = duration2;
                            } else {
                                if (jO < q6Var.E) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                q6Var.w(z10);
                                q6Var.y(jO < q6Var.E);
                            }
                        }
                        q6Var.B.setProgress(q6Var.f16565e.o());
                    } else {
                        q6Var.B.setProgress(q6Var.f16565e.o());
                    }
                    if (q6Var.f16565e.z()) {
                        AndroidUtilities.cancelRunOnUIThread(m6Var);
                        AndroidUtilities.runOnUIThread(m6Var, (long) (1000.0f / AndroidUtilities.screenRefreshRate));
                    }
                    q6Var.E = jO;
                    break;
                }
                break;
            case 4:
                q6 q6Var2 = this.f16386b;
                m6 m6Var2 = q6Var2.H;
                if (q6Var2.f16590y != null && q6Var2.f16565e == null && q6Var2.f16589x == null && q6Var2.B != null && !q6Var2.j()) {
                    long jO2 = q6Var2.f16590y.o();
                    z7 z7Var2 = q6Var2.d;
                    if (z7Var2 != null) {
                        float f10 = jO2;
                        float f11 = z7Var2.E;
                        float f12 = z7Var2.C;
                        if ((f10 < f11 * f12 || f10 > z7Var2.F * f12) && System.currentTimeMillis() - q6Var2.F > 500) {
                            q6Var2.F = System.currentTimeMillis();
                            m61 m61Var3 = q6Var2.f16590y;
                            z7 z7Var3 = q6Var2.d;
                            long j10 = (long) (z7Var3.E * z7Var3.C);
                            m61Var3.M(j10, false);
                            jO2 = j10;
                        }
                    }
                    q6Var2.B.setProgress(jO2);
                    if (q6Var2.f16590y.z()) {
                        AndroidUtilities.cancelRunOnUIThread(m6Var2);
                        AndroidUtilities.runOnUIThread(m6Var2, (long) (1000.0f / AndroidUtilities.screenRefreshRate));
                    }
                    break;
                }
                break;
            case 5:
                q6 q6Var3 = this.f16386b;
                m6 m6Var3 = q6Var3.I;
                if (q6Var3.f16589x != null && q6Var3.f16565e == null && !q6Var3.j() && q6Var3.B != null) {
                    long jO3 = q6Var3.f16589x.o();
                    z7 z7Var4 = q6Var3.d;
                    if (z7Var4 != null) {
                        float f13 = jO3;
                        float f14 = z7Var4.f17232s0;
                        float f15 = z7Var4.f17228q0;
                        if ((f13 < f14 * f15 || f13 > z7Var4.f17234t0 * f15) && System.currentTimeMillis() - q6Var3.F > 500) {
                            q6Var3.F = System.currentTimeMillis();
                            m61 m61Var4 = q6Var3.f16589x;
                            z7 z7Var5 = q6Var3.d;
                            long j11 = (long) (z7Var5.f17232s0 * z7Var5.f17228q0);
                            m61Var4.M(j11, false);
                            q6Var3.w(true);
                            jO3 = j11;
                        }
                    }
                    q6Var3.B.setProgress(jO3);
                    if (q6Var3.f16589x.z()) {
                        AndroidUtilities.cancelRunOnUIThread(m6Var3);
                        AndroidUtilities.runOnUIThread(m6Var3, (long) (1000.0f / AndroidUtilities.screenRefreshRate));
                    }
                    break;
                }
                break;
            default:
                q6 q6Var4 = this.f16386b;
                a61 a61Var = q6Var4.f16575n;
                if (a61Var != null) {
                    jz jzVar = a61Var.f26644b;
                    if (jzVar != null) {
                        jzVar.postRunnable(new gz(jzVar, 0));
                    }
                    a61Var.f26643a = null;
                    q6Var4.removeView(q6Var4.f16575n);
                    q6Var4.f16575n = null;
                }
                break;
        }
    }
}
