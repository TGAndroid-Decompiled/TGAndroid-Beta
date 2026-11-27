package defpackage;
public final class n65 extends zo {
    public final j95 c;

    public n65(j95 j95Var) {
        this.c = j95Var;
    }

    @Override
    public final int i(int i) {
        int i2;
        e95 e95Var;
        int i3;
        int i4;
        int i5;
        if (j95.u5) {
            i2 = 6;
        } else {
            i2 = 2;
        }
        if (!j95.v5 && i >= (i3 = (e95Var = this.c.I1).H) && i < (i4 = e95Var.I)) {
            int i6 = i4 - i3;
            if (i == i4 - 1 && (j95.u5 || i6 % 2 != 0)) {
                i5 = 2;
            } else {
                i5 = 1;
            }
            if (j95.u5) {
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
