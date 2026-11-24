package defpackage;
public final class l45 extends yo {
    public final h75 c;

    public l45(h75 h75Var) {
        this.c = h75Var;
    }

    @Override
    public final int i(int i) {
        int i2;
        c75 c75Var;
        int i3;
        int i4;
        int i5;
        if (h75.u5) {
            i2 = 6;
        } else {
            i2 = 2;
        }
        if (!h75.v5 && i >= (i3 = (c75Var = this.c.I1).H) && i < (i4 = c75Var.I)) {
            int i6 = i4 - i3;
            if (i == i4 - 1 && (h75.u5 || i6 % 2 != 0)) {
                i5 = 2;
            } else {
                i5 = 1;
            }
            if (h75.u5) {
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
