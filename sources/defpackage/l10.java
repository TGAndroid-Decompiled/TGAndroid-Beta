package defpackage;

import org.telegram.messenger.MediaController;
public final class l10 implements Runnable {
    public final byte a;
    public final m10 b;

    public l10(m10 m10Var, byte b) {
        this.a = b;
        this.b = m10Var;
    }

    @Override
    public final void run() {
        long U;
        long j;
        float f;
        byte b = this.a;
        m10 m10Var = this.b;
        switch (b) {
            case 0:
                int i = m10Var.w + 1;
                m10Var.w = i;
                if (i == 1) {
                    i20 i20Var = m10Var.I;
                    i20Var.A2 = -1;
                    i20Var.B2 = MediaController.w().v0.b0;
                    m10Var.x = System.currentTimeMillis();
                    gl.d3(this, 2000L);
                    gl.c3(m10Var.F);
                    return;
                } else if (i == 2) {
                    gl.d3(this, 2000L);
                    return;
                } else {
                    return;
                }
            default:
                i20 i20Var2 = m10Var.I;
                lbc lbcVar = MediaController.w().j0;
                if (lbcVar == null) {
                    U = 0;
                } else {
                    U = lbcVar.U();
                }
                if (U != 0 && U != -9223372036854775807L) {
                    float f2 = i20Var2.B2;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j2 = currentTimeMillis - m10Var.x;
                    m10Var.x = currentTimeMillis;
                    long j3 = currentTimeMillis - m10Var.y;
                    int i2 = m10Var.w;
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
                    i20Var2.B2 = f3;
                    k27 k27Var = MediaController.w().v0;
                    if (k27Var != null && k27Var.I3()) {
                        i20Var2.W0(k27Var, false);
                    }
                    if (i20Var2.A2 == -1 && m10Var.w > 0) {
                        if (j3 > 200 || i20Var2.B2 == 0.0f) {
                            m10Var.y = currentTimeMillis;
                            if (i20Var2.B2 == 0.0f) {
                                MediaController.w().h0(MediaController.w().v0, 0.0f);
                                lbc lbcVar2 = MediaController.w().j0;
                                if (lbcVar2 != null) {
                                    lbcVar2.f0();
                                }
                            } else {
                                MediaController.w().h0(MediaController.w().v0, f3);
                            }
                        }
                        if (m10Var.w > 0 && i20Var2.B2 > 0.0f) {
                            gl.d3(m10Var.F, 16L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                m10Var.x = System.currentTimeMillis();
                return;
        }
    }
}
