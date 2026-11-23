package ec;
public final class a {
    public static final a h;
    public final int[] f10871a;
    public final int[] f10872b;
    public final b f10873c;
    public final b d;
    public final int f10874e;
    public final int f10875f;
    public final int f10876g;

    static {
        new a(4201, 4096, 1);
        new a(1033, 1024, 1);
        new a(67, 64, 1);
        new a(19, 16, 1);
        h = new a(285, 256, 0);
        new a(301, 256, 1);
    }

    public a(int i7, int i10, int i11) {
        this.f10875f = i7;
        this.f10874e = i10;
        this.f10876g = i11;
        this.f10871a = new int[i10];
        this.f10872b = new int[i10];
        int i12 = 1;
        for (int i13 = 0; i13 < i10; i13++) {
            this.f10871a[i13] = i12;
            i12 *= 2;
            if (i12 >= i10) {
                i12 = (i12 ^ i7) & (i10 - 1);
            }
        }
        for (int i14 = 0; i14 < i10 - 1; i14++) {
            this.f10872b[this.f10871a[i14]] = i14;
        }
        this.f10873c = new b(this, new int[]{0});
        this.d = new b(this, new int[]{1});
    }

    public final b a(int i7, int i10) {
        if (i7 >= 0) {
            if (i10 == 0) {
                return this.f10873c;
            }
            int[] iArr = new int[i7 + 1];
            iArr[0] = i10;
            return new b(this, iArr);
        }
        throw new IllegalArgumentException();
    }

    public final int b(int i7) {
        if (i7 != 0) {
            int i10 = this.f10872b[i7];
            return this.f10871a[(this.f10874e - i10) - 1];
        }
        throw new ArithmeticException();
    }

    public final int c(int i7, int i10) {
        if (i7 != 0 && i10 != 0) {
            int[] iArr = this.f10872b;
            return this.f10871a[(iArr[i7] + iArr[i10]) % (this.f10874e - 1)];
        }
        return 0;
    }

    public final String toString() {
        return "GF(0x" + Integer.toHexString(this.f10875f) + ',' + this.f10874e + ')';
    }
}
