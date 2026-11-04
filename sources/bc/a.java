package bc;
public final class a {
    public static final a h;
    public final int[] f3212a;
    public final int[] f3213b;
    public final b f3214c;
    public final b d;
    public final int f3215e;
    public final int f3216f;
    public final int f3217g;

    static {
        new a(4201, 4096, 1);
        new a(1033, 1024, 1);
        new a(67, 64, 1);
        new a(19, 16, 1);
        h = new a(285, 256, 0);
        new a(301, 256, 1);
    }

    public a(int i3, int i10, int i11) {
        this.f3216f = i3;
        this.f3215e = i10;
        this.f3217g = i11;
        this.f3212a = new int[i10];
        this.f3213b = new int[i10];
        int i12 = 1;
        for (int i13 = 0; i13 < i10; i13++) {
            this.f3212a[i13] = i12;
            i12 *= 2;
            if (i12 >= i10) {
                i12 = (i12 ^ i3) & (i10 - 1);
            }
        }
        for (int i14 = 0; i14 < i10 - 1; i14++) {
            this.f3213b[this.f3212a[i14]] = i14;
        }
        this.f3214c = new b(this, new int[]{0});
        this.d = new b(this, new int[]{1});
    }

    public final b a(int i3, int i10) {
        if (i3 >= 0) {
            if (i10 == 0) {
                return this.f3214c;
            }
            int[] iArr = new int[i3 + 1];
            iArr[0] = i10;
            return new b(this, iArr);
        }
        throw new IllegalArgumentException();
    }

    public final int b(int i3) {
        if (i3 != 0) {
            int i10 = this.f3213b[i3];
            return this.f3212a[(this.f3215e - i10) - 1];
        }
        throw new ArithmeticException();
    }

    public final int c(int i3, int i10) {
        if (i3 != 0 && i10 != 0) {
            int[] iArr = this.f3213b;
            return this.f3212a[(iArr[i3] + iArr[i10]) % (this.f3215e - 1)];
        }
        return 0;
    }

    public final String toString() {
        return "GF(0x" + Integer.toHexString(this.f3216f) + ',' + this.f3215e + ')';
    }
}
