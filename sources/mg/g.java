package mg;
public final class g {
    public boolean f16940a;
    public float f16941b;
    public float f16942c;
    public float d;
    public float e;
    public float f16943f;
    public float f16944g;
    public boolean h;
    public int f16945i;
    public float f16946j;
    public float f16947k;
    public float f16948l;
    public float f16949m;

    public final g clone() {
        ?? obj = new Object();
        obj.f16940a = this.f16940a;
        obj.f16941b = this.f16941b;
        obj.f16942c = this.f16942c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f16943f = this.f16943f;
        obj.f16944g = this.f16944g;
        obj.h = this.h;
        obj.f16945i = this.f16945i;
        obj.f16946j = this.f16946j;
        obj.f16947k = this.f16947k;
        obj.f16948l = this.f16948l;
        obj.f16949m = this.f16949m;
        return obj;
    }

    public final int b() {
        return this.f16945i;
    }

    public final boolean c() {
        return this.f16940a;
    }

    public final boolean d() {
        return this.h;
    }

    public final void e(boolean z10, float f7, float f10, float f11, int i10, float f12, float f13, float f14, float f15, float f16, float f17, float f18, boolean z11) {
        this.f16940a = z10;
        this.f16941b = f7;
        this.f16942c = f10;
        this.f16943f = f12;
        this.f16944g = f11;
        this.f16945i = i10;
        while (true) {
            int i11 = this.f16945i;
            if (i11 >= 0) {
                break;
            }
            this.f16945i = i11 + 360;
        }
        while (true) {
            int i12 = this.f16945i;
            if (i12 >= 360) {
                this.f16945i = i12 - 360;
            } else {
                this.f16946j = f15;
                this.f16947k = f16;
                this.d = f17;
                this.e = f18;
                this.f16948l = f13;
                this.f16949m = f14;
                this.h = z11;
                return;
            }
        }
    }
}
