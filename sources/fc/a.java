package fc;
public final class a {
    public static final a h;
    public final int[] f7936a;
    public final int[] f7937b;
    public final b f7938c;
    public final b d;
    public final int e;
    public final int f7939f;
    public final int f7940g;

    static {
        new a(4201, 4096, 1);
        new a(1033, 1024, 1);
        new a(67, 64, 1);
        new a(19, 16, 1);
        h = new a(285, 256, 0);
        new a(301, 256, 1);
    }

    public a(int i10, int i11, int i12) {
        this.f7939f = i10;
        this.e = i11;
        this.f7940g = i12;
        this.f7936a = new int[i11];
        this.f7937b = new int[i11];
        int i13 = 1;
        for (int i14 = 0; i14 < i11; i14++) {
            this.f7936a[i14] = i13;
            i13 *= 2;
            if (i13 >= i11) {
                i13 = (i13 ^ i10) & (i11 - 1);
            }
        }
        for (int i15 = 0; i15 < i11 - 1; i15++) {
            this.f7937b[this.f7936a[i15]] = i15;
        }
        this.f7938c = new b(this, new int[]{0});
        this.d = new b(this, new int[]{1});
    }

    public final b a(int i10, int i11) {
        if (i10 >= 0) {
            if (i11 == 0) {
                return this.f7938c;
            }
            int[] iArr = new int[i10 + 1];
            iArr[0] = i11;
            return new b(this, iArr);
        }
        throw new IllegalArgumentException();
    }

    public final int b(int i10) {
        if (i10 != 0) {
            int i11 = this.f7937b[i10];
            return this.f7936a[(this.e - i11) - 1];
        }
        throw new ArithmeticException();
    }

    public final int c(int i10, int i11) {
        if (i10 != 0 && i11 != 0) {
            int[] iArr = this.f7937b;
            return this.f7936a[(iArr[i10] + iArr[i11]) % (this.e - 1)];
        }
        return 0;
    }

    public final String toString() {
        return "GF(0x" + Integer.toHexString(this.f7939f) + ',' + this.e + ')';
    }
}
