package d2;
public final class b {
    public final int f5268a;
    public int f5269b;
    public int f5270c;
    public int d;
    public int f5271e;
    public int f5272f;
    public int f5273g;
    public int h;
    public int f5274i;
    public final c f5275j;

    public b(c cVar, int i10, int i11) {
        this.f5275j = cVar;
        this.f5268a = i10;
        this.f5269b = i11;
        a();
    }

    public final void a() {
        c cVar = this.f5275j;
        int[] iArr = (int[]) cVar.f5278a;
        int[] iArr2 = (int[]) cVar.f5279b;
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MAX_VALUE;
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MIN_VALUE;
        int i14 = Integer.MIN_VALUE;
        int i15 = Integer.MIN_VALUE;
        int i16 = 0;
        for (int i17 = this.f5268a; i17 <= this.f5269b; i17++) {
            int i18 = iArr[i17];
            i16 += iArr2[i18];
            int i19 = (i18 >> 10) & 31;
            int i20 = (i18 >> 5) & 31;
            int i21 = i18 & 31;
            if (i19 > i13) {
                i13 = i19;
            }
            if (i19 < i10) {
                i10 = i19;
            }
            if (i20 > i14) {
                i14 = i20;
            }
            if (i20 < i11) {
                i11 = i20;
            }
            if (i21 > i15) {
                i15 = i21;
            }
            if (i21 < i12) {
                i12 = i21;
            }
        }
        this.d = i10;
        this.f5271e = i13;
        this.f5272f = i11;
        this.f5273g = i14;
        this.h = i12;
        this.f5274i = i15;
        this.f5270c = i16;
    }

    public final int b() {
        return ((this.f5274i - this.h) + 1) * ((this.f5273g - this.f5272f) + 1) * ((this.f5271e - this.d) + 1);
    }
}
