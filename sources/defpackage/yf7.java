package defpackage;
public final class yf7 {
    public final ig7 a;
    public final int b;
    public final int c;
    public final byte d;
    public final yf7 e;
    public final int f;

    public yf7(yh4 yh4Var, ig7 ig7Var, int i, int i2, int i3, yf7 yf7Var, ybc ybcVar) {
        int i4;
        int i5;
        this.a = ig7Var;
        this.b = i;
        ig7 ig7Var2 = ig7.BYTE;
        if (ig7Var != ig7Var2 && yf7Var != null) {
            i4 = yf7Var.c;
        } else {
            i4 = i2;
        }
        this.c = i4;
        this.d = i3;
        this.e = yf7Var;
        boolean z = false;
        if (yf7Var != null) {
            i5 = yf7Var.f;
        } else {
            i5 = 0;
        }
        if ((ig7Var == ig7Var2 && yf7Var == null && i4 != 0) || (yf7Var != null && i4 != yf7Var.c)) {
            z = true;
        }
        int i6 = 4;
        i5 = (yf7Var == null || ig7Var != yf7Var.a || z) ? i5 + ig7Var.a(ybcVar) + 4 : i5;
        int ordinal = ig7Var.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 4) {
                    if (ordinal == 6) {
                        i5 += 13;
                    }
                } else {
                    i5 += ((String) yh4Var.b).substring(i, i3 + i).getBytes(((pt3) yh4Var.c).a[i2].charset()).length << 3;
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
