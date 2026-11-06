package ec;
public final class a {
    public static final a h;
    public final int[] f10727a;
    public final int[] f10728b;
    public final b f10729c;
    public final b d;
    public final int f10730e;
    public final int f10731f;
    public final int f10732g;

    static {
        new a(4201, 4096, 1);
        new a(1033, 1024, 1);
        new a(67, 64, 1);
        new a(19, 16, 1);
        h = new a(285, 256, 0);
        new a(301, 256, 1);
    }

    public a(int i7, int i10, int i11) {
        this.f10731f = i7;
        this.f10730e = i10;
        this.f10732g = i11;
        this.f10727a = new int[i10];
        this.f10728b = new int[i10];
        int i12 = 1;
        for (int i13 = 0; i13 < i10; i13++) {
            this.f10727a[i13] = i12;
            i12 *= 2;
            if (i12 >= i10) {
                i12 = (i12 ^ i7) & (i10 - 1);
            }
        }
        for (int i14 = 0; i14 < i10 - 1; i14++) {
            this.f10728b[this.f10727a[i14]] = i14;
        }
        this.f10729c = new b(this, new int[]{0});
        this.d = new b(this, new int[]{1});
    }

    public final b a(int i7, int i10) {
        if (i7 >= 0) {
            if (i10 == 0) {
                return this.f10729c;
            }
            int[] iArr = new int[i7 + 1];
            iArr[0] = i10;
            return new b(this, iArr);
        }
        throw new IllegalArgumentException();
    }

    public final int b(int i7) {
        if (i7 != 0) {
            int i10 = this.f10728b[i7];
            return this.f10727a[(this.f10730e - i10) - 1];
        }
        throw new ArithmeticException();
    }

    public final int c(int i7, int i10) {
        if (i7 != 0 && i10 != 0) {
            int[] iArr = this.f10728b;
            return this.f10727a[(iArr[i7] + iArr[i10]) % (this.f10730e - 1)];
        }
        return 0;
    }

    public final String toString() {
        return "GF(0x" + Integer.toHexString(this.f10731f) + ',' + this.f10730e + ')';
    }
}
