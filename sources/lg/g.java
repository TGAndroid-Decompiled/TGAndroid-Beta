package lg;
public final class g {
    public boolean f15527a;
    public float f15528b;
    public float f15529c;
    public float d;
    public float f15530e;
    public float f15531f;
    public float f15532g;
    public boolean h;
    public int f15533i;
    public float f15534j;
    public float f15535k;
    public float f15536l;
    public float f15537m;

    public final g clone() {
        ?? obj = new Object();
        obj.f15527a = this.f15527a;
        obj.f15528b = this.f15528b;
        obj.f15529c = this.f15529c;
        obj.d = this.d;
        obj.f15530e = this.f15530e;
        obj.f15531f = this.f15531f;
        obj.f15532g = this.f15532g;
        obj.h = this.h;
        obj.f15533i = this.f15533i;
        obj.f15534j = this.f15534j;
        obj.f15535k = this.f15535k;
        obj.f15536l = this.f15536l;
        obj.f15537m = this.f15537m;
        return obj;
    }

    public final int b() {
        return this.f15533i;
    }

    public final boolean c() {
        return this.f15527a;
    }

    public final boolean d() {
        return this.h;
    }

    public final void e(boolean z10, float f7, float f10, float f11, int i10, float f12, float f13, float f14, float f15, float f16, float f17, float f18, boolean z11) {
        this.f15527a = z10;
        this.f15528b = f7;
        this.f15529c = f10;
        this.f15531f = f12;
        this.f15532g = f11;
        this.f15533i = i10;
        while (true) {
            int i11 = this.f15533i;
            if (i11 >= 0) {
                break;
            }
            this.f15533i = i11 + 360;
        }
        while (true) {
            int i12 = this.f15533i;
            if (i12 >= 360) {
                this.f15533i = i12 - 360;
            } else {
                this.f15534j = f15;
                this.f15535k = f16;
                this.d = f17;
                this.f15530e = f18;
                this.f15536l = f13;
                this.f15537m = f14;
                this.h = z11;
                return;
            }
        }
    }
}
