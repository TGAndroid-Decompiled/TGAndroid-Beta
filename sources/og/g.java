package og;
public final class g {
    public boolean f21944a;
    public float f21945b;
    public float f21946c;
    public float d;
    public float f21947e;
    public float f21948f;
    public float f21949g;
    public boolean h;
    public int f21950i;
    public float f21951j;
    public float f21952k;
    public float f21953l;
    public float f21954m;

    public final g clone() {
        ?? obj = new Object();
        obj.f21944a = this.f21944a;
        obj.f21945b = this.f21945b;
        obj.f21946c = this.f21946c;
        obj.d = this.d;
        obj.f21947e = this.f21947e;
        obj.f21948f = this.f21948f;
        obj.f21949g = this.f21949g;
        obj.h = this.h;
        obj.f21950i = this.f21950i;
        obj.f21951j = this.f21951j;
        obj.f21952k = this.f21952k;
        obj.f21953l = this.f21953l;
        obj.f21954m = this.f21954m;
        return obj;
    }

    public final int b() {
        return this.f21950i;
    }

    public final boolean c() {
        return this.f21944a;
    }

    public final boolean d() {
        return this.h;
    }

    public final void e(boolean z10, float f10, float f11, float f12, int i7, float f13, float f14, float f15, float f16, float f17, float f18, float f19, boolean z11) {
        this.f21944a = z10;
        this.f21945b = f10;
        this.f21946c = f11;
        this.f21948f = f13;
        this.f21949g = f12;
        this.f21950i = i7;
        while (true) {
            int i10 = this.f21950i;
            if (i10 >= 0) {
                break;
            }
            this.f21950i = i10 + 360;
        }
        while (true) {
            int i11 = this.f21950i;
            if (i11 >= 360) {
                this.f21950i = i11 - 360;
            } else {
                this.f21951j = f16;
                this.f21952k = f17;
                this.d = f18;
                this.f21947e = f19;
                this.f21953l = f14;
                this.f21954m = f15;
                this.h = z11;
                return;
            }
        }
    }
}
