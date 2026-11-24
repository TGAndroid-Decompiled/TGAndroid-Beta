package defpackage;

import android.os.SystemClock;
public final class pp1 implements Runnable {
    public final byte a;
    public final yv1 b;

    public pp1(yv1 yv1Var, byte b) {
        this.a = b;
        this.b = yv1Var;
    }

    @Override
    public final void run() {
        hg5 hg5Var;
        boolean z;
        byte b = this.a;
        yv1 yv1Var = this.b;
        switch (b) {
            case 0:
                yv1Var.O7();
                yv1Var.Q7();
                yv1Var.E5();
                yv1Var.G5();
                return;
            case 1:
                ps1 ps1Var = yv1Var.g3;
                if ((ps1Var == null || ps1Var.getVisibility() != 0) && (hg5Var = yv1Var.L1) != null) {
                    hg5Var.v();
                    return;
                }
                return;
            case 2:
                yv1Var.x5();
                return;
            case 3:
                if (yv1Var.h6 != 0 && SystemClock.elapsedRealtime() >= yv1Var.h6 + 150) {
                    z = true;
                } else {
                    z = false;
                }
                yv1Var.gd(0, z);
                return;
            case 4:
                yv1Var.n5(false);
                return;
            case 5:
                int i = yv1.xd;
                yv1Var.m5();
                return;
            case 6:
                int i2 = yv1.xd;
                yv1Var.m5();
                return;
            case 7:
                int i3 = yv1.xd;
                yv1Var.U4();
                return;
            case 8:
                int i4 = yv1.xd;
                yv1Var.U4();
                return;
            case 9:
                int i5 = yv1.xd;
                yv1Var.gb();
                return;
            case 10:
                int i6 = yv1.xd;
                yv1Var.gb();
                return;
            case 11:
                int i7 = yv1.xd;
                yv1Var.gb();
                return;
            case 12:
                int i8 = yv1.xd;
                yv1Var.gb();
                return;
            case 13:
                int i9 = yv1.xd;
                yv1Var.gb();
                return;
            case 14:
                int i10 = yv1.xd;
                yv1Var.gb();
                return;
            case 15:
                int i11 = yv1.xd;
                yv1Var.gb();
                return;
            case 16:
                int i12 = yv1.xd;
                yv1Var.gb();
                return;
            default:
                if (yv1Var.getParentLayout() != null) {
                    sxb.M0(yv1Var);
                    return;
                }
                return;
        }
    }
}
