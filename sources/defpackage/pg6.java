package defpackage;
public final class pg6 {
    public static final int[][] h = {new int[]{11025, -1, 22050, 44100}, new int[]{12000, -1, 24000, 48000}, new int[]{8000, -1, 16000, 32000}, new int[]{-1, -1, -1, -1}};
    public static final int[][] i = {new int[]{0, 0, 0, 0, 0}, new int[]{32000, 32000, 32000, 32000, 8000}, new int[]{64000, 48000, 40000, 48000, 16000}, new int[]{96000, 56000, 48000, 56000, 24000}, new int[]{128000, 64000, 56000, 64000, 32000}, new int[]{160000, 80000, 64000, 80000, 40000}, new int[]{192000, 96000, 80000, 96000, 48000}, new int[]{224000, 112000, 96000, 112000, 56000}, new int[]{256000, 128000, 112000, 128000, 64000}, new int[]{288000, 160000, 128000, 144000, 80000}, new int[]{320000, 192000, 160000, 160000, 96000}, new int[]{352000, 224000, 192000, 176000, 112000}, new int[]{384000, 256000, 224000, 192000, 128000}, new int[]{416000, 320000, 256000, 224000, 144000}, new int[]{448000, 384000, 320000, 256000, 160000}, new int[]{-1, -1, -1, -1, -1}};
    public static final int[][] j = {new int[]{-1, 4, 4, 3}, new int[]{-1, -1, -1, -1}, new int[]{-1, 4, 4, 3}, new int[]{-1, 2, 1, 0}};
    public static final int[][] k = {new int[]{-1, 72, 144, 12}, new int[]{-1, -1, -1, -1}, new int[]{-1, 72, 144, 12}, new int[]{-1, 144, 144, 12}};
    public static final int[] l = {-1, 1, 1, 4};
    public static final int[][] m = {new int[]{17, -1, 17, 32}, new int[]{17, -1, 17, 32}, new int[]{17, -1, 17, 32}, new int[]{9, -1, 9, 17}};
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    public pg6(int i2, int i3, int i4) {
        int i5 = (i2 >> 3) & 3;
        this.a = i5;
        if (i5 != 1) {
            int i6 = (i2 >> 1) & 3;
            this.b = i6;
            if (i6 != 0) {
                int i7 = (i3 >> 4) & 15;
                this.d = i7;
                if (i7 != 15) {
                    if (i7 != 0) {
                        int i8 = (i3 >> 2) & 3;
                        this.c = i8;
                        if (i8 != 3) {
                            int i9 = (i4 >> 6) & 3;
                            this.e = i9;
                            this.f = (i3 >> 1) & 1;
                            int i10 = i2 & 1;
                            this.g = i10;
                            int i11 = i10 != 0 ? 4 : 6;
                            i11 = i6 == 1 ? i11 + m[i9][i5] : i11;
                            if (b() >= i11) {
                                return;
                            }
                            throw new Exception(de9.k(i11, "Frame size must be at least "));
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
        return i[this.d][j[this.a][this.b]];
    }

    public final int b() {
        int[][] iArr = k;
        int i2 = this.a;
        int[] iArr2 = iArr[i2];
        int i3 = this.b;
        return (((a() * iArr2[i3]) / h[this.c][i2]) + this.f) * l[i3];
    }

    public final long c(long j2) {
        int i2;
        if (this.b == 3) {
            i2 = 384;
        } else {
            i2 = 1152;
        }
        int b = b();
        int[] iArr = h[this.c];
        int i3 = this.a;
        long j3 = ((i2 * j2) * 1000) / (iArr[i3] * b);
        if (i3 != 3 && this.e == 3) {
            return j3 / 2;
        }
        return j3;
    }

    public final boolean d(pg6 pg6Var) {
        if (this.b == pg6Var.b && this.a == pg6Var.a && this.c == pg6Var.c && this.e == pg6Var.e) {
            return true;
        }
        return false;
    }
}
