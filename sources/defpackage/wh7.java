package defpackage;
public final class wh7 {
    public int a;
    public String b;
    public int c;
    public int d;
    public byte e;
    public int f;
    public int g;

    public final boolean a(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if ((i & (-2097152)) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        this.a = i2;
        this.b = wcd.a[3 - i3];
        int i8 = wcd.b[i5];
        this.d = i8;
        byte b = 2;
        if (i2 == 2) {
            i8 /= 2;
            this.d = i8;
        } else if (i2 == 0) {
            i8 /= 4;
            this.d = i8;
        }
        int i9 = (i >>> 9) & 1;
        int i10 = 1152;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 3) {
                    i10 = 384;
                } else {
                    i98.g();
                    return false;
                }
            }
        } else if (i2 != 3) {
            i10 = 576;
        }
        this.g = i10;
        if (i3 == 3) {
            if (i2 == 3) {
                i7 = wcd.c[i4 - 1];
            } else {
                i7 = wcd.d[i4 - 1];
            }
            this.f = i7;
            this.c = kt6.z(i7, 12, i8, i9) << 2;
        } else {
            int i11 = 144;
            if (i2 == 3) {
                if (i3 == 2) {
                    i6 = wcd.e[i4 - 1];
                } else {
                    i6 = wcd.f[i4 - 1];
                }
                this.f = i6;
                this.c = kt6.z(i6, 144, i8, i9);
            } else {
                int i12 = wcd.g[i4 - 1];
                this.f = i12;
                if (i3 == 1) {
                    i11 = 72;
                }
                this.c = kt6.z(i11, i12, i8, i9);
            }
        }
        if (((i >> 6) & 3) == 3) {
            b = 1;
        }
        this.e = b;
        return true;
    }
}
