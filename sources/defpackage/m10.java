package defpackage;

import org.telegram.messenger.MediaController;
public final class m10 implements Runnable {
    public final byte a;
    public final n10 b;

    public m10(n10 n10Var, byte b) {
        this.a = b;
        this.b = n10Var;
    }

    @Override
    public final void run() {
        long U;
        long j;
        float f;
        byte b = this.a;
        n10 n10Var = this.b;
        switch (b) {
            case 0:
                int i = n10Var.w + 1;
                n10Var.w = i;
                if (i == 1) {
                    j20 j20Var = n10Var.I;
                    j20Var.A2 = -1;
                    j20Var.B2 = MediaController.z().v0.b0;
                    n10Var.x = System.currentTimeMillis();
                    hl.d3(this, 2000L);
                    hl.c3(n10Var.F);
                    return;
                } else if (i == 2) {
                    hl.d3(this, 2000L);
                    return;
                } else {
                    return;
                }
            default:
                j20 j20Var2 = n10Var.I;
                kfc kfcVar = MediaController.z().j0;
                if (kfcVar == null) {
                    U = 0;
                } else {
                    U = kfcVar.U();
                }
                if (U != 0 && U != -9223372036854775807L) {
                    float f2 = j20Var2.B2;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j2 = currentTimeMillis - n10Var.x;
                    n10Var.x = currentTimeMillis;
                    long j3 = currentTimeMillis - n10Var.y;
                    int i2 = n10Var.w;
                    if (i2 == 1) {
                        j = 3;
                    } else if (i2 == 2) {
                        j = 6;
                    } else {
                        j = 12;
                    }
                    long j4 = j2 * j;
                    float f3 = ((f2 * f) - ((float) j4)) / ((float) U);
                    if (f3 < 0.0f) {
                        f3 = 0.0f;
                    }
                    j20Var2.B2 = f3;
                    r47 r47Var = MediaController.z().v0;
                    if (r47Var != null && r47Var.I3()) {
                        j20Var2.X0(r47Var, false);
                    }
                    if (j20Var2.A2 == -1 && n10Var.w > 0) {
                        if (j3 > 200 || j20Var2.B2 == 0.0f) {
                            n10Var.y = currentTimeMillis;
                            if (j20Var2.B2 == 0.0f) {
                                MediaController.z().k0(MediaController.z().v0, 0.0f);
                                kfc kfcVar2 = MediaController.z().j0;
                                if (kfcVar2 != null) {
                                    kfcVar2.f0();
                                }
                            } else {
                                MediaController.z().k0(MediaController.z().v0, f3);
                            }
                        }
                        if (n10Var.w > 0 && j20Var2.B2 > 0.0f) {
                            hl.d3(n10Var.F, 16L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                n10Var.x = System.currentTimeMillis();
                return;
        }
    }
}
