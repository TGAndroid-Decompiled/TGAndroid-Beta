package ob;

public final class a {
    public static final a h;

    public final int[] f19415a;

    public final int[] f19416b;

    public final b f19417c;
    public final b d;

    public final int f19418e;

    public final int f19419f;

    public final int f19420g;

    static {
        new a(4201, 4096, 1);
        new a(1033, 1024, 1);
        new a(67, 64, 1);
        new a(19, 16, 1);
        h = new a(285, 256, 0);
        new a(301, 256, 1);
    }

    public a(int i10, int i11, int i12) {
        this.f19419f = i10;
        this.f19418e = i11;
        this.f19420g = i12;
        this.f19415a = new int[i11];
        this.f19416b = new int[i11];
        int i13 = 1;
        for (int i14 = 0; i14 < i11; i14++) {
            this.f19415a[i14] = i13;
            i13 *= 2;
            if (i13 >= i11) {
                i13 = (i13 ^ i10) & (i11 - 1);
            }
        }
        for (int i15 = 0; i15 < i11 - 1; i15++) {
            this.f19416b[this.f19415a[i15]] = i15;
        }
        this.f19417c = new b(this, new int[]{0});
        this.d = new b(this, new int[]{1});
    }

    public final b a(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        if (i11 == 0) {
            return this.f19417c;
        }
        int[] iArr = new int[i10 + 1];
        iArr[0] = i11;
        return new b(this, iArr);
    }

    public final int b(int i10) {
        if (i10 == 0) {
            throw new ArithmeticException();
        }
        return this.f19415a[(this.f19418e - this.f19416b[i10]) - 1];
    }

    public final int c(int i10, int i11) {
        if (i10 == 0 || i11 == 0) {
            return 0;
        }
        int[] iArr = this.f19416b;
        return this.f19415a[(iArr[i10] + iArr[i11]) % (this.f19418e - 1)];
    }

    public final String toString() {
        return "GF(0x" + Integer.toHexString(this.f19419f) + ',' + this.f19418e + ')';
    }
}
