package d2;
public final class a {
    public final int f4083a;
    public int f4084b;
    public int f4085c;
    public int d;
    public int e;
    public int f4086f;
    public int f4087g;
    public int h;
    public int f4088i;
    public final b f4089j;

    public a(b bVar, int i10, int i11) {
        this.f4089j = bVar;
        this.f4083a = i10;
        this.f4084b = i11;
        a();
    }

    public final void a() {
        b bVar = this.f4089j;
        int[] iArr = (int[]) bVar.f4092a;
        int[] iArr2 = (int[]) bVar.f4093b;
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MAX_VALUE;
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MIN_VALUE;
        int i14 = Integer.MIN_VALUE;
        int i15 = Integer.MIN_VALUE;
        int i16 = 0;
        for (int i17 = this.f4083a; i17 <= this.f4084b; i17++) {
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
        this.e = i13;
        this.f4086f = i11;
        this.f4087g = i14;
        this.h = i12;
        this.f4088i = i15;
        this.f4085c = i16;
    }

    public final int b() {
        return ((this.f4088i - this.h) + 1) * ((this.f4087g - this.f4086f) + 1) * ((this.e - this.d) + 1);
    }
}
