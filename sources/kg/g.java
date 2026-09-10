package kg;
public final class g {
    public boolean f12455a;
    public float f12456b;
    public float f12457c;
    public float d;
    public float e;
    public float f12458f;
    public float f12459g;
    public boolean h;
    public int f12460i;
    public float f12461j;
    public float f12462k;
    public float f12463l;
    public float f12464m;

    public final g clone() {
        ?? obj = new Object();
        obj.f12455a = this.f12455a;
        obj.f12456b = this.f12456b;
        obj.f12457c = this.f12457c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f12458f = this.f12458f;
        obj.f12459g = this.f12459g;
        obj.h = this.h;
        obj.f12460i = this.f12460i;
        obj.f12461j = this.f12461j;
        obj.f12462k = this.f12462k;
        obj.f12463l = this.f12463l;
        obj.f12464m = this.f12464m;
        return obj;
    }

    public final int b() {
        return this.f12460i;
    }

    public final boolean c() {
        return this.f12455a;
    }

    public final boolean d() {
        return this.h;
    }

    public final void e(boolean z10, float f7, float f10, float f11, int i10, float f12, float f13, float f14, float f15, float f16, float f17, float f18, boolean z11) {
        this.f12455a = z10;
        this.f12456b = f7;
        this.f12457c = f10;
        this.f12458f = f12;
        this.f12459g = f11;
        this.f12460i = i10;
        while (true) {
            int i11 = this.f12460i;
            if (i11 >= 0) {
                break;
            }
            this.f12460i = i11 + 360;
        }
        while (true) {
            int i12 = this.f12460i;
            if (i12 >= 360) {
                this.f12460i = i12 - 360;
            } else {
                this.f12461j = f15;
                this.f12462k = f16;
                this.d = f17;
                this.e = f18;
                this.f12463l = f13;
                this.f12464m = f14;
                this.h = z11;
                return;
            }
        }
    }
}
