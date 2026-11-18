package og;
public final class g {
    public boolean f21853a;
    public float f21854b;
    public float f21855c;
    public float d;
    public float f21856e;
    public float f21857f;
    public float f21858g;
    public boolean h;
    public int f21859i;
    public float f21860j;
    public float f21861k;
    public float f21862l;
    public float f21863m;

    public final g clone() {
        ?? obj = new Object();
        obj.f21853a = this.f21853a;
        obj.f21854b = this.f21854b;
        obj.f21855c = this.f21855c;
        obj.d = this.d;
        obj.f21856e = this.f21856e;
        obj.f21857f = this.f21857f;
        obj.f21858g = this.f21858g;
        obj.h = this.h;
        obj.f21859i = this.f21859i;
        obj.f21860j = this.f21860j;
        obj.f21861k = this.f21861k;
        obj.f21862l = this.f21862l;
        obj.f21863m = this.f21863m;
        return obj;
    }

    public final int b() {
        return this.f21859i;
    }

    public final boolean c() {
        return this.f21853a;
    }

    public final boolean d() {
        return this.h;
    }

    public final void e(boolean z10, float f10, float f11, float f12, int i7, float f13, float f14, float f15, float f16, float f17, float f18, float f19, boolean z11) {
        this.f21853a = z10;
        this.f21854b = f10;
        this.f21855c = f11;
        this.f21857f = f13;
        this.f21858g = f12;
        this.f21859i = i7;
        while (true) {
            int i10 = this.f21859i;
            if (i10 >= 0) {
                break;
            }
            this.f21859i = i10 + 360;
        }
        while (true) {
            int i11 = this.f21859i;
            if (i11 >= 360) {
                this.f21859i = i11 - 360;
            } else {
                this.f21860j = f16;
                this.f21861k = f17;
                this.d = f18;
                this.f21856e = f19;
                this.f21862l = f14;
                this.f21863m = f15;
                this.h = z11;
                return;
            }
        }
    }
}
