package lg;
public final class g {
    public boolean f14070a;
    public float f14071b;
    public float f14072c;
    public float d;
    public float e;
    public float f14073f;
    public float f14074g;
    public boolean h;
    public int f14075i;
    public float f14076j;
    public float f14077k;
    public float f14078l;
    public float f14079m;

    public final g clone() {
        ?? obj = new Object();
        obj.f14070a = this.f14070a;
        obj.f14071b = this.f14071b;
        obj.f14072c = this.f14072c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f14073f = this.f14073f;
        obj.f14074g = this.f14074g;
        obj.h = this.h;
        obj.f14075i = this.f14075i;
        obj.f14076j = this.f14076j;
        obj.f14077k = this.f14077k;
        obj.f14078l = this.f14078l;
        obj.f14079m = this.f14079m;
        return obj;
    }

    public final int b() {
        return this.f14075i;
    }

    public final boolean c() {
        return this.f14070a;
    }

    public final boolean d() {
        return this.h;
    }

    public final void e(boolean z10, float f7, float f10, float f11, int i10, float f12, float f13, float f14, float f15, float f16, float f17, float f18, boolean z11) {
        this.f14070a = z10;
        this.f14071b = f7;
        this.f14072c = f10;
        this.f14073f = f12;
        this.f14074g = f11;
        this.f14075i = i10;
        while (true) {
            int i11 = this.f14075i;
            if (i11 >= 0) {
                break;
            }
            this.f14075i = i11 + 360;
        }
        while (true) {
            int i12 = this.f14075i;
            if (i12 >= 360) {
                this.f14075i = i12 - 360;
            } else {
                this.f14076j = f15;
                this.f14077k = f16;
                this.d = f17;
                this.e = f18;
                this.f14078l = f13;
                this.f14079m = f14;
                this.h = z11;
                return;
            }
        }
    }
}
