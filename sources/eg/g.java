package eg;
public final class g {
    public boolean f6541a;
    public float f6542b;
    public float f6543c;
    public float d;
    public float e;
    public float f6544f;
    public float f6545g;
    public boolean h;
    public int f6546i;
    public float f6547j;
    public float f6548k;
    public float f6549l;
    public float f6550m;

    public final g clone() {
        ?? obj = new Object();
        obj.f6541a = this.f6541a;
        obj.f6542b = this.f6542b;
        obj.f6543c = this.f6543c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f6544f = this.f6544f;
        obj.f6545g = this.f6545g;
        obj.h = this.h;
        obj.f6546i = this.f6546i;
        obj.f6547j = this.f6547j;
        obj.f6548k = this.f6548k;
        obj.f6549l = this.f6549l;
        obj.f6550m = this.f6550m;
        return obj;
    }

    public final int b() {
        return this.f6546i;
    }

    public final boolean c() {
        return this.f6541a;
    }

    public final boolean d() {
        return this.h;
    }

    public final void e(boolean z10, float f7, float f10, float f11, int i10, float f12, float f13, float f14, float f15, float f16, float f17, float f18, boolean z11) {
        this.f6541a = z10;
        this.f6542b = f7;
        this.f6543c = f10;
        this.f6544f = f12;
        this.f6545g = f11;
        this.f6546i = i10;
        while (true) {
            int i11 = this.f6546i;
            if (i11 >= 0) {
                break;
            }
            this.f6546i = i11 + 360;
        }
        while (true) {
            int i12 = this.f6546i;
            if (i12 >= 360) {
                this.f6546i = i12 - 360;
            } else {
                this.f6547j = f15;
                this.f6548k = f16;
                this.d = f17;
                this.e = f18;
                this.f6549l = f13;
                this.f6550m = f14;
                this.h = z11;
                return;
            }
        }
    }
}
