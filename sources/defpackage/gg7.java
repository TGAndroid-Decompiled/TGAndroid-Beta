package defpackage;
public final class gg7 {
    public final qg7 a;
    public final int b;
    public final int c;
    public final byte d;
    public final gg7 e;
    public final int f;

    public gg7(vh4 vh4Var, qg7 qg7Var, int i, int i2, int i3, gg7 gg7Var, xdc xdcVar) {
        int i4;
        int i5;
        this.a = qg7Var;
        this.b = i;
        qg7 qg7Var2 = qg7.BYTE;
        if (qg7Var != qg7Var2 && gg7Var != null) {
            i4 = gg7Var.c;
        } else {
            i4 = i2;
        }
        this.c = i4;
        this.d = i3;
        this.e = gg7Var;
        boolean z = false;
        if (gg7Var != null) {
            i5 = gg7Var.f;
        } else {
            i5 = 0;
        }
        if ((qg7Var == qg7Var2 && gg7Var == null && i4 != 0) || (gg7Var != null && i4 != gg7Var.c)) {
            z = true;
        }
        int i6 = 4;
        i5 = (gg7Var == null || qg7Var != gg7Var.a || z) ? i5 + qg7Var.a(xdcVar) + 4 : i5;
        int ordinal = qg7Var.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 4) {
                    if (ordinal == 6) {
                        i5 += 13;
                    }
                } else {
                    i5 += ((String) vh4Var.b).substring(i, i3 + i).getBytes(((xs3) vh4Var.c).a[i2].charset()).length << 3;
                    if (z) {
                        i5 += 12;
                    }
                }
            } else {
                i5 += i3 != 1 ? 11 : 6;
            }
        } else {
            if (i3 != 1) {
                if (i3 == 2) {
                    i6 = 7;
                } else {
                    i6 = 10;
                }
            }
            i5 += i6;
        }
        this.f = i5;
    }
}
