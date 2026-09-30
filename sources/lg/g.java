package lg;
public final class g {
    public boolean f14299a;
    public float f14300b;
    public float f14301c;
    public float d;
    public float e;
    public float f14302f;
    public float f14303g;
    public boolean h;
    public int f14304i;
    public float f14305j;
    public float f14306k;
    public float f14307l;
    public float f14308m;

    public final g clone() {
        ?? obj = new Object();
        obj.f14299a = this.f14299a;
        obj.f14300b = this.f14300b;
        obj.f14301c = this.f14301c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f14302f = this.f14302f;
        obj.f14303g = this.f14303g;
        obj.h = this.h;
        obj.f14304i = this.f14304i;
        obj.f14305j = this.f14305j;
        obj.f14306k = this.f14306k;
        obj.f14307l = this.f14307l;
        obj.f14308m = this.f14308m;
        return obj;
    }

    public final int b() {
        return this.f14304i;
    }

    public final boolean c() {
        return this.f14299a;
    }

    public final boolean d() {
        return this.h;
    }

    public final void e(boolean z10, float f7, float f10, float f11, int i10, float f12, float f13, float f14, float f15, float f16, float f17, float f18, boolean z11) {
        this.f14299a = z10;
        this.f14300b = f7;
        this.f14301c = f10;
        this.f14302f = f12;
        this.f14303g = f11;
        this.f14304i = i10;
        while (true) {
            int i11 = this.f14304i;
            if (i11 >= 0) {
                break;
            }
            this.f14304i = i11 + 360;
        }
        while (true) {
            int i12 = this.f14304i;
            if (i12 >= 360) {
                this.f14304i = i12 - 360;
            } else {
                this.f14305j = f15;
                this.f14306k = f16;
                this.d = f17;
                this.e = f18;
                this.f14307l = f13;
                this.f14308m = f14;
                this.h = z11;
                return;
            }
        }
    }
}
