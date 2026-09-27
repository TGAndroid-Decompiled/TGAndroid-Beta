package lg;
public final class g {
    public boolean f14285a;
    public float f14286b;
    public float f14287c;
    public float d;
    public float e;
    public float f14288f;
    public float f14289g;
    public boolean h;
    public int f14290i;
    public float f14291j;
    public float f14292k;
    public float f14293l;
    public float f14294m;

    public final g clone() {
        ?? obj = new Object();
        obj.f14285a = this.f14285a;
        obj.f14286b = this.f14286b;
        obj.f14287c = this.f14287c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f14288f = this.f14288f;
        obj.f14289g = this.f14289g;
        obj.h = this.h;
        obj.f14290i = this.f14290i;
        obj.f14291j = this.f14291j;
        obj.f14292k = this.f14292k;
        obj.f14293l = this.f14293l;
        obj.f14294m = this.f14294m;
        return obj;
    }

    public final int b() {
        return this.f14290i;
    }

    public final boolean c() {
        return this.f14285a;
    }

    public final boolean d() {
        return this.h;
    }

    public final void e(boolean z10, float f7, float f10, float f11, int i10, float f12, float f13, float f14, float f15, float f16, float f17, float f18, boolean z11) {
        this.f14285a = z10;
        this.f14286b = f7;
        this.f14287c = f10;
        this.f14288f = f12;
        this.f14289g = f11;
        this.f14290i = i10;
        while (true) {
            int i11 = this.f14290i;
            if (i11 >= 0) {
                break;
            }
            this.f14290i = i11 + 360;
        }
        while (true) {
            int i12 = this.f14290i;
            if (i12 >= 360) {
                this.f14290i = i12 - 360;
            } else {
                this.f14291j = f15;
                this.f14292k = f16;
                this.d = f17;
                this.e = f18;
                this.f14293l = f13;
                this.f14294m = f14;
                this.h = z11;
                return;
            }
        }
    }
}
