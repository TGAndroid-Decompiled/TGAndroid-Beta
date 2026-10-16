package mg;
public final class g {
    public boolean f15519a;
    public float f15520b;
    public float f15521c;
    public float d;
    public float e;
    public float f15522f;
    public float f15523g;
    public boolean h;
    public int f15524i;
    public float f15525j;
    public float f15526k;
    public float f15527l;
    public float f15528m;

    public final g clone() {
        ?? obj = new Object();
        obj.f15519a = this.f15519a;
        obj.f15520b = this.f15520b;
        obj.f15521c = this.f15521c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f15522f = this.f15522f;
        obj.f15523g = this.f15523g;
        obj.h = this.h;
        obj.f15524i = this.f15524i;
        obj.f15525j = this.f15525j;
        obj.f15526k = this.f15526k;
        obj.f15527l = this.f15527l;
        obj.f15528m = this.f15528m;
        return obj;
    }

    public final int b() {
        return this.f15524i;
    }

    public final boolean c() {
        return this.f15519a;
    }

    public final boolean d() {
        return this.h;
    }

    public final void e(boolean z10, float f7, float f10, float f11, int i10, float f12, float f13, float f14, float f15, float f16, float f17, float f18, boolean z11) {
        this.f15519a = z10;
        this.f15520b = f7;
        this.f15521c = f10;
        this.f15522f = f12;
        this.f15523g = f11;
        this.f15524i = i10;
        while (true) {
            int i11 = this.f15524i;
            if (i11 >= 0) {
                break;
            }
            this.f15524i = i11 + 360;
        }
        while (true) {
            int i12 = this.f15524i;
            if (i12 >= 360) {
                this.f15524i = i12 - 360;
            } else {
                this.f15525j = f15;
                this.f15526k = f16;
                this.d = f17;
                this.e = f18;
                this.f15527l = f13;
                this.f15528m = f14;
                this.h = z11;
                return;
            }
        }
    }
}
