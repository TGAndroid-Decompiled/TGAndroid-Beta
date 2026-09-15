package lg;
public final class g {
    public boolean f14057a;
    public float f14058b;
    public float f14059c;
    public float d;
    public float e;
    public float f14060f;
    public float f14061g;
    public boolean h;
    public int f14062i;
    public float f14063j;
    public float f14064k;
    public float f14065l;
    public float f14066m;

    public final g clone() {
        ?? obj = new Object();
        obj.f14057a = this.f14057a;
        obj.f14058b = this.f14058b;
        obj.f14059c = this.f14059c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f14060f = this.f14060f;
        obj.f14061g = this.f14061g;
        obj.h = this.h;
        obj.f14062i = this.f14062i;
        obj.f14063j = this.f14063j;
        obj.f14064k = this.f14064k;
        obj.f14065l = this.f14065l;
        obj.f14066m = this.f14066m;
        return obj;
    }

    public final int b() {
        return this.f14062i;
    }

    public final boolean c() {
        return this.f14057a;
    }

    public final boolean d() {
        return this.h;
    }

    public final void e(boolean z10, float f7, float f10, float f11, int i10, float f12, float f13, float f14, float f15, float f16, float f17, float f18, boolean z11) {
        this.f14057a = z10;
        this.f14058b = f7;
        this.f14059c = f10;
        this.f14060f = f12;
        this.f14061g = f11;
        this.f14062i = i10;
        while (true) {
            int i11 = this.f14062i;
            if (i11 >= 0) {
                break;
            }
            this.f14062i = i11 + 360;
        }
        while (true) {
            int i12 = this.f14062i;
            if (i12 >= 360) {
                this.f14062i = i12 - 360;
            } else {
                this.f14063j = f15;
                this.f14064k = f16;
                this.d = f17;
                this.e = f18;
                this.f14065l = f13;
                this.f14066m = f14;
                this.h = z11;
                return;
            }
        }
    }
}
