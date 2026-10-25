package ng;
public final class g {
    public boolean f18803a;
    public float f18804b;
    public float f18805c;
    public float d;
    public float e;
    public float f18806f;
    public float f18807g;
    public boolean h;
    public int f18808i;
    public float f18809j;
    public float f18810k;
    public float f18811l;
    public float f18812m;

    public final g clone() {
        ?? obj = new Object();
        obj.f18803a = this.f18803a;
        obj.f18804b = this.f18804b;
        obj.f18805c = this.f18805c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f18806f = this.f18806f;
        obj.f18807g = this.f18807g;
        obj.h = this.h;
        obj.f18808i = this.f18808i;
        obj.f18809j = this.f18809j;
        obj.f18810k = this.f18810k;
        obj.f18811l = this.f18811l;
        obj.f18812m = this.f18812m;
        return obj;
    }

    public final int b() {
        return this.f18808i;
    }

    public final boolean c() {
        return this.f18803a;
    }

    public final boolean d() {
        return this.h;
    }

    public final void e(boolean z10, float f7, float f10, float f11, int i10, float f12, float f13, float f14, float f15, float f16, float f17, float f18, boolean z11) {
        this.f18803a = z10;
        this.f18804b = f7;
        this.f18805c = f10;
        this.f18806f = f12;
        this.f18807g = f11;
        this.f18808i = i10;
        while (true) {
            int i11 = this.f18808i;
            if (i11 >= 0) {
                break;
            }
            this.f18808i = i11 + 360;
        }
        while (true) {
            int i12 = this.f18808i;
            if (i12 >= 360) {
                this.f18808i = i12 - 360;
            } else {
                this.f18809j = f15;
                this.f18810k = f16;
                this.d = f17;
                this.e = f18;
                this.f18811l = f13;
                this.f18812m = f14;
                this.h = z11;
                return;
            }
        }
    }
}
