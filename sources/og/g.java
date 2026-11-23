package og;
public final class g {
    public boolean f21878a;
    public float f21879b;
    public float f21880c;
    public float d;
    public float f21881e;
    public float f21882f;
    public float f21883g;
    public boolean h;
    public int f21884i;
    public float f21885j;
    public float f21886k;
    public float f21887l;
    public float f21888m;

    public final g clone() {
        ?? obj = new Object();
        obj.f21878a = this.f21878a;
        obj.f21879b = this.f21879b;
        obj.f21880c = this.f21880c;
        obj.d = this.d;
        obj.f21881e = this.f21881e;
        obj.f21882f = this.f21882f;
        obj.f21883g = this.f21883g;
        obj.h = this.h;
        obj.f21884i = this.f21884i;
        obj.f21885j = this.f21885j;
        obj.f21886k = this.f21886k;
        obj.f21887l = this.f21887l;
        obj.f21888m = this.f21888m;
        return obj;
    }

    public final int b() {
        return this.f21884i;
    }

    public final boolean c() {
        return this.f21878a;
    }

    public final boolean d() {
        return this.h;
    }

    public final void e(boolean z10, float f10, float f11, float f12, int i7, float f13, float f14, float f15, float f16, float f17, float f18, float f19, boolean z11) {
        this.f21878a = z10;
        this.f21879b = f10;
        this.f21880c = f11;
        this.f21882f = f13;
        this.f21883g = f12;
        this.f21884i = i7;
        while (true) {
            int i10 = this.f21884i;
            if (i10 >= 0) {
                break;
            }
            this.f21884i = i10 + 360;
        }
        while (true) {
            int i11 = this.f21884i;
            if (i11 >= 360) {
                this.f21884i = i11 - 360;
            } else {
                this.f21885j = f16;
                this.f21886k = f17;
                this.d = f18;
                this.f21881e = f19;
                this.f21887l = f14;
                this.f21888m = f15;
                this.h = z11;
                return;
            }
        }
    }
}
