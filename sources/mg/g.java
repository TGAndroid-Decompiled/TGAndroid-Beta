package mg;
public final class g {
    public boolean f16876a;
    public float f16877b;
    public float f16878c;
    public float d;
    public float e;
    public float f16879f;
    public float f16880g;
    public boolean h;
    public int f16881i;
    public float f16882j;
    public float f16883k;
    public float f16884l;
    public float f16885m;

    public final g clone() {
        ?? obj = new Object();
        obj.f16876a = this.f16876a;
        obj.f16877b = this.f16877b;
        obj.f16878c = this.f16878c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f16879f = this.f16879f;
        obj.f16880g = this.f16880g;
        obj.h = this.h;
        obj.f16881i = this.f16881i;
        obj.f16882j = this.f16882j;
        obj.f16883k = this.f16883k;
        obj.f16884l = this.f16884l;
        obj.f16885m = this.f16885m;
        return obj;
    }

    public final int b() {
        return this.f16881i;
    }

    public final boolean c() {
        return this.f16876a;
    }

    public final boolean d() {
        return this.h;
    }

    public final void e(boolean z10, float f7, float f10, float f11, int i10, float f12, float f13, float f14, float f15, float f16, float f17, float f18, boolean z11) {
        this.f16876a = z10;
        this.f16877b = f7;
        this.f16878c = f10;
        this.f16879f = f12;
        this.f16880g = f11;
        this.f16881i = i10;
        while (true) {
            int i11 = this.f16881i;
            if (i11 >= 0) {
                break;
            }
            this.f16881i = i11 + 360;
        }
        while (true) {
            int i12 = this.f16881i;
            if (i12 >= 360) {
                this.f16881i = i12 - 360;
            } else {
                this.f16882j = f15;
                this.f16883k = f16;
                this.d = f17;
                this.e = f18;
                this.f16884l = f13;
                this.f16885m = f14;
                this.h = z11;
                return;
            }
        }
    }
}
