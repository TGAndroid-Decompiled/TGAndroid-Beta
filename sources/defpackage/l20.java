package defpackage;

import org.telegram.messenger.MediaController;
public final class l20 implements Runnable {
    public final byte a;
    public final m20 b;

    public l20(m20 m20Var, byte b) {
        this.a = b;
        this.b = m20Var;
    }

    @Override
    public final void run() {
        long U;
        long j;
        float f;
        byte b = this.a;
        m20 m20Var = this.b;
        switch (b) {
            case 0:
                int i = m20Var.w + 1;
                m20Var.w = i;
                if (i == 1) {
                    i30 i30Var = m20Var.I;
                    i30Var.A2 = -1;
                    i30Var.B2 = MediaController.w().v0.b0;
                    m20Var.x = System.currentTimeMillis();
                    gm.d3(this, 2000L);
                    gm.c3(m20Var.F);
                    return;
                } else if (i == 2) {
                    gm.d3(this, 2000L);
                    return;
                } else {
                    return;
                }
            default:
                i30 i30Var2 = m20Var.I;
                ndc ndcVar = MediaController.w().j0;
                if (ndcVar == null) {
                    U = 0;
                } else {
                    U = ndcVar.U();
                }
                if (U != 0 && U != -9223372036854775807L) {
                    float f2 = i30Var2.B2;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j2 = currentTimeMillis - m20Var.x;
                    m20Var.x = currentTimeMillis;
                    long j3 = currentTimeMillis - m20Var.y;
                    int i2 = m20Var.w;
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
                    i30Var2.B2 = f3;
                    k47 k47Var = MediaController.w().v0;
                    if (k47Var != null && k47Var.I3()) {
                        i30Var2.W0(k47Var, false);
                    }
                    if (i30Var2.A2 == -1 && m20Var.w > 0) {
                        if (j3 > 200 || i30Var2.B2 == 0.0f) {
                            m20Var.y = currentTimeMillis;
                            if (i30Var2.B2 == 0.0f) {
                                MediaController.w().h0(MediaController.w().v0, 0.0f);
                                ndc ndcVar2 = MediaController.w().j0;
                                if (ndcVar2 != null) {
                                    ndcVar2.f0();
                                }
                            } else {
                                MediaController.w().h0(MediaController.w().v0, f3);
                            }
                        }
                        if (m20Var.w > 0 && i30Var2.B2 > 0.0f) {
                            gm.d3(m20Var.F, 16L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                m20Var.x = System.currentTimeMillis();
                return;
        }
    }
}
