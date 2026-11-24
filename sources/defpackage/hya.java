package defpackage;
public final class hya {
    public static final hya f = new hya(xrb.b, 0, 0, 0);
    public final int a;
    public final xrb b;
    public final int c;
    public final int d;
    public final byte e;

    public hya(xrb xrbVar, int i, int i2, int i3) {
        byte b;
        this.b = xrbVar;
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

    public final hya a(int i) {
        int i2;
        xrb xrbVar = this.b;
        int i3 = this.a;
        int i4 = this.d;
        if (i3 == 4 || i3 == 2) {
            int[] iArr = yf5.b[i3];
            i3 = 0;
            int i5 = iArr[0];
            int i6 = 65535 & i5;
            int i7 = i5 >> 16;
            xrbVar.getClass();
            i4 += i7;
            xrbVar = new mka(xrbVar, i6, i7);
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
        hya hyaVar = new hya(xrbVar, i3, i9, i4 + i2);
        if (i9 == 2078) {
            return hyaVar.b(i + 1);
        }
        return hyaVar;
    }

    public final hya b(int i) {
        int i2 = this.c;
        if (i2 == 0) {
            return this;
        }
        xrb xrbVar = this.b;
        xrbVar.getClass();
        return new hya(new oj0(xrbVar, i - i2, i2), this.a, 0, this.d);
    }

    public final boolean c(hya hyaVar) {
        int i = this.d + (yf5.b[this.a][hyaVar.a] >> 16);
        int i2 = hyaVar.c;
        int i3 = this.c;
        if (i3 < i2) {
            i += hyaVar.e - this.e;
        } else if (i3 > i2 && i2 > 0) {
            i += 10;
        }
        if (i <= hyaVar.d) {
            return true;
        }
        return false;
    }

    public final hya d(int i, int i2) {
        int i3;
        int i4 = this.d;
        xrb xrbVar = this.b;
        int i5 = this.a;
        if (i != i5) {
            int i6 = yf5.b[i5][i];
            int i7 = 65535 & i6;
            int i8 = i6 >> 16;
            xrbVar.getClass();
            i4 += i8;
            xrbVar = new mka(xrbVar, i7, i8);
        }
        if (i == 2) {
            i3 = 4;
        } else {
            i3 = 5;
        }
        xrbVar.getClass();
        return new hya(new mka(xrbVar, i2, i3), i, 0, i4 + i3);
    }

    public final hya e(int i, int i2) {
        int i3;
        int i4 = this.a;
        if (i4 == 2) {
            i3 = 4;
        } else {
            i3 = 5;
        }
        int i5 = yf5.d[i4][i];
        xrb xrbVar = this.b;
        xrbVar.getClass();
        return new hya(new mka(new mka(xrbVar, i5, i3), i2, 5), i4, 0, this.d + i3 + 5);
    }

    public final String toString() {
        return String.format("%s bits=%d bytes=%d", yf5.a[this.a], Integer.valueOf(this.d), Integer.valueOf(this.c));
    }
}
