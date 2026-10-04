package lg;
public final class g {
    public boolean f15530a;
    public float f15531b;
    public float f15532c;
    public float d;
    public float f15533e;
    public float f15534f;
    public float f15535g;
    public boolean h;
    public int f15536i;
    public float f15537j;
    public float f15538k;
    public float f15539l;
    public float f15540m;

    public final g clone() {
        ?? obj = new Object();
        obj.f15530a = this.f15530a;
        obj.f15531b = this.f15531b;
        obj.f15532c = this.f15532c;
        obj.d = this.d;
        obj.f15533e = this.f15533e;
        obj.f15534f = this.f15534f;
        obj.f15535g = this.f15535g;
        obj.h = this.h;
        obj.f15536i = this.f15536i;
        obj.f15537j = this.f15537j;
        obj.f15538k = this.f15538k;
        obj.f15539l = this.f15539l;
        obj.f15540m = this.f15540m;
        return obj;
    }

    public final int b() {
        return this.f15536i;
    }

    public final boolean c() {
        return this.f15530a;
    }

    public final boolean d() {
        return this.h;
    }

    public final void e(boolean z10, float f7, float f10, float f11, int i10, float f12, float f13, float f14, float f15, float f16, float f17, float f18, boolean z11) {
        this.f15530a = z10;
        this.f15531b = f7;
        this.f15532c = f10;
        this.f15534f = f12;
        this.f15535g = f11;
        this.f15536i = i10;
        while (true) {
            int i11 = this.f15536i;
            if (i11 >= 0) {
                break;
            }
            this.f15536i = i11 + 360;
        }
        while (true) {
            int i12 = this.f15536i;
            if (i12 >= 360) {
                this.f15536i = i12 - 360;
            } else {
                this.f15537j = f15;
                this.f15538k = f16;
                this.d = f17;
                this.f15533e = f18;
                this.f15539l = f13;
                this.f15540m = f14;
                this.h = z11;
                return;
            }
        }
    }
}
