package defpackage;

import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.l;
public final class ln1 implements Runnable {
    public final byte a = 0;
    public final zu1 b;
    public final boolean c;
    public final long d;

    public ln1(zu1 zu1Var, long j, boolean z) {
        this.b = zu1Var;
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
        zu1 zu1Var = this.b;
        switch (b) {
            case 0:
                zu1Var.q9(j3, z);
                return;
            default:
                nr1 nr1Var = zu1Var.a0;
                if (nr1Var != null) {
                    MediaController z2 = MediaController.z();
                    if (!nr1Var.N2 && !nr1Var.u3 && z2.I() && !z2.J() && z2.h1 == nr1Var.v3) {
                        nr1Var.d1 = false;
                        zw1 zw1Var = nr1Var.c1;
                        if (zw1Var != null) {
                            zw1Var.j(gz1.a, false);
                        }
                        nr1Var.x4 = true;
                        nr1Var.u3 = true;
                        xy1 xy1Var = nr1Var.O3;
                        if (xy1Var != null) {
                            xy1Var.z0(1);
                        }
                        nr1Var.D2(0, true);
                        if (z) {
                            nr1Var.P = true;
                            l lVar = nr1Var.D2;
                            if (lVar != null) {
                                lVar.E.f(1, true, false);
                            }
                            ls6 d0 = ls6.d0(nr1Var.R);
                            long j4 = nr1Var.F3;
                            zu1 zu1Var2 = nr1Var.E3;
                            if (zu1Var2 != null && zu1Var2.x4) {
                                j2 = zu1Var2.c();
                            } else {
                                j2 = 0;
                            }
                            d0.g2(j4, j2, true);
                        }
                        if (j3 > 0) {
                            j = System.currentTimeMillis() - j3;
                        } else {
                            j = z2.l1;
                        }
                        nr1Var.X1 = j;
                        ez1 ez1Var = nr1Var.Z0;
                        if (ez1Var != null) {
                            ez1Var.a(j);
                        }
                        nr1Var.j5 = true;
                        nr1Var.o2();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public ln1(zu1 zu1Var, boolean z, long j) {
        this.b = zu1Var;
        this.c = z;
        this.d = j;
    }
}
