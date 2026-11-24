package defpackage;

import java.util.ArrayList;
public final class iy9 extends yp {
    public final byte c;
    public final vz9 d;

    public iy9(vz9 vz9Var, byte b) {
        this.c = b;
        this.d = vz9Var;
    }

    @Override
    public final int i(int i) {
        int i2;
        byte b = this.c;
        vz9 vz9Var = this.d;
        switch (b) {
            case 0:
                if (vz9Var.x0.indexOfKey(i) < 0 && vz9Var.A0.indexOfKey(i) < 0 && i != vz9Var.f && i != vz9Var.E && i != vz9Var.n && i != vz9Var.h && i != vz9Var.w && i != vz9Var.a && i != vz9Var.y) {
                    if ((i >= vz9Var.F && i < vz9Var.G) || vz9Var.R) {
                        return 8;
                    }
                    return 5;
                }
                return vz9Var.s0.J;
            default:
                gz9 gz9Var = vz9Var.r0;
                int d = gz9Var.d(i);
                if (d == 6) {
                    return vz9Var.s0.J;
                }
                if (d == 5) {
                    return 8;
                }
                vz9 vz9Var2 = gz9Var.s;
                if (vz9Var2.a0 == 14) {
                    ArrayList arrayList = vz9Var2.D1;
                    if (arrayList != null && i >= (i2 = gz9Var.c) && i - i2 < arrayList.size()) {
                        return 8;
                    }
                } else {
                    int i3 = gz9Var.c;
                    if (i > i3 && (i - i3) - 1 < vz9Var2.E1.size()) {
                        return 8;
                    }
                }
                return 5;
        }
    }
}
