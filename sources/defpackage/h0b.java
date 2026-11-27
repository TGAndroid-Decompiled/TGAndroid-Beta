package defpackage;
public final class h0b {
    public static final h0b f = new h0b(xtb.b, 0, 0, 0);
    public final int a;
    public final xtb b;
    public final int c;
    public final int d;
    public final byte e;

    public h0b(xtb xtbVar, int i, int i2, int i3) {
        byte b;
        this.b = xtbVar;
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

    public final h0b a(int i) {
        int i2;
        xtb xtbVar = this.b;
        int i3 = this.a;
        int i4 = this.d;
        if (i3 == 4 || i3 == 2) {
            int[] iArr = bg5.b[i3];
            i3 = 0;
            int i5 = iArr[0];
            int i6 = 65535 & i5;
            int i7 = i5 >> 16;
            xtbVar.getClass();
            i4 += i7;
            xtbVar = new fma(xtbVar, i6, i7);
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
        h0b h0bVar = new h0b(xtbVar, i3, i9, i4 + i2);
        if (i9 == 2078) {
            return h0bVar.b(i + 1);
        }
        return h0bVar;
    }

    public final h0b b(int i) {
        int i2 = this.c;
        if (i2 == 0) {
            return this;
        }
        xtb xtbVar = this.b;
        xtbVar.getClass();
        return new h0b(new pi0(xtbVar, i - i2, i2), this.a, 0, this.d);
    }

    public final boolean c(h0b h0bVar) {
        int i = this.d + (bg5.b[this.a][h0bVar.a] >> 16);
        int i2 = h0bVar.c;
        int i3 = this.c;
        if (i3 < i2) {
            i += h0bVar.e - this.e;
        } else if (i3 > i2 && i2 > 0) {
            i += 10;
        }
        if (i <= h0bVar.d) {
            return true;
        }
        return false;
    }

    public final h0b d(int i, int i2) {
        int i3;
        int i4 = this.d;
        xtb xtbVar = this.b;
        int i5 = this.a;
        if (i != i5) {
            int i6 = bg5.b[i5][i];
            int i7 = 65535 & i6;
            int i8 = i6 >> 16;
            xtbVar.getClass();
            i4 += i8;
            xtbVar = new fma(xtbVar, i7, i8);
        }
        if (i == 2) {
            i3 = 4;
        } else {
            i3 = 5;
        }
        xtbVar.getClass();
        return new h0b(new fma(xtbVar, i2, i3), i, 0, i4 + i3);
    }

    public final h0b e(int i, int i2) {
        int i3;
        int i4 = this.a;
        if (i4 == 2) {
            i3 = 4;
        } else {
            i3 = 5;
        }
        int i5 = bg5.d[i4][i];
        xtb xtbVar = this.b;
        xtbVar.getClass();
        return new h0b(new fma(new fma(xtbVar, i5, i3), i2, 5), i4, 0, this.d + i3 + 5);
    }

    public final String toString() {
        return String.format("%s bits=%d bytes=%d", bg5.a[this.a], Integer.valueOf(this.d), Integer.valueOf(this.c));
    }
}
