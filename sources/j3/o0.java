package j3;

import java.io.Serializable;

public final class o0 {

    public int f12393a;

    public int f12394b;

    public int f12395c;
    public int d;

    public int f12396e;

    public int f12397f;

    public Serializable f12398g;

    public boolean a(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        if ((i10 & (-2097152)) != -2097152 || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return false;
        }
        this.f12393a = i11;
        this.f12398g = b.f12314m[3 - i12];
        int i15 = b.f12315n[i14];
        this.f12395c = i15;
        if (i11 == 2) {
            this.f12395c = i15 / 2;
        } else if (i11 == 0) {
            this.f12395c = i15 / 4;
        }
        int i16 = (i10 >>> 9) & 1;
        int i17 = 1152;
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 != 3) {
                    throw new IllegalArgumentException();
                }
                i17 = 384;
            }
        } else if (i11 != 3) {
            i17 = 576;
        }
        this.f12397f = i17;
        if (i12 == 3) {
            int i18 = i11 == 3 ? b.f12316o[i13 - 1] : b.f12317p[i13 - 1];
            this.f12396e = i18;
            this.f12394b = (((i18 * 12) / this.f12395c) + i16) * 4;
        } else {
            if (i11 == 3) {
                int i19 = i12 == 2 ? b.f12318q[i13 - 1] : b.f12319r[i13 - 1];
                this.f12396e = i19;
                this.f12394b = ((i19 * 144) / this.f12395c) + i16;
            } else {
                int i20 = b.f12320s[i13 - 1];
                this.f12396e = i20;
                this.f12394b = (((i12 == 1 ? 72 : 144) * i20) / this.f12395c) + i16;
            }
        }
        this.d = ((i10 >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
