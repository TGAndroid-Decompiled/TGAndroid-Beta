package lg;
public final class g {
    public boolean f14283a;
    public float f14284b;
    public float f14285c;
    public float d;
    public float e;
    public float f14286f;
    public float f14287g;
    public boolean h;
    public int f14288i;
    public float f14289j;
    public float f14290k;
    public float f14291l;
    public float f14292m;

    public final g clone() {
        ?? obj = new Object();
        obj.f14283a = this.f14283a;
        obj.f14284b = this.f14284b;
        obj.f14285c = this.f14285c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f14286f = this.f14286f;
        obj.f14287g = this.f14287g;
        obj.h = this.h;
        obj.f14288i = this.f14288i;
        obj.f14289j = this.f14289j;
        obj.f14290k = this.f14290k;
        obj.f14291l = this.f14291l;
        obj.f14292m = this.f14292m;
        return obj;
    }

    public final int b() {
        return this.f14288i;
    }

    public final boolean c() {
        return this.f14283a;
    }

    public final boolean d() {
        return this.h;
    }

    public final void e(boolean z10, float f7, float f10, float f11, int i10, float f12, float f13, float f14, float f15, float f16, float f17, float f18, boolean z11) {
        this.f14283a = z10;
        this.f14284b = f7;
        this.f14285c = f10;
        this.f14286f = f12;
        this.f14287g = f11;
        this.f14288i = i10;
        while (true) {
            int i11 = this.f14288i;
            if (i11 >= 0) {
                break;
            }
            this.f14288i = i11 + 360;
        }
        while (true) {
            int i12 = this.f14288i;
            if (i12 >= 360) {
                this.f14288i = i12 - 360;
            } else {
                this.f14289j = f15;
                this.f14290k = f16;
                this.d = f17;
                this.e = f18;
                this.f14291l = f13;
                this.f14292m = f14;
                this.h = z11;
                return;
            }
        }
    }
}
