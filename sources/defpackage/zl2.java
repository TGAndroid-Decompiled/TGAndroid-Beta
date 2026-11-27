package defpackage;
public final class zl2 {
    public final int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public final am2 j;

    public zl2(am2 am2Var, int i, int i2) {
        this.j = am2Var;
        this.a = i;
        this.b = i2;
        a();
    }

    public final void a() {
        am2 am2Var = this.j;
        int[] iArr = (int[]) am2Var.b;
        int[] iArr2 = (int[]) am2Var.c;
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        int i3 = Integer.MIN_VALUE;
        int i4 = 0;
        int i5 = Integer.MAX_VALUE;
        int i6 = Integer.MAX_VALUE;
        int i7 = Integer.MIN_VALUE;
        for (int i8 = this.a; i8 <= this.b; i8++) {
            int i9 = iArr[i8];
            i4 += iArr2[i9];
            int i10 = (i9 >> 10) & 31;
            int i11 = (i9 >> 5) & 31;
            int i12 = i9 & 31;
            if (i10 > i7) {
                i7 = i10;
            }
            if (i10 < i) {
                i = i10;
            }
            if (i11 > i2) {
                i2 = i11;
            }
            if (i11 < i5) {
                i5 = i11;
            }
            if (i12 > i3) {
                i3 = i12;
            }
            if (i12 < i6) {
                i6 = i12;
            }
        }
        this.d = i;
        this.e = i7;
        this.f = i5;
        this.g = i2;
        this.h = i6;
        this.i = i3;
        this.c = i4;
    }

    public final int b() {
        return ((this.i - this.h) + 1) * ((this.g - this.f) + 1) * ((this.e - this.d) + 1);
    }
}
