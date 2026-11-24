package defpackage;
public final class j65 extends yp {
    public final g95 c;

    public j65(g95 g95Var) {
        this.c = g95Var;
    }

    @Override
    public final int i(int i) {
        int i2;
        b95 b95Var;
        int i3;
        int i4;
        int i5;
        if (g95.u5) {
            i2 = 6;
        } else {
            i2 = 2;
        }
        if (!g95.v5 && i >= (i3 = (b95Var = this.c.I1).H) && i < (i4 = b95Var.I)) {
            int i6 = i4 - i3;
            if (i == i4 - 1 && (g95.u5 || i6 % 2 != 0)) {
                i5 = 2;
            } else {
                i5 = 1;
            }
            if (g95.u5) {
                if (i6 == 1) {
                    return 6;
                }
                if (i6 != 2) {
                    return 2;
                }
                return 3;
            }
            return i5;
        }
        return i2;
    }
}
