package defpackage;
public final class ewa {
    public static final ewa f = new ewa(wpb.b, 0, 0, 0);
    public final int a;
    public final wpb b;
    public final int c;
    public final int d;
    public final byte e;

    public ewa(wpb wpbVar, int i, int i2, int i3) {
        byte b;
        this.b = wpbVar;
        this.a = i;
        this.c = i2;
        this.d = i3;
        if (i2 > 62) {
            b = 21;
        } else if (i2 > 31) {
            b = 20;
        } else if (i2 > 0) {
            b = 10;
        } else {
            b = 0;
        }
        this.e = b;
    }

    public final ewa a(int i) {
        int i2;
        wpb wpbVar = this.b;
        int i3 = this.a;
        int i4 = this.d;
        if (i3 == 4 || i3 == 2) {
            int[] iArr = ae5.b[i3];
            i3 = 0;
            int i5 = iArr[0];
            int i6 = 65535 & i5;
            int i7 = i5 >> 16;
            wpbVar.getClass();
            i4 += i7;
            wpbVar = new kia(wpbVar, i6, i7);
        }
        int i8 = this.c;
        if (i8 != 0 && i8 != 31) {
            if (i8 == 62) {
                i2 = 9;
            } else {
                i2 = 8;
            }
        } else {
            i2 = 18;
        }
        int i9 = i8 + 1;
        ewa ewaVar = new ewa(wpbVar, i3, i9, i4 + i2);
        if (i9 == 2078) {
            return ewaVar.b(i + 1);
        }
        return ewaVar;
    }

    public final ewa b(int i) {
        int i2 = this.c;
        if (i2 == 0) {
            return this;
        }
        wpb wpbVar = this.b;
        wpbVar.getClass();
        return new ewa(new oi0(wpbVar, i - i2, i2), this.a, 0, this.d);
    }

    public final boolean c(ewa ewaVar) {
        int i = this.d + (ae5.b[this.a][ewaVar.a] >> 16);
        int i2 = ewaVar.c;
        int i3 = this.c;
        if (i3 < i2) {
            i += ewaVar.e - this.e;
        } else if (i3 > i2 && i2 > 0) {
            i += 10;
        }
        if (i <= ewaVar.d) {
            return true;
        }
        return false;
    }

    public final ewa d(int i, int i2) {
        int i3;
        int i4 = this.d;
        wpb wpbVar = this.b;
        int i5 = this.a;
        if (i != i5) {
            int i6 = ae5.b[i5][i];
            int i7 = 65535 & i6;
            int i8 = i6 >> 16;
            wpbVar.getClass();
            i4 += i8;
            wpbVar = new kia(wpbVar, i7, i8);
        }
        if (i == 2) {
            i3 = 4;
        } else {
            i3 = 5;
        }
        wpbVar.getClass();
        return new ewa(new kia(wpbVar, i2, i3), i, 0, i4 + i3);
    }

    public final ewa e(int i, int i2) {
        int i3;
        int i4 = this.a;
        if (i4 == 2) {
            i3 = 4;
        } else {
            i3 = 5;
        }
        int i5 = ae5.d[i4][i];
        wpb wpbVar = this.b;
        wpbVar.getClass();
        return new ewa(new kia(new kia(wpbVar, i5, i3), i2, 5), i4, 0, this.d + i3 + 5);
    }

    public final String toString() {
        return String.format("%s bits=%d bytes=%d", ae5.a[this.a], Integer.valueOf(this.d), Integer.valueOf(this.c));
    }
}
