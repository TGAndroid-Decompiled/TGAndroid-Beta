package lg;
public final class g {
    public boolean f15274a;
    public float f15275b;
    public float f15276c;
    public float d;
    public float f15277e;
    public float f15278f;
    public float f15279g;
    public boolean h;
    public int f15280i;
    public float f15281j;
    public float f15282k;
    public float f15283l;
    public float f15284m;

    public final g clone() {
        ?? obj = new Object();
        obj.f15274a = this.f15274a;
        obj.f15275b = this.f15275b;
        obj.f15276c = this.f15276c;
        obj.d = this.d;
        obj.f15277e = this.f15277e;
        obj.f15278f = this.f15278f;
        obj.f15279g = this.f15279g;
        obj.h = this.h;
        obj.f15280i = this.f15280i;
        obj.f15281j = this.f15281j;
        obj.f15282k = this.f15282k;
        obj.f15283l = this.f15283l;
        obj.f15284m = this.f15284m;
        return obj;
    }

    public final int b() {
        return this.f15280i;
    }

    public final boolean c() {
        return this.f15274a;
    }

    public final boolean d() {
        return this.h;
    }

    public final void e(boolean z10, float f7, float f10, float f11, int i10, float f12, float f13, float f14, float f15, float f16, float f17, float f18, boolean z11) {
        this.f15274a = z10;
        this.f15275b = f7;
        this.f15276c = f10;
        this.f15278f = f12;
        this.f15279g = f11;
        this.f15280i = i10;
        while (true) {
            int i11 = this.f15280i;
            if (i11 >= 0) {
                break;
            }
            this.f15280i = i11 + 360;
        }
        while (true) {
            int i12 = this.f15280i;
            if (i12 >= 360) {
                this.f15280i = i12 - 360;
            } else {
                this.f15281j = f15;
                this.f15282k = f16;
                this.d = f17;
                this.f15277e = f18;
                this.f15283l = f13;
                this.f15284m = f14;
                this.h = z11;
                return;
            }
        }
    }
}
