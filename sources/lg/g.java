package lg;
public final class g {
    public boolean f14058a;
    public float f14059b;
    public float f14060c;
    public float d;
    public float e;
    public float f14061f;
    public float f14062g;
    public boolean h;
    public int f14063i;
    public float f14064j;
    public float f14065k;
    public float f14066l;
    public float f14067m;

    public final g clone() {
        ?? obj = new Object();
        obj.f14058a = this.f14058a;
        obj.f14059b = this.f14059b;
        obj.f14060c = this.f14060c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f14061f = this.f14061f;
        obj.f14062g = this.f14062g;
        obj.h = this.h;
        obj.f14063i = this.f14063i;
        obj.f14064j = this.f14064j;
        obj.f14065k = this.f14065k;
        obj.f14066l = this.f14066l;
        obj.f14067m = this.f14067m;
        return obj;
    }

    public final int b() {
        return this.f14063i;
    }

    public final boolean c() {
        return this.f14058a;
    }

    public final boolean d() {
        return this.h;
    }

    public final void e(boolean z10, float f7, float f10, float f11, int i10, float f12, float f13, float f14, float f15, float f16, float f17, float f18, boolean z11) {
        this.f14058a = z10;
        this.f14059b = f7;
        this.f14060c = f10;
        this.f14061f = f12;
        this.f14062g = f11;
        this.f14063i = i10;
        while (true) {
            int i11 = this.f14063i;
            if (i11 >= 0) {
                break;
            }
            this.f14063i = i11 + 360;
        }
        while (true) {
            int i12 = this.f14063i;
            if (i12 >= 360) {
                this.f14063i = i12 - 360;
            } else {
                this.f14064j = f15;
                this.f14065k = f16;
                this.d = f17;
                this.e = f18;
                this.f14066l = f13;
                this.f14067m = f14;
                this.h = z11;
                return;
            }
        }
    }
}
