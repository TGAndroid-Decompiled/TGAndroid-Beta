package e3;

import java.io.Serializable;
public final class z {
    public int f9540a;
    public int f9541b;
    public int f9542c;
    public int d;
    public int f9543e;
    public int f9544f;
    public Serializable f9545g;

    public boolean a(int i3) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        if ((i3 & (-2097152)) != -2097152 || (i10 = (i3 >>> 19) & 3) == 1 || (i11 = (i3 >>> 17) & 3) == 0 || (i12 = (i3 >>> 12) & 15) == 0 || i12 == 15 || (i13 = (i3 >>> 10) & 3) == 3) {
            return false;
        }
        this.f9540a = i10;
        this.f9545g = b.f9424s[3 - i11];
        int i16 = b.f9425t[i13];
        this.f9542c = i16;
        int i17 = 2;
        if (i10 == 2) {
            this.f9542c = i16 / 2;
        } else if (i10 == 0) {
            this.f9542c = i16 / 4;
        }
        int i18 = (i3 >>> 9) & 1;
        int i19 = 1152;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    i19 = 384;
                } else {
                    throw new IllegalArgumentException();
                }
            }
        } else if (i10 != 3) {
            i19 = 576;
        }
        this.f9544f = i19;
        if (i11 == 3) {
            if (i10 == 3) {
                i15 = b.f9426u[i12 - 1];
            } else {
                i15 = b.v[i12 - 1];
            }
            this.f9543e = i15;
            this.f9541b = (((i15 * 12) / this.f9542c) + i18) * 4;
        } else {
            int i20 = 144;
            if (i10 == 3) {
                if (i11 == 2) {
                    i14 = b.f9427w[i12 - 1];
                } else {
                    i14 = b.f9428x[i12 - 1];
                }
                this.f9543e = i14;
                this.f9541b = ((i14 * 144) / this.f9542c) + i18;
            } else {
                int i21 = b.f9429y[i12 - 1];
                this.f9543e = i21;
                if (i11 == 1) {
                    i20 = 72;
                }
                this.f9541b = ((i20 * i21) / this.f9542c) + i18;
            }
        }
        if (((i3 >> 6) & 3) == 3) {
            i17 = 1;
        }
        this.d = i17;
        return true;
    }
}
