package d2;
public final class b {
    public final int f4259a;
    public int f4260b;
    public int f4261c;
    public int d;
    public int f4262e;
    public int f4263f;
    public int f4264g;
    public int h;
    public int f4265i;
    public final c f4266j;

    public b(c cVar, int i9, int i10) {
        this.f4266j = cVar;
        this.f4259a = i9;
        this.f4260b = i10;
        a();
    }

    public final void a() {
        c cVar = this.f4266j;
        int[] iArr = (int[]) cVar.f4269a;
        int[] iArr2 = (int[]) cVar.f4270b;
        int i9 = Integer.MAX_VALUE;
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MAX_VALUE;
        int i12 = Integer.MIN_VALUE;
        int i13 = Integer.MIN_VALUE;
        int i14 = Integer.MIN_VALUE;
        int i15 = 0;
        for (int i16 = this.f4259a; i16 <= this.f4260b; i16++) {
            int i17 = iArr[i16];
            i15 += iArr2[i17];
            int i18 = (i17 >> 10) & 31;
            int i19 = (i17 >> 5) & 31;
            int i20 = i17 & 31;
            if (i18 > i12) {
                i12 = i18;
            }
            if (i18 < i9) {
                i9 = i18;
            }
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
        }
        this.d = i9;
        this.f4262e = i12;
        this.f4263f = i10;
        this.f4264g = i13;
        this.h = i11;
        this.f4265i = i14;
        this.f4261c = i15;
    }

    public final int b() {
        return ((this.f4265i - this.h) + 1) * ((this.f4264g - this.f4263f) + 1) * ((this.f4262e - this.d) + 1);
    }
}
