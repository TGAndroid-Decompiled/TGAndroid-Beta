package lg;
public final class g {
    public boolean f15566a;
    public float f15567b;
    public float f15568c;
    public float d;
    public float f15569e;
    public float f15570f;
    public float f15571g;
    public boolean h;
    public int f15572i;
    public float f15573j;
    public float f15574k;
    public float f15575l;
    public float f15576m;

    public final g clone() {
        ?? obj = new Object();
        obj.f15566a = this.f15566a;
        obj.f15567b = this.f15567b;
        obj.f15568c = this.f15568c;
        obj.d = this.d;
        obj.f15569e = this.f15569e;
        obj.f15570f = this.f15570f;
        obj.f15571g = this.f15571g;
        obj.h = this.h;
        obj.f15572i = this.f15572i;
        obj.f15573j = this.f15573j;
        obj.f15574k = this.f15574k;
        obj.f15575l = this.f15575l;
        obj.f15576m = this.f15576m;
        return obj;
    }

    public final int b() {
        return this.f15572i;
    }

    public final boolean c() {
        return this.f15566a;
    }

    public final boolean d() {
        return this.h;
    }

    public final void e(boolean z10, float f7, float f10, float f11, int i10, float f12, float f13, float f14, float f15, float f16, float f17, float f18, boolean z11) {
        this.f15566a = z10;
        this.f15567b = f7;
        this.f15568c = f10;
        this.f15570f = f12;
        this.f15571g = f11;
        this.f15572i = i10;
        while (true) {
            int i11 = this.f15572i;
            if (i11 >= 0) {
                break;
            }
            this.f15572i = i11 + 360;
        }
        while (true) {
            int i12 = this.f15572i;
            if (i12 >= 360) {
                this.f15572i = i12 - 360;
            } else {
                this.f15573j = f15;
                this.f15574k = f16;
                this.d = f17;
                this.f15569e = f18;
                this.f15575l = f13;
                this.f15576m = f14;
                this.h = z11;
                return;
            }
        }
    }
}
