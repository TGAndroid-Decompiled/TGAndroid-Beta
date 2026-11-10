package og;
public final class g {
    public boolean f20969a;
    public float f20970b;
    public float f20971c;
    public float d;
    public float f20972e;
    public float f20973f;
    public float f20974g;
    public boolean h;
    public int f20975i;
    public float f20976j;
    public float f20977k;
    public float f20978l;
    public float f20979m;

    public final g clone() {
        ?? obj = new Object();
        obj.f20969a = this.f20969a;
        obj.f20970b = this.f20970b;
        obj.f20971c = this.f20971c;
        obj.d = this.d;
        obj.f20972e = this.f20972e;
        obj.f20973f = this.f20973f;
        obj.f20974g = this.f20974g;
        obj.h = this.h;
        obj.f20975i = this.f20975i;
        obj.f20976j = this.f20976j;
        obj.f20977k = this.f20977k;
        obj.f20978l = this.f20978l;
        obj.f20979m = this.f20979m;
        return obj;
    }

    public final int b() {
        return this.f20975i;
    }

    public final boolean c() {
        return this.f20969a;
    }

    public final boolean d() {
        return this.h;
    }

    public final void e(boolean z9, float f10, float f11, float f12, int i7, float f13, float f14, float f15, float f16, float f17, float f18, float f19, boolean z10) {
        this.f20969a = z9;
        this.f20970b = f10;
        this.f20971c = f11;
        this.f20973f = f13;
        this.f20974g = f12;
        this.f20975i = i7;
        while (true) {
            int i10 = this.f20975i;
            if (i10 >= 0) {
                break;
            }
            this.f20975i = i10 + 360;
        }
        while (true) {
            int i11 = this.f20975i;
            if (i11 >= 360) {
                this.f20975i = i11 - 360;
            } else {
                this.f20976j = f16;
                this.f20977k = f17;
                this.d = f18;
                this.f20972e = f19;
                this.f20978l = f14;
                this.f20979m = f15;
                this.h = z10;
                return;
            }
        }
    }
}
