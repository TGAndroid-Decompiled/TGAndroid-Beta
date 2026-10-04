package lg;
public final class g {
    public boolean f15529a;
    public float f15530b;
    public float f15531c;
    public float d;
    public float f15532e;
    public float f15533f;
    public float f15534g;
    public boolean h;
    public int f15535i;
    public float f15536j;
    public float f15537k;
    public float f15538l;
    public float f15539m;

    public final g clone() {
        ?? obj = new Object();
        obj.f15529a = this.f15529a;
        obj.f15530b = this.f15530b;
        obj.f15531c = this.f15531c;
        obj.d = this.d;
        obj.f15532e = this.f15532e;
        obj.f15533f = this.f15533f;
        obj.f15534g = this.f15534g;
        obj.h = this.h;
        obj.f15535i = this.f15535i;
        obj.f15536j = this.f15536j;
        obj.f15537k = this.f15537k;
        obj.f15538l = this.f15538l;
        obj.f15539m = this.f15539m;
        return obj;
    }

    public final int b() {
        return this.f15535i;
    }

    public final boolean c() {
        return this.f15529a;
    }

    public final boolean d() {
        return this.h;
    }

    public final void e(boolean z10, float f7, float f10, float f11, int i10, float f12, float f13, float f14, float f15, float f16, float f17, float f18, boolean z11) {
        this.f15529a = z10;
        this.f15530b = f7;
        this.f15531c = f10;
        this.f15533f = f12;
        this.f15534g = f11;
        this.f15535i = i10;
        while (true) {
            int i11 = this.f15535i;
            if (i11 >= 0) {
                break;
            }
            this.f15535i = i11 + 360;
        }
        while (true) {
            int i12 = this.f15535i;
            if (i12 >= 360) {
                this.f15535i = i12 - 360;
            } else {
                this.f15536j = f15;
                this.f15537k = f16;
                this.d = f17;
                this.f15532e = f18;
                this.f15538l = f13;
                this.f15539m = f14;
                this.h = z11;
                return;
            }
        }
    }
}
