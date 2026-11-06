package og;
public final class g {
    public boolean f20961a;
    public float f20962b;
    public float f20963c;
    public float d;
    public float f20964e;
    public float f20965f;
    public float f20966g;
    public boolean h;
    public int f20967i;
    public float f20968j;
    public float f20969k;
    public float f20970l;
    public float f20971m;

    public final g clone() {
        ?? obj = new Object();
        obj.f20961a = this.f20961a;
        obj.f20962b = this.f20962b;
        obj.f20963c = this.f20963c;
        obj.d = this.d;
        obj.f20964e = this.f20964e;
        obj.f20965f = this.f20965f;
        obj.f20966g = this.f20966g;
        obj.h = this.h;
        obj.f20967i = this.f20967i;
        obj.f20968j = this.f20968j;
        obj.f20969k = this.f20969k;
        obj.f20970l = this.f20970l;
        obj.f20971m = this.f20971m;
        return obj;
    }

    public final int b() {
        return this.f20967i;
    }

    public final boolean c() {
        return this.f20961a;
    }

    public final boolean d() {
        return this.h;
    }

    public final void e(boolean z9, float f10, float f11, float f12, int i7, float f13, float f14, float f15, float f16, float f17, float f18, float f19, boolean z10) {
        this.f20961a = z9;
        this.f20962b = f10;
        this.f20963c = f11;
        this.f20965f = f13;
        this.f20966g = f12;
        this.f20967i = i7;
        while (true) {
            int i10 = this.f20967i;
            if (i10 >= 0) {
                break;
            }
            this.f20967i = i10 + 360;
        }
        while (true) {
            int i11 = this.f20967i;
            if (i11 >= 360) {
                this.f20967i = i11 - 360;
            } else {
                this.f20968j = f16;
                this.f20969k = f17;
                this.d = f18;
                this.f20964e = f19;
                this.f20970l = f14;
                this.f20971m = f15;
                this.h = z10;
                return;
            }
        }
    }
}
