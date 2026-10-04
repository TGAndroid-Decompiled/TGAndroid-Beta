package lg;
public final class g {
    public boolean f15531a;
    public float f15532b;
    public float f15533c;
    public float d;
    public float f15534e;
    public float f15535f;
    public float f15536g;
    public boolean h;
    public int f15537i;
    public float f15538j;
    public float f15539k;
    public float f15540l;
    public float f15541m;

    public final g clone() {
        ?? obj = new Object();
        obj.f15531a = this.f15531a;
        obj.f15532b = this.f15532b;
        obj.f15533c = this.f15533c;
        obj.d = this.d;
        obj.f15534e = this.f15534e;
        obj.f15535f = this.f15535f;
        obj.f15536g = this.f15536g;
        obj.h = this.h;
        obj.f15537i = this.f15537i;
        obj.f15538j = this.f15538j;
        obj.f15539k = this.f15539k;
        obj.f15540l = this.f15540l;
        obj.f15541m = this.f15541m;
        return obj;
    }

    public final int b() {
        return this.f15537i;
    }

    public final boolean c() {
        return this.f15531a;
    }

    public final boolean d() {
        return this.h;
    }

    public final void e(boolean z10, float f7, float f10, float f11, int i10, float f12, float f13, float f14, float f15, float f16, float f17, float f18, boolean z11) {
        this.f15531a = z10;
        this.f15532b = f7;
        this.f15533c = f10;
        this.f15535f = f12;
        this.f15536g = f11;
        this.f15537i = i10;
        while (true) {
            int i11 = this.f15537i;
            if (i11 >= 0) {
                break;
            }
            this.f15537i = i11 + 360;
        }
        while (true) {
            int i12 = this.f15537i;
            if (i12 >= 360) {
                this.f15537i = i12 - 360;
            } else {
                this.f15538j = f15;
                this.f15539k = f16;
                this.d = f17;
                this.f15534e = f18;
                this.f15540l = f13;
                this.f15541m = f14;
                this.h = z11;
                return;
            }
        }
    }
}
