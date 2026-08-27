package d2;

public final class b {

    public final int f4701a;

    public int f4702b;

    public int f4703c;
    public int d;

    public int f4704e;

    public int f4705f;

    public int f4706g;
    public int h;

    public int f4707i;

    public final c f4708j;

    public b(c cVar, int i10, int i11) {
        this.f4708j = cVar;
        this.f4701a = i10;
        this.f4702b = i11;
        a();
    }

    public final void a() {
        c cVar = this.f4708j;
        int[] iArr = (int[]) cVar.f4711a;
        int[] iArr2 = (int[]) cVar.f4712b;
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MAX_VALUE;
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MIN_VALUE;
        int i14 = Integer.MIN_VALUE;
        int i15 = Integer.MIN_VALUE;
        int i16 = 0;
        for (int i17 = this.f4701a; i17 <= this.f4702b; i17++) {
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
        this.f4704e = i13;
        this.f4705f = i11;
        this.f4706g = i14;
        this.h = i12;
        this.f4707i = i15;
        this.f4703c = i16;
    }

    public final int b() {
        return ((this.f4707i - this.h) + 1) * ((this.f4706g - this.f4705f) + 1) * ((this.f4704e - this.d) + 1);
    }
}
