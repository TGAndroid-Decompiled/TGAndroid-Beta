package og;
public final class g {
    public boolean f21487a;
    public float f21488b;
    public float f21489c;
    public float d;
    public float f21490e;
    public float f21491f;
    public float f21492g;
    public boolean h;
    public int f21493i;
    public float f21494j;
    public float f21495k;
    public float f21496l;
    public float f21497m;

    public final g clone() {
        ?? obj = new Object();
        obj.f21487a = this.f21487a;
        obj.f21488b = this.f21488b;
        obj.f21489c = this.f21489c;
        obj.d = this.d;
        obj.f21490e = this.f21490e;
        obj.f21491f = this.f21491f;
        obj.f21492g = this.f21492g;
        obj.h = this.h;
        obj.f21493i = this.f21493i;
        obj.f21494j = this.f21494j;
        obj.f21495k = this.f21495k;
        obj.f21496l = this.f21496l;
        obj.f21497m = this.f21497m;
        return obj;
    }

    public final int b() {
        return this.f21493i;
    }

    public final boolean c() {
        return this.f21487a;
    }

    public final boolean d() {
        return this.h;
    }

    public final void e(boolean z10, float f10, float f11, float f12, int i7, float f13, float f14, float f15, float f16, float f17, float f18, float f19, boolean z11) {
        this.f21487a = z10;
        this.f21488b = f10;
        this.f21489c = f11;
        this.f21491f = f13;
        this.f21492g = f12;
        this.f21493i = i7;
        while (true) {
            int i10 = this.f21493i;
            if (i10 >= 0) {
                break;
            }
            this.f21493i = i10 + 360;
        }
        while (true) {
            int i11 = this.f21493i;
            if (i11 >= 360) {
                this.f21493i = i11 - 360;
            } else {
                this.f21494j = f16;
                this.f21495k = f17;
                this.d = f18;
                this.f21490e = f19;
                this.f21496l = f14;
                this.f21497m = f15;
                this.h = z11;
                return;
            }
        }
    }
}
