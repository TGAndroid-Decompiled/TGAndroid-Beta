package lg;
public final class g {
    public boolean f14268a;
    public float f14269b;
    public float f14270c;
    public float d;
    public float e;
    public float f14271f;
    public float f14272g;
    public boolean h;
    public int f14273i;
    public float f14274j;
    public float f14275k;
    public float f14276l;
    public float f14277m;

    public final g clone() {
        ?? obj = new Object();
        obj.f14268a = this.f14268a;
        obj.f14269b = this.f14269b;
        obj.f14270c = this.f14270c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f14271f = this.f14271f;
        obj.f14272g = this.f14272g;
        obj.h = this.h;
        obj.f14273i = this.f14273i;
        obj.f14274j = this.f14274j;
        obj.f14275k = this.f14275k;
        obj.f14276l = this.f14276l;
        obj.f14277m = this.f14277m;
        return obj;
    }

    public final int b() {
        return this.f14273i;
    }

    public final boolean c() {
        return this.f14268a;
    }

    public final boolean d() {
        return this.h;
    }

    public final void e(boolean z10, float f7, float f10, float f11, int i10, float f12, float f13, float f14, float f15, float f16, float f17, float f18, boolean z11) {
        this.f14268a = z10;
        this.f14269b = f7;
        this.f14270c = f10;
        this.f14271f = f12;
        this.f14272g = f11;
        this.f14273i = i10;
        while (true) {
            int i11 = this.f14273i;
            if (i11 >= 0) {
                break;
            }
            this.f14273i = i11 + 360;
        }
        while (true) {
            int i12 = this.f14273i;
            if (i12 >= 360) {
                this.f14273i = i12 - 360;
            } else {
                this.f14274j = f15;
                this.f14275k = f16;
                this.d = f17;
                this.e = f18;
                this.f14276l = f13;
                this.f14277m = f14;
                this.h = z11;
                return;
            }
        }
    }
}
