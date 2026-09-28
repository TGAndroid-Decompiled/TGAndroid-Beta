package lg;
public final class g {
    public boolean f14284a;
    public float f14285b;
    public float f14286c;
    public float d;
    public float e;
    public float f14287f;
    public float f14288g;
    public boolean h;
    public int f14289i;
    public float f14290j;
    public float f14291k;
    public float f14292l;
    public float f14293m;

    public final g clone() {
        ?? obj = new Object();
        obj.f14284a = this.f14284a;
        obj.f14285b = this.f14285b;
        obj.f14286c = this.f14286c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f14287f = this.f14287f;
        obj.f14288g = this.f14288g;
        obj.h = this.h;
        obj.f14289i = this.f14289i;
        obj.f14290j = this.f14290j;
        obj.f14291k = this.f14291k;
        obj.f14292l = this.f14292l;
        obj.f14293m = this.f14293m;
        return obj;
    }

    public final int b() {
        return this.f14289i;
    }

    public final boolean c() {
        return this.f14284a;
    }

    public final boolean d() {
        return this.h;
    }

    public final void e(boolean z10, float f7, float f10, float f11, int i10, float f12, float f13, float f14, float f15, float f16, float f17, float f18, boolean z11) {
        this.f14284a = z10;
        this.f14285b = f7;
        this.f14286c = f10;
        this.f14287f = f12;
        this.f14288g = f11;
        this.f14289i = i10;
        while (true) {
            int i11 = this.f14289i;
            if (i11 >= 0) {
                break;
            }
            this.f14289i = i11 + 360;
        }
        while (true) {
            int i12 = this.f14289i;
            if (i12 >= 360) {
                this.f14289i = i12 - 360;
            } else {
                this.f14290j = f15;
                this.f14291k = f16;
                this.d = f17;
                this.e = f18;
                this.f14292l = f13;
                this.f14293m = f14;
                this.h = z11;
                return;
            }
        }
    }
}
