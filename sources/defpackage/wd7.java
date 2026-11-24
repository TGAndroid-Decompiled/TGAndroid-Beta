package defpackage;
public final class wd7 {
    public final ge7 a;
    public final int b;
    public final int c;
    public final byte d;
    public final wd7 e;
    public final int f;

    public wd7(xf4 xf4Var, ge7 ge7Var, int i, int i2, int i3, wd7 wd7Var, x9c x9cVar) {
        int i4;
        int i5;
        this.a = ge7Var;
        this.b = i;
        ge7 ge7Var2 = ge7.BYTE;
        if (ge7Var != ge7Var2 && wd7Var != null) {
            i4 = wd7Var.c;
        } else {
            i4 = i2;
        }
        this.c = i4;
        this.d = i3;
        this.e = wd7Var;
        boolean z = false;
        if (wd7Var != null) {
            i5 = wd7Var.f;
        } else {
            i5 = 0;
        }
        if ((ge7Var == ge7Var2 && wd7Var == null && i4 != 0) || (wd7Var != null && i4 != wd7Var.c)) {
            z = true;
        }
        int i6 = 4;
        i5 = (wd7Var == null || ge7Var != wd7Var.a || z) ? i5 + ge7Var.a(x9cVar) + 4 : i5;
        int ordinal = ge7Var.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 4) {
                    if (ordinal == 6) {
                        i5 += 13;
                    }
                } else {
                    i5 += ((String) xf4Var.b).substring(i, i3 + i).getBytes(((fs3) xf4Var.c).a[i2].charset()).length << 3;
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
