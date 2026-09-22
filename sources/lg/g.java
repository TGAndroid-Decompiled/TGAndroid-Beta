package lg;
public final class g {
    public boolean f14267a;
    public float f14268b;
    public float f14269c;
    public float d;
    public float e;
    public float f14270f;
    public float f14271g;
    public boolean h;
    public int f14272i;
    public float f14273j;
    public float f14274k;
    public float f14275l;
    public float f14276m;

    public final g clone() {
        ?? obj = new Object();
        obj.f14267a = this.f14267a;
        obj.f14268b = this.f14268b;
        obj.f14269c = this.f14269c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f14270f = this.f14270f;
        obj.f14271g = this.f14271g;
        obj.h = this.h;
        obj.f14272i = this.f14272i;
        obj.f14273j = this.f14273j;
        obj.f14274k = this.f14274k;
        obj.f14275l = this.f14275l;
        obj.f14276m = this.f14276m;
        return obj;
    }

    public final int b() {
        return this.f14272i;
    }

    public final boolean c() {
        return this.f14267a;
    }

    public final boolean d() {
        return this.h;
    }

    public final void e(boolean z10, float f7, float f10, float f11, int i10, float f12, float f13, float f14, float f15, float f16, float f17, float f18, boolean z11) {
        this.f14267a = z10;
        this.f14268b = f7;
        this.f14269c = f10;
        this.f14270f = f12;
        this.f14271g = f11;
        this.f14272i = i10;
        while (true) {
            int i11 = this.f14272i;
            if (i11 >= 0) {
                break;
            }
            this.f14272i = i11 + 360;
        }
        while (true) {
            int i12 = this.f14272i;
            if (i12 >= 360) {
                this.f14272i = i12 - 360;
            } else {
                this.f14273j = f15;
                this.f14274k = f16;
                this.d = f17;
                this.e = f18;
                this.f14275l = f13;
                this.f14276m = f14;
                this.h = z11;
                return;
            }
        }
    }
}
