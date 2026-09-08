package mf;
public final class k {
    public static final int[][] h = {new int[]{11025, -1, 22050, 44100}, new int[]{12000, -1, 24000, 48000}, new int[]{8000, -1, 16000, 32000}, new int[]{-1, -1, -1, -1}};
    public static final int[][] f16249i = {new int[]{0, 0, 0, 0, 0}, new int[]{32000, 32000, 32000, 32000, 8000}, new int[]{64000, 48000, 40000, 48000, 16000}, new int[]{96000, 56000, 48000, 56000, 24000}, new int[]{128000, 64000, 56000, 64000, 32000}, new int[]{160000, 80000, 64000, 80000, 40000}, new int[]{192000, 96000, 80000, 96000, 48000}, new int[]{224000, 112000, 96000, 112000, 56000}, new int[]{256000, 128000, 112000, 128000, 64000}, new int[]{288000, 160000, 128000, 144000, 80000}, new int[]{320000, 192000, 160000, 160000, 96000}, new int[]{352000, 224000, 192000, 176000, 112000}, new int[]{384000, 256000, 224000, 192000, 128000}, new int[]{416000, 320000, 256000, 224000, 144000}, new int[]{448000, 384000, 320000, 256000, 160000}, new int[]{-1, -1, -1, -1, -1}};
    public static final int[][] f16250j = {new int[]{-1, 4, 4, 3}, new int[]{-1, -1, -1, -1}, new int[]{-1, 4, 4, 3}, new int[]{-1, 2, 1, 0}};
    public static final int[][] f16251k = {new int[]{-1, 72, 144, 12}, new int[]{-1, -1, -1, -1}, new int[]{-1, 72, 144, 12}, new int[]{-1, 144, 144, 12}};
    public static final int[] f16252l = {-1, 1, 1, 4};
    public static final int[][] f16253m = {new int[]{17, -1, 17, 32}, new int[]{17, -1, 17, 32}, new int[]{17, -1, 17, 32}, new int[]{9, -1, 9, 17}};
    public final int f16254a;
    public final int f16255b;
    public final int f16256c;
    public final int d;
    public final int f16257e;
    public final int f16258f;
    public final int f16259g;

    public k(int i10, int i11, int i12) {
        int i13 = (i10 >> 3) & 3;
        this.f16254a = i13;
        if (i13 != 1) {
            int i14 = (i10 >> 1) & 3;
            this.f16255b = i14;
            if (i14 != 0) {
                int i15 = (i11 >> 4) & 15;
                this.d = i15;
                if (i15 != 15) {
                    if (i15 != 0) {
                        int i16 = (i11 >> 2) & 3;
                        this.f16256c = i16;
                        if (i16 != 3) {
                            int i17 = (i12 >> 6) & 3;
                            this.f16257e = i17;
                            this.f16258f = (i11 >> 1) & 1;
                            int i18 = i10 & 1;
                            this.f16259g = i18;
                            int i19 = i18 != 0 ? 4 : 6;
                            i19 = i14 == 1 ? i19 + f16253m[i17][i13] : i19;
                            if (b() >= i19) {
                                return;
                            }
                            throw new Exception(i2.g.i(i19, "Frame size must be at least "));
                        }
                        throw new Exception("Reserved frequency");
                    }
                    throw new Exception("Free bitrate");
                }
                throw new Exception("Reserved bitrate");
            }
            throw new Exception("Reserved layer");
        }
        throw new Exception("Reserved version");
    }

    public final int a() {
        return f16249i[this.d][f16250j[this.f16254a][this.f16255b]];
    }

    public final int b() {
        int[][] iArr = f16251k;
        int i10 = this.f16254a;
        int[] iArr2 = iArr[i10];
        int i11 = this.f16255b;
        return (((a() * iArr2[i11]) / h[this.f16256c][i10]) + this.f16258f) * f16252l[i11];
    }

    public final long c(long j3) {
        int i10;
        if (this.f16255b == 3) {
            i10 = 384;
        } else {
            i10 = 1152;
        }
        int b10 = b();
        int[] iArr = h[this.f16256c];
        int i11 = this.f16254a;
        long j10 = ((i10 * j3) * 1000) / (iArr[i11] * b10);
        if (i11 != 3 && this.f16257e == 3) {
            return j10 / 2;
        }
        return j10;
    }

    public final boolean d(k kVar) {
        if (this.f16255b == kVar.f16255b && this.f16254a == kVar.f16254a && this.f16256c == kVar.f16256c && this.f16257e == kVar.f16257e) {
            return true;
        }
        return false;
    }
}
