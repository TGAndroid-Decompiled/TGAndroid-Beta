package f3;

import java.io.Serializable;
public final class a0 {
    public int f10969a;
    public int f10970b;
    public int f10971c;
    public int d;
    public int f10972e;
    public int f10973f;
    public Serializable f10974g;

    public boolean a(int i7) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        if ((i7 & (-2097152)) != -2097152 || (i10 = (i7 >>> 19) & 3) == 1 || (i11 = (i7 >>> 17) & 3) == 0 || (i12 = (i7 >>> 12) & 15) == 0 || i12 == 15 || (i13 = (i7 >>> 10) & 3) == 3) {
            return false;
        }
        this.f10969a = i10;
        this.f10974g = b.f10991s[3 - i11];
        int i16 = b.f10992t[i13];
        this.f10971c = i16;
        int i17 = 2;
        if (i10 == 2) {
            this.f10971c = i16 / 2;
        } else if (i10 == 0) {
            this.f10971c = i16 / 4;
        }
        int i18 = (i7 >>> 9) & 1;
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
        this.f10973f = i19;
        if (i11 == 3) {
            if (i10 == 3) {
                i15 = b.f10993u[i12 - 1];
            } else {
                i15 = b.v[i12 - 1];
            }
            this.f10972e = i15;
            this.f10970b = (((i15 * 12) / this.f10971c) + i18) * 4;
        } else {
            int i20 = 144;
            if (i10 == 3) {
                if (i11 == 2) {
                    i14 = b.f10994w[i12 - 1];
                } else {
                    i14 = b.f10995x[i12 - 1];
                }
                this.f10972e = i14;
                this.f10970b = ((i14 * 144) / this.f10971c) + i18;
            } else {
                int i21 = b.f10996y[i12 - 1];
                this.f10972e = i21;
                if (i11 == 1) {
                    i20 = 72;
                }
                this.f10970b = ((i20 * i21) / this.f10971c) + i18;
            }
        }
        if (((i7 >> 6) & 3) == 3) {
            i17 = 1;
        }
        this.d = i17;
        return true;
    }
}
