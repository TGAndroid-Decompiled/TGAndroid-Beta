package lg;
public final class g {
    public boolean f15273a;
    public float f15274b;
    public float f15275c;
    public float d;
    public float f15276e;
    public float f15277f;
    public float f15278g;
    public boolean h;
    public int f15279i;
    public float f15280j;
    public float f15281k;
    public float f15282l;
    public float f15283m;

    public final g clone() {
        ?? obj = new Object();
        obj.f15273a = this.f15273a;
        obj.f15274b = this.f15274b;
        obj.f15275c = this.f15275c;
        obj.d = this.d;
        obj.f15276e = this.f15276e;
        obj.f15277f = this.f15277f;
        obj.f15278g = this.f15278g;
        obj.h = this.h;
        obj.f15279i = this.f15279i;
        obj.f15280j = this.f15280j;
        obj.f15281k = this.f15281k;
        obj.f15282l = this.f15282l;
        obj.f15283m = this.f15283m;
        return obj;
    }

    public final int b() {
        return this.f15279i;
    }

    public final boolean c() {
        return this.f15273a;
    }

    public final boolean d() {
        return this.h;
    }

    public final void e(boolean z10, float f7, float f10, float f11, int i10, float f12, float f13, float f14, float f15, float f16, float f17, float f18, boolean z11) {
        this.f15273a = z10;
        this.f15274b = f7;
        this.f15275c = f10;
        this.f15277f = f12;
        this.f15278g = f11;
        this.f15279i = i10;
        while (true) {
            int i11 = this.f15279i;
            if (i11 >= 0) {
                break;
            }
            this.f15279i = i11 + 360;
        }
        while (true) {
            int i12 = this.f15279i;
            if (i12 >= 360) {
                this.f15279i = i12 - 360;
            } else {
                this.f15280j = f15;
                this.f15281k = f16;
                this.d = f17;
                this.f15276e = f18;
                this.f15282l = f13;
                this.f15283m = f14;
                this.h = z11;
                return;
            }
        }
    }
}
