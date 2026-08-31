package d2;
public final class a {
    public final int f4163a;
    public int f4164b;
    public int f4165c;
    public int d;
    public int f4166e;
    public int f4167f;
    public int f4168g;
    public int h;
    public int f4169i;
    public final b f4170j;

    public a(b bVar, int i10, int i11) {
        this.f4170j = bVar;
        this.f4163a = i10;
        this.f4164b = i11;
        a();
    }

    public final void a() {
        b bVar = this.f4170j;
        int[] iArr = (int[]) bVar.f4173a;
        int[] iArr2 = (int[]) bVar.f4174b;
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MAX_VALUE;
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MIN_VALUE;
        int i14 = Integer.MIN_VALUE;
        int i15 = Integer.MIN_VALUE;
        int i16 = 0;
        for (int i17 = this.f4163a; i17 <= this.f4164b; i17++) {
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
        this.f4166e = i13;
        this.f4167f = i11;
        this.f4168g = i14;
        this.h = i12;
        this.f4169i = i15;
        this.f4165c = i16;
    }

    public final int b() {
        return ((this.f4169i - this.h) + 1) * ((this.f4168g - this.f4167f) + 1) * ((this.f4166e - this.d) + 1);
    }
}
