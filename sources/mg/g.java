package mg;
public final class g {
    public boolean f15784a;
    public float f15785b;
    public float f15786c;
    public float d;
    public float e;
    public float f15787f;
    public float f15788g;
    public boolean h;
    public int f15789i;
    public float f15790j;
    public float f15791k;
    public float f15792l;
    public float f15793m;

    public final g clone() {
        ?? obj = new Object();
        obj.f15784a = this.f15784a;
        obj.f15785b = this.f15785b;
        obj.f15786c = this.f15786c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f15787f = this.f15787f;
        obj.f15788g = this.f15788g;
        obj.h = this.h;
        obj.f15789i = this.f15789i;
        obj.f15790j = this.f15790j;
        obj.f15791k = this.f15791k;
        obj.f15792l = this.f15792l;
        obj.f15793m = this.f15793m;
        return obj;
    }

    public final int b() {
        return this.f15789i;
    }

    public final boolean c() {
        return this.f15784a;
    }

    public final boolean d() {
        return this.h;
    }

    public final void e(boolean z10, float f7, float f10, float f11, int i10, float f12, float f13, float f14, float f15, float f16, float f17, float f18, boolean z11) {
        this.f15784a = z10;
        this.f15785b = f7;
        this.f15786c = f10;
        this.f15787f = f12;
        this.f15788g = f11;
        this.f15789i = i10;
        while (true) {
            int i11 = this.f15789i;
            if (i11 >= 0) {
                break;
            }
            this.f15789i = i11 + 360;
        }
        while (true) {
            int i12 = this.f15789i;
            if (i12 >= 360) {
                this.f15789i = i12 - 360;
            } else {
                this.f15790j = f15;
                this.f15791k = f16;
                this.d = f17;
                this.e = f18;
                this.f15792l = f13;
                this.f15793m = f14;
                this.h = z11;
                return;
            }
        }
    }
}
