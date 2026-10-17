package mg;
public final class g {
    public boolean f16871a;
    public float f16872b;
    public float f16873c;
    public float d;
    public float e;
    public float f16874f;
    public float f16875g;
    public boolean h;
    public int f16876i;
    public float f16877j;
    public float f16878k;
    public float f16879l;
    public float f16880m;

    public final g clone() {
        ?? obj = new Object();
        obj.f16871a = this.f16871a;
        obj.f16872b = this.f16872b;
        obj.f16873c = this.f16873c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f16874f = this.f16874f;
        obj.f16875g = this.f16875g;
        obj.h = this.h;
        obj.f16876i = this.f16876i;
        obj.f16877j = this.f16877j;
        obj.f16878k = this.f16878k;
        obj.f16879l = this.f16879l;
        obj.f16880m = this.f16880m;
        return obj;
    }

    public final int b() {
        return this.f16876i;
    }

    public final boolean c() {
        return this.f16871a;
    }

    public final boolean d() {
        return this.h;
    }

    public final void e(boolean z10, float f7, float f10, float f11, int i10, float f12, float f13, float f14, float f15, float f16, float f17, float f18, boolean z11) {
        this.f16871a = z10;
        this.f16872b = f7;
        this.f16873c = f10;
        this.f16874f = f12;
        this.f16875g = f11;
        this.f16876i = i10;
        while (true) {
            int i11 = this.f16876i;
            if (i11 >= 0) {
                break;
            }
            this.f16876i = i11 + 360;
        }
        while (true) {
            int i12 = this.f16876i;
            if (i12 >= 360) {
                this.f16876i = i12 - 360;
            } else {
                this.f16877j = f15;
                this.f16878k = f16;
                this.d = f17;
                this.e = f18;
                this.f16879l = f13;
                this.f16880m = f14;
                this.h = z11;
                return;
            }
        }
    }
}
