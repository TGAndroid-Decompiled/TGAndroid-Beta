package lg;
public final class g {
    public boolean f14252a;
    public float f14253b;
    public float f14254c;
    public float d;
    public float e;
    public float f14255f;
    public float f14256g;
    public boolean h;
    public int f14257i;
    public float f14258j;
    public float f14259k;
    public float f14260l;
    public float f14261m;

    public final g clone() {
        ?? obj = new Object();
        obj.f14252a = this.f14252a;
        obj.f14253b = this.f14253b;
        obj.f14254c = this.f14254c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f14255f = this.f14255f;
        obj.f14256g = this.f14256g;
        obj.h = this.h;
        obj.f14257i = this.f14257i;
        obj.f14258j = this.f14258j;
        obj.f14259k = this.f14259k;
        obj.f14260l = this.f14260l;
        obj.f14261m = this.f14261m;
        return obj;
    }

    public final int b() {
        return this.f14257i;
    }

    public final boolean c() {
        return this.f14252a;
    }

    public final boolean d() {
        return this.h;
    }

    public final void e(boolean z10, float f7, float f10, float f11, int i10, float f12, float f13, float f14, float f15, float f16, float f17, float f18, boolean z11) {
        this.f14252a = z10;
        this.f14253b = f7;
        this.f14254c = f10;
        this.f14255f = f12;
        this.f14256g = f11;
        this.f14257i = i10;
        while (true) {
            int i11 = this.f14257i;
            if (i11 >= 0) {
                break;
            }
            this.f14257i = i11 + 360;
        }
        while (true) {
            int i12 = this.f14257i;
            if (i12 >= 360) {
                this.f14257i = i12 - 360;
            } else {
                this.f14258j = f15;
                this.f14259k = f16;
                this.d = f17;
                this.e = f18;
                this.f14260l = f13;
                this.f14261m = f14;
                this.h = z11;
                return;
            }
        }
    }
}
