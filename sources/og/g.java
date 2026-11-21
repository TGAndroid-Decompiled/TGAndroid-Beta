package og;
public final class g {
    public boolean f21875a;
    public float f21876b;
    public float f21877c;
    public float d;
    public float f21878e;
    public float f21879f;
    public float f21880g;
    public boolean h;
    public int f21881i;
    public float f21882j;
    public float f21883k;
    public float f21884l;
    public float f21885m;

    public final g clone() {
        ?? obj = new Object();
        obj.f21875a = this.f21875a;
        obj.f21876b = this.f21876b;
        obj.f21877c = this.f21877c;
        obj.d = this.d;
        obj.f21878e = this.f21878e;
        obj.f21879f = this.f21879f;
        obj.f21880g = this.f21880g;
        obj.h = this.h;
        obj.f21881i = this.f21881i;
        obj.f21882j = this.f21882j;
        obj.f21883k = this.f21883k;
        obj.f21884l = this.f21884l;
        obj.f21885m = this.f21885m;
        return obj;
    }

    public final int b() {
        return this.f21881i;
    }

    public final boolean c() {
        return this.f21875a;
    }

    public final boolean d() {
        return this.h;
    }

    public final void e(boolean z10, float f10, float f11, float f12, int i7, float f13, float f14, float f15, float f16, float f17, float f18, float f19, boolean z11) {
        this.f21875a = z10;
        this.f21876b = f10;
        this.f21877c = f11;
        this.f21879f = f13;
        this.f21880g = f12;
        this.f21881i = i7;
        while (true) {
            int i10 = this.f21881i;
            if (i10 >= 0) {
                break;
            }
            this.f21881i = i10 + 360;
        }
        while (true) {
            int i11 = this.f21881i;
            if (i11 >= 360) {
                this.f21881i = i11 - 360;
            } else {
                this.f21882j = f16;
                this.f21883k = f17;
                this.d = f18;
                this.f21878e = f19;
                this.f21884l = f14;
                this.f21885m = f15;
                this.h = z11;
                return;
            }
        }
    }
}
