package defpackage;
public final class fg7 {
    public final pg7 a;
    public final int b;
    public final int c;
    public final byte d;
    public final fg7 e;
    public final int f;

    public fg7(vh4 vh4Var, pg7 pg7Var, int i, int i2, int i3, fg7 fg7Var, xdc xdcVar) {
        int i4;
        int i5;
        this.a = pg7Var;
        this.b = i;
        pg7 pg7Var2 = pg7.BYTE;
        if (pg7Var != pg7Var2 && fg7Var != null) {
            i4 = fg7Var.c;
        } else {
            i4 = i2;
        }
        this.c = i4;
        this.d = i3;
        this.e = fg7Var;
        boolean z = false;
        if (fg7Var != null) {
            i5 = fg7Var.f;
        } else {
            i5 = 0;
        }
        if ((pg7Var == pg7Var2 && fg7Var == null && i4 != 0) || (fg7Var != null && i4 != fg7Var.c)) {
            z = true;
        }
        int i6 = 4;
        i5 = (fg7Var == null || pg7Var != fg7Var.a || z) ? i5 + pg7Var.a(xdcVar) + 4 : i5;
        int ordinal = pg7Var.ordinal();
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
