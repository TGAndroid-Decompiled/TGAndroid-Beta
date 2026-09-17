package mg;
public final class g {
    public boolean f16283a;
    public float f16284b;
    public float f16285c;
    public float d;
    public float f16286e;
    public float f16287f;
    public float f16288g;
    public boolean h;
    public int f16289i;
    public float f16290j;
    public float f16291k;
    public float f16292l;
    public float f16293m;

    public final g clone() {
        ?? obj = new Object();
        obj.f16283a = this.f16283a;
        obj.f16284b = this.f16284b;
        obj.f16285c = this.f16285c;
        obj.d = this.d;
        obj.f16286e = this.f16286e;
        obj.f16287f = this.f16287f;
        obj.f16288g = this.f16288g;
        obj.h = this.h;
        obj.f16289i = this.f16289i;
        obj.f16290j = this.f16290j;
        obj.f16291k = this.f16291k;
        obj.f16292l = this.f16292l;
        obj.f16293m = this.f16293m;
        return obj;
    }

    public final int b() {
        return this.f16289i;
    }

    public final boolean c() {
        return this.f16283a;
    }

    public final boolean d() {
        return this.h;
    }

    public final void e(boolean z10, float f7, float f10, float f11, int i10, float f12, float f13, float f14, float f15, float f16, float f17, float f18, boolean z11) {
        this.f16283a = z10;
        this.f16284b = f7;
        this.f16285c = f10;
        this.f16287f = f12;
        this.f16288g = f11;
        this.f16289i = i10;
        while (true) {
            int i11 = this.f16289i;
            if (i11 >= 0) {
                break;
            }
            this.f16289i = i11 + 360;
        }
        while (true) {
            int i12 = this.f16289i;
            if (i12 >= 360) {
                this.f16289i = i12 - 360;
            } else {
                this.f16290j = f15;
                this.f16291k = f16;
                this.d = f17;
                this.f16286e = f18;
                this.f16292l = f13;
                this.f16293m = f14;
                this.h = z11;
                return;
            }
        }
    }
}
