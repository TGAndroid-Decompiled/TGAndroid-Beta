package nb;
public final class a {
    public static final a h;
    public final int[] f18566a;
    public final int[] f18567b;
    public final b f18568c;
    public final b d;
    public final int f18569e;
    public final int f18570f;
    public final int f18571g;

    static {
        new a(4201, 4096, 1);
        new a(1033, 1024, 1);
        new a(67, 64, 1);
        new a(19, 16, 1);
        h = new a(285, 256, 0);
        new a(301, 256, 1);
    }

    public a(int i9, int i10, int i11) {
        this.f18570f = i9;
        this.f18569e = i10;
        this.f18571g = i11;
        this.f18566a = new int[i10];
        this.f18567b = new int[i10];
        int i12 = 1;
        for (int i13 = 0; i13 < i10; i13++) {
            this.f18566a[i13] = i12;
            i12 *= 2;
            if (i12 >= i10) {
                i12 = (i12 ^ i9) & (i10 - 1);
            }
        }
        for (int i14 = 0; i14 < i10 - 1; i14++) {
            this.f18567b[this.f18566a[i14]] = i14;
        }
        this.f18568c = new b(this, new int[]{0});
        this.d = new b(this, new int[]{1});
    }

    public final b a(int i9, int i10) {
        if (i9 >= 0) {
            if (i10 == 0) {
                return this.f18568c;
            }
            int[] iArr = new int[i9 + 1];
            iArr[0] = i10;
            return new b(this, iArr);
        }
        throw new IllegalArgumentException();
    }

    public final int b(int i9) {
        if (i9 != 0) {
            int i10 = this.f18567b[i9];
            return this.f18566a[(this.f18569e - i10) - 1];
        }
        throw new ArithmeticException();
    }

    public final int c(int i9, int i10) {
        if (i9 != 0 && i10 != 0) {
            int[] iArr = this.f18567b;
            return this.f18566a[(iArr[i9] + iArr[i10]) % (this.f18569e - 1)];
        }
        return 0;
    }

    public final String toString() {
        return "GF(0x" + Integer.toHexString(this.f18570f) + ',' + this.f18569e + ')';
    }
}
