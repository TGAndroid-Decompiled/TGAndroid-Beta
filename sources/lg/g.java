package lg;
public final class g {
    public boolean f14048a;
    public float f14049b;
    public float f14050c;
    public float d;
    public float e;
    public float f14051f;
    public float f14052g;
    public boolean h;
    public int f14053i;
    public float f14054j;
    public float f14055k;
    public float f14056l;
    public float f14057m;

    public final g clone() {
        ?? obj = new Object();
        obj.f14048a = this.f14048a;
        obj.f14049b = this.f14049b;
        obj.f14050c = this.f14050c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f14051f = this.f14051f;
        obj.f14052g = this.f14052g;
        obj.h = this.h;
        obj.f14053i = this.f14053i;
        obj.f14054j = this.f14054j;
        obj.f14055k = this.f14055k;
        obj.f14056l = this.f14056l;
        obj.f14057m = this.f14057m;
        return obj;
    }

    public final int b() {
        return this.f14053i;
    }

    public final boolean c() {
        return this.f14048a;
    }

    public final boolean d() {
        return this.h;
    }

    public final void e(boolean z10, float f7, float f10, float f11, int i10, float f12, float f13, float f14, float f15, float f16, float f17, float f18, boolean z11) {
        this.f14048a = z10;
        this.f14049b = f7;
        this.f14050c = f10;
        this.f14051f = f12;
        this.f14052g = f11;
        this.f14053i = i10;
        while (true) {
            int i11 = this.f14053i;
            if (i11 >= 0) {
                break;
            }
            this.f14053i = i11 + 360;
        }
        while (true) {
            int i12 = this.f14053i;
            if (i12 >= 360) {
                this.f14053i = i12 - 360;
            } else {
                this.f14054j = f15;
                this.f14055k = f16;
                this.d = f17;
                this.e = f18;
                this.f14056l = f13;
                this.f14057m = f14;
                this.h = z11;
                return;
            }
        }
    }
}
