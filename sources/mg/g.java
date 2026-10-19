package mg;
public final class g {
    public boolean f16879a;
    public float f16880b;
    public float f16881c;
    public float d;
    public float e;
    public float f16882f;
    public float f16883g;
    public boolean h;
    public int f16884i;
    public float f16885j;
    public float f16886k;
    public float f16887l;
    public float f16888m;

    public final g clone() {
        ?? obj = new Object();
        obj.f16879a = this.f16879a;
        obj.f16880b = this.f16880b;
        obj.f16881c = this.f16881c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f16882f = this.f16882f;
        obj.f16883g = this.f16883g;
        obj.h = this.h;
        obj.f16884i = this.f16884i;
        obj.f16885j = this.f16885j;
        obj.f16886k = this.f16886k;
        obj.f16887l = this.f16887l;
        obj.f16888m = this.f16888m;
        return obj;
    }

    public final int b() {
        return this.f16884i;
    }

    public final boolean c() {
        return this.f16879a;
    }

    public final boolean d() {
        return this.h;
    }

    public final void e(boolean z10, float f7, float f10, float f11, int i10, float f12, float f13, float f14, float f15, float f16, float f17, float f18, boolean z11) {
        this.f16879a = z10;
        this.f16880b = f7;
        this.f16881c = f10;
        this.f16882f = f12;
        this.f16883g = f11;
        this.f16884i = i10;
        while (true) {
            int i11 = this.f16884i;
            if (i11 >= 0) {
                break;
            }
            this.f16884i = i11 + 360;
        }
        while (true) {
            int i12 = this.f16884i;
            if (i12 >= 360) {
                this.f16884i = i12 - 360;
            } else {
                this.f16885j = f15;
                this.f16886k = f16;
                this.d = f17;
                this.e = f18;
                this.f16887l = f13;
                this.f16888m = f14;
                this.h = z11;
                return;
            }
        }
    }
}
