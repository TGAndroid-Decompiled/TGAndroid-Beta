package defpackage;
public final class hs4 {
    public static final hs4 h = new hs4(4201, 4096, 1);
    public static final hs4 i = new hs4(1033, 1024, 1);
    public static final hs4 j = new hs4(67, 64, 1);
    public static final hs4 k = new hs4(19, 16, 1);
    public static final hs4 l = new hs4(285, 256, 0);
    public static final hs4 m = new hs4(301, 256, 1);
    public final int[] a;
    public final int[] b;
    public final is4 c;
    public final is4 d;
    public final short e;
    public final short f;
    public final boolean g;

    public hs4(int i2, int i3, int i4) {
        this.f = i2;
        this.e = i3;
        this.g = i4;
        this.a = new int[i3];
        this.b = new int[i3];
        int i5 = 1;
        for (int i6 = 0; i6 < i3; i6++) {
            this.a[i6] = i5;
            i5 <<= 1;
            if (i5 >= i3) {
                i5 = (i5 ^ i2) & (i3 - 1);
            }
        }
        for (int i7 = 0; i7 < i3 - 1; i7++) {
            this.b[this.a[i7]] = i7;
        }
        this.c = new is4(this, new int[]{0});
        this.d = new is4(this, new int[]{1});
    }

    public final is4 a(int i2, int i3) {
        if (i2 >= 0) {
            if (i3 == 0) {
                return this.c;
            }
            int[] iArr = new int[i2 + 1];
            iArr[0] = i3;
            return new is4(this, iArr);
        }
        sc8.e();
        return null;
    }

    public final int b(int i2) {
        if (i2 != 0) {
            int i3 = this.b[i2];
            return this.a[(this.e - i3) - 1];
        }
        throw new ArithmeticException();
    }

    public final int c(int i2, int i3) {
        if (i2 != 0 && i3 != 0) {
            int[] iArr = this.b;
            return this.a[(iArr[i2] + iArr[i3]) % (this.e - 1)];
        }
        return 0;
    }

    public final String toString() {
        return "GF(0x" + Integer.toHexString(this.f) + ',' + ((int) this.e) + ')';
    }
}
