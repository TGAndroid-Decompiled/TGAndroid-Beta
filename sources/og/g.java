package og;
public final class g {
    public boolean f21850a;
    public float f21851b;
    public float f21852c;
    public float d;
    public float f21853e;
    public float f21854f;
    public float f21855g;
    public boolean h;
    public int f21856i;
    public float f21857j;
    public float f21858k;
    public float f21859l;
    public float f21860m;

    public final g clone() {
        ?? obj = new Object();
        obj.f21850a = this.f21850a;
        obj.f21851b = this.f21851b;
        obj.f21852c = this.f21852c;
        obj.d = this.d;
        obj.f21853e = this.f21853e;
        obj.f21854f = this.f21854f;
        obj.f21855g = this.f21855g;
        obj.h = this.h;
        obj.f21856i = this.f21856i;
        obj.f21857j = this.f21857j;
        obj.f21858k = this.f21858k;
        obj.f21859l = this.f21859l;
        obj.f21860m = this.f21860m;
        return obj;
    }

    public final int b() {
        return this.f21856i;
    }

    public final boolean c() {
        return this.f21850a;
    }

    public final boolean d() {
        return this.h;
    }

    public final void e(boolean z10, float f10, float f11, float f12, int i7, float f13, float f14, float f15, float f16, float f17, float f18, float f19, boolean z11) {
        this.f21850a = z10;
        this.f21851b = f10;
        this.f21852c = f11;
        this.f21854f = f13;
        this.f21855g = f12;
        this.f21856i = i7;
        while (true) {
            int i10 = this.f21856i;
            if (i10 >= 0) {
                break;
            }
            this.f21856i = i10 + 360;
        }
        while (true) {
            int i11 = this.f21856i;
            if (i11 >= 360) {
                this.f21856i = i11 - 360;
            } else {
                this.f21857j = f16;
                this.f21858k = f17;
                this.d = f18;
                this.f21853e = f19;
                this.f21859l = f14;
                this.f21860m = f15;
                this.h = z11;
                return;
            }
        }
    }
}
