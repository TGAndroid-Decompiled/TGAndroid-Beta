package defpackage;

import java.util.ArrayList;
public final class fw9 extends yo {
    public final byte c;
    public final tx9 d;

    public fw9(tx9 tx9Var, byte b) {
        this.c = b;
        this.d = tx9Var;
    }

    @Override
    public final int i(int i) {
        int i2;
        byte b = this.c;
        tx9 tx9Var = this.d;
        switch (b) {
            case 0:
                if (tx9Var.x0.indexOfKey(i) < 0 && tx9Var.A0.indexOfKey(i) < 0 && i != tx9Var.f && i != tx9Var.E && i != tx9Var.n && i != tx9Var.h && i != tx9Var.w && i != tx9Var.a && i != tx9Var.y) {
                    if ((i >= tx9Var.F && i < tx9Var.G) || tx9Var.R) {
                        return 8;
                    }
                    return 5;
                }
                return tx9Var.s0.J;
            default:
                ex9 ex9Var = tx9Var.r0;
                int d = ex9Var.d(i);
                if (d == 6) {
                    return tx9Var.s0.J;
                }
                if (d == 5) {
                    return 8;
                }
                tx9 tx9Var2 = ex9Var.s;
                if (tx9Var2.a0 == 14) {
                    ArrayList arrayList = tx9Var2.D1;
                    if (arrayList != null && i >= (i2 = ex9Var.c) && i - i2 < arrayList.size()) {
                        return 8;
                    }
                } else {
                    int i3 = ex9Var.c;
                    if (i > i3 && (i - i3) - 1 < tx9Var2.E1.size()) {
                        return 8;
                    }
                }
                return 5;
        }
    }
}
