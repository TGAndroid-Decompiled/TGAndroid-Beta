package og;
public final class g {
    public boolean f20964a;
    public float f20965b;
    public float f20966c;
    public float d;
    public float f20967e;
    public float f20968f;
    public float f20969g;
    public boolean h;
    public int f20970i;
    public float f20971j;
    public float f20972k;
    public float f20973l;
    public float f20974m;

    public final g clone() {
        ?? obj = new Object();
        obj.f20964a = this.f20964a;
        obj.f20965b = this.f20965b;
        obj.f20966c = this.f20966c;
        obj.d = this.d;
        obj.f20967e = this.f20967e;
        obj.f20968f = this.f20968f;
        obj.f20969g = this.f20969g;
        obj.h = this.h;
        obj.f20970i = this.f20970i;
        obj.f20971j = this.f20971j;
        obj.f20972k = this.f20972k;
        obj.f20973l = this.f20973l;
        obj.f20974m = this.f20974m;
        return obj;
    }

    public final int b() {
        return this.f20970i;
    }

    public final boolean c() {
        return this.f20964a;
    }

    public final boolean d() {
        return this.h;
    }

    public final void e(boolean z9, float f10, float f11, float f12, int i7, float f13, float f14, float f15, float f16, float f17, float f18, float f19, boolean z10) {
        this.f20964a = z9;
        this.f20965b = f10;
        this.f20966c = f11;
        this.f20968f = f13;
        this.f20969g = f12;
        this.f20970i = i7;
        while (true) {
            int i10 = this.f20970i;
            if (i10 >= 0) {
                break;
            }
            this.f20970i = i10 + 360;
        }
        while (true) {
            int i11 = this.f20970i;
            if (i11 >= 360) {
                this.f20970i = i11 - 360;
            } else {
                this.f20971j = f16;
                this.f20972k = f17;
                this.d = f18;
                this.f20967e = f19;
                this.f20973l = f14;
                this.f20974m = f15;
                this.h = z10;
                return;
            }
        }
    }
}
