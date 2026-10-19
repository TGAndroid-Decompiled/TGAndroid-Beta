package mg;
public final class g {
    public boolean f16877a;
    public float f16878b;
    public float f16879c;
    public float d;
    public float e;
    public float f16880f;
    public float f16881g;
    public boolean h;
    public int f16882i;
    public float f16883j;
    public float f16884k;
    public float f16885l;
    public float f16886m;

    public final g clone() {
        ?? obj = new Object();
        obj.f16877a = this.f16877a;
        obj.f16878b = this.f16878b;
        obj.f16879c = this.f16879c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f16880f = this.f16880f;
        obj.f16881g = this.f16881g;
        obj.h = this.h;
        obj.f16882i = this.f16882i;
        obj.f16883j = this.f16883j;
        obj.f16884k = this.f16884k;
        obj.f16885l = this.f16885l;
        obj.f16886m = this.f16886m;
        return obj;
    }

    public final int b() {
        return this.f16882i;
    }

    public final boolean c() {
        return this.f16877a;
    }

    public final boolean d() {
        return this.h;
    }

    public final void e(boolean z10, float f7, float f10, float f11, int i10, float f12, float f13, float f14, float f15, float f16, float f17, float f18, boolean z11) {
        this.f16877a = z10;
        this.f16878b = f7;
        this.f16879c = f10;
        this.f16880f = f12;
        this.f16881g = f11;
        this.f16882i = i10;
        while (true) {
            int i11 = this.f16882i;
            if (i11 >= 0) {
                break;
            }
            this.f16882i = i11 + 360;
        }
        while (true) {
            int i12 = this.f16882i;
            if (i12 >= 360) {
                this.f16882i = i12 - 360;
            } else {
                this.f16883j = f15;
                this.f16884k = f16;
                this.d = f17;
                this.e = f18;
                this.f16885l = f13;
                this.f16886m = f14;
                this.h = z11;
                return;
            }
        }
    }
}
