package c3;

import java.io.Serializable;
public final class z {
    public int f3827a;
    public int f3828b;
    public int f3829c;
    public int d;
    public int e;
    public int f3830f;
    public Serializable f3831g;

    public boolean a(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        if ((i10 & (-2097152)) != -2097152 || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return false;
        }
        this.f3827a = i11;
        this.f3831g = b.f3725s[3 - i12];
        int i17 = b.f3726t[i14];
        this.f3829c = i17;
        int i18 = 2;
        if (i11 == 2) {
            this.f3829c = i17 / 2;
        } else if (i11 == 0) {
            this.f3829c = i17 / 4;
        }
        int i19 = (i10 >>> 9) & 1;
        int i20 = 1152;
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 == 3) {
                    i20 = 384;
                } else {
                    throw new IllegalArgumentException();
                }
            }
        } else if (i11 != 3) {
            i20 = 576;
        }
        this.f3830f = i20;
        if (i12 == 3) {
            if (i11 == 3) {
                i16 = b.f3727u[i13 - 1];
            } else {
                i16 = b.v[i13 - 1];
            }
            this.e = i16;
            this.f3828b = (((i16 * 12) / this.f3829c) + i19) * 4;
        } else {
            int i21 = 144;
            if (i11 == 3) {
                if (i12 == 2) {
                    i15 = b.f3728w[i13 - 1];
                } else {
                    i15 = b.f3729x[i13 - 1];
                }
                this.e = i15;
                this.f3828b = ((i15 * 144) / this.f3829c) + i19;
            } else {
                int i22 = b.f3730y[i13 - 1];
                this.e = i22;
                if (i12 == 1) {
                    i21 = 72;
                }
                this.f3828b = ((i21 * i22) / this.f3829c) + i19;
            }
        }
        if (((i10 >> 6) & 3) == 3) {
            i18 = 1;
        }
        this.d = i18;
        return true;
    }
}
