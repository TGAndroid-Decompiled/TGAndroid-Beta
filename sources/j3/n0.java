package j3;

import java.io.Serializable;
public final class n0 {
    public int f13293a;
    public int f13294b;
    public int f13295c;
    public int d;
    public int f13296e;
    public int f13297f;
    public Serializable f13298g;

    public boolean a(int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        if ((i9 & (-2097152)) != -2097152 || (i10 = (i9 >>> 19) & 3) == 1 || (i11 = (i9 >>> 17) & 3) == 0 || (i12 = (i9 >>> 12) & 15) == 0 || i12 == 15 || (i13 = (i9 >>> 10) & 3) == 3) {
            return false;
        }
        this.f13293a = i10;
        this.f13298g = b.f13217m[3 - i11];
        int i16 = b.f13218n[i13];
        this.f13295c = i16;
        int i17 = 2;
        if (i10 == 2) {
            this.f13295c = i16 / 2;
        } else if (i10 == 0) {
            this.f13295c = i16 / 4;
        }
        int i18 = (i9 >>> 9) & 1;
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
        this.f13297f = i19;
        if (i11 == 3) {
            if (i10 == 3) {
                i15 = b.f13219o[i12 - 1];
            } else {
                i15 = b.f13220p[i12 - 1];
            }
            this.f13296e = i15;
            this.f13294b = (((i15 * 12) / this.f13295c) + i18) * 4;
        } else {
            int i20 = 144;
            if (i10 == 3) {
                if (i11 == 2) {
                    i14 = b.f13221q[i12 - 1];
                } else {
                    i14 = b.f13222r[i12 - 1];
                }
                this.f13296e = i14;
                this.f13294b = ((i14 * 144) / this.f13295c) + i18;
            } else {
                int i21 = b.f13223s[i12 - 1];
                this.f13296e = i21;
                if (i11 == 1) {
                    i20 = 72;
                }
                this.f13294b = ((i20 * i21) / this.f13295c) + i18;
            }
        }
        if (((i9 >> 6) & 3) == 3) {
            i17 = 1;
        }
        this.d = i17;
        return true;
    }
}
