package ng;
public final class g {
    public boolean f18802a;
    public float f18803b;
    public float f18804c;
    public float d;
    public float e;
    public float f18805f;
    public float f18806g;
    public boolean h;
    public int f18807i;
    public float f18808j;
    public float f18809k;
    public float f18810l;
    public float f18811m;

    public final g clone() {
        ?? obj = new Object();
        obj.f18802a = this.f18802a;
        obj.f18803b = this.f18803b;
        obj.f18804c = this.f18804c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f18805f = this.f18805f;
        obj.f18806g = this.f18806g;
        obj.h = this.h;
        obj.f18807i = this.f18807i;
        obj.f18808j = this.f18808j;
        obj.f18809k = this.f18809k;
        obj.f18810l = this.f18810l;
        obj.f18811m = this.f18811m;
        return obj;
    }

    public final int b() {
        return this.f18807i;
    }

    public final boolean c() {
        return this.f18802a;
    }

    public final boolean d() {
        return this.h;
    }

    public final void e(boolean z10, float f7, float f10, float f11, int i10, float f12, float f13, float f14, float f15, float f16, float f17, float f18, boolean z11) {
        this.f18802a = z10;
        this.f18803b = f7;
        this.f18804c = f10;
        this.f18805f = f12;
        this.f18806g = f11;
        this.f18807i = i10;
        while (true) {
            int i11 = this.f18807i;
            if (i11 >= 0) {
                break;
            }
            this.f18807i = i11 + 360;
        }
        while (true) {
            int i12 = this.f18807i;
            if (i12 >= 360) {
                this.f18807i = i12 - 360;
            } else {
                this.f18808j = f15;
                this.f18809k = f16;
                this.d = f17;
                this.e = f18;
                this.f18810l = f13;
                this.f18811m = f14;
                this.h = z11;
                return;
            }
        }
    }
}
