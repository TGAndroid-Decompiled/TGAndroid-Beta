package l3;

import java.io.Serializable;
public final class o0 {
    public int f11205a;
    public int f11206b;
    public int f11207c;
    public int d;
    public int e;
    public int f11208f;
    public Serializable f11209g;

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
        this.f11205a = i11;
        this.f11209g = a.f11120m[3 - i12];
        int i17 = a.f11121n[i14];
        this.f11207c = i17;
        int i18 = 2;
        if (i11 == 2) {
            this.f11207c = i17 / 2;
        } else if (i11 == 0) {
            this.f11207c = i17 / 4;
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
        this.f11208f = i20;
        if (i12 == 3) {
            if (i11 == 3) {
                i16 = a.f11122o[i13 - 1];
            } else {
                i16 = a.f11123p[i13 - 1];
            }
            this.e = i16;
            this.f11206b = (((i16 * 12) / this.f11207c) + i19) * 4;
        } else {
            int i21 = 144;
            if (i11 == 3) {
                if (i12 == 2) {
                    i15 = a.f11124q[i13 - 1];
                } else {
                    i15 = a.f11125r[i13 - 1];
                }
                this.e = i15;
                this.f11206b = ((i15 * 144) / this.f11207c) + i19;
            } else {
                int i22 = a.f11126s[i13 - 1];
                this.e = i22;
                if (i12 == 1) {
                    i21 = 72;
                }
                this.f11206b = ((i21 * i22) / this.f11207c) + i19;
            }
        }
        if (((i10 >> 6) & 3) == 3) {
            i18 = 1;
        }
        this.d = i18;
        return true;
    }
}
