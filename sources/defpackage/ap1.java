package defpackage;

import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.l;
public final class ap1 implements Runnable {
    public final byte a = 0;
    public final yv1 b;
    public final boolean c;
    public final long d;

    public ap1(yv1 yv1Var, long j, boolean z) {
        this.b = yv1Var;
        this.d = j;
        this.c = z;
    }

    @Override
    public final void run() {
        long j;
        long j2;
        byte b = this.a;
        long j3 = this.d;
        boolean z = this.c;
        yv1 yv1Var = this.b;
        switch (b) {
            case 0:
                yv1Var.p9(j3, z);
                return;
            default:
                ms1 ms1Var = yv1Var.a0;
                if (ms1Var != null) {
                    MediaController w = MediaController.w();
                    if (!ms1Var.O2 && !ms1Var.v3 && w.E() && !w.F() && w.h1 == ms1Var.w3) {
                        ms1Var.d1 = false;
                        zx1 zx1Var = ms1Var.c1;
                        if (zx1Var != null) {
                            zx1Var.j(b02.a, false);
                        }
                        ms1Var.y4 = true;
                        ms1Var.v3 = true;
                        uz1 uz1Var = ms1Var.P3;
                        if (uz1Var != null) {
                            uz1Var.z0(1);
                        }
                        ms1Var.w2(0, true);
                        if (z) {
                            ms1Var.P = true;
                            l lVar = ms1Var.E2;
                            if (lVar != null) {
                                lVar.E.d(1, true, false);
                            }
                            hs6 d0 = hs6.d0(ms1Var.R);
                            long j4 = ms1Var.G3;
                            yv1 yv1Var2 = ms1Var.F3;
                            if (yv1Var2 != null && yv1Var2.x4) {
                                j2 = yv1Var2.d();
                            } else {
                                j2 = 0;
                            }
                            d0.g2(j4, j2, true);
                        }
                        if (j3 > 0) {
                            j = System.currentTimeMillis() - j3;
                        } else {
                            j = w.l1;
                        }
                        ms1Var.Y1 = j;
                        zz1 zz1Var = ms1Var.Z0;
                        if (zz1Var != null) {
                            zz1Var.a(j);
                        }
                        ms1Var.h5 = true;
                        ms1Var.f2();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public ap1(yv1 yv1Var, boolean z, long j) {
        this.b = yv1Var;
        this.c = z;
        this.d = j;
    }
}
