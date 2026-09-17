package mg;
public final class g {
    public boolean f16256a;
    public float f16257b;
    public float f16258c;
    public float d;
    public float f16259e;
    public float f16260f;
    public float f16261g;
    public boolean h;
    public int f16262i;
    public float f16263j;
    public float f16264k;
    public float f16265l;
    public float f16266m;

    public final g clone() {
        ?? obj = new Object();
        obj.f16256a = this.f16256a;
        obj.f16257b = this.f16257b;
        obj.f16258c = this.f16258c;
        obj.d = this.d;
        obj.f16259e = this.f16259e;
        obj.f16260f = this.f16260f;
        obj.f16261g = this.f16261g;
        obj.h = this.h;
        obj.f16262i = this.f16262i;
        obj.f16263j = this.f16263j;
        obj.f16264k = this.f16264k;
        obj.f16265l = this.f16265l;
        obj.f16266m = this.f16266m;
        return obj;
    }

    public final int b() {
        return this.f16262i;
    }

    public final boolean c() {
        return this.f16256a;
    }

    public final boolean d() {
        return this.h;
    }

    public final void e(boolean z10, float f7, float f10, float f11, int i10, float f12, float f13, float f14, float f15, float f16, float f17, float f18, boolean z11) {
        this.f16256a = z10;
        this.f16257b = f7;
        this.f16258c = f10;
        this.f16260f = f12;
        this.f16261g = f11;
        this.f16262i = i10;
        while (true) {
            int i11 = this.f16262i;
            if (i11 >= 0) {
                break;
            }
            this.f16262i = i11 + 360;
        }
        while (true) {
            int i12 = this.f16262i;
            if (i12 >= 360) {
                this.f16262i = i12 - 360;
            } else {
                this.f16263j = f15;
                this.f16264k = f16;
                this.d = f17;
                this.f16259e = f18;
                this.f16265l = f13;
                this.f16266m = f14;
                this.h = z11;
                return;
            }
        }
    }
}
