package lg;
public final class g {
    public boolean f14216a;
    public float f14217b;
    public float f14218c;
    public float d;
    public float e;
    public float f14219f;
    public float f14220g;
    public boolean h;
    public int f14221i;
    public float f14222j;
    public float f14223k;
    public float f14224l;
    public float f14225m;

    public final g clone() {
        ?? obj = new Object();
        obj.f14216a = this.f14216a;
        obj.f14217b = this.f14217b;
        obj.f14218c = this.f14218c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f14219f = this.f14219f;
        obj.f14220g = this.f14220g;
        obj.h = this.h;
        obj.f14221i = this.f14221i;
        obj.f14222j = this.f14222j;
        obj.f14223k = this.f14223k;
        obj.f14224l = this.f14224l;
        obj.f14225m = this.f14225m;
        return obj;
    }

    public final int b() {
        return this.f14221i;
    }

    public final boolean c() {
        return this.f14216a;
    }

    public final boolean d() {
        return this.h;
    }

    public final void e(boolean z10, float f7, float f10, float f11, int i10, float f12, float f13, float f14, float f15, float f16, float f17, float f18, boolean z11) {
        this.f14216a = z10;
        this.f14217b = f7;
        this.f14218c = f10;
        this.f14219f = f12;
        this.f14220g = f11;
        this.f14221i = i10;
        while (true) {
            int i11 = this.f14221i;
            if (i11 >= 0) {
                break;
            }
            this.f14221i = i11 + 360;
        }
        while (true) {
            int i12 = this.f14221i;
            if (i12 >= 360) {
                this.f14221i = i12 - 360;
            } else {
                this.f14222j = f15;
                this.f14223k = f16;
                this.d = f17;
                this.e = f18;
                this.f14224l = f13;
                this.f14225m = f14;
                this.h = z11;
                return;
            }
        }
    }
}
