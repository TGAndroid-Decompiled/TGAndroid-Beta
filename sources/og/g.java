package og;
public final class g {
    public boolean f21844a;
    public float f21845b;
    public float f21846c;
    public float d;
    public float f21847e;
    public float f21848f;
    public float f21849g;
    public boolean h;
    public int f21850i;
    public float f21851j;
    public float f21852k;
    public float f21853l;
    public float f21854m;

    public final g clone() {
        ?? obj = new Object();
        obj.f21844a = this.f21844a;
        obj.f21845b = this.f21845b;
        obj.f21846c = this.f21846c;
        obj.d = this.d;
        obj.f21847e = this.f21847e;
        obj.f21848f = this.f21848f;
        obj.f21849g = this.f21849g;
        obj.h = this.h;
        obj.f21850i = this.f21850i;
        obj.f21851j = this.f21851j;
        obj.f21852k = this.f21852k;
        obj.f21853l = this.f21853l;
        obj.f21854m = this.f21854m;
        return obj;
    }

    public final int b() {
        return this.f21850i;
    }

    public final boolean c() {
        return this.f21844a;
    }

    public final boolean d() {
        return this.h;
    }

    public final void e(boolean z10, float f10, float f11, float f12, int i7, float f13, float f14, float f15, float f16, float f17, float f18, float f19, boolean z11) {
        this.f21844a = z10;
        this.f21845b = f10;
        this.f21846c = f11;
        this.f21848f = f13;
        this.f21849g = f12;
        this.f21850i = i7;
        while (true) {
            int i10 = this.f21850i;
            if (i10 >= 0) {
                break;
            }
            this.f21850i = i10 + 360;
        }
        while (true) {
            int i11 = this.f21850i;
            if (i11 >= 360) {
                this.f21850i = i11 - 360;
            } else {
                this.f21851j = f16;
                this.f21852k = f17;
                this.d = f18;
                this.f21847e = f19;
                this.f21853l = f14;
                this.f21854m = f15;
                this.h = z11;
                return;
            }
        }
    }
}
