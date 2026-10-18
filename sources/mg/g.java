package mg;
public final class g {
    public boolean f16878a;
    public float f16879b;
    public float f16880c;
    public float d;
    public float e;
    public float f16881f;
    public float f16882g;
    public boolean h;
    public int f16883i;
    public float f16884j;
    public float f16885k;
    public float f16886l;
    public float f16887m;

    public final g clone() {
        ?? obj = new Object();
        obj.f16878a = this.f16878a;
        obj.f16879b = this.f16879b;
        obj.f16880c = this.f16880c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f16881f = this.f16881f;
        obj.f16882g = this.f16882g;
        obj.h = this.h;
        obj.f16883i = this.f16883i;
        obj.f16884j = this.f16884j;
        obj.f16885k = this.f16885k;
        obj.f16886l = this.f16886l;
        obj.f16887m = this.f16887m;
        return obj;
    }

    public final int b() {
        return this.f16883i;
    }

    public final boolean c() {
        return this.f16878a;
    }

    public final boolean d() {
        return this.h;
    }

    public final void e(boolean z10, float f7, float f10, float f11, int i10, float f12, float f13, float f14, float f15, float f16, float f17, float f18, boolean z11) {
        this.f16878a = z10;
        this.f16879b = f7;
        this.f16880c = f10;
        this.f16881f = f12;
        this.f16882g = f11;
        this.f16883i = i10;
        while (true) {
            int i11 = this.f16883i;
            if (i11 >= 0) {
                break;
            }
            this.f16883i = i11 + 360;
        }
        while (true) {
            int i12 = this.f16883i;
            if (i12 >= 360) {
                this.f16883i = i12 - 360;
            } else {
                this.f16884j = f15;
                this.f16885k = f16;
                this.d = f17;
                this.e = f18;
                this.f16886l = f13;
                this.f16887m = f14;
                this.h = z11;
                return;
            }
        }
    }
}
